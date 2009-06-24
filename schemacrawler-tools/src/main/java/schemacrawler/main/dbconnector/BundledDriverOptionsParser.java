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


import sf.util.CommandLineParser.NumberOption;
import sf.util.CommandLineParser.Option;
import sf.util.CommandLineParser.StringOption;

/**
 * Options for the command line.
 * 
 * @author sfatehi
 */
final class BundledDriverOptionsParser
  extends BaseConnectorOptionsParser<BundledDriverOptions>
{

  private final StringOption optionHost = new StringOption(Option.NO_SHORT_FORM,
                                                           "host",
                                                           null);
  private final NumberOption<Integer> optionPort = new NumberOption<Integer>(Option.NO_SHORT_FORM,
                                                                             "port",
                                                                             0);
  private final StringOption optionDatabase = new StringOption(Option.NO_SHORT_FORM,
                                                               "database",
                                                               "");

  /**
   * Parses the command line into options.
   * 
   * @param args
   */
  BundledDriverOptionsParser(final String[] args)
  {
    super(args);
  }

  @Override
  protected String getHelpResource()
  {
    return "/help/Commands.readme.txt";
  }

  @Override
  protected BundledDriverOptions getOptions()
  {
    parse(new Option[] {
        optionHost,
        optionPort,
        optionDatabase,
        optionSchemaPattern,
        optionUser,
        optionPassword,
    });

    final BundledDriverOptions options = new BundledDriverOptions();
    options.setHost(optionHost.getValue());
    options.setPort(optionPort.getValue().intValue());
    options.setDatabase(optionDatabase.getValue());
    options.setSchemapattern(optionSchemaPattern.getValue());
    options.setUser(optionUser.getValue());
    options.setPassword(optionPassword.getValue());

    return options;
  }

}
