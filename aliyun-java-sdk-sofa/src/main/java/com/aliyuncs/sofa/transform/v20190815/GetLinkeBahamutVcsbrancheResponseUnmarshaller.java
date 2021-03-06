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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsbrancheResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsbrancheResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcsbrancheResponseUnmarshaller {

	public static GetLinkeBahamutVcsbrancheResponse unmarshall(GetLinkeBahamutVcsbrancheResponse getLinkeBahamutVcsbrancheResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcsbrancheResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcsbrancheResponse.RequestId"));
		getLinkeBahamutVcsbrancheResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcsbrancheResponse.ResultCode"));
		getLinkeBahamutVcsbrancheResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcsbrancheResponse.ResultMessage"));
		getLinkeBahamutVcsbrancheResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcsbrancheResponse.ErrorMessage"));
		getLinkeBahamutVcsbrancheResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcsbrancheResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcsbrancheResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcsbrancheResponse.Message"));
		getLinkeBahamutVcsbrancheResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcsbrancheResponse.ResponseStatusCode"));
		getLinkeBahamutVcsbrancheResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcsbrancheResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutVcsbrancheResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCommit(_ctx.stringValue("GetLinkeBahamutVcsbrancheResponse.Result["+ i +"].Commit"));
			resultItem.setLocked(_ctx.booleanValue("GetLinkeBahamutVcsbrancheResponse.Result["+ i +"].Locked"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutVcsbrancheResponse.Result["+ i +"].Name"));

			result.add(resultItem);
		}
		getLinkeBahamutVcsbrancheResponse.setResult(result);
	 
	 	return getLinkeBahamutVcsbrancheResponse;
	}
}