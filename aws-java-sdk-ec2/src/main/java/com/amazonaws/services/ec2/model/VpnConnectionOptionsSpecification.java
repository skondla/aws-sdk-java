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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes VPN connection options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpnConnectionOptionsSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpnConnectionOptionsSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * Indicate whether to enable acceleration for the VPN connection.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean enableAcceleration;
    /**
     * <p>
     * Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a device
     * that does not support BGP, you must specify <code>true</code>. Use <a>CreateVpnConnectionRoute</a> to create a
     * static route.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean staticRoutesOnly;
    /**
     * <p>
     * Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.
     * </p>
     * <p>
     * Default: <code>ipv4</code>
     * </p>
     */
    private String tunnelInsideIpVersion;
    /**
     * <p>
     * The tunnel options for the VPN connection.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpnTunnelOptionsSpecification> tunnelOptions;

    /**
     * <p>
     * Indicate whether to enable acceleration for the VPN connection.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param enableAcceleration
     *        Indicate whether to enable acceleration for the VPN connection.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
    }

    /**
     * <p>
     * Indicate whether to enable acceleration for the VPN connection.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicate whether to enable acceleration for the VPN connection.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getEnableAcceleration() {
        return this.enableAcceleration;
    }

    /**
     * <p>
     * Indicate whether to enable acceleration for the VPN connection.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param enableAcceleration
     *        Indicate whether to enable acceleration for the VPN connection.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnectionOptionsSpecification withEnableAcceleration(Boolean enableAcceleration) {
        setEnableAcceleration(enableAcceleration);
        return this;
    }

    /**
     * <p>
     * Indicate whether to enable acceleration for the VPN connection.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicate whether to enable acceleration for the VPN connection.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isEnableAcceleration() {
        return this.enableAcceleration;
    }

    /**
     * <p>
     * Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a device
     * that does not support BGP, you must specify <code>true</code>. Use <a>CreateVpnConnectionRoute</a> to create a
     * static route.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param staticRoutesOnly
     *        Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a
     *        device that does not support BGP, you must specify <code>true</code>. Use <a>CreateVpnConnectionRoute</a>
     *        to create a static route.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setStaticRoutesOnly(Boolean staticRoutesOnly) {
        this.staticRoutesOnly = staticRoutesOnly;
    }

    /**
     * <p>
     * Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a device
     * that does not support BGP, you must specify <code>true</code>. Use <a>CreateVpnConnectionRoute</a> to create a
     * static route.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a
     *         device that does not support BGP, you must specify <code>true</code>. Use <a>CreateVpnConnectionRoute</a>
     *         to create a static route.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getStaticRoutesOnly() {
        return this.staticRoutesOnly;
    }

    /**
     * <p>
     * Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a device
     * that does not support BGP, you must specify <code>true</code>. Use <a>CreateVpnConnectionRoute</a> to create a
     * static route.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param staticRoutesOnly
     *        Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a
     *        device that does not support BGP, you must specify <code>true</code>. Use <a>CreateVpnConnectionRoute</a>
     *        to create a static route.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnectionOptionsSpecification withStaticRoutesOnly(Boolean staticRoutesOnly) {
        setStaticRoutesOnly(staticRoutesOnly);
        return this;
    }

    /**
     * <p>
     * Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a device
     * that does not support BGP, you must specify <code>true</code>. Use <a>CreateVpnConnectionRoute</a> to create a
     * static route.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a
     *         device that does not support BGP, you must specify <code>true</code>. Use <a>CreateVpnConnectionRoute</a>
     *         to create a static route.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isStaticRoutesOnly() {
        return this.staticRoutesOnly;
    }

    /**
     * <p>
     * Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.
     * </p>
     * <p>
     * Default: <code>ipv4</code>
     * </p>
     * 
     * @param tunnelInsideIpVersion
     *        Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.</p>
     *        <p>
     *        Default: <code>ipv4</code>
     * @see TunnelInsideIpVersion
     */

    public void setTunnelInsideIpVersion(String tunnelInsideIpVersion) {
        this.tunnelInsideIpVersion = tunnelInsideIpVersion;
    }

    /**
     * <p>
     * Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.
     * </p>
     * <p>
     * Default: <code>ipv4</code>
     * </p>
     * 
     * @return Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.</p>
     *         <p>
     *         Default: <code>ipv4</code>
     * @see TunnelInsideIpVersion
     */

    public String getTunnelInsideIpVersion() {
        return this.tunnelInsideIpVersion;
    }

    /**
     * <p>
     * Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.
     * </p>
     * <p>
     * Default: <code>ipv4</code>
     * </p>
     * 
     * @param tunnelInsideIpVersion
     *        Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.</p>
     *        <p>
     *        Default: <code>ipv4</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TunnelInsideIpVersion
     */

    public VpnConnectionOptionsSpecification withTunnelInsideIpVersion(String tunnelInsideIpVersion) {
        setTunnelInsideIpVersion(tunnelInsideIpVersion);
        return this;
    }

    /**
     * <p>
     * Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.
     * </p>
     * <p>
     * Default: <code>ipv4</code>
     * </p>
     * 
     * @param tunnelInsideIpVersion
     *        Indicate whether the VPN tunnels process IPv4 or IPv6 traffic.</p>
     *        <p>
     *        Default: <code>ipv4</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TunnelInsideIpVersion
     */

    public VpnConnectionOptionsSpecification withTunnelInsideIpVersion(TunnelInsideIpVersion tunnelInsideIpVersion) {
        this.tunnelInsideIpVersion = tunnelInsideIpVersion.toString();
        return this;
    }

    /**
     * <p>
     * The tunnel options for the VPN connection.
     * </p>
     * 
     * @return The tunnel options for the VPN connection.
     */

    public java.util.List<VpnTunnelOptionsSpecification> getTunnelOptions() {
        if (tunnelOptions == null) {
            tunnelOptions = new com.amazonaws.internal.SdkInternalList<VpnTunnelOptionsSpecification>();
        }
        return tunnelOptions;
    }

    /**
     * <p>
     * The tunnel options for the VPN connection.
     * </p>
     * 
     * @param tunnelOptions
     *        The tunnel options for the VPN connection.
     */

    public void setTunnelOptions(java.util.Collection<VpnTunnelOptionsSpecification> tunnelOptions) {
        if (tunnelOptions == null) {
            this.tunnelOptions = null;
            return;
        }

        this.tunnelOptions = new com.amazonaws.internal.SdkInternalList<VpnTunnelOptionsSpecification>(tunnelOptions);
    }

    /**
     * <p>
     * The tunnel options for the VPN connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTunnelOptions(java.util.Collection)} or {@link #withTunnelOptions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tunnelOptions
     *        The tunnel options for the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnectionOptionsSpecification withTunnelOptions(VpnTunnelOptionsSpecification... tunnelOptions) {
        if (this.tunnelOptions == null) {
            setTunnelOptions(new com.amazonaws.internal.SdkInternalList<VpnTunnelOptionsSpecification>(tunnelOptions.length));
        }
        for (VpnTunnelOptionsSpecification ele : tunnelOptions) {
            this.tunnelOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tunnel options for the VPN connection.
     * </p>
     * 
     * @param tunnelOptions
     *        The tunnel options for the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnectionOptionsSpecification withTunnelOptions(java.util.Collection<VpnTunnelOptionsSpecification> tunnelOptions) {
        setTunnelOptions(tunnelOptions);
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
        if (getEnableAcceleration() != null)
            sb.append("EnableAcceleration: ").append(getEnableAcceleration()).append(",");
        if (getStaticRoutesOnly() != null)
            sb.append("StaticRoutesOnly: ").append(getStaticRoutesOnly()).append(",");
        if (getTunnelInsideIpVersion() != null)
            sb.append("TunnelInsideIpVersion: ").append(getTunnelInsideIpVersion()).append(",");
        if (getTunnelOptions() != null)
            sb.append("TunnelOptions: ").append(getTunnelOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpnConnectionOptionsSpecification == false)
            return false;
        VpnConnectionOptionsSpecification other = (VpnConnectionOptionsSpecification) obj;
        if (other.getEnableAcceleration() == null ^ this.getEnableAcceleration() == null)
            return false;
        if (other.getEnableAcceleration() != null && other.getEnableAcceleration().equals(this.getEnableAcceleration()) == false)
            return false;
        if (other.getStaticRoutesOnly() == null ^ this.getStaticRoutesOnly() == null)
            return false;
        if (other.getStaticRoutesOnly() != null && other.getStaticRoutesOnly().equals(this.getStaticRoutesOnly()) == false)
            return false;
        if (other.getTunnelInsideIpVersion() == null ^ this.getTunnelInsideIpVersion() == null)
            return false;
        if (other.getTunnelInsideIpVersion() != null && other.getTunnelInsideIpVersion().equals(this.getTunnelInsideIpVersion()) == false)
            return false;
        if (other.getTunnelOptions() == null ^ this.getTunnelOptions() == null)
            return false;
        if (other.getTunnelOptions() != null && other.getTunnelOptions().equals(this.getTunnelOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableAcceleration() == null) ? 0 : getEnableAcceleration().hashCode());
        hashCode = prime * hashCode + ((getStaticRoutesOnly() == null) ? 0 : getStaticRoutesOnly().hashCode());
        hashCode = prime * hashCode + ((getTunnelInsideIpVersion() == null) ? 0 : getTunnelInsideIpVersion().hashCode());
        hashCode = prime * hashCode + ((getTunnelOptions() == null) ? 0 : getTunnelOptions().hashCode());
        return hashCode;
    }

    @Override
    public VpnConnectionOptionsSpecification clone() {
        try {
            return (VpnConnectionOptionsSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
