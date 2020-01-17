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

package com.aliyuncs.hitsdb.transform.v20170601;

import com.aliyuncs.hitsdb.model.v20170601.DescribeHiTSDBInstanceDataTtlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHiTSDBInstanceDataTtlResponseUnmarshaller {

	public static DescribeHiTSDBInstanceDataTtlResponse unmarshall(DescribeHiTSDBInstanceDataTtlResponse describeHiTSDBInstanceDataTtlResponse, UnmarshallerContext _ctx) {
		
		describeHiTSDBInstanceDataTtlResponse.setRequestId(_ctx.stringValue("DescribeHiTSDBInstanceDataTtlResponse.RequestId"));
		describeHiTSDBInstanceDataTtlResponse.setTtl(_ctx.longValue("DescribeHiTSDBInstanceDataTtlResponse.Ttl"));
	 
	 	return describeHiTSDBInstanceDataTtlResponse;
	}
}