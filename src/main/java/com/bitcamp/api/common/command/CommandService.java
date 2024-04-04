package com.bitcamp.api.common.command;

import com.bitcamp.api.common.component.MessengerVo;

public interface CommandService<T> {
    String save(T t);
    String insertMany();
    String delete(T t);
}
