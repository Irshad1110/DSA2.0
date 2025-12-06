public class SingletonDesignPattern {

    private volatile SingletonDesignPattern singletonDesignPattern = null;

    private SingletonDesignPattern() {
        System.out.print("Constructor");
    }

    public SingletonDesignPattern getSingletonDesignPattern() {
        if(singletonDesignPattern == null) {
            synchronized (SingletonDesignPattern.class) {
                if(singletonDesignPattern == null) {
                    singletonDesignPattern = new SingletonDesignPattern();
                }
            }
        }
        return singletonDesignPattern;
    }






}
