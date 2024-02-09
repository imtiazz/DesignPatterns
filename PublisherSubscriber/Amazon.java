package DesignPattern.PublisherSubscriber;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    List<OrderPlacedSubscriber> orderPlacedSubscriberList;
    private static Amazon instance;
    private  Amazon(){
        orderPlacedSubscriberList=new ArrayList<>();
        
    }

    public static Amazon getInstance(){
        if (instance==null){
            synchronized (Amazon.class){
                if (instance==null)
                    instance=new Amazon();
            }
        }
        return  instance;
    }
    public void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscriberList.add(orderPlacedSubscriber);

    }
    public void deRegisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscriberList.remove(orderPlacedSubscriber);
    }

    public void orderPlace(){
        for(OrderPlacedSubscriber o: orderPlacedSubscriberList)
            o.notifyUser();
    }






}
