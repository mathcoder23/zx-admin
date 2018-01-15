package com.mt23.zhongxin.admin.templates;

import com.aliyun.oss.model.PutObjectResult;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;


@Slf4j
@Service
public class ProductBuilder {
    private static Map rootMap = new HashMap();
    private static boolean isBuildLocal = false;

    @Autowired
    private CompanyService companyService;
    @Autowired
    private ConfigFrontIndexService configFrontIndexService;

    @Autowired
    private ZxProductBiz zxProductBiz;
    @Autowired
    private ZxProductSortBiz zxProductSortBiz;
    @Autowired
    private ProductBuilder productBuilder;
    @Autowired
    private ZxProductSortProductBiz zxProductSortProductBiz;
    static{
        File file = new File("builder/product/list");
        file.mkdirs();
        file = new File("builder/product/detail");
        file.mkdirs(); file = new File("builder/base");
        file.mkdirs();

        file = new File("builder/produce/detail");
        file.mkdirs();

        file = new File("builder/produce/list");
        file.mkdirs();
    }
    /**
     * 更新html公共部分
     */
    public  Map updateHtml(){
        Map html = (Map) rootMap.get("comm");//html基础模板
        List<ZxProductSortTree> treeSort = zxProductSortBiz.getTree(zxProductSortBiz.selectListAll(),-1);
        Company company = companyService.selectListAll().get(0);

        if(html == null){
            html = new HashMap();
        }
        if(html.get("head") == null){
            html.put("head",getHtmlHead());
        }
        if(html.get("menu") == null){
            html.put("menu",getHtmlMenu(treeSort,company));
        }
        if(html.get("foot") == null){
            html.put("foot",getHtmlFoot());
        }
        if(html.get("footScript") == null){
            html.put("footScript",getHtmlFootScript());
        }
        if(html.get("productSort") == null){
            html.put("productSort",getHtmlProductSort(zxProductSortBiz.getTree(zxProductSortBiz.selectListAll(),-1)));
        }
        rootMap.put("comm",html);
        return rootMap;
    }

    public String getHtmlProductSort(List<ZxProductSortTree> tree){
        Map root = new HashMap();
        root.put("sort",tree);
        String uri = "base/productSort.html";
        freeMarkerBaseBuilder(root,uri);
        String ProductSort = FileOption.readFile("builder/"+uri);
        return ProductSort;
    }
    public String getHtmlHead(){

        Map root = new HashMap();
        root.put("name","东莞市众鑫包装制品有限公司");
        root.put("phone","13089898889");
        root.put("about","这是关于我们");
        root.put("loginIcon","https://mt-zx-store.oss-cn-qingdao.aliyuncs.com/image/zhongxin/13a40c603f0ceb1cbeaa24c59323df73-20171231094521.jpg");
        root.put("banner",new String[]{
                "https://mt-zx-store.oss-cn-qingdao.aliyuncs.com/image/zhongxin/13a40c603f0ceb1cbeaa24c59323df73-20171231094521.jpg"
                ,"https://mt-zx-store.oss-cn-qingdao.aliyuncs.com/image/zhongxin/13a40c603f0ceb1cbeaa24c59323df73-20171231094521.jpg"
        });
        root.put("productDes","这是产品介绍");
        List<ZxProduct> zxProductList = new ArrayList<>();
        ZxProduct z = new ZxProduct();
        z.setName("tet");
        z.setMainPictureUri("http://mt-zx-store.oss-cn-qingdao.aliyuncs.com/image/zhongxin/13a40c603f0ceb1cbeaa24c59323df73-20171231094521.jpg");
        zxProductList.add(z);
        root.put("productTuijian",zxProductList);

        String headUri = "base/head.html";
        freeMarkerBaseBuilder(root,headUri);
        String head = FileOption.readFile("builder/"+headUri);
        return head;
    }
    public String getHtmlMenu(List<ZxProductSortTree> tree,Company company){

        Map root = new HashMap();

        root.put("sort",tree);
        root.put("company",company);
        String menuUri = "base/menu.html";
        freeMarkerBaseBuilder(root,menuUri);
        String menu = FileOption.readFile("builder/"+menuUri);
        return menu;
    }

