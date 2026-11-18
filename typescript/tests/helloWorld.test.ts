import { describe, expect, it } from "vitest";
import { codadvent } from "../src/helloWorld";

describe("HelloWorld", () => {
  it("says hello world", () => {
    expect(codadvent.HelloWorld.sayHello()).toBe("Hello World!");
  });
});
