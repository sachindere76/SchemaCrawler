/* 
 *
 * SchemaCrawler
 * http://sourceforge.net/projects/schemacrawler
 * Copyright (c) 2000-2009, Sualeh Fatehi.
 *
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 *
 */
package schemacrawler.main.dbconnector;


/**
 * Additional options needed for Spring.
 * 
 * @author Sualeh Fatehi
 */
final class PropertiesDataSourceOptions
  extends BaseConnectorOptions
{

  private static final long serialVersionUID = 5125868244511892692L;

  private boolean useDefaultConnection;
  private String connection;
  private String driver;
  private String connectionUrl;

  protected String getConnection()
  {
    return connection;
  }

  protected String getConnectionUrl()
  {
    return connectionUrl;
  }

  protected String getDriver()
  {
    return driver;
  }

  protected boolean isUseDefaultConnection()
  {
    return useDefaultConnection;
  }

  protected boolean isUseJdbcConnection()
  {
    return !schemacrawler.utility.Utility.isBlank(driver)
           && !schemacrawler.utility.Utility.isBlank(connectionUrl);
  }

  void setConnection(final String connection)
  {
    this.connection = connection;
  }

  void setConnectionUrl(final String connectionUrl)
  {
    this.connectionUrl = connectionUrl;
  }

  void setDriver(final String driver)
  {
    this.driver = driver;
  }

  void setUseDefaultConnection(final boolean useDefaultConnection)
  {
    this.useDefaultConnection = useDefaultConnection;
  }

}
