package quotes

import groovy.transform.Canonical
import groovy.transform.CompileStatic

@Canonical
@CompileStatic
class Quote {
    String movie
    String text
}
