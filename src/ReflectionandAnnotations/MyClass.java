package ReflectionandAnnotations;

class MyClass {
    @MethodInfo(author = "John Doe", version = 1)
    public void myMethod() {
        System.out.println("Hello");
    }
}
