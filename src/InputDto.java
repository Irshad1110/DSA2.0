import java.util.Objects;

public class InputDto {

    int int1;
    int int2;
    int limit;
    String str1;
    String str2;

    public InputDto(int int1, int int2, int limit, String str1, String str2) {
        this.int1 = int1;
        this.int2 = int2;
        this.limit = limit;
        this.str1 = str1;
        this.str2 = str2;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof InputDto input)) {
            return false;
        }

        return input.int1 == this.int1 && input.int2 == this.int2 && input.limit == this.limit
                && Objects.equals(input.str1, this.str1) && Objects.equals(input.str2, this.str2);
    }

    @Override
    public int hashCode()
    {
        return this.int1 + this.int2 + this.limit + Integer.valueOf(this.str1) + Integer.valueOf(this.str2);
    }
}
