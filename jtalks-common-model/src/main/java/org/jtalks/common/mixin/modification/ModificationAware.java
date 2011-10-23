/**
 * Copyright (C) 2011  JTalks.org Team
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.jtalks.common.mixin.modification;

import org.joda.time.DateTime;
import org.jtalks.common.model.entity.User;

/**
 * <p>This interface extends {@link ModificationAwareEntity} by adding setter for creation date and the creator.</p>
 * Date: 18.09.2011<br />
 * Time: 14:14
 *
 * @author Alexey Malev
 */
public interface ModificationAware extends ModificationAwareEntity {
    /**
     * This method sets entity modification date to specified value.
     *
     * @param modificationDate New entity modification date.
     */
    void setModificationDate(DateTime modificationDate);

    /**
     * This method sets last user who modified entity, to specified value.
     *
     * @param user Last user modified entity.
     */
    void setModifiedBy(User user);
}