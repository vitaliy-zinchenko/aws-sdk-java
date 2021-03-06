/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these settings
 * only apply to the <code>Scheduled</code> trigger type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ScheduledTriggerProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledTriggerProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The scheduling expression that determines the rate at which the schedule will run, for example
     * <code>rate(5minutes)</code>.
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each flow
     * run.
     * </p>
     */
    private String dataPullMode;
    /**
     * <p>
     * Specifies the scheduled start time for a schedule-triggered flow.
     * </p>
     */
    private java.util.Date scheduleStartTime;
    /**
     * <p>
     * Specifies the scheduled end time for a schedule-triggered flow.
     * </p>
     */
    private java.util.Date scheduleEndTime;
    /**
     * <p>
     * Specifies the time zone used when referring to the date and time of a scheduled-triggered flow, such as
     * <code>America/New_York</code>.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * Specifies the optional offset that is added to the time interval for a schedule-triggered flow.
     * </p>
     */
    private Long scheduleOffset;

    /**
     * <p>
     * The scheduling expression that determines the rate at which the schedule will run, for example
     * <code>rate(5minutes)</code>.
     * </p>
     * 
     * @param scheduleExpression
     *        The scheduling expression that determines the rate at which the schedule will run, for example
     *        <code>rate(5minutes)</code>.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * The scheduling expression that determines the rate at which the schedule will run, for example
     * <code>rate(5minutes)</code>.
     * </p>
     * 
     * @return The scheduling expression that determines the rate at which the schedule will run, for example
     *         <code>rate(5minutes)</code>.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * The scheduling expression that determines the rate at which the schedule will run, for example
     * <code>rate(5minutes)</code>.
     * </p>
     * 
     * @param scheduleExpression
     *        The scheduling expression that determines the rate at which the schedule will run, for example
     *        <code>rate(5minutes)</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledTriggerProperties withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each flow
     * run.
     * </p>
     * 
     * @param dataPullMode
     *        Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each
     *        flow run.
     * @see DataPullMode
     */

    public void setDataPullMode(String dataPullMode) {
        this.dataPullMode = dataPullMode;
    }

    /**
     * <p>
     * Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each flow
     * run.
     * </p>
     * 
     * @return Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each
     *         flow run.
     * @see DataPullMode
     */

    public String getDataPullMode() {
        return this.dataPullMode;
    }

    /**
     * <p>
     * Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each flow
     * run.
     * </p>
     * 
     * @param dataPullMode
     *        Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each
     *        flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataPullMode
     */

    public ScheduledTriggerProperties withDataPullMode(String dataPullMode) {
        setDataPullMode(dataPullMode);
        return this;
    }

    /**
     * <p>
     * Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each flow
     * run.
     * </p>
     * 
     * @param dataPullMode
     *        Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each
     *        flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataPullMode
     */

    public ScheduledTriggerProperties withDataPullMode(DataPullMode dataPullMode) {
        this.dataPullMode = dataPullMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the scheduled start time for a schedule-triggered flow.
     * </p>
     * 
     * @param scheduleStartTime
     *        Specifies the scheduled start time for a schedule-triggered flow.
     */

    public void setScheduleStartTime(java.util.Date scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }

    /**
     * <p>
     * Specifies the scheduled start time for a schedule-triggered flow.
     * </p>
     * 
     * @return Specifies the scheduled start time for a schedule-triggered flow.
     */

    public java.util.Date getScheduleStartTime() {
        return this.scheduleStartTime;
    }

    /**
     * <p>
     * Specifies the scheduled start time for a schedule-triggered flow.
     * </p>
     * 
     * @param scheduleStartTime
     *        Specifies the scheduled start time for a schedule-triggered flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledTriggerProperties withScheduleStartTime(java.util.Date scheduleStartTime) {
        setScheduleStartTime(scheduleStartTime);
        return this;
    }

    /**
     * <p>
     * Specifies the scheduled end time for a schedule-triggered flow.
     * </p>
     * 
     * @param scheduleEndTime
     *        Specifies the scheduled end time for a schedule-triggered flow.
     */

    public void setScheduleEndTime(java.util.Date scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }

    /**
     * <p>
     * Specifies the scheduled end time for a schedule-triggered flow.
     * </p>
     * 
     * @return Specifies the scheduled end time for a schedule-triggered flow.
     */

    public java.util.Date getScheduleEndTime() {
        return this.scheduleEndTime;
    }

    /**
     * <p>
     * Specifies the scheduled end time for a schedule-triggered flow.
     * </p>
     * 
     * @param scheduleEndTime
     *        Specifies the scheduled end time for a schedule-triggered flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledTriggerProperties withScheduleEndTime(java.util.Date scheduleEndTime) {
        setScheduleEndTime(scheduleEndTime);
        return this;
    }

    /**
     * <p>
     * Specifies the time zone used when referring to the date and time of a scheduled-triggered flow, such as
     * <code>America/New_York</code>.
     * </p>
     * 
     * @param timezone
     *        Specifies the time zone used when referring to the date and time of a scheduled-triggered flow, such as
     *        <code>America/New_York</code>.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * Specifies the time zone used when referring to the date and time of a scheduled-triggered flow, such as
     * <code>America/New_York</code>.
     * </p>
     * 
     * @return Specifies the time zone used when referring to the date and time of a scheduled-triggered flow, such as
     *         <code>America/New_York</code>.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * Specifies the time zone used when referring to the date and time of a scheduled-triggered flow, such as
     * <code>America/New_York</code>.
     * </p>
     * 
     * @param timezone
     *        Specifies the time zone used when referring to the date and time of a scheduled-triggered flow, such as
     *        <code>America/New_York</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledTriggerProperties withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * Specifies the optional offset that is added to the time interval for a schedule-triggered flow.
     * </p>
     * 
     * @param scheduleOffset
     *        Specifies the optional offset that is added to the time interval for a schedule-triggered flow.
     */

    public void setScheduleOffset(Long scheduleOffset) {
        this.scheduleOffset = scheduleOffset;
    }

    /**
     * <p>
     * Specifies the optional offset that is added to the time interval for a schedule-triggered flow.
     * </p>
     * 
     * @return Specifies the optional offset that is added to the time interval for a schedule-triggered flow.
     */

    public Long getScheduleOffset() {
        return this.scheduleOffset;
    }

    /**
     * <p>
     * Specifies the optional offset that is added to the time interval for a schedule-triggered flow.
     * </p>
     * 
     * @param scheduleOffset
     *        Specifies the optional offset that is added to the time interval for a schedule-triggered flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledTriggerProperties withScheduleOffset(Long scheduleOffset) {
        setScheduleOffset(scheduleOffset);
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
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression()).append(",");
        if (getDataPullMode() != null)
            sb.append("DataPullMode: ").append(getDataPullMode()).append(",");
        if (getScheduleStartTime() != null)
            sb.append("ScheduleStartTime: ").append(getScheduleStartTime()).append(",");
        if (getScheduleEndTime() != null)
            sb.append("ScheduleEndTime: ").append(getScheduleEndTime()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getScheduleOffset() != null)
            sb.append("ScheduleOffset: ").append(getScheduleOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledTriggerProperties == false)
            return false;
        ScheduledTriggerProperties other = (ScheduledTriggerProperties) obj;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getDataPullMode() == null ^ this.getDataPullMode() == null)
            return false;
        if (other.getDataPullMode() != null && other.getDataPullMode().equals(this.getDataPullMode()) == false)
            return false;
        if (other.getScheduleStartTime() == null ^ this.getScheduleStartTime() == null)
            return false;
        if (other.getScheduleStartTime() != null && other.getScheduleStartTime().equals(this.getScheduleStartTime()) == false)
            return false;
        if (other.getScheduleEndTime() == null ^ this.getScheduleEndTime() == null)
            return false;
        if (other.getScheduleEndTime() != null && other.getScheduleEndTime().equals(this.getScheduleEndTime()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getScheduleOffset() == null ^ this.getScheduleOffset() == null)
            return false;
        if (other.getScheduleOffset() != null && other.getScheduleOffset().equals(this.getScheduleOffset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getDataPullMode() == null) ? 0 : getDataPullMode().hashCode());
        hashCode = prime * hashCode + ((getScheduleStartTime() == null) ? 0 : getScheduleStartTime().hashCode());
        hashCode = prime * hashCode + ((getScheduleEndTime() == null) ? 0 : getScheduleEndTime().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getScheduleOffset() == null) ? 0 : getScheduleOffset().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledTriggerProperties clone() {
        try {
            return (ScheduledTriggerProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ScheduledTriggerPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
