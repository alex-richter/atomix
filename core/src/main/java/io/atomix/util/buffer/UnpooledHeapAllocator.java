/*
 * Copyright 2017-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atomix.util.buffer;

import io.atomix.util.memory.HeapMemory;

/**
 * Unpooled heap allocator.
 *
 * @author <a href="http://github.com/kuujo">Jordan Halterman</a>
 */
public class UnpooledHeapAllocator extends UnpooledAllocator {

  @Override
  protected long maxCapacity() {
    return HeapMemory.MAX_SIZE;
  }

  @Override
  public Buffer allocate(long initialCapacity, long maxCapacity) {
    return HeapBuffer.allocate(initialCapacity, maxCapacity);
  }

}