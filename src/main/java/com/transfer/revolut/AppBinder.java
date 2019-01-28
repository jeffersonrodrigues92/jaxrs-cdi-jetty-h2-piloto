package com.transfer.revolut;

import com.transfer.revolut.service.TransferService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class AppBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(TransferService.class).to(TransferService.class);
    }
}
