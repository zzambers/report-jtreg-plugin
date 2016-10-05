/*
 * The MIT License
 *
 * Copyright 2016 jvanek.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package hudson.plugins.report.jck.main.formatters;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class ColorFormatter extends StringMappedFormatter {

    private static final String Default = "\\e[39m";

    private static final String ResetAll = "\\e[0m";

    private static final String Bold = "\\e[1m";

    private static final String Black = "\\e[30m";
    private static final String Red = "\\e[31m";
    private static final String Green = "\\e[32m";
    private static final String Yellow = "\\e[33m";
    private static final String Blue = "\\e[34m";
    private static final String Magenta = "\\e[35m";
    private static final String Cyan = "\\e[36m";
    private static final String LightRed = "\\e[91m";
    private static final String LightGreen = "\\e[92m";
    private static final String LightYellow = "\\e[93m";
    private static final String LightBlue = "\\e[94m";
    private static final String LightMagenta = "\\e[95m";
    private static final String LightCyan = "\\e[96m";

    private void fillColors() {
        colors.put(SupportedColors.Black, Black);
        colors.put(SupportedColors.Red, Red);
        colors.put(SupportedColors.Green, Green);
        colors.put(SupportedColors.Yellow, Yellow);
        colors.put(SupportedColors.Blue, Blue);
        colors.put(SupportedColors.Magenta, Magenta);
        colors.put(SupportedColors.Cyan, Cyan);
        colors.put(SupportedColors.LightRed, LightRed);
        colors.put(SupportedColors.LightGreen, LightGreen);
        colors.put(SupportedColors.LightYellow, LightYellow);
        colors.put(SupportedColors.LightBlue, LightBlue);
        colors.put(SupportedColors.LightMagenta, LightMagenta);
        colors.put(SupportedColors.LightCyan, LightCyan);
    }

    public ColorFormatter(PrintStream stream) {
        super(stream);
        fillColors();
    }

    @Override
    public void startBold() {
        print(Bold);
    }

    @Override
    public void startColor(SupportedColors color) {
        print(getColor(color));
    }

    @Override
    public void reset() {
        print(ResetAll);
    }

}