/*
 * Copyright 2012 Alessandro Bahgat Shehata Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and limitations under the
 * License.
 */
package mezz.jei.search;

import mezz.jei.util.Substring;

/**
 * Represents an Edge in the Suffix Tree. It has a label and a destination Node
 * <p>
 * Edited by mezz: - optimized with SubString
 */
public class Edge<T> extends Substring {

    private final Node<T> dest;

    public Edge(Substring subString, Node<T> dest) {
        super(subString);
        this.dest = dest;
    }

    public Node<T> getDest() {
        return dest;
    }
}
