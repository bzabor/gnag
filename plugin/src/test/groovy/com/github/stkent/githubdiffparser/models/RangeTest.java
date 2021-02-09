/**
 * Copyright 2016 Bryan Kelly
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.github.stkent.githubdiffparser.models;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RangeTest {
    
    @Test
    public void testContains() {
        final int rangeStart = 3;
        final int rangeCount = 5;
        
        final Range range = new Range(3, 5);

        assertFalse(range.contains(rangeStart - 1));

        for (int lineNumber = rangeStart; lineNumber < rangeStart + rangeCount; lineNumber++) {
            assertTrue(range.contains(lineNumber));
        }

        assertFalse(range.contains(rangeStart + rangeCount));
    }
    
}
