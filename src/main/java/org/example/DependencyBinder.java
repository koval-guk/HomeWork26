package org.example;

import jakarta.inject.Singleton;
import org.example.service.OrderRepoClassService;
import org.example.service.OrderService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class DependencyBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(OrderRepoClassService.class).to(OrderService.class).in(Singleton.class);
    }
}
