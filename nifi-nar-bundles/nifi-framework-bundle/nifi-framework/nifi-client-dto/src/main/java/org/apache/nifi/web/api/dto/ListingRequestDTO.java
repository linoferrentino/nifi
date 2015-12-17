/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.web.api.dto;

import com.wordnik.swagger.annotations.ApiModelProperty;
import org.apache.nifi.web.api.dto.util.TimestampAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.List;

public class ListingRequestDTO {

    private String id;
    private String uri;

    private Date submissionTime;
    private Date lastUpdated;

    private Integer percentCompleted;
    private Boolean finished;
    private String failureReason;

    private String state;

    private List<FlowFileSummaryDTO> flowFileSummaries;

    /**
     * @return the id for this listing request.
     */
    @ApiModelProperty(
        value = "The id for this listing request."
    )
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the URI for this listing request.
     */
    @ApiModelProperty(
        value = "The URI for futures requests to this listing request."
    )
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * @return time the query was submitted
     */
    @XmlJavaTypeAdapter(TimestampAdapter.class)
    @ApiModelProperty(
        value = "The timestamp when the query was submitted."
    )
    public Date getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(Date submissionTime) {
        this.submissionTime = submissionTime;
    }

    /**
     * @return the time this request was last updated
     */
    @XmlJavaTypeAdapter(TimestampAdapter.class)
    @ApiModelProperty(
        value = "The last time this listing request was updated."
    )
    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * @return percent completed
     */
    @ApiModelProperty(
        value = "The current percent complete."
    )
    public Integer getPercentCompleted() {
        return percentCompleted;
    }

    public void setPercentCompleted(Integer percentCompleted) {
        this.percentCompleted = percentCompleted;
    }

    /**
     * @return whether the query has finished
     */
    @ApiModelProperty(
        value = "Whether the query has finished."
    )
    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    /**
     * @return the reason, if any, that this listing request failed
     */
    @ApiModelProperty(
        value = "The reason, if any, that this listing request failed."
    )
    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * @return the current state of the listing request.
     */
    @ApiModelProperty(
        value = "The current state of the listing request."
    )
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the FlowFile summaries.
     */
    @ApiModelProperty(
        value = "The FlowFile summaries. The summaries will be populated once the request has completed."
    )
    public List<FlowFileSummaryDTO> getFlowFileSummaries() {
        return flowFileSummaries;
    }

    public void setFlowFileSummaries(List<FlowFileSummaryDTO> flowFileSummaries) {
        this.flowFileSummaries = flowFileSummaries;
    }
}
