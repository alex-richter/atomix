/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.kuujo.raft.state;

import java.util.Set;

import net.kuujo.raft.protocol.PingRequest;
import net.kuujo.raft.protocol.PollRequest;
import net.kuujo.raft.protocol.SubmitRequest;
import net.kuujo.raft.protocol.SyncRequest;

import org.vertx.java.core.Handler;

/**
 * A start state.
 *
 * @author Jordan Halterman
 */
public class Start extends State {

  @Override
  public void startUp(Handler<Void> doneHandler) {
    doneHandler.handle((Void) null);
  }

  @Override
  public void configure(Set<String> members) {
    // Do nothing.
  }

  @Override
  public void handlePing(PingRequest request) {
    request.error("Service not started.");
  }

  @Override
  public void handleSync(SyncRequest request) {
    request.error("Service not started.");
  }

  @Override
  public void handlePoll(PollRequest request) {
    request.error("Service not started.");
  }

  @Override
  public void handleSubmit(SubmitRequest request) {
    request.error("Service not started.");
  }

  @Override
  public void shutDown(Handler<Void> doneHandler) {
    doneHandler.handle((Void) null);
  }

}
