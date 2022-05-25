package main.java.org.codely.solid.lsp;

public class Seagull implements Bird {

  @Override
  public void tweet() {
    // Break LSP due to Seagulls don't tweet
    throw new RuntimeException("Seagulls don't tweet");
  }

}
