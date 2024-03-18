package ee.tu.app.errors;

import lombok.Getter;

@Getter
public enum Errors {
    ERROR_OPERATION_FAILED ("error.operationFailed"),
    ERROR_NOT_FOUND ("error.notFound");

    private final String code;

    Errors(String code) {
        this.code = code;
    }
}
