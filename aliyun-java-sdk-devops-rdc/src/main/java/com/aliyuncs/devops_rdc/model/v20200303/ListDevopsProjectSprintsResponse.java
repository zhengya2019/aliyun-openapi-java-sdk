/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.devops_rdc.model.v20200303;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops_rdc.transform.v20200303.ListDevopsProjectSprintsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDevopsProjectSprintsResponse extends AcsResponse {

	private Boolean successful;

	private String errorCode;

	private String errorMsg;

	private String requestId;

	private List<Sprint> object;

	public Boolean getSuccessful() {
		return this.successful;
	}

	public void setSuccessful(Boolean successful) {
		this.successful = successful;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Sprint> getObject() {
		return this.object;
	}

	public void setObject(List<Sprint> object) {
		this.object = object;
	}

	public static class Sprint {

		private String accomplished;

		private Boolean isDeleted;

		private String created;

		private String dueDate;

		private String name;

		private String creatorId;

		private String id;

		private String updated;

		private String startDate;

		private String status;

		private String projectId;

		private PlanToDo planToDo;

		public String getAccomplished() {
			return this.accomplished;
		}

		public void setAccomplished(String accomplished) {
			this.accomplished = accomplished;
		}

		public Boolean getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getDueDate() {
			return this.dueDate;
		}

		public void setDueDate(String dueDate) {
			this.dueDate = dueDate;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public PlanToDo getPlanToDo() {
			return this.planToDo;
		}

		public void setPlanToDo(PlanToDo planToDo) {
			this.planToDo = planToDo;
		}

		public static class PlanToDo {

			private Integer storyPoints;

			private Integer workTimes;

			private Integer tasks;

			public Integer getStoryPoints() {
				return this.storyPoints;
			}

			public void setStoryPoints(Integer storyPoints) {
				this.storyPoints = storyPoints;
			}

			public Integer getWorkTimes() {
				return this.workTimes;
			}

			public void setWorkTimes(Integer workTimes) {
				this.workTimes = workTimes;
			}

			public Integer getTasks() {
				return this.tasks;
			}

			public void setTasks(Integer tasks) {
				this.tasks = tasks;
			}
		}
	}

	@Override
	public ListDevopsProjectSprintsResponse getInstance(UnmarshallerContext context) {
		return	ListDevopsProjectSprintsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
