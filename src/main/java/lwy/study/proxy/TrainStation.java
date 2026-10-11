package lwy.study.proxy;

public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站售出一张 G2794 次黄梅东开往合肥南的高铁票（7车16F）");
    }
}
