package sb.java.spring.result;

import java.util.HashMap;
import java.util.Map;

public class ResultModelTool {

    public static ResultModel handleResultModel(ResultModel resultModel) {

        ResultModel handledModel = new ResultModel();
        @SuppressWarnings("rawtypes")
		Map map = new HashMap();
        if (resultModel != null) {
            int error = resultModel.getCode();
            handledModel.setCode(error);
            switch (error) {
                case 10000:
                    handledModel.setMsg("网络繁忙,请稍后重试");
                    handledModel.setData(map);
                    break;
                case 10001:
                    handledModel.setMsg("登录失败");
                    handledModel.setData(map);
                    break;
                case 10002:
                    handledModel.setMsg("添加成功");
                    handledModel.setData(resultModel.getData());
                    break;
                case 10003:
                    handledModel.setMsg("删除成功");
                    handledModel.setData(resultModel.getData());
                    break;
                case -1:
                    handledModel.setMsg("请求失败");
                    handledModel.setData(map);
                    break;
                case 10005:
                    handledModel.setMsg("此用户已存在");
                    handledModel.setData(map);
                    break;
                case 10006:
                    handledModel.setMsg("添加失败");
                    handledModel.setData(map);
                    break;
                case 10007:
                    handledModel.setMsg("删除失败");
                    handledModel.setData(map);
                    break;
                case 10008:
                    handledModel.setMsg("更新失败");
                    handledModel.setData(map);
                    break;
                case 10088:
                    handledModel.setMsg("更新失败");
                    handledModel.setData(map);
                    break;
                case 10009:
                	handledModel.setMsg("登录成功");
                	handledModel.setData(map);
                case 12000:
                	handledModel.setMsg("注册成功");
                	handledModel.setData(map);
                	break;
                case 11111:
                	handledModel.setMsg("注册失败");
                	handledModel.setData(map);
                	break;
                case 11112:
                	handledModel.setMsg("注册失败");
                	handledModel.setData(map);
                	break;
                case 12221:
                	handledModel.setMsg("登录失败");
                	handledModel.setData(map);
                	break;
                case 12222:
                	handledModel.setMsg("登录失败");
                	handledModel.setData(map);
                	break;
                case 200:
                    handledModel.setMsg("success");
                    handledModel.setData(resultModel.getData());
                    break;
                case 11119:
                    handledModel.setMsg("error");
                    handledModel.setData(map);
                    break;
                default:
                	handledModel.setMsg("error");
                    handledModel.setData(resultModel.getData());
                    break;
            }
        }
        return handledModel;
    }
}