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
package com.amazonaws.services.iotsitewise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssetProperty JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetPropertyJsonUnmarshaller implements Unmarshaller<AssetProperty, JsonUnmarshallerContext> {

    public AssetProperty unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssetProperty assetProperty = new AssetProperty();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    assetProperty.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    assetProperty.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("alias", targetDepth)) {
                    context.nextToken();
                    assetProperty.setAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("notification", targetDepth)) {
                    context.nextToken();
                    assetProperty.setNotification(PropertyNotificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dataType", targetDepth)) {
                    context.nextToken();
                    assetProperty.setDataType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("unit", targetDepth)) {
                    context.nextToken();
                    assetProperty.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assetProperty;
    }

    private static AssetPropertyJsonUnmarshaller instance;

    public static AssetPropertyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssetPropertyJsonUnmarshaller();
        return instance;
    }
}
