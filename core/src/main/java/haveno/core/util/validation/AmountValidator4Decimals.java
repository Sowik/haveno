/*
 * This file is part of Haveno.
 *
 * Haveno is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Haveno is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Haveno. If not, see <http://www.gnu.org/licenses/>.
 */

package haveno.core.util.validation;

import javax.inject.Inject;

public class AmountValidator4Decimals extends MonetaryValidator {
    @Override
    public double getMinValue() {
        return 0.0001;
    }

    @Override
    public double getMaxValue() {
        // Hard to say what the max value should be (zimbabwe dollar....)?
        // Lets set it to Double.MAX_VALUE until we find some reasonable number
        return Double.MAX_VALUE;
    }

    @Inject
    public AmountValidator4Decimals() {
    }
}
