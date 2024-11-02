module nine.feat.moduled {
    // 引入模块c，并自动引入模块c所引入的模块
    requires transitive nine.feat.modulec;
    // 实现其他模块声明的接口
    provides cn.y.java.service.UserService with cn.y.java.service_impl.UserServiceImpl;
}