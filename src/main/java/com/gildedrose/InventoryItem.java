package com.gildedrose;

public class InventoryItem {
    protected final Item item;

    public InventoryItem(Item item) {
        this.item = item;
    }

    public static InventoryItem create(Item item) {
        if (item.name.equals(AgedBrie.NAME)) {
            return new AgedBrie(item);
        }
        if (item.name.equals(BackStage.NAME)) {
            return new BackStage(item);
        }
        if (item.name.equals(Sulfuras.NAME)) {
            return new Sulfuras(item);
        }
        if (item.name.contains(Conjured.NAME)) {
            return new Conjured(item);
        }
        return new InventoryItem(item);

    }

    public void dailyUpdate() {
        updateQuality();

        updateSellIn();

        if (isExpired()) {
            processExpired();
        }
    }

    protected void processExpired() {
        decreaseQuality();
    }

    protected void updateQuality() {
        decreaseQuality();
    }

    protected void decreaseQuality() {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    protected void increaseQuality() {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    protected void updateSellIn() {

        item.sellIn--;
    }

    protected boolean isExpired() {
        return item.sellIn < 0;
    }
}
