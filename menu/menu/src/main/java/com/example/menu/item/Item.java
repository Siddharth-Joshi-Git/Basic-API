// com/example/menu/item/Item.java

package com.example.menu.item;

import org.springframework.data.annotation.Id;

public class Item {
    private final Long id;
    private final String name;
    private final String description;


    public Item (
        Long id,
        String name,
        String description

    ) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

   public String getDescription() {
        return description;
    }

    public Item updateWith(Item item) {
        return new Item(
                this.id,
                item.name,
                item.description

        );
    }
}