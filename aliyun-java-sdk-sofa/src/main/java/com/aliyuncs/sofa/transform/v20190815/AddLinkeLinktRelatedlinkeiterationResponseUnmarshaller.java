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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktRelatedlinkeiterationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeLinktRelatedlinkeiterationResponseUnmarshaller {

	public static AddLinkeLinktRelatedlinkeiterationResponse unmarshall(AddLinkeLinktRelatedlinkeiterationResponse addLinkeLinktRelatedlinkeiterationResponse, UnmarshallerContext _ctx) {
		
		addLinkeLinktRelatedlinkeiterationResponse.setRequestId(_ctx.stringValue("AddLinkeLinktRelatedlinkeiterationResponse.RequestId"));
		addLinkeLinktRelatedlinkeiterationResponse.setResultCode(_ctx.stringValue("AddLinkeLinktRelatedlinkeiterationResponse.ResultCode"));
		addLinkeLinktRelatedlinkeiterationResponse.setResultMessage(_ctx.stringValue("AddLinkeLinktRelatedlinkeiterationResponse.ResultMessage"));
		addLinkeLinktRelatedlinkeiterationResponse.setData(_ctx.booleanValue("AddLinkeLinktRelatedlinkeiterationResponse.Data"));
		addLinkeLinktRelatedlinkeiterationResponse.setErrorCode(_ctx.longValue("AddLinkeLinktRelatedlinkeiterationResponse.ErrorCode"));
		addLinkeLinktRelatedlinkeiterationResponse.setErrorMessage(_ctx.stringValue("AddLinkeLinktRelatedlinkeiterationResponse.ErrorMessage"));
		addLinkeLinktRelatedlinkeiterationResponse.setResponseStatusCode(_ctx.longValue("AddLinkeLinktRelatedlinkeiterationResponse.ResponseStatusCode"));
		addLinkeLinktRelatedlinkeiterationResponse.setSuccess(_ctx.booleanValue("AddLinkeLinktRelatedlinkeiterationResponse.Success"));
	 
	 	return addLinkeLinktRelatedlinkeiterationResponse;
	}
}