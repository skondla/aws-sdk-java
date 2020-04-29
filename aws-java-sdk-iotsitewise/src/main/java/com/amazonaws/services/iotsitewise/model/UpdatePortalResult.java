/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdatePortal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePortalResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the portal, which contains a state (<code>UPDATING</code> after successfully calling this action)
     * and any error message.
     * </p>
     */
    private PortalStatus portalStatus;

    /**
     * <p>
     * The status of the portal, which contains a state (<code>UPDATING</code> after successfully calling this action)
     * and any error message.
     * </p>
     * 
     * @param portalStatus
     *        The status of the portal, which contains a state (<code>UPDATING</code> after successfully calling this
     *        action) and any error message.
     */

    public void setPortalStatus(PortalStatus portalStatus) {
        this.portalStatus = portalStatus;
    }

    /**
     * <p>
     * The status of the portal, which contains a state (<code>UPDATING</code> after successfully calling this action)
     * and any error message.
     * </p>
     * 
     * @return The status of the portal, which contains a state (<code>UPDATING</code> after successfully calling this
     *         action) and any error message.
     */

    public PortalStatus getPortalStatus() {
        return this.portalStatus;
    }

    /**
     * <p>
     * The status of the portal, which contains a state (<code>UPDATING</code> after successfully calling this action)
     * and any error message.
     * </p>
     * 
     * @param portalStatus
     *        The status of the portal, which contains a state (<code>UPDATING</code> after successfully calling this
     *        action) and any error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortalResult withPortalStatus(PortalStatus portalStatus) {
        setPortalStatus(portalStatus);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPortalStatus() != null)
            sb.append("PortalStatus: ").append(getPortalStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePortalResult == false)
            return false;
        UpdatePortalResult other = (UpdatePortalResult) obj;
        if (other.getPortalStatus() == null ^ this.getPortalStatus() == null)
            return false;
        if (other.getPortalStatus() != null && other.getPortalStatus().equals(this.getPortalStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortalStatus() == null) ? 0 : getPortalStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePortalResult clone() {
        try {
            return (UpdatePortalResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
