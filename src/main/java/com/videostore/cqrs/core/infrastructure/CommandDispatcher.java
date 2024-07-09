/*
 * Copyright (c) 2024 Zorica Maneva. This source file can not be copied and/or distributed without the express
 * written permission of Zorica Maneva. Any unauthorized use is subject to criminal prosecution.
 */

package com.videostore.cqrs.core.infrastructure;

import org.springframework.web.bind.MethodArgumentNotValidException;

import com.videostore.cqrs.core.commands.BaseCommand;
import com.videostore.cqrs.core.commands.CommandHandlerMethod;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand command) throws MethodArgumentNotValidException;
}
