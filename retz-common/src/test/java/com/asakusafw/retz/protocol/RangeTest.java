/**
 *    Retz
 *    Copyright (C) 2016 Nautilus Technologies, KK.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.asakusafw.retz.protocol;

import com.asakusafw.retz.protocol.Range;
import org.junit.Test;

public class RangeTest {

    @Test
    public void parseTest() {
        Range r;

        r = Range.parseRange("2-20");
        assert r.getMin() == 2;
        assert r.getMax() == 20;

        r = Range.parseRange("2-");
        assert r.getMin() == 2;
        assert r.getMax() == Integer.MAX_VALUE;
    }

}