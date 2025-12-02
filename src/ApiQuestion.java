import java.util.ArrayList;
import java.util.List;

public class ApiQuestion {



//    Write an HTTP service with two endpoints
//- First one is going to accept 5 inputs int1, int2, limit, str1, str2 and it will return values
//    from 1 to limit, where the values that are multiple of int1 are replaced with str1,
//    values that are multiple of int2 are replaced with str2, and
//    values that are multiple of int1 and int2 are replaced with str1str2.
//
//            - Second endpoint is not going to expect any input, but it will return the input using which
//    first endpoint was called the most.
//    Input Calls to first endpoint:
//            3, 5, 100, a, d
//3, 5, 100, a, d
//3, 5, 100, a, d
//3, 5, 100, a, d
//3, 5, 100, a, d
//3, 5, 100, a, b
//3, 5, 100, b, c
//
//
//    Output from second endpoint:
//            3, 5, 100, a, d
//5


    public static List<String> firstEndPoint(InputDto inputDto) {
        List<String> result = new ArrayList<>();
        for(int index = 1; index <= 100; index++){
            if(index % inputDto.int1 == 0 && index % inputDto.int2 == 0) {
                result.add(inputDto.str1 + inputDto.str2);
            }else if(index % inputDto.int1 == 0) {
                result.add(inputDto.str1);
            } else if(index % inputDto.int2 == 0) {
                result.add(inputDto.str2);
            }
        }
        return result;
    }


}
