package pl.exsio.querydsl.entityql.entity.scanner.runtime;

import com.google.common.base.CaseFormat;

public class UnderscoreToCamelStrategyQRuntimeNamingStrategy implements QRuntimeNamingStrategy {

    @Override
    public String getFieldName(String columnName) {
        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, columnName);
    }

    @Override
    public String getColumnName(String fieldName) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, fieldName);
    }

    public static UnderscoreToCamelStrategyQRuntimeNamingStrategy getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {

        public static UnderscoreToCamelStrategyQRuntimeNamingStrategy INSTANCE = new UnderscoreToCamelStrategyQRuntimeNamingStrategy();

    }

}