    public String getHtmlFoot(){

        Map root = new HashMap();
        root.put("name","东莞市众鑫包装制品有限公司");
        root.put("phone","13089898889");
        root.put("about","这是关于我们");
        root.put("loginIcon","http://mt-zx-store.oss-cn-qingdao.aliyuncs.com/image/zhongxin/13a40c603f0ceb1cbeaa24c59323df73-20171231094521.jpg");
        root.put("banner",new String[]{
                "http://mt-zx-store.oss-cn-qingdao.aliyuncs.com/image/zhongxin/13a40c603f0ceb1cbeaa24c59323df73-20171231094521.jpg"
                ,"http://mt-zx-store.oss-cn-qingdao.aliyuncs.com/image/zhongxin/13a40c603f0ceb1cbeaa24c59323df73-20171231094521.jpg"
        });
        root.put("productDes","这是产品介绍");
        List<ZxProduct> zxProductList = new ArrayList<>();
        ZxProduct z = new ZxProduct();
        z.setName("tet");
        z.setMainPictureUri("http://mt-zx-store.oss-cn-qingdao.aliyuncs.com/image/zhongxin/13a40c603f0ceb1cbeaa24c59323df73-20171231094521.jpg");
        zxProductList.add(z);
        root.put("productTuijian",zxProductList);

        String footUri = "base/foot.html";
        freeMarkerBaseBuilder(root,footUri);
        String foot = FileOption.readFile("builder/"+footUri);
        return foot;
    }
    public String getHtmlFootScript(){
        String footScript = FileOption.readFile("src/main/resources/templates/base/footScript.html");
        return footScript;
    }

    public void builderProduct(){
        Map root = new HashMap();
        root.put("name","东莞市众鑫包装制品有限公司");
        root.put("phone","13089898889");
        root.put("about","这是关于我们");
        root.put("loginIcon","http://mt-zx-store.oss-cn-qingdao.aliyuncs.com/image/zhongxin/13a40c603f0ceb1cbeaa24c59323df73-20171231094521.jpg");
        root.put("banner",new String[]{
                "http://mt-zx-store.oss-cn-qingdao.aliyuncs.com/image/zhongxin/13a40c603f0ceb1cbeaa24c59323df73-20171231094521.jpg"
                ,"http://mt-zx-store.oss-cn-qingdao.aliyuncs.com/image/zhongxin/13a40c603f0ceb1cbeaa24c59323df73-20171231094521.jpg"
        });
        root.put("productDes","这是产品介绍");
        List<ZxProduct> zxProductList = new ArrayList<>();
        ZxProduct z = new ZxProduct();
        z.setName("tet");
        z.setId(1L);
        z.setMainPictureUri("http://mt-zx-store.oss-cn-qingdao.aliyuncs.com/image/zhongxin/13a40c603f0ceb1cbeaa24c59323df73-20171231094521.jpg");
        zxProductList.add(z);
        root.put("productTuijian",zxProductList);

        ZxProduct zz = new ZxProduct();
        zz.setName("tet2");
        zz.setId(2L);
        zz.setMainPictureUri("http://mt-zx-store.oss-cn-qingdao.aliyuncs.com/image/zhongxin/13a40c603f0ceb1cbeaa24c59323df73-20171231094521.jpg");
        zxProductList.add(zz);
        zxProductList.add(z);
        root.put("productList",zxProductList);

        freeMarkerBaseBuilder(root,"pro.html");
    }

    /**
     * 生成产品详情
     * @param product
     */
    public void builderProductDetail(ZxProduct product){
        if(null == product || null == product.getId()){
            log.error("生成产品详情失败，产品为null或id不存在");
            return;
        }
        updateHtml().put("data",product);
        String outUriName=String.format("product/detail/%s.html",String.valueOf(product.getId()));
        freeMarkerBaseBuilder(rootMap,"pro_detail.html",outUriName);
    }

    /**
     * 生成产品分类
     * @param
     */
    public void builderProductListBySort(String uriName,Integer maxPage,List<ZxProduct> productList){
        if(StringUtils.isBlank(uriName)){
            log.error("生成产品分类列表失败,uriName不存在");
            return;
        }
        Map temp = updateHtml();
        temp.put("productList",productList);
        temp.put("maxPage",maxPage);
        String outUriName=String.format("product/list/%s.html",uriName);
        freeMarkerBaseBuilder(temp,"pro.html",outUriName);
    }
    /**
     * 生成厂区展示
     * @param
     */
    public void builderProduceListBySort(String uriName,Integer maxPage,List<ZxProduct> productList){
        if(StringUtils.isBlank(uriName)){
            log.error("生成产区展示分类列表失败,uriName不存在");
            return;
        }
        Map temp = updateHtml();
        temp.put("productList",productList);
        temp.put("maxPage",maxPage);
        String outUriName=String.format("produce/list/%s.html",uriName);
        freeMarkerBaseBuilder(temp,"produce.html",outUriName);
    }
    /**
     * 生成产品分类
     * @param
     */
    public void builderProductList( Integer currentPage,List<ZxProduct> productList){

        Map temp = updateHtml();
        temp.put("productList",productList);
        String outUriName=String.format("product/list/index.html",currentPage);
        if(!currentPage.equals(1)){
            outUriName=String.format("product/list/index%s.html",currentPage);
        }

        freeMarkerBaseBuilder(temp,"pro.html",outUriName);
    }

