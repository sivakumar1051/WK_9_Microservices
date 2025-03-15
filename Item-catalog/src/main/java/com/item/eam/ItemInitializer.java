package com.item.eam;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;

@Component
class ItemInitializer implements CommandLineRunner {

    private final ItemRepository itemRepository;

    public ItemInitializer(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
                .forEach(item -> itemRepository.save(new Item(item)));

        itemRepository.findAll().forEach(System.out::println);
    }
}
