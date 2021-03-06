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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * M3u8Settings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M3u8SettingsJsonUnmarshaller implements Unmarshaller<M3u8Settings, JsonUnmarshallerContext> {

    public M3u8Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        M3u8Settings m3u8Settings = new M3u8Settings();

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
                if (context.testExpression("audioFramesPerPes", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setAudioFramesPerPes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("audioPids", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setAudioPids(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))

                    .unmarshall(context));
                }
                if (context.testExpression("nielsenId3", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setNielsenId3(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("patInterval", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setPatInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pcrControl", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setPcrControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pcrPid", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setPcrPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pmtInterval", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setPmtInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pmtPid", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setPmtPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("privateMetadataPid", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setPrivateMetadataPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("programNumber", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setProgramNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("scte35Pid", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setScte35Pid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("scte35Source", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setScte35Source(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timedMetadata", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setTimedMetadata(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timedMetadataPid", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setTimedMetadataPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("transportStreamId", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setTransportStreamId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("videoPid", targetDepth)) {
                    context.nextToken();
                    m3u8Settings.setVideoPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return m3u8Settings;
    }

    private static M3u8SettingsJsonUnmarshaller instance;

    public static M3u8SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new M3u8SettingsJsonUnmarshaller();
        return instance;
    }
}