    /**
     * 生成首页
     */
    public void builderIndex() {
        Company company = companyService.selectListAll().get(0);
        ConfigFrontIndex configFrontIndex = configFrontIndexService.selectListAll().get(0);

        Map temp = updateHtml();
        temp.put("company",company);
        temp.put("config",configFrontIndex);


        freeMarkerBaseBuilder(temp,"index.html");

    }
    /**
     * 生成about
     */
    public void builderAbout() {
        Company company = companyService.selectListAll().get(0);
        Map temp = updateHtml();
        temp.put("company",company);


        freeMarkerBaseBuilder(temp,"about.html");
        freeMarkerBaseBuilder(temp,"culture.html");
        freeMarkerBaseBuilder(temp,"contact.html");
        freeMarkerBaseBuilder(temp,"honor.html");


    }

    /**
     * 生成about
     */
    public void builderHonor() {
        Map temp = updateHtml();


        freeMarkerBaseBuilder(temp,"honor.html");

    }
    private void freeMarkerBaseBuilder(Map<String,Object> root,String templatePath){
        freeMarkerBaseBuilder(root,templatePath,templatePath);
    }
    @Autowired
    Configuration configuration;
    private void freeMarkerBaseBuilder(Map<String,Object> root,String templatePath,String outPath){

        try {

            Configuration cfg = new Configuration();
            cfg.setEncoding(Locale.getDefault(),"utf-8");
            cfg.setClassicCompatible(true);
            Template temp = configuration.getTemplate("templates/"+templatePath);
            //以classpath下面的static目录作为静态页面的存储目录，同时命名生成的静态html文件名称
            File ffile = new File("builder/"+outPath);

            Writer file = new FileWriter(ffile);

            temp.process(root, file);
            file.flush();
            file.close();
            PutObjectResult result = AliyunOSSClientHelper.ossClient.putObject(bucketNameZxWeb,""+outPath,new File("builder/"+outPath));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }

    /**
     * 生成配置，首页，关于，联系等页面
     */
    public void buildHtmlConfig(){
        builderAbout();
        builderIndex();
    }
    /**
     * 生成所有
     */
    public void buildHtmlAll(){
        buildHtmlConfig();
        buildAllProductDetail();
        buildAllProductList();
        buildAllProduceList();
    }

    /**
     * 生成所有产品信息详情
     */
    public void buildAllProductDetail(){
        List<ZxProduct> list = zxProductBiz.selectListAll();
        log.debug("生成所有产品详情开始");
        for(ZxProduct product : list){
            log.debug("生成产品详情 ID:{}",product.getId());
            productBuilder.builderProductDetail(product);
        }
        log.debug("生成所有产品详情完成");
    }


    /**
     * 生成所有产品列表，包含分类
     */
    public void buildAllProductList(){
        //命名:
        List<ZxProductSort> list = zxProductSortBiz.selectListAll();
        List<ZxProductSortTree> tree = zxProductSortBiz.getTree(list,-1);
        buildProductPage(-1,"index_");

        for(ZxProductSortTree sort1 : tree){
            buildProductPage(sort1.getId(),sort1.getId()+"__");

            for(TreeNode sort2 : sort1.getChildren()){
                buildProductPage(sort2.getId(),sort1.getId()+"_"+sort2.getId()+"_");
            }
        }
    }
    /**
     * 生成所有产区展示列表
     */
    public void buildAllProduceList(){
        //命名:
        buildProducePage(93,"index_");

    }
    private void buildProductPage(Integer sortId,String uriName){
        PageInfo<ZxProduct> zxProductList = null;
        if(sortId.equals(-1)){
            zxProductList = zxProductBiz.getPageList(1,20);
        }else{
            zxProductList = zxProductSortProductBiz.getListProductBySortId(1,20,sortId+"");

        }

        productBuilder.builderProductListBySort(uriName+zxProductList.getPageNum(),zxProductList.getLastPage(),zxProductList.getList());
        while(zxProductList.isHasNextPage()){
            if(sortId.equals(-1)){
                zxProductList = zxProductBiz.getPageList(zxProductList.getNextPage(),zxProductList.getPageSize());
            }else{
                zxProductList =zxProductSortProductBiz.getListProductBySortId(zxProductList.getNextPage(),zxProductList.getPageSize(),sortId+"");

            }

            productBuilder.builderProductListBySort(uriName+zxProductList.getPageNum(),zxProductList.getLastPage(),zxProductList.getList());

        }

    }
    private void buildProducePage(Integer sortId,String uriName){
        PageInfo<ZxProduct> zxProductList = null;
        zxProductList = zxProductSortProductBiz.getListProductBySortId(1,20,sortId+"");


        productBuilder.builderProduceListBySort(uriName+zxProductList.getPageNum(),zxProductList.getLastPage(),zxProductList.getList());
        while(zxProductList.isHasNextPage()){
            if(sortId.equals(-1)){
                zxProductList = zxProductBiz.getPageList(zxProductList.getNextPage(),zxProductList.getPageSize());
            }else{
                zxProductList =zxProductSortProductBiz.getListProductBySortId(zxProductList.getNextPage(),zxProductList.getPageSize(),sortId+"");

            }

            productBuilder.builderProduceListBySort(uriName+zxProductList.getPageNum(),zxProductList.getLastPage(),zxProductList.getList());

        }

    }


}
