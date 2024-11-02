package cn.y.java.sealed_class;

public sealed class A permits B, C, D {
    private String name;
}
