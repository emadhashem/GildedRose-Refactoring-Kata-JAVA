package com.gildedrose;

public class BackStage extends InventoryItem {
    public static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    public BackStage(Item item) {
        super(item);
    }

    @Override
    protected void processExpired() {
        item.quality = 0;
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
        if (item.sellIn < 11) {
            increaseQuality();
        }

        if (item.sellIn < 6) {
            increaseQuality();
        }
    }
}
