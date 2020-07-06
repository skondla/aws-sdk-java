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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListThemes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThemesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account that contains the themes that you're listing.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The type of themes that you want to list. Valid options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL (default)</code>- Display all existing themes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code> - Display only the themes created by people using Amazon QuickSight.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code> - Display only the starting themes defined by QuickSight.
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * The ID of the AWS account that contains the themes that you're listing.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the themes that you're listing.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the themes that you're listing.
     * </p>
     * 
     * @return The ID of the AWS account that contains the themes that you're listing.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the themes that you're listing.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the themes that you're listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThemesRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThemesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @return The maximum number of results to be returned per request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThemesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The type of themes that you want to list. Valid options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL (default)</code>- Display all existing themes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code> - Display only the themes created by people using Amazon QuickSight.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code> - Display only the starting themes defined by QuickSight.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of themes that you want to list. Valid options include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL (default)</code>- Display all existing themes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM</code> - Display only the themes created by people using Amazon QuickSight.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUICKSIGHT</code> - Display only the starting themes defined by QuickSight.
     *        </p>
     *        </li>
     * @see ThemeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of themes that you want to list. Valid options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL (default)</code>- Display all existing themes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code> - Display only the themes created by people using Amazon QuickSight.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code> - Display only the starting themes defined by QuickSight.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of themes that you want to list. Valid options include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL (default)</code>- Display all existing themes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CUSTOM</code> - Display only the themes created by people using Amazon QuickSight.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QUICKSIGHT</code> - Display only the starting themes defined by QuickSight.
     *         </p>
     *         </li>
     * @see ThemeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of themes that you want to list. Valid options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL (default)</code>- Display all existing themes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code> - Display only the themes created by people using Amazon QuickSight.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code> - Display only the starting themes defined by QuickSight.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of themes that you want to list. Valid options include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL (default)</code>- Display all existing themes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM</code> - Display only the themes created by people using Amazon QuickSight.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUICKSIGHT</code> - Display only the starting themes defined by QuickSight.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThemeType
     */

    public ListThemesRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of themes that you want to list. Valid options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL (default)</code>- Display all existing themes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM</code> - Display only the themes created by people using Amazon QuickSight.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code> - Display only the starting themes defined by QuickSight.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of themes that you want to list. Valid options include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL (default)</code>- Display all existing themes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM</code> - Display only the themes created by people using Amazon QuickSight.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUICKSIGHT</code> - Display only the starting themes defined by QuickSight.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThemeType
     */

    public ListThemesRequest withType(ThemeType type) {
        this.type = type.toString();
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThemesRequest == false)
            return false;
        ListThemesRequest other = (ListThemesRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ListThemesRequest clone() {
        return (ListThemesRequest) super.clone();
    }

}
