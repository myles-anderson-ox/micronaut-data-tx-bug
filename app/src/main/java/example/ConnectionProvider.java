
package example;

import java.sql.Connection;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.sql.DataSource;
import io.micronaut.transaction.jdbc.DataSourceUtils;

@Singleton
public class ConnectionProvider {

    private final DataSource ds;

    public ConnectionProvider(@Named("myds") DataSource ds) {
        super();
        this.ds = ds;
    }

    public Connection getConnection() {
        return DataSourceUtils.getConnection(ds);
    }

    public void release(Connection con) {
        DataSourceUtils.releaseConnection(con, ds);
    }

}
