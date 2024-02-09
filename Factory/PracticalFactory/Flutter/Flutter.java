package DesignPattern.Factory.PracticalFactory.Flutter
        ;

public class Flutter {
    private SupportedPlatform platform;
    public Flutter(SupportedPlatform platform){
        this.platform=platform;
    }
    public void setRefreshRate(){
        System.out.println("Refresh rate is set at 0.5");
    }

    public  void setTheme(){
        System.out.println("Some theme is set");
    }
    public  UIFactory createFactory(){
        return UIFactoryFactory.createUIFactory(platform);
    }



}
