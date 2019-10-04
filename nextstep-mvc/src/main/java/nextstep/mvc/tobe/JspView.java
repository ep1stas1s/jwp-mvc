package nextstep.mvc.tobe;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class JspView implements View {
    private static final String SUFFIX = ".jsp";
    private final String filePath;

    public JspView(String filePath) {
        this.filePath = filePath + SUFFIX;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
    }
}
