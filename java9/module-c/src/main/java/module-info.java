module nine.feat.modulec {
    // 暴露包给指定的模块
    exports cn.y.java.service to nine.feat.moduled;
    // 声明接口，给其他模块实现
    uses cn.y.java.service.UserService;
    // 引入模块b，并自动引入模块b所引入的模块
    requires transitive nine.feat.moduleb;
}