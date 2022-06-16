
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver8HiddenTest {


  @Test
  public void test_omaha_holdem_2000_6d7d7hKcKd_2d3h4dTs_QsAd9hQd_Tc3d2c6s_8h2h3c9s_5cJs7s8c_Jc3sQc4c_AhKs5d9c_8s7c4s2s() {
    assertEquals(
      "8h2h3c9s Jc3sQc4c Tc3d2c6s 8s7c4s2s 5cJs7s8c AhKs5d9c 2d3h4dTs QsAd9hQd",
      Solver.process("omaha-holdem 6d7d7hKcKd 2d3h4dTs QsAd9hQd Tc3d2c6s 8h2h3c9s 5cJs7s8c Jc3sQc4c AhKs5d9c 8s7c4s2s"));
  }

  @Test
  public void test_omaha_holdem_2001_3s4d4hAhQc_9cTs5s7c_5h6s5d9h_7d7hJcJh_JsKcTh8h_3cAdTdQs() {
    assertEquals(
      "9cTs5s7c JsKcTh8h 5h6s5d9h 7d7hJcJh 3cAdTdQs",
      Solver.process("omaha-holdem 3s4d4hAhQc 9cTs5s7c 5h6s5d9h 7d7hJcJh JsKcTh8h 3cAdTdQs"));
  }

  @Test
  public void test_omaha_holdem_2002_2h7hAdQdTc_Kc4c5h2d_5sQc4h5d_Jc5cJd3c_4s9dJh6h_3s7d8c6c_Kh4d7cKd_8s3hTsTh() {
    assertEquals(
      "4s9dJh6h Kc4c5h2d 3s7d8c6c Jc5cJd3c 5sQc4h5d Kh4d7cKd 8s3hTsTh",
      Solver.process("omaha-holdem 2h7hAdQdTc Kc4c5h2d 5sQc4h5d Jc5cJd3c 4s9dJh6h 3s7d8c6c Kh4d7cKd 8s3hTsTh"));
  }

  @Test
  public void test_omaha_holdem_2003_3h6d8cJsTc_2cTdTh6c_2d9dKsJc_Qc4h3d8h() {
    assertEquals(
      "2d9dKsJc Qc4h3d8h 2cTdTh6c",
      Solver.process("omaha-holdem 3h6d8cJsTc 2cTdTh6c 2d9dKsJc Qc4h3d8h"));
  }

  @Test
  public void test_omaha_holdem_2004_6d7dJdKsQh_7s2hTsQc_5c7h6c3c_KdAh2c8d_8c4dJh5s_ThAs3s2d_3h9h5d6h_7cJs9d9c() {
    assertEquals(
      "3h9h5d6h 8c4dJh5s 5c7h6c3c 7cJs9d9c 7s2hTsQc ThAs3s2d KdAh2c8d",
      Solver.process("omaha-holdem 6d7dJdKsQh 7s2hTsQc 5c7h6c3c KdAh2c8d 8c4dJh5s ThAs3s2d 3h9h5d6h 7cJs9d9c"));
  }

  @Test
  public void test_omaha_holdem_2005_4h5d6c7h8s_7c6dTs9d_Kd5s4d7d_3dJsJhKc_Ks3sAc5c_2s8hQc3h_Jc9c4c6h_Th2h7sAd_Tc8d2d2c() {
    assertEquals(
      "Th2h7sAd Tc8d2d2c 3dJsJhKc 2s8hQc3h Ks3sAc5c Kd5s4d7d Jc9c4c6h 7c6dTs9d",
      Solver.process("omaha-holdem 4h5d6c7h8s 7c6dTs9d Kd5s4d7d 3dJsJhKc Ks3sAc5c 2s8hQc3h Jc9c4c6h Th2h7sAd Tc8d2d2c"));
  }

  @Test
  public void test_omaha_holdem_2006_2h6s8hJcKs_8c4dTsTh_5d6hTd7h_Kc9c9s9d_Qs3d7c6c_Jd3sAd6d_Qc4cAh3h_5s3c7d9h() {
    assertEquals(
      "5s3c7d9h Qc4cAh3h 5d6hTd7h Qs3d7c6c 8c4dTsTh Kc9c9s9d Jd3sAd6d",
      Solver.process("omaha-holdem 2h6s8hJcKs 8c4dTsTh 5d6hTd7h Kc9c9s9d Qs3d7c6c Jd3sAd6d Qc4cAh3h 5s3c7d9h"));
  }

  @Test
  public void test_omaha_holdem_2007_5d6d6s8hJc_5h6c8cJs_3h3c2sQh_7h2dKhAs_4s3sTdKc() {
    assertEquals(
      "4s3sTdKc 7h2dKhAs 3h3c2sQh 5h6c8cJs",
      Solver.process("omaha-holdem 5d6d6s8hJc 5h6c8cJs 3h3c2sQh 7h2dKhAs 4s3sTdKc"));
  }

  @Test
  public void test_omaha_holdem_2008_2c6s7d9sJs_Ac2hTs9h_3dAd4h4s_3sJc9c7s_8dKh5dTd() {
    assertEquals(
      "3dAd4h4s Ac2hTs9h 8dKh5dTd 3sJc9c7s",
      Solver.process("omaha-holdem 2c6s7d9sJs Ac2hTs9h 3dAd4h4s 3sJc9c7s 8dKh5dTd"));
  }

  @Test
  public void test_omaha_holdem_2009_2c6hAdAsJh_Ts2h7c7d_Tc4h5c9s_9h8c6cTd_KhKs2d4c() {
    assertEquals(
      "Tc4h5c9s 9h8c6cTd Ts2h7c7d KhKs2d4c",
      Solver.process("omaha-holdem 2c6hAdAsJh Ts2h7c7d Tc4h5c9s 9h8c6cTd KhKs2d4c"));
  }

  @Test
  public void test_omaha_holdem_2010_2c5h6dKhQc_Ah7c5c9d_9s9c7dQh_2d6cJd2s_4h8cQdQs() {
    assertEquals(
      "Ah7c5c9d 9s9c7dQh 2d6cJd2s 4h8cQdQs",
      Solver.process("omaha-holdem 2c5h6dKhQc Ah7c5c9d 9s9c7dQh 2d6cJd2s 4h8cQdQs"));
  }

  @Test
  public void test_omaha_holdem_2011_3s7d7s9sAs_9c8c5h3h_Ad5d7hJs_2h6s7cTh() {
    assertEquals(
      "9c8c5h3h 2h6s7cTh Ad5d7hJs",
      Solver.process("omaha-holdem 3s7d7s9sAs 9c8c5h3h Ad5d7hJs 2h6s7cTh"));
  }

  @Test
  public void test_omaha_holdem_2012_4h5s8d9c9d_2s7d4dJh_2hKhKc6h_7s9sJsAd_9h3sQh6c_Jc6dAc5h_JdTd4cQd_Ah2c3d8s_5cQs8h5d_Tc7c3h3c() {
    assertEquals(
      "Tc7c3h3c 2s7d4dJh JdTd4cQd Jc6dAc5h Ah2c3d8s 2hKhKc6h 9h3sQh6c 7s9sJsAd 5cQs8h5d",
      Solver.process("omaha-holdem 4h5s8d9c9d 2s7d4dJh 2hKhKc6h 7s9sJsAd 9h3sQh6c Jc6dAc5h JdTd4cQd Ah2c3d8s 5cQs8h5d Tc7c3h3c"));
  }

  @Test
  public void test_omaha_holdem_2013_2h9cAcAdQd_4d3d5s4h_8hKhJh3c_Td7s6h6d() {
    assertEquals(
      "8hKhJh3c 4d3d5s4h Td7s6h6d",
      Solver.process("omaha-holdem 2h9cAcAdQd 4d3d5s4h 8hKhJh3c Td7s6h6d"));
  }

  @Test
  public void test_omaha_holdem_2014_4c9hJdKdKs_Td8s8hJc_6c5dKh5h_Ah7h4h3s_5c3cQc9s_3hAsQs4s_AdJh9cQd_6h7sKc8c() {
    assertEquals(
      "3hAsQs4s=Ah7h4h3s 5c3cQc9s Td8s8hJc AdJh9cQd 6c5dKh5h 6h7sKc8c",
      Solver.process("omaha-holdem 4c9hJdKdKs Td8s8hJc 6c5dKh5h Ah7h4h3s 5c3cQc9s 3hAsQs4s AdJh9cQd 6h7sKc8c"));
  }

  @Test
  public void test_omaha_holdem_2015_2s6h9cKcQc_8cJh6s5s_2cQh4h3s_QdKs7c2h_5cKh8d8s_KdAhJdJc() {
    assertEquals(
      "8cJh6s5s 5cKh8d8s KdAhJdJc 2cQh4h3s QdKs7c2h",
      Solver.process("omaha-holdem 2s6h9cKcQc 8cJh6s5s 2cQh4h3s QdKs7c2h 5cKh8d8s KdAhJdJc"));
  }

  @Test
  public void test_omaha_holdem_2016_5c5h7d7h8c_Qd4h2cKh_6sTd5s7c_6cTs3sAs() {
    assertEquals(
      "Qd4h2cKh 6cTs3sAs 6sTd5s7c",
      Solver.process("omaha-holdem 5c5h7d7h8c Qd4h2cKh 6sTd5s7c 6cTs3sAs"));
  }

  @Test
  public void test_omaha_holdem_2017_2d5sKdQhTd_As9hTcKs_6c2s2h3h_7h4s6s7s_Th6h6dJd_4hAc2c4d_Jh8d8s3d() {
    assertEquals(
      "4hAc2c4d 7h4s6s7s As9hTcKs 6c2s2h3h Jh8d8s3d Th6h6dJd",
      Solver.process("omaha-holdem 2d5sKdQhTd As9hTcKs 6c2s2h3h 7h4s6s7s Th6h6dJd 4hAc2c4d Jh8d8s3d"));
  }

  @Test
  public void test_omaha_holdem_2018_2c4d9sJsKs_5h2d5s6h_Ac8s7s9d_Th8h3s2s_5c8c3h6c_Qc3c7cJc_4hTs3d7d_Ah4s9hQh() {
    assertEquals(
      "5c8c3h6c 4hTs3d7d 5h2d5s6h Qc3c7cJc Ah4s9hQh Th8h3s2s Ac8s7s9d",
      Solver.process("omaha-holdem 2c4d9sJsKs 5h2d5s6h Ac8s7s9d Th8h3s2s 5c8c3h6c Qc3c7cJc 4hTs3d7d Ah4s9hQh"));
  }

  @Test
  public void test_omaha_holdem_2019_2c3d8dJsQc_9d6s3c9c_7dQd4cAd_9hTc8hAs() {
    assertEquals(
      "9d6s3c9c 7dQd4cAd 9hTc8hAs",
      Solver.process("omaha-holdem 2c3d8dJsQc 9d6s3c9c 7dQd4cAd 9hTc8hAs"));
  }

  @Test
  public void test_omaha_holdem_2020_2d5h7d9dQd_4dJh2s6d_3h2hAcQs_8s3cJsKc_2cJd4cQh_Kh7s6c8d_7c3dTh3s_Tc4sKd7h_8c8hAsTs_9hAh6sTd() {
    assertEquals(
      "8s3cJsKc 7c3dTh3s Tc4sKd7h 8c8hAsTs 9hAh6sTd 2cJd4cQh=3h2hAcQs Kh7s6c8d 4dJh2s6d",
      Solver.process("omaha-holdem 2d5h7d9dQd 4dJh2s6d 3h2hAcQs 8s3cJsKc 2cJd4cQh Kh7s6c8d 7c3dTh3s Tc4sKd7h 8c8hAsTs 9hAh6sTd"));
  }

  @Test
  public void test_omaha_holdem_2021_5c5d6dAsKs_9d7dKd7h_AhJcJsJh() {
    assertEquals(
      "9d7dKd7h AhJcJsJh",
      Solver.process("omaha-holdem 5c5d6dAsKs 9d7dKd7h AhJcJsJh"));
  }

  @Test
  public void test_omaha_holdem_2022_3s7h8cAdJs_5sKd6s2c_7sQc2dAh_As9s9dQd_9hQhKh3d_Jh8h8dTd_5h7dAcKs_Jd9c3h4c() {
    assertEquals(
      "5sKd6s2c 9hQhKh3d As9s9dQd Jd9c3h4c 5h7dAcKs=7sQc2dAh Jh8h8dTd",
      Solver.process("omaha-holdem 3s7h8cAdJs 5sKd6s2c 7sQc2dAh As9s9dQd 9hQhKh3d Jh8h8dTd 5h7dAcKs Jd9c3h4c"));
  }

  @Test
  public void test_omaha_holdem_2023_2h9cAcJsQs_Jh6dTc3c_4dKcAd2d_Kh5c3h5h_6sQhThTs() {
    assertEquals(
      "Kh5c3h5h Jh6dTc3c 6sQhThTs 4dKcAd2d",
      Solver.process("omaha-holdem 2h9cAcJsQs Jh6dTc3c 4dKcAd2d Kh5c3h5h 6sQhThTs"));
  }

  @Test
  public void test_omaha_holdem_2024_6c7c7hAdQc_TdKcQs6h_4d9h2hAc_8s4s6s5d_Js2c5s8d_QhTc4h7s() {
    assertEquals(
      "Js2c5s8d 8s4s6s5d TdKcQs6h 4d9h2hAc QhTc4h7s",
      Solver.process("omaha-holdem 6c7c7hAdQc TdKcQs6h 4d9h2hAc 8s4s6s5d Js2c5s8d QhTc4h7s"));
  }

  @Test
  public void test_omaha_holdem_2025_4h5h7dAcJs_2c7c6s4c_9s9dAh2h_Ts3hJc3c_8s3dTh8h_6cQcJhKc_5sTd6h7h_TcQh2dQs_2sAd4s5d() {
    assertEquals(
      "8s3dTh8h Ts3hJc3c 6cQcJhKc TcQh2dQs 9s9dAh2h 2c7c6s4c 5sTd6h7h 2sAd4s5d",
      Solver.process("omaha-holdem 4h5h7dAcJs 2c7c6s4c 9s9dAh2h Ts3hJc3c 8s3dTh8h 6cQcJhKc 5sTd6h7h TcQh2dQs 2sAd4s5d"));
  }

  @Test
  public void test_omaha_holdem_2026_3h4d6hJdTs_4s5dKc7d_3d3cTh8c_QdTc9s4c_2c6c2sAc_2dJsQh6s_AsJc8hQc() {
    assertEquals(
      "2c6c2sAc AsJc8hQc QdTc9s4c 2dJsQh6s 3d3cTh8c 4s5dKc7d",
      Solver.process("omaha-holdem 3h4d6hJdTs 4s5dKc7d 3d3cTh8c QdTc9s4c 2c6c2sAc 2dJsQh6s AsJc8hQc"));
  }

  @Test
  public void test_omaha_holdem_2027_6cAcAdJcKs_2h4cJhAs_7s5h5s4h() {
    assertEquals(
      "7s5h5s4h 2h4cJhAs",
      Solver.process("omaha-holdem 6cAcAdJcKs 2h4cJhAs 7s5h5s4h"));
  }

  @Test
  public void test_omaha_holdem_2028_6h7c8h9cJd_5cKd2dTh_5dAcTd5s_Qh8s9sJc() {
    assertEquals(
      "5cKd2dTh 5dAcTd5s Qh8s9sJc",
      Solver.process("omaha-holdem 6h7c8h9cJd 5cKd2dTh 5dAcTd5s Qh8s9sJc"));
  }

  @Test
  public void test_omaha_holdem_2029_2s4d6d8hJs_2d8sKs2c_5dQc5h9d_JdAdTd8d_7cKdAh7d_9h4cJhTh_3sKc7sTs_Tc9s7h6c_9cQh3hJc() {
    assertEquals(
      "3sKc7sTs 5dQc5h9d Tc9s7h6c 7cKdAh7d 9cQh3hJc 9h4cJhTh JdAdTd8d 2d8sKs2c",
      Solver.process("omaha-holdem 2s4d6d8hJs 2d8sKs2c 5dQc5h9d JdAdTd8d 7cKdAh7d 9h4cJhTh 3sKc7sTs Tc9s7h6c 9cQh3hJc"));
  }

  @Test
  public void test_omaha_holdem_2030_3h6h7h9hJh_8sJsJc9s_Ac2c8h4d_AhTh9cKs_TdTc7sTs_3cQsKc5c_Qc2d7cQd_As7d4h5d_6s3s8d6d() {
    assertEquals(
      "Ac2c8h4d 3cQsKc5c TdTc7sTs Qc2d7cQd 6s3s8d6d 8sJsJc9s As7d4h5d AhTh9cKs",
      Solver.process("omaha-holdem 3h6h7h9hJh 8sJsJc9s Ac2c8h4d AhTh9cKs TdTc7sTs 3cQsKc5c Qc2d7cQd As7d4h5d 6s3s8d6d"));
  }

  @Test
  public void test_omaha_holdem_2031_5c8sJcKsQc_4d7h5d4h_Qh7s2sJd_5h9d3d9h_9sJs8d2h_7d3cQsJh() {
    assertEquals(
      "4d7h5d4h 5h9d3d9h 9sJs8d2h 7d3cQsJh=Qh7s2sJd",
      Solver.process("omaha-holdem 5c8sJcKsQc 4d7h5d4h Qh7s2sJd 5h9d3d9h 9sJs8d2h 7d3cQsJh"));
  }

  @Test
  public void test_omaha_holdem_2032_9dAcAsKcQs_6cJhQdKs_8c3hQh2s_6d9c5hKh() {
    assertEquals(
      "8c3hQh2s 6d9c5hKh 6cJhQdKs",
      Solver.process("omaha-holdem 9dAcAsKcQs 6cJhQdKs 8c3hQh2s 6d9c5hKh"));
  }

  @Test
  public void test_omaha_holdem_2033_2c7d8hQdTc_TsJh8sQh_6c8c9d8d_9c3h6sKh_9s4c7sJs_3s4dQs2h_KsKc7h6h_Jd5s5h4s_KdJc3c2d() {
    assertEquals(
      "KdJc3c2d Jd5s5h4s KsKc7h6h 3s4dQs2h TsJh8sQh 6c8c9d8d=9c3h6sKh 9s4c7sJs",
      Solver.process("omaha-holdem 2c7d8hQdTc TsJh8sQh 6c8c9d8d 9c3h6sKh 9s4c7sJs 3s4dQs2h KsKc7h6h Jd5s5h4s KdJc3c2d"));
  }

  @Test
  public void test_omaha_holdem_2034_2c5h9h9sKs_AhJdQdAs_4sTd3h4c_8cQc7h6h_4h5s4d2s_3sKcKh9c() {
    assertEquals(
      "8cQc7h6h 4sTd3h4c 4h5s4d2s AhJdQdAs 3sKcKh9c",
      Solver.process("omaha-holdem 2c5h9h9sKs AhJdQdAs 4sTd3h4c 8cQc7h6h 4h5s4d2s 3sKcKh9c"));
  }

  @Test
  public void test_omaha_holdem_2035_2hAhJhKhQc_6c5s3c6s_5d3s7dTs_9s5cQd3h_2cAs8sKs_8hJd7sQh_Tc3d6h5h_8c8dTh9d_4dTdQs4s_JsJc2d7h() {
    assertEquals(
      "5d3s7dTs 6c5s3c6s 9s5cQd3h 2cAs8sKs JsJc2d7h 8c8dTh9d 4dTdQs4s Tc3d6h5h 8hJd7sQh",
      Solver.process("omaha-holdem 2hAhJhKhQc 6c5s3c6s 5d3s7dTs 9s5cQd3h 2cAs8sKs 8hJd7sQh Tc3d6h5h 8c8dTh9d 4dTdQs4s JsJc2d7h"));
  }

  @Test
  public void test_omaha_holdem_2036_4c5d7c9dQh_Jc7dQdTc_KsAh6s7s() {
    assertEquals(
      "KsAh6s7s Jc7dQdTc",
      Solver.process("omaha-holdem 4c5d7c9dQh Jc7dQdTc KsAh6s7s"));
  }

  @Test
  public void test_omaha_holdem_2037_2d3c6s9cTh_2sJd9d5h_3sKc5dJh_7dAc4s4h_7h3dQhQc_4dKdQdAs_2c6cJc9h_3h7c5sTs_7s5cTcKh_4c8dAd9s() {
    assertEquals(
      "4dKdQdAs 3sKc5dJh 7dAc4s4h 4c8dAd9s 7s5cTcKh 7h3dQhQc 2sJd9d5h 2c6cJc9h 3h7c5sTs",
      Solver.process("omaha-holdem 2d3c6s9cTh 2sJd9d5h 3sKc5dJh 7dAc4s4h 7h3dQhQc 4dKdQdAs 2c6cJc9h 3h7c5sTs 7s5cTcKh 4c8dAd9s"));
  }

  @Test
  public void test_omaha_holdem_2038_2s3c4d5h6h_7hJcAcKd_Tc9h8c7s_4c4h9sAd_6d6cKcTs_3sKsQsQc() {
    assertEquals(
      "7hJcAcKd 3sKsQsQc 6d6cKcTs 4c4h9sAd Tc9h8c7s",
      Solver.process("omaha-holdem 2s3c4d5h6h 7hJcAcKd Tc9h8c7s 4c4h9sAd 6d6cKcTs 3sKsQsQc"));
  }

  @Test
  public void test_omaha_holdem_2039_3d3s4cKcQc_Ts5dKh4d_6h8d2s3c_Js9cJd7h_2hAdAh7d_6cAcTd8h() {
    assertEquals(
      "Js9cJd7h Ts5dKh4d 2hAdAh7d 6h8d2s3c 6cAcTd8h",
      Solver.process("omaha-holdem 3d3s4cKcQc Ts5dKh4d 6h8d2s3c Js9cJd7h 2hAdAh7d 6cAcTd8h"));
  }

  @Test
  public void test_omaha_holdem_2040_4s7h7s9dAh_QhTcKs2d_4h8sKcJh_2h9h6d5s_9cTh7cQs_AcJdTd5c_6s8c8h2s() {
    assertEquals(
      "QhTcKs2d 4h8sKcJh 6s8c8h2s 2h9h6d5s AcJdTd5c 9cTh7cQs",
      Solver.process("omaha-holdem 4s7h7s9dAh QhTcKs2d 4h8sKcJh 2h9h6d5s 9cTh7cQs AcJdTd5c 6s8c8h2s"));
  }

  @Test
  public void test_omaha_holdem_2041_2s5h7d7sQh_9h4hQc2d_AdQd6c7h_Tc4sKd9d() {
    assertEquals(
      "Tc4sKd9d 9h4hQc2d AdQd6c7h",
      Solver.process("omaha-holdem 2s5h7d7sQh 9h4hQc2d AdQd6c7h Tc4sKd9d"));
  }

  @Test
  public void test_omaha_holdem_2042_7sJsKcQcTh_5cJd4d9d_3s8c8h4c_2d9h3d2s_7cQs7dAc_Kd7hTc6h() {
    assertEquals(
      "2d9h3d2s 3s8c8h4c Kd7hTc6h 5cJd4d9d 7cQs7dAc",
      Solver.process("omaha-holdem 7sJsKcQcTh 5cJd4d9d 3s8c8h4c 2d9h3d2s 7cQs7dAc Kd7hTc6h"));
  }

  @Test
  public void test_omaha_holdem_2043_4d5d6c6h9h_Ac7h8d6d_2cKd2dTd_6s2sJs3s_7s4hQcAh() {
    assertEquals(
      "2cKd2dTd 7s4hQcAh 6s2sJs3s Ac7h8d6d",
      Solver.process("omaha-holdem 4d5d6c6h9h Ac7h8d6d 2cKd2dTd 6s2sJs3s 7s4hQcAh"));
  }

  @Test
  public void test_omaha_holdem_2044_6c7d7hKsQh_9c3cQs9s_Qc8d5dTd_7s8c4c2c_2d3dJcTc() {
    assertEquals(
      "2d3dJcTc 9c3cQs9s Qc8d5dTd 7s8c4c2c",
      Solver.process("omaha-holdem 6c7d7hKsQh 9c3cQs9s Qc8d5dTd 7s8c4c2c 2d3dJcTc"));
  }

  @Test
  public void test_omaha_holdem_2045_4h7s9d9sAh_KdKh3dTc_6sJsJd3h() {
    assertEquals(
      "6sJsJd3h KdKh3dTc",
      Solver.process("omaha-holdem 4h7s9d9sAh KdKh3dTc 6sJsJd3h"));
  }

  @Test
  public void test_omaha_holdem_2046_5d6s8hAhQd_7sKh9c4h_3c6hTsQh_9s3hKd2c_Jh3dAcQc_Td9d5cQs_ThAs2sAd_Js7c4d4c_Kc7h5s3s_Jc9h8c2h() {
    assertEquals(
      "9s3hKd2c Kc7h5s3s Jc9h8c2h Td9d5cQs 3c6hTsQh Jh3dAcQc ThAs2sAd Js7c4d4c 7sKh9c4h",
      Solver.process("omaha-holdem 5d6s8hAhQd 7sKh9c4h 3c6hTsQh 9s3hKd2c Jh3dAcQc Td9d5cQs ThAs2sAd Js7c4d4c Kc7h5s3s Jc9h8c2h"));
  }

  @Test
  public void test_omaha_holdem_2047_5h6c7cQcQh_3c8cKh8d_Ad3d5cQs_3sJdThKc_9sAc7d4s_8s9d4h2c_TdAsKd6h_8h6dJsKs() {
    assertEquals(
      "3sJdThKc 8h6dJsKs TdAsKd6h 9sAc7d4s 8s9d4h2c 3c8cKh8d Ad3d5cQs",
      Solver.process("omaha-holdem 5h6c7cQcQh 3c8cKh8d Ad3d5cQs 3sJdThKc 9sAc7d4s 8s9d4h2c TdAsKd6h 8h6dJsKs"));
  }

  @Test
  public void test_omaha_holdem_2048_4s5s8d9sKd_6s3cJhQh_6c8hTs2c_5dAcKsAd_8c6h5cTh_KhKcTd5h_As3h6dJd_Qs7d2sTc_JsJc2dQd() {
    assertEquals(
      "6s3cJhQh As3h6dJd 6c8hTs2c JsJc2dQd 8c6h5cTh 5dAcKsAd KhKcTd5h Qs7d2sTc",
      Solver.process("omaha-holdem 4s5s8d9sKd 6s3cJhQh 6c8hTs2c 5dAcKsAd 8c6h5cTh KhKcTd5h As3h6dJd Qs7d2sTc JsJc2dQd"));
  }

  @Test
  public void test_omaha_holdem_2049_4d7sJsKcTh_As9dKdTc_2cQsKhJd_2hQc4cTd_Jh9s3d5c() {
    assertEquals(
      "Jh9s3d5c 2hQc4cTd As9dKdTc 2cQsKhJd",
      Solver.process("omaha-holdem 4d7sJsKcTh As9dKdTc 2cQsKhJd 2hQc4cTd Jh9s3d5c"));
  }

  @Test
  public void test_omaha_holdem_2050_7hQcTcTdTh_9sJd5h6h_9c8dAc9h_3h8c2dTs_4h4c2s4d_KcAsKd5c_7c5sAh2h_3dKs3s5d() {
    assertEquals(
      "9sJd5h6h 7c5sAh2h 3dKs3s5d 4h4c2s4d 9c8dAc9h KcAsKd5c 3h8c2dTs",
      Solver.process("omaha-holdem 7hQcTcTdTh 9sJd5h6h 9c8dAc9h 3h8c2dTs 4h4c2s4d KcAsKd5c 7c5sAh2h 3dKs3s5d"));
  }

  @Test
  public void test_omaha_holdem_2051_8s9sAdJdTh_7h9h5s4d_AcAs3d4h_4cQdQh4s_7sKdTc6d_JcJhKsTd_KcAh5d6h_7d6c8h9c_Kh2c5h2s_3s7cJs9d() {
    assertEquals(
      "Kh2c5h2s 4cQdQh4s KcAh5d6h JcJhKsTd AcAs3d4h 3s7cJs9d=7d6c8h9c=7h9h5s4d=7sKdTc6d",
      Solver.process("omaha-holdem 8s9sAdJdTh 7h9h5s4d AcAs3d4h 4cQdQh4s 7sKdTc6d JcJhKsTd KcAh5d6h 7d6c8h9c Kh2c5h2s 3s7cJs9d"));
  }

  @Test
  public void test_omaha_holdem_2052_2d3s7cAhQs_Tc8h9s8d_ThKcKd8s() {
    assertEquals(
      "Tc8h9s8d ThKcKd8s",
      Solver.process("omaha-holdem 2d3s7cAhQs Tc8h9s8d ThKcKd8s"));
  }

  @Test
  public void test_omaha_holdem_2053_4s5c5s7hJc_2dQsAc3h_7s5h2cTd_4c6d3c9h() {
    assertEquals(
      "2dQsAc3h 4c6d3c9h 7s5h2cTd",
      Solver.process("omaha-holdem 4s5c5s7hJc 2dQsAc3h 7s5h2cTd 4c6d3c9h"));
  }

  @Test
  public void test_omaha_holdem_2054_2h7c8s9sAh_TdKh3d7d_Qc6c8hJd_Ac8d9c2d_7sAd8cTc() {
    assertEquals(
      "TdKh3d7d Qc6c8hJd 7sAd8cTc Ac8d9c2d",
      Solver.process("omaha-holdem 2h7c8s9sAh TdKh3d7d Qc6c8hJd Ac8d9c2d 7sAd8cTc"));
  }

  @Test
  public void test_omaha_holdem_2055_3c6s7cQcQs_5s9cKd6c_2sTs6hAs_Ac9hAh8s_4h7h8c3s_5d2cJs2h_2d8hJc3d() {
    assertEquals(
      "5d2cJs2h 2d8hJc3d 2sTs6hAs 4h7h8c3s Ac9hAh8s 5s9cKd6c",
      Solver.process("omaha-holdem 3c6s7cQcQs 5s9cKd6c 2sTs6hAs Ac9hAh8s 4h7h8c3s 5d2cJs2h 2d8hJc3d"));
  }

  @Test
  public void test_omaha_holdem_2056_3cAhQhQsTs_3d3sKh2d_8dKc3hQd_Jd8h7d6h_Js6cAsQc_7cKdTd4d() {
    assertEquals(
      "Jd8h7d6h 7cKdTd4d 3d3sKh2d 8dKc3hQd Js6cAsQc",
      Solver.process("omaha-holdem 3cAhQhQsTs 3d3sKh2d 8dKc3hQd Jd8h7d6h Js6cAsQc 7cKdTd4d"));
  }

  @Test
  public void test_omaha_holdem_2057_3h7d8cJhTc_JdAc2c2s_7sAhKh6s_Th9h2h3c_5h9cJcAd_Ks5s4hTs_Js3d6d8d_4d7c6c5d_9d8hQh8s_Qc7hAsQs() {
    assertEquals(
      "4d7c6c5d 7sAhKh6s Ks5s4hTs JdAc2c2s Qc7hAsQs Js3d6d8d 5h9cJcAd=Th9h2h3c 9d8hQh8s",
      Solver.process("omaha-holdem 3h7d8cJhTc JdAc2c2s 7sAhKh6s Th9h2h3c 5h9cJcAd Ks5s4hTs Js3d6d8d 4d7c6c5d 9d8hQh8s Qc7hAsQs"));
  }

  @Test
  public void test_omaha_holdem_2058_5hJsQcQhTh_Ac8d2h9c_8sTd6d7d_Ks8cJdKh_4h3s7h9h() {
    assertEquals(
      "8sTd6d7d Ks8cJdKh Ac8d2h9c 4h3s7h9h",
      Solver.process("omaha-holdem 5hJsQcQhTh Ac8d2h9c 8sTd6d7d Ks8cJdKh 4h3s7h9h"));
  }

  @Test
  public void test_omaha_holdem_2059_3d4h4s7hTs_4d7s9s4c_2s9d6d2d_AhKsQd5h() {
    assertEquals(
      "AhKsQd5h 2s9d6d2d 4d7s9s4c",
      Solver.process("omaha-holdem 3d4h4s7hTs 4d7s9s4c 2s9d6d2d AhKsQd5h"));
  }

  @Test
  public void test_omaha_holdem_2060_5c9c9hJhJs_Tc8sKsKc_Ac6dQs2d_7hAs6cQc_Qh7d3cTh() {
    assertEquals(
      "Qh7d3cTh 7hAs6cQc=Ac6dQs2d Tc8sKsKc",
      Solver.process("omaha-holdem 5c9c9hJhJs Tc8sKsKc Ac6dQs2d 7hAs6cQc Qh7d3cTh"));
  }

  @Test
  public void test_omaha_holdem_2061_4d6c7hAhKd_8d8c2h9s_9dTdTs4s() {
    assertEquals(
      "8d8c2h9s 9dTdTs4s",
      Solver.process("omaha-holdem 4d6c7hAhKd 8d8c2h9s 9dTdTs4s"));
  }

  @Test
  public void test_omaha_holdem_2062_2d4h8cAcKh_5sJd3hJc_Qs6d7c5h_4dTs8dKs_5c2c4s6c_2hTd5dKc() {
    assertEquals(
      "Qs6d7c5h 5c2c4s6c 2hTd5dKc 4dTs8dKs 5sJd3hJc",
      Solver.process("omaha-holdem 2d4h8cAcKh 5sJd3hJc Qs6d7c5h 4dTs8dKs 5c2c4s6c 2hTd5dKc"));
  }

  @Test
  public void test_omaha_holdem_2063_7h8sJcJsTs_9s3s5h4d_3dKcTd9h_ThAd7d6h_Qc6d6c2c_Kd8c5cKs_JdQs3c2s() {
    assertEquals(
      "Qc6d6c2c ThAd7d6h Kd8c5cKs 3dKcTd9h 9s3s5h4d JdQs3c2s",
      Solver.process("omaha-holdem 7h8sJcJsTs 9s3s5h4d 3dKcTd9h ThAd7d6h Qc6d6c2c Kd8c5cKs JdQs3c2s"));
  }

  @Test
  public void test_omaha_holdem_2064_3d5h7c7sQc_7hKh9h6s_8cAh4s2s_4c9sQd9c_8sAc5dTh_Ad5sAs7d_3cKd8h3s_Ts8d3hTd() {
    assertEquals(
      "8cAh4s2s 8sAc5dTh Ts8d3hTd 4c9sQd9c 7hKh9h6s 3cKd8h3s Ad5sAs7d",
      Solver.process("omaha-holdem 3d5h7c7sQc 7hKh9h6s 8cAh4s2s 4c9sQd9c 8sAc5dTh Ad5sAs7d 3cKd8h3s Ts8d3hTd"));
  }

  @Test
  public void test_omaha_holdem_2065_2h4h6hAcJd_Jc5h9hAd_2s8sKd8c_KhKs7dTs_Qs5s3h9s_4s4d7s2d() {
    assertEquals(
      "2s8sKd8c KhKs7dTs 4s4d7s2d Qs5s3h9s Jc5h9hAd",
      Solver.process("omaha-holdem 2h4h6hAcJd Jc5h9hAd 2s8sKd8c KhKs7dTs Qs5s3h9s 4s4d7s2d"));
  }

  @Test
  public void test_omaha_holdem_2066_6hAcJhQcQd_9sJd7hTh_9dJcAhQs() {
    assertEquals(
      "9sJd7hTh 9dJcAhQs",
      Solver.process("omaha-holdem 6hAcJhQcQd 9sJd7hTh 9dJcAhQs"));
  }

  @Test
  public void test_omaha_holdem_2067_8c8d8hAcJs_Tc7sKd4h_5h6c3cKc_5sJdTdQs_ThQd4d6d_AdKh5d9s() {
    assertEquals(
      "ThQd4d6d 5sJdTdQs 5h6c3cKc Tc7sKd4h AdKh5d9s",
      Solver.process("omaha-holdem 8c8d8hAcJs Tc7sKd4h 5h6c3cKc 5sJdTdQs ThQd4d6d AdKh5d9s"));
  }

  @Test
  public void test_omaha_holdem_2068_6h7hAdAsKd_3s9h6c5d_QhQs4cTs_3c7d6d8c_3d2d4d9c_7c5s2sQc() {
    assertEquals(
      "3d2d4d9c 3s9h6c5d 3c7d6d8c 7c5s2sQc QhQs4cTs",
      Solver.process("omaha-holdem 6h7hAdAsKd 3s9h6c5d QhQs4cTs 3c7d6d8c 3d2d4d9c 7c5s2sQc"));
  }

  @Test
  public void test_omaha_holdem_2069_3s4cKhQdTs_Ad6hQs5h_7dAhThAc_5c6sJh8h_2d4h5s6c_Jc6dTcJd_4d7c8s7s() {
    assertEquals(
      "5c6sJh8h 2d4h5s6c 4d7c8s7s Jc6dTcJd Ad6hQs5h 7dAhThAc",
      Solver.process("omaha-holdem 3s4cKhQdTs Ad6hQs5h 7dAhThAc 5c6sJh8h 2d4h5s6c Jc6dTcJd 4d7c8s7s"));
  }

  @Test
  public void test_omaha_holdem_2070_2d4c6s7cKc_QcKh7d4h_Qh2h5hQd_6h5sAd9c_ThTdAsJh_5c7s6c8s_3hTcKs4s() {
    assertEquals(
      "6h5sAd9c ThTdAsJh Qh2h5hQd 3hTcKs4s QcKh7d4h 5c7s6c8s",
      Solver.process("omaha-holdem 2d4c6s7cKc QcKh7d4h Qh2h5hQd 6h5sAd9c ThTdAsJh 5c7s6c8s 3hTcKs4s"));
  }

  @Test
  public void test_omaha_holdem_2071_3d4h5d7s8d_Qh7dAc5s_3hQsAd6h_5c8sQc9c_Ah5hKdKs_Qd8c9s2h_Jd6dJsTd_4d4sThJc_2d6c9d8h_2cTc3cTs() {
    assertEquals(
      "Qd8c9s2h 2cTc3cTs Ah5hKdKs Qh7dAc5s 5c8sQc9c 4d4sThJc 3hQsAd6h 2d6c9d8h Jd6dJsTd",
      Solver.process("omaha-holdem 3d4h5d7s8d Qh7dAc5s 3hQsAd6h 5c8sQc9c Ah5hKdKs Qd8c9s2h Jd6dJsTd 4d4sThJc 2d6c9d8h 2cTc3cTs"));
  }

  @Test
  public void test_omaha_holdem_2072_2c5c9hAhQs_7dTc7c6c_5dQc9c8c_3s3c2d6s_Qh3hKdAc_JhAs6h5h() {
    assertEquals(
      "3s3c2d6s 7dTc7c6c 5dQc9c8c JhAs6h5h Qh3hKdAc",
      Solver.process("omaha-holdem 2c5c9hAhQs 7dTc7c6c 5dQc9c8c 3s3c2d6s Qh3hKdAc JhAs6h5h"));
  }

  @Test
  public void test_omaha_holdem_2073_6d7s8h9dKc_5d4c2h9s_3sQs3c6h_AcAdQd5h_Ah9cKsKh_Qh8d2dTs_6s7d7cJs_2sTdTc5s_AsQcJdJc_4d3h8sJh() {
    assertEquals(
      "3sQs3c6h 4d3h8sJh 2sTdTc5s AsQcJdJc AcAdQd5h 6s7d7cJs Ah9cKsKh 5d4c2h9s Qh8d2dTs",
      Solver.process("omaha-holdem 6d7s8h9dKc 5d4c2h9s 3sQs3c6h AcAdQd5h Ah9cKsKh Qh8d2dTs 6s7d7cJs 2sTdTc5s AsQcJdJc 4d3h8sJh"));
  }

  @Test
  public void test_omaha_holdem_2074_3c6c6s7s8c_5dTcQdKc_3d3sAcQc_KsJcKh8h_9c9s2h4c_2c2s9d5s() {
    assertEquals(
      "KsJcKh8h 2c2s9d5s 9c9s2h4c 5dTcQdKc 3d3sAcQc",
      Solver.process("omaha-holdem 3c6c6s7s8c 5dTcQdKc 3d3sAcQc KsJcKh8h 9c9s2h4c 2c2s9d5s"));
  }

  @Test
  public void test_omaha_holdem_2075_3h7dJcQdTc_3c7hQs2h_3sKd5h6d_TsKc3d6h_8sTd9h4h_Js6s9d4c_4sKsAcKh_5dQc9s9c_Jh2d6c5c_8c4d2cAd() {
    assertEquals(
      "8c4d2cAd 3sKd5h6d Jh2d6c5c Js6s9d4c 5dQc9s9c TsKc3d6h 3c7hQs2h 8sTd9h4h 4sKsAcKh",
      Solver.process("omaha-holdem 3h7dJcQdTc 3c7hQs2h 3sKd5h6d TsKc3d6h 8sTd9h4h Js6s9d4c 4sKsAcKh 5dQc9s9c Jh2d6c5c 8c4d2cAd"));
  }

  @Test
  public void test_omaha_holdem_2076_2h6h7c9hKd_3hQh8cQd_JsTs2c4s_3dTd4d5c_Ad6cAhAc() {
    assertEquals(
      "3dTd4d5c JsTs2c4s Ad6cAhAc 3hQh8cQd",
      Solver.process("omaha-holdem 2h6h7c9hKd 3hQh8cQd JsTs2c4s 3dTd4d5c Ad6cAhAc"));
  }

  @Test
  public void test_omaha_holdem_2077_2d3cAsKhQc_Kc2sJsJc_5s7s2h9s_Ad3s8h5h_4c4h2c8c_6cAc6dJh() {
    assertEquals(
      "5s7s2h9s 4c4h2c8c 6cAc6dJh Kc2sJsJc Ad3s8h5h",
      Solver.process("omaha-holdem 2d3cAsKhQc Kc2sJsJc 5s7s2h9s Ad3s8h5h 4c4h2c8c 6cAc6dJh"));
  }

  @Test
  public void test_omaha_holdem_2078_4d7dAdJcQd_7sKs6c8s_9h2cQhJd_Jh3c3h4s_9dAs9s2h_Qc3s6hTc() {
    assertEquals(
      "7sKs6c8s Qc3s6hTc 9dAs9s2h Jh3c3h4s 9h2cQhJd",
      Solver.process("omaha-holdem 4d7dAdJcQd 7sKs6c8s 9h2cQhJd Jh3c3h4s 9dAs9s2h Qc3s6hTc"));
  }

  @Test
  public void test_omaha_holdem_2079_8h9c9d9hTd_Js9sKh4c_JdKcQcTc_Jh7h6c2c_4d2s3h6h_Qd7sAsAd_8d3c6d4h_8s5c5h2d() {
    assertEquals(
      "4d2s3h6h 8d3c6d4h Jh7h6c2c JdKcQcTc 8s5c5h2d Qd7sAsAd Js9sKh4c",
      Solver.process("omaha-holdem 8h9c9d9hTd Js9sKh4c JdKcQcTc Jh7h6c2c 4d2s3h6h Qd7sAsAd 8d3c6d4h 8s5c5h2d"));
  }

  @Test
  public void test_omaha_holdem_2080_2c4d7sAsTh_Qh9d8cQc_7h3hAh3c_4h9cKdJd_3d6sTs5c_7cQs3s8h_2s4c9h2d() {
    assertEquals(
      "4h9cKdJd 7cQs3s8h Qh9d8cQc 7h3hAh3c 2s4c9h2d 3d6sTs5c",
      Solver.process("omaha-holdem 2c4d7sAsTh Qh9d8cQc 7h3hAh3c 4h9cKdJd 3d6sTs5c 7cQs3s8h 2s4c9h2d"));
  }

  @Test
  public void test_omaha_holdem_2081_5s8s9sAhJc_AdKh4hTs_3cTd9c2s_3d7cAcKd_6h2c3s5d_8hTcQc2h_2d7s4c6s_7h3h6c4s() {
    assertEquals(
      "6h2c3s5d 3cTd9c2s 3d7cAcKd=AdKh4hTs 7h3h6c4s 8hTcQc2h 2d7s4c6s",
      Solver.process("omaha-holdem 5s8s9sAhJc AdKh4hTs 3cTd9c2s 3d7cAcKd 6h2c3s5d 8hTcQc2h 2d7s4c6s 7h3h6c4s"));
  }

  @Test
  public void test_omaha_holdem_2082_2s4h7hKsQs_5c7d4s4d_8cJdAc3s_Th8dTcKh_9dJsJhKc_6d7cAsAd_Jc5d9hQc_4cTs8s9s() {
    assertEquals(
      "8cJdAc3s Jc5d9hQc Th8dTcKh 9dJsJhKc 6d7cAsAd 5c7d4s4d 4cTs8s9s",
      Solver.process("omaha-holdem 2s4h7hKsQs 5c7d4s4d 8cJdAc3s Th8dTcKh 9dJsJhKc 6d7cAsAd Jc5d9hQc 4cTs8s9s"));
  }

  @Test
  public void test_omaha_holdem_2083_2hJcKdQdTs_3hKs6sTh_As7d8s2s_Ah6cJd6h_9h2c4d8h() {
    assertEquals(
      "As7d8s2s 3hKs6sTh 9h2c4d8h Ah6cJd6h",
      Solver.process("omaha-holdem 2hJcKdQdTs 3hKs6sTh As7d8s2s Ah6cJd6h 9h2c4d8h"));
  }

  @Test
  public void test_omaha_holdem_2084_4c4h6hJsTc_3d8d8hJc_TsQd3c5s_Jh8sKs4d() {
    assertEquals(
      "TsQd3c5s 3d8d8hJc Jh8sKs4d",
      Solver.process("omaha-holdem 4c4h6hJsTc 3d8d8hJc TsQd3c5s Jh8sKs4d"));
  }

  @Test
  public void test_omaha_holdem_2085_4h5d6s8hTc_TdJdQh3c_Jh6h7d2c_Ah4c6c7c() {
    assertEquals(
      "TdJdQh3c Ah4c6c7c=Jh6h7d2c",
      Solver.process("omaha-holdem 4h5d6s8hTc TdJdQh3c Jh6h7d2c Ah4c6c7c"));
  }

  @Test
  public void test_omaha_holdem_2086_2h4h7hKdQd_6s3s4sJh_8s8d3c6h_Jd3hQsJc_Qc9hTcAs() {
    assertEquals(
      "6s3s4sJh 8s8d3c6h Jd3hQsJc Qc9hTcAs",
      Solver.process("omaha-holdem 2h4h7hKdQd 6s3s4sJh 8s8d3c6h Jd3hQsJc Qc9hTcAs"));
  }

  @Test
  public void test_omaha_holdem_2087_6s8dJcKcQs_3hAcTsTc_7s2h4hJd_6h5h8c5d_Qc8s4sQh_9d5cTdTh_2s6c7c4c_Ah9sQd2c_7d6d3sJh() {
    assertEquals(
      "2s6c7c4c 7s2h4hJd Ah9sQd2c 6h5h8c5d 7d6d3sJh Qc8s4sQh 9d5cTdTh 3hAcTsTc",
      Solver.process("omaha-holdem 6s8dJcKcQs 3hAcTsTc 7s2h4hJd 6h5h8c5d Qc8s4sQh 9d5cTdTh 2s6c7c4c Ah9sQd2c 7d6d3sJh"));
  }

  @Test
  public void test_omaha_holdem_2088_3d5d8cAcQd_JsJcTd9s_6d3s6hTs_Qc8dQsJh_5h3h9cKc_3c2cQhKh_2s7c8s6s_4cJd4s2d() {
    assertEquals(
      "6d3s6hTs 2s7c8s6s JsJcTd9s 5h3h9cKc 3c2cQhKh Qc8dQsJh 4cJd4s2d",
      Solver.process("omaha-holdem 3d5d8cAcQd JsJcTd9s 6d3s6hTs Qc8dQsJh 5h3h9cKc 3c2cQhKh 2s7c8s6s 4cJd4s2d"));
  }

  @Test
  public void test_omaha_holdem_2089_2s4c8c9sTs_3s5d4s5c_Td9h3h2d_Th9dKc2h() {
    assertEquals(
      "Td9h3h2d=Th9dKc2h 3s5d4s5c",
      Solver.process("omaha-holdem 2s4c8c9sTs 3s5d4s5c Td9h3h2d Th9dKc2h"));
  }

  @Test
  public void test_omaha_holdem_2090_3s4d6sJhQs_Jc6d7sTc_TsQcAdQd_5d7hAhQh_9cKhKd2h_9h7dKsAs_Kc6hTh8s() {
    assertEquals(
      "Kc6hTh8s 9cKhKd2h Jc6d7sTc TsQcAdQd 5d7hAhQh 9h7dKsAs",
      Solver.process("omaha-holdem 3s4d6sJhQs Jc6d7sTc TsQcAdQd 5d7hAhQh 9cKhKd2h 9h7dKsAs Kc6hTh8s"));
  }

  @Test
  public void test_omaha_holdem_2091_2d7c7dJcJs_Qs8s8h8c_2c6c4hTs_Ks5dJh3h_5s8d3c4c() {
    assertEquals(
      "5s8d3c4c 2c6c4hTs Qs8s8h8c Ks5dJh3h",
      Solver.process("omaha-holdem 2d7c7dJcJs Qs8s8h8c 2c6c4hTs Ks5dJh3h 5s8d3c4c"));
  }

  @Test
  public void test_omaha_holdem_2092_4h4s5s6sQs_3d3hJd9d_5dJh8d7s_7d7c2d3s_9sQc4dAd_6hTc8hTd_Js6dKd5h() {
    assertEquals(
      "3d3hJd9d Js6dKd5h 6hTc8hTd 7d7c2d3s 5dJh8d7s 9sQc4dAd",
      Solver.process("omaha-holdem 4h4s5s6sQs 3d3hJd9d 5dJh8d7s 7d7c2d3s 9sQc4dAd 6hTc8hTd Js6dKd5h"));
  }

  @Test
  public void test_omaha_holdem_2093_2d2s3s8s9c_As8cAh8d_TdJh7c4c_2c9dQsQh_8hKs5cJc_Th6h2h6d_QdKd7s4s_5s6sQcAc() {
    assertEquals(
      "TdJh7c4c 8hKs5cJc Th6h2h6d 5s6sQcAc QdKd7s4s 2c9dQsQh As8cAh8d",
      Solver.process("omaha-holdem 2d2s3s8s9c As8cAh8d TdJh7c4c 2c9dQsQh 8hKs5cJc Th6h2h6d QdKd7s4s 5s6sQcAc"));
  }

  @Test
  public void test_omaha_holdem_2094_4s8c8hAdJh_5s5cTs4d_2hTc3h2s_7hKhJs3c_7c2d7sTd() {
    assertEquals(
      "2hTc3h2s 5s5cTs4d 7c2d7sTd 7hKhJs3c",
      Solver.process("omaha-holdem 4s8c8hAdJh 5s5cTs4d 2hTc3h2s 7hKhJs3c 7c2d7sTd"));
  }

  @Test
  public void test_omaha_holdem_2095_2s5h6d7hKc_4s9hKh9d_As4d7cTd() {
    assertEquals(
      "As4d7cTd 4s9hKh9d",
      Solver.process("omaha-holdem 2s5h6d7hKc 4s9hKh9d As4d7cTd"));
  }

  @Test
  public void test_omaha_holdem_2096_3c3d5sAcTh_8d4h2d3h_5d2sTcAd_2c8cJs6h_9cTs8h7h_3sQhKs4c_JcJhAh4d_6c7sTd6d_QsJd6sAs_9sKc5c9h() {
    assertEquals(
      "2c8cJs6h 9sKc5c9h 6c7sTd6d 9cTs8h7h JcJhAh4d QsJd6sAs 5d2sTcAd 3sQhKs4c 8d4h2d3h",
      Solver.process("omaha-holdem 3c3d5sAcTh 8d4h2d3h 5d2sTcAd 2c8cJs6h 9cTs8h7h 3sQhKs4c JcJhAh4d 6c7sTd6d QsJd6sAs 9sKc5c9h"));
  }

  @Test
  public void test_omaha_holdem_2097_4h4s6c7s8d_QsJsQc2s_8s9d9s7d_Ad8hTdJd_Qh2h4d7c_AsKdQdAc_9c5c5d3h_Jc4c3c8c_KcTc7hKs_Kh6h2c6s() {
    assertEquals(
      "Ad8hTdJd 8s9d9s7d QsJsQc2s KcTc7hKs AsKdQdAc 9c5c5d3h Qh2h4d7c Jc4c3c8c Kh6h2c6s",
      Solver.process("omaha-holdem 4h4s6c7s8d QsJsQc2s 8s9d9s7d Ad8hTdJd Qh2h4d7c AsKdQdAc 9c5c5d3h Jc4c3c8c KcTc7hKs Kh6h2c6s"));
  }

  @Test
  public void test_omaha_holdem_2098_2h6c6d7hQs_Ac4c3sAh_Qd2dKcTc_5cKs9sTs_5sKhTd6s_9c4h3h4s_Qh6h8h4d() {
    assertEquals(
      "5cKs9sTs 9c4h3h4s Qd2dKcTc Ac4c3sAh 5sKhTd6s Qh6h8h4d",
      Solver.process("omaha-holdem 2h6c6d7hQs Ac4c3sAh Qd2dKcTc 5cKs9sTs 5sKhTd6s 9c4h3h4s Qh6h8h4d"));
  }

  @Test
  public void test_omaha_holdem_2099_4s8s9cJdKc_QhKd7hAh_Ac2c7cQc_4d9h2s3s_6c9s5dQd_8d4h6h7d() {
    assertEquals(
      "Ac2c7cQc 6c9s5dQd QhKd7hAh 8d4h6h7d 4d9h2s3s",
      Solver.process("omaha-holdem 4s8s9cJdKc QhKd7hAh Ac2c7cQc 4d9h2s3s 6c9s5dQd 8d4h6h7d"));
  }

  @Test
  public void test_omaha_holdem_2100_6h7c9dAhJc_9h3cJsQh_6s4d2h4c_AdJdKd2c() {
    assertEquals(
      "6s4d2h4c 9h3cJsQh AdJdKd2c",
      Solver.process("omaha-holdem 6h7c9dAhJc 9h3cJsQh 6s4d2h4c AdJdKd2c"));
  }

  @Test
  public void test_omaha_holdem_2101_2h3s4dJhQc_ThQs7h5h_8hTsKs7s_8c9c4s3c_6d3d5d9d_6hAs5sKh() {
    assertEquals(
      "8hTsKs7s ThQs7h5h 8c9c4s3c 6d3d5d9d=6hAs5sKh",
      Solver.process("omaha-holdem 2h3s4dJhQc ThQs7h5h 8hTsKs7s 8c9c4s3c 6d3d5d9d 6hAs5sKh"));
  }

  @Test
  public void test_omaha_holdem_2102_4s5c5d5sTh_2dQc9d2s_Qs6c4cJs_4h7sTcKs_Ac2hAs6h_7cQhKd9s_9hJcKc8s_8c6sKh3h_3sAh8d6d_Jh7h8h3c() {
    assertEquals(
      "Jh7h8h3c Qs6c4cJs 8c6sKh3h 4h7sTcKs 9hJcKc8s 7cQhKd9s 3sAh8d6d 2dQc9d2s Ac2hAs6h",
      Solver.process("omaha-holdem 4s5c5d5sTh 2dQc9d2s Qs6c4cJs 4h7sTcKs Ac2hAs6h 7cQhKd9s 9hJcKc8s 8c6sKh3h 3sAh8d6d Jh7h8h3c"));
  }

  @Test
  public void test_omaha_holdem_2103_3h3s7h9hAh_5hJdJc4h_KhQd4dQh_TdJsKs2h_7s6h2c7d_Kd4s8c3d_9s6dThQc_6s8d9d3c_5sAsQs7c_JhTc9c8s() {
    assertEquals(
      "TdJsKs2h JhTc9c8s 9s6dThQc 5sAsQs7c Kd4s8c3d 5hJdJc4h KhQd4dQh 6s8d9d3c 7s6h2c7d",
      Solver.process("omaha-holdem 3h3s7h9hAh 5hJdJc4h KhQd4dQh TdJsKs2h 7s6h2c7d Kd4s8c3d 9s6dThQc 6s8d9d3c 5sAsQs7c JhTc9c8s"));
  }

  @Test
  public void test_omaha_holdem_2104_2c3d6d6hQs_4dKcKs7c_4cJsJd9c() {
    assertEquals(
      "4cJsJd9c 4dKcKs7c",
      Solver.process("omaha-holdem 2c3d6d6hQs 4dKcKs7c 4cJsJd9c"));
  }

  @Test
  public void test_omaha_holdem_2105_2d3d4c7cKh_6d4d3sAh_7d5d8c4s() {
    assertEquals(
      "6d4d3sAh 7d5d8c4s",
      Solver.process("omaha-holdem 2d3d4c7cKh 6d4d3sAh 7d5d8c4s"));
  }

  @Test
  public void test_omaha_holdem_2106_2s3s6cAcQs_JdAd8d4h_7sJs5c2h_5s7cKdJc() {
    assertEquals(
      "5s7cKdJc JdAd8d4h 7sJs5c2h",
      Solver.process("omaha-holdem 2s3s6cAcQs JdAd8d4h 7sJs5c2h 5s7cKdJc"));
  }

  @Test
  public void test_omaha_holdem_2107_3s7h8sAcKc_7d4s7c8d_9h9c3hJd_TdKh6sQs_9s4h8hJs_Ad7sJh8c_Ts6cQhKs_4dTh4c5s_3d5hQd5d_2dQc6d2c() {
    assertEquals(
      "2dQc6d2c 4dTh4c5s 3d5hQd5d 9s4h8hJs 9h9c3hJd TdKh6sQs=Ts6cQhKs Ad7sJh8c 7d4s7c8d",
      Solver.process("omaha-holdem 3s7h8sAcKc 7d4s7c8d 9h9c3hJd TdKh6sQs 9s4h8hJs Ad7sJh8c Ts6cQhKs 4dTh4c5s 3d5hQd5d 2dQc6d2c"));
  }

  @Test
  public void test_omaha_holdem_2108_3c4s9c9sJs_7c2dThQs_8c6hTcAd_4h2sJcTs_8d6s4d3d_KdTdJhKs() {
    assertEquals(
      "7c2dThQs 8c6hTcAd 8d6s4d3d KdTdJhKs 4h2sJcTs",
      Solver.process("omaha-holdem 3c4s9c9sJs 7c2dThQs 8c6hTcAd 4h2sJcTs 8d6s4d3d KdTdJhKs"));
  }

  @Test
  public void test_omaha_holdem_2109_3c6d7c7hAd_KhKs4s2c_3s6s5hQd() {
    assertEquals(
      "3s6s5hQd KhKs4s2c",
      Solver.process("omaha-holdem 3c6d7c7hAd KhKs4s2c 3s6s5hQd"));
  }

  @Test
  public void test_omaha_holdem_2110_3d4c6hAdKh_ThTd7d5h_9h4hAh3s_AcJcQd5c_6dTc6s5s() {
    assertEquals(
      "AcJcQd5c 9h4hAh3s 6dTc6s5s ThTd7d5h",
      Solver.process("omaha-holdem 3d4c6hAdKh ThTd7d5h 9h4hAh3s AcJcQd5c 6dTc6s5s"));
  }

  @Test
  public void test_omaha_holdem_2111_2h8h8sJsKh_2c7d3d6s_Qc3sAc4c_9hAh4h5d() {
    assertEquals(
      "Qc3sAc4c 2c7d3d6s 9hAh4h5d",
      Solver.process("omaha-holdem 2h8h8sJsKh 2c7d3d6s Qc3sAc4c 9hAh4h5d"));
  }

  @Test
  public void test_omaha_holdem_2112_3d5c7h8hTh_4d7sJsAc_Ah7c6sTc_Kh3h6d7d_Kc2h2c9c_5sQh4hAs() {
    assertEquals(
      "Kc2h2c9c 4d7sJsAc Ah7c6sTc 5sQh4hAs Kh3h6d7d",
      Solver.process("omaha-holdem 3d5c7h8hTh 4d7sJsAc Ah7c6sTc Kh3h6d7d Kc2h2c9c 5sQh4hAs"));
  }

  @Test
  public void test_omaha_holdem_2113_8h8s9sAsKs_9hTs3h3d_7c6h8dJh_7sKhKc5h_Kd8cQdJd_3s2c6c4c_Ah2h5c2d_Qs9d4dJc() {
    assertEquals(
      "3s2c6c4c 9hTs3h3d Qs9d4dJc Ah2h5c2d 7c6h8dJh Kd8cQdJd 7sKhKc5h",
      Solver.process("omaha-holdem 8h8s9sAsKs 9hTs3h3d 7c6h8dJh 7sKhKc5h Kd8cQdJd 3s2c6c4c Ah2h5c2d Qs9d4dJc"));
  }

  @Test
  public void test_omaha_holdem_2114_3h5s7h8cTc_Js3d7dAs_4cTd8hAh() {
    assertEquals(
      "Js3d7dAs 4cTd8hAh",
      Solver.process("omaha-holdem 3h5s7h8cTc Js3d7dAs 4cTd8hAh"));
  }

  @Test
  public void test_omaha_holdem_2115_2c2h3dKcKd_5h2sAc8d_3c7s8h7d_Qd4hQh7c_9cJhKs9h_3h5c6sTh_9s4s4cJd() {
    assertEquals(
      "3h5c6sTh 9s4s4cJd 3c7s8h7d Qd4hQh7c 5h2sAc8d 9cJhKs9h",
      Solver.process("omaha-holdem 2c2h3dKcKd 5h2sAc8d 3c7s8h7d Qd4hQh7c 9cJhKs9h 3h5c6sTh 9s4s4cJd"));
  }

  @Test
  public void test_omaha_holdem_2116_6h8c9cJcJs_Th6sKc2c_5hJh8h4h_9sAs4c9h() {
    assertEquals(
      "Th6sKc2c 9sAs4c9h 5hJh8h4h",
      Solver.process("omaha-holdem 6h8c9cJcJs Th6sKc2c 5hJh8h4h 9sAs4c9h"));
  }

  @Test
  public void test_omaha_holdem_2117_6s7c7h7sJd_8c6dKh3h_4c3c3s7d_JcAc4d6h_9s2d2h8s_Kc6cTh4h_QsAdKdQd_Td2c5d8d() {
    assertEquals(
      "Td2c5d8d 8c6dKh3h Kc6cTh4h JcAc4d6h 9s2d2h8s QsAdKdQd 4c3c3s7d",
      Solver.process("omaha-holdem 6s7c7h7sJd 8c6dKh3h 4c3c3s7d JcAc4d6h 9s2d2h8s Kc6cTh4h QsAdKdQd Td2c5d8d"));
  }

  @Test
  public void test_omaha_holdem_2118_2c2s3c9sTh_Qc6h4h7h_7sJd4d3s() {
    assertEquals(
      "Qc6h4h7h 7sJd4d3s",
      Solver.process("omaha-holdem 2c2s3c9sTh Qc6h4h7h 7sJd4d3s"));
  }

  @Test
  public void test_omaha_holdem_2119_3h5d8hKcQh_AcJh9d9c_7cQd8s6d_3s6hAhAd() {
    assertEquals(
      "AcJh9d9c 7cQd8s6d 3s6hAhAd",
      Solver.process("omaha-holdem 3h5d8hKcQh AcJh9d9c 7cQd8s6d 3s6hAhAd"));
  }

  @Test
  public void test_omaha_holdem_2120_5d6dJsQcTd_KhQs6s8c_Ad4c6cKc_9dKsTs7h_Ac5h8hQh_3s9c8d2h_7d2c4s2s() {
    assertEquals(
      "7d2c4s2s Ac5h8hQh KhQs6s8c 3s9c8d2h 9dKsTs7h Ad4c6cKc",
      Solver.process("omaha-holdem 5d6dJsQcTd KhQs6s8c Ad4c6cKc 9dKsTs7h Ac5h8hQh 3s9c8d2h 7d2c4s2s"));
  }

  @Test
  public void test_omaha_holdem_2121_7h8c9hJcQd_JsTs2d7s_9dQs4hKs_Kc2c5h8h() {
    assertEquals(
      "Kc2c5h8h 9dQs4hKs JsTs2d7s",
      Solver.process("omaha-holdem 7h8c9hJcQd JsTs2d7s 9dQs4hKs Kc2c5h8h"));
  }

  @Test
  public void test_omaha_holdem_2122_5sAcJhQcQd_5hKc6h4h_TdQhKs2s_9h2c7h4d_8hAs6c5c_9sTs4c9c_8cKh8s5d_2h6sJcJd_3cAh8d7d() {
    assertEquals(
      "9h2c7h4d 5hKc6h4h 8cKh8s5d 9sTs4c9c 3cAh8d7d=8hAs6c5c TdQhKs2s 2h6sJcJd",
      Solver.process("omaha-holdem 5sAcJhQcQd 5hKc6h4h TdQhKs2s 9h2c7h4d 8hAs6c5c 9sTs4c9c 8cKh8s5d 2h6sJcJd 3cAh8d7d"));
  }

  @Test
  public void test_omaha_holdem_2123_3d3h3s4d6s_Tc4hJhQd_5s5c9d5d_5h8hAh9s_8sKc2c9c() {
    assertEquals(
      "Tc4hJhQd 8sKc2c9c 5h8hAh9s 5s5c9d5d",
      Solver.process("omaha-holdem 3d3h3s4d6s Tc4hJhQd 5s5c9d5d 5h8hAh9s 8sKc2c9c"));
  }

  @Test
  public void test_omaha_holdem_2124_5d8h8sAsKd_7s2cKc2s_Jh9sTs4d_TcJdAdQd() {
    assertEquals(
      "Jh9sTs4d 7s2cKc2s TcJdAdQd",
      Solver.process("omaha-holdem 5d8h8sAsKd 7s2cKc2s Jh9sTs4d TcJdAdQd"));
  }

  @Test
  public void test_omaha_holdem_2125_3c4s6s7hJs_7d9sJh6c_8sTc2h2s_9dTs9hAs_8hJd9cTd_6d7sJcQc_8d3d4d5h_Qs4c3s6h() {
    assertEquals(
      "8hJd9cTd 6d7sJcQc=7d9sJh6c 8d3d4d5h 8sTc2h2s Qs4c3s6h 9dTs9hAs",
      Solver.process("omaha-holdem 3c4s6s7hJs 7d9sJh6c 8sTc2h2s 9dTs9hAs 8hJd9cTd 6d7sJcQc 8d3d4d5h Qs4c3s6h"));
  }

  @Test
  public void test_omaha_holdem_2126_3d4h5dAhQs_3s8s9s6c_As2s8c7c_6d5s3hTs_5c6sTc4d_7d2d2c4c_Kc7s3cJh_Ad7hTd4s_Js9cKdQc() {
    assertEquals(
      "3s8s9s6c Kc7s3cJh Js9cKdQc 6d5s3hTs 5c6sTc4d Ad7hTd4s 7d2d2c4c=As2s8c7c",
      Solver.process("omaha-holdem 3d4h5dAhQs 3s8s9s6c As2s8c7c 6d5s3hTs 5c6sTc4d 7d2d2c4c Kc7s3cJh Ad7hTd4s Js9cKdQc"));
  }

  @Test
  public void test_omaha_holdem_2127_6sAdAhKsQd_5cJcQsKd_3h2c9dJh_6c8s6hTh_KcKhQc5h_9h2sAc5s_Td3d2d7h() {
    assertEquals(
      "Td3d2d7h 3h2c9dJh 5cJcQsKd 9h2sAc5s 6c8s6hTh KcKhQc5h",
      Solver.process("omaha-holdem 6sAdAhKsQd 5cJcQsKd 3h2c9dJh 6c8s6hTh KcKhQc5h 9h2sAc5s Td3d2d7h"));
  }

  @Test
  public void test_omaha_holdem_2128_4d9hAcJsTc_KdJc9d3c_3h6c8c6h_JhTd7s8h_Ad4h8d3s_4sThJdQd_7c2h5d7h_Qs8s2s5s() {
    assertEquals(
      "3h6c8c6h 7c2h5d7h KdJc9d3c 4sThJdQd Ad4h8d3s JhTd7s8h Qs8s2s5s",
      Solver.process("omaha-holdem 4d9hAcJsTc KdJc9d3c 3h6c8c6h JhTd7s8h Ad4h8d3s 4sThJdQd 7c2h5d7h Qs8s2s5s"));
  }

  @Test
  public void test_omaha_holdem_2129_2d3d5s6s9s_Jc5hQc9d_5dJdKdAh_Th2hJs4c_4sKsJh4d() {
    assertEquals(
      "5dJdKdAh Jc5hQc9d Th2hJs4c 4sKsJh4d",
      Solver.process("omaha-holdem 2d3d5s6s9s Jc5hQc9d 5dJdKdAh Th2hJs4c 4sKsJh4d"));
  }

  @Test
  public void test_omaha_holdem_2130_3c7d9sAcKh_AsKc9h4s_Ks7cTs4d_2dJhQh9d() {
    assertEquals(
      "2dJhQh9d Ks7cTs4d AsKc9h4s",
      Solver.process("omaha-holdem 3c7d9sAcKh AsKc9h4s Ks7cTs4d 2dJhQh9d"));
  }

  @Test
  public void test_omaha_holdem_2131_2c3h5s7s9h_TsAdQs6h_7c5c9d6c_4d2d8sQd() {
    assertEquals(
      "TsAdQs6h 4d2d8sQd 7c5c9d6c",
      Solver.process("omaha-holdem 2c3h5s7s9h TsAdQs6h 7c5c9d6c 4d2d8sQd"));
  }

  @Test
  public void test_omaha_holdem_2132_3d9hJcKhQh_4hTc2c7h_4s3cQs9s_2h6dKdJh_7dAdQc7c() {
    assertEquals(
      "7dAdQc7c 4s3cQs9s 4hTc2c7h 2h6dKdJh",
      Solver.process("omaha-holdem 3d9hJcKhQh 4hTc2c7h 4s3cQs9s 2h6dKdJh 7dAdQc7c"));
  }

  @Test
  public void test_omaha_holdem_2133_4d5h5s9cJh_Kh7dTc3h_AsTh4s9d_6sJd9s6h_Ks7sQsQh_Ts3c3d4c_Qc8cAh8d_AdQdAc4h() {
    assertEquals(
      "Kh7dTc3h Ts3c3d4c Qc8cAh8d AsTh4s9d 6sJd9s6h Ks7sQsQh AdQdAc4h",
      Solver.process("omaha-holdem 4d5h5s9cJh Kh7dTc3h AsTh4s9d 6sJd9s6h Ks7sQsQh Ts3c3d4c Qc8cAh8d AdQdAc4h"));
  }

  @Test
  public void test_omaha_holdem_2134_3d6c8hAdQh_4d7s7dAc_8d6s5h6d_9sJs3sQd_9dJhJd4h_2hKs3cKc_KdAhKh2c_2d4c8c5c() {
    assertEquals(
      "2d4c8c5c 9dJhJd4h 2hKs3cKc 4d7s7dAc KdAhKh2c 9sJs3sQd 8d6s5h6d",
      Solver.process("omaha-holdem 3d6c8hAdQh 4d7s7dAc 8d6s5h6d 9sJs3sQd 9dJhJd4h 2hKs3cKc KdAhKh2c 2d4c8c5c"));
  }

  @Test
  public void test_omaha_holdem_2135_3c4d6h7dQc_Ac3s8d5d_6s6cTcTd_5hTh3h9d_4sQs7c4h_8hQdJh8s_5sJd9c2d() {
    assertEquals(
      "8hQdJh8s 4sQs7c4h 6s6cTcTd 5sJd9c2d 5hTh3h9d Ac3s8d5d",
      Solver.process("omaha-holdem 3c4d6h7dQc Ac3s8d5d 6s6cTcTd 5hTh3h9d 4sQs7c4h 8hQdJh8s 5sJd9c2d"));
  }

  @Test
  public void test_omaha_holdem_2136_5h9hJhKhQc_Td2s4dQs_2dJc3d7c_3h5s4c2h_5cQd4sTc_8hJs9c3c_2c9sQh6h_ThJd6c3s_5dAsKcAc_6dKs8sTs() {
    assertEquals(
      "2dJc3d7c 8hJs9c3c 5dAsKcAc 5cQd4sTc=6dKs8sTs=Td2s4dQs=ThJd6c3s 3h5s4c2h 2c9sQh6h",
      Solver.process("omaha-holdem 5h9hJhKhQc Td2s4dQs 2dJc3d7c 3h5s4c2h 5cQd4sTc 8hJs9c3c 2c9sQh6h ThJd6c3s 5dAsKcAc 6dKs8sTs"));
  }

  @Test
  public void test_omaha_holdem_2137_8c8d9dKhTd_2h2s7h2d_Kc5s7dJd_JhKdTsQc() {
    assertEquals(
      "2h2s7h2d JhKdTsQc Kc5s7dJd",
      Solver.process("omaha-holdem 8c8d9dKhTd 2h2s7h2d Kc5s7dJd JhKdTsQc"));
  }

  @Test
  public void test_omaha_holdem_2138_5c6dAsKsQd_5s8h4hJc_2c4d7d4s_Js9sAh5h_8sQs4cKh() {
    assertEquals(
      "2c4d7d4s 5s8h4hJc 8sQs4cKh Js9sAh5h",
      Solver.process("omaha-holdem 5c6dAsKsQd 5s8h4hJc 2c4d7d4s Js9sAh5h 8sQs4cKh"));
  }

  @Test
  public void test_omaha_holdem_2139_4c4d6h8cJh_5h6c2c2d_3d4hTsTd_AhAcQsKh() {
    assertEquals(
      "5h6c2c2d AhAcQsKh 3d4hTsTd",
      Solver.process("omaha-holdem 4c4d6h8cJh 5h6c2c2d 3d4hTsTd AhAcQsKh"));
  }

  @Test
  public void test_omaha_holdem_2140_4h9hAcAdKc_9d8s5c8d_TsJd6d3h_3cQdTdKd_As6s7hTc_5sQs5d2c_6hQcAhKh_9s4cKs3s_Jc2d7c4d() {
    assertEquals(
      "TsJd6d3h Jc2d7c4d 5sQs5d2c 9d8s5c8d 9s4cKs3s 3cQdTdKd As6s7hTc 6hQcAhKh",
      Solver.process("omaha-holdem 4h9hAcAdKc 9d8s5c8d TsJd6d3h 3cQdTdKd As6s7hTc 5sQs5d2c 6hQcAhKh 9s4cKs3s Jc2d7c4d"));
  }

  @Test
  public void test_omaha_holdem_2141_4c4d7d7sQs_4s6h6d2h_Ac8s2cKh_3d3c2dKc_As8d9cTc_2sJdAdQd_QhKs6cKd_7h5sQcTs_5c9sJh8h() {
    assertEquals(
      "5c9sJh8h As8d9cTc Ac8s2cKh 3d3c2dKc 2sJdAdQd QhKs6cKd 4s6h6d2h 7h5sQcTs",
      Solver.process("omaha-holdem 4c4d7d7sQs 4s6h6d2h Ac8s2cKh 3d3c2dKc As8d9cTc 2sJdAdQd QhKs6cKd 7h5sQcTs 5c9sJh8h"));
  }

  @Test
  public void test_omaha_holdem_2142_3h8s9sJsQs_4d5c9hAd_Ac6s7d3d_ThTcKc3c_TsKs7sJh_Qc9d6hJc() {
    assertEquals(
      "Ac6s7d3d 4d5c9hAd Qc9d6hJc ThTcKc3c TsKs7sJh",
      Solver.process("omaha-holdem 3h8s9sJsQs 4d5c9hAd Ac6s7d3d ThTcKc3c TsKs7sJh Qc9d6hJc"));
  }

  @Test
  public void test_omaha_holdem_2143_3h6d6s7hJh_7cQdTdAs_2s9d7s5d_Ks9c8sKd_Jc5cTh9h_8hTs6cKc_Js3d2hTc_8cQh2dAd() {
    assertEquals(
      "8cQh2dAd 2s9d7s5d 7cQdTdAs Js3d2hTc Ks9c8sKd 8hTs6cKc Jc5cTh9h",
      Solver.process("omaha-holdem 3h6d6s7hJh 7cQdTdAs 2s9d7s5d Ks9c8sKd Jc5cTh9h 8hTs6cKc Js3d2hTc 8cQh2dAd"));
  }

  @Test
  public void test_omaha_holdem_2144_6s7h9dKcKh_3sQd2c5d_4c2sKs4d_2h6h5cQh_Kd4hAsQc_9s8cTd2d_Tc8d8s5s_5hAd8hTh_Ts7sAhJd_7dQs3d6d() {
    assertEquals(
      "3sQd2c5d 2h6h5cQh 7dQs3d6d Ts7sAhJd 4c2sKs4d Kd4hAsQc 5hAd8hTh=9s8cTd2d=Tc8d8s5s",
      Solver.process("omaha-holdem 6s7h9dKcKh 3sQd2c5d 4c2sKs4d 2h6h5cQh Kd4hAsQc 9s8cTd2d Tc8d8s5s 5hAd8hTh Ts7sAhJd 7dQs3d6d"));
  }

  @Test
  public void test_omaha_holdem_2145_2s4h5s9hQh_5d6s2h8c_9d4c7c8d_AhQsTs8h_2dKc5cJh() {
    assertEquals(
      "2dKc5cJh=5d6s2h8c 9d4c7c8d AhQsTs8h",
      Solver.process("omaha-holdem 2s4h5s9hQh 5d6s2h8c 9d4c7c8d AhQsTs8h 2dKc5cJh"));
  }

  @Test
  public void test_omaha_holdem_2146_4d5sJsQcQs_Th6cJd6h_Ad8s3cAh_AsJcKh8d_TcTd8h4c_Kc2h3h2d_7d7h9s8c_6sKsKd4h() {
    assertEquals(
      "Kc2h3h2d 7d7h9s8c TcTd8h4c Th6cJd6h AsJcKh8d Ad8s3cAh 6sKsKd4h",
      Solver.process("omaha-holdem 4d5sJsQcQs Th6cJd6h Ad8s3cAh AsJcKh8d TcTd8h4c Kc2h3h2d 7d7h9s8c 6sKsKd4h"));
  }

  @Test
  public void test_omaha_holdem_2147_2c2s4cKdQs_KhKcTh9c_Ts5c3h7d_2hAsAh8d_8c3dAd4d_4s9dQc6s_6hJs7s5d_Jd8hQhJc_KsJhQd3c_5h9s8sAc() {
    assertEquals(
      "Ts5c3h7d 6hJs7s5d 5h9s8sAc 8c3dAd4d Jd8hQhJc 4s9dQc6s KsJhQd3c 2hAsAh8d KhKcTh9c",
      Solver.process("omaha-holdem 2c2s4cKdQs KhKcTh9c Ts5c3h7d 2hAsAh8d 8c3dAd4d 4s9dQc6s 6hJs7s5d Jd8hQhJc KsJhQd3c 5h9s8sAc"));
  }

  @Test
  public void test_omaha_holdem_2148_2h3c7h8cTh_4cKcAhQs_TdAd8s3d_2c2s9s4d_Qc8h7dKs_3h9c8dJd_3s5d5s4h() {
    assertEquals(
      "4cKcAhQs 3s5d5s4h Qc8h7dKs TdAd8s3d 2c2s9s4d 3h9c8dJd",
      Solver.process("omaha-holdem 2h3c7h8cTh 4cKcAhQs TdAd8s3d 2c2s9s4d Qc8h7dKs 3h9c8dJd 3s5d5s4h"));
  }

  @Test
  public void test_omaha_holdem_2149_2c2s4c4dKs_4h4sJd7c_8cJsKh9h_9cTc8s6h_3sKd2d7d_TsQsAd7s_Th5dQd9s() {
    assertEquals(
      "9cTc8s6h Th5dQd9s TsQsAd7s 8cJsKh9h 3sKd2d7d 4h4sJd7c",
      Solver.process("omaha-holdem 2c2s4c4dKs 4h4sJd7c 8cJsKh9h 9cTc8s6h 3sKd2d7d TsQsAd7s Th5dQd9s"));
  }

  @Test
  public void test_omaha_holdem_2150_2s8hJsKdQc_7d6dTh4d_7cQs3s7s_Tc9h8s2d_Kh7h3h5h_AhJdQhKc() {
    assertEquals(
      "7d6dTh4d 7cQs3s7s Kh7h3h5h AhJdQhKc Tc9h8s2d",
      Solver.process("omaha-holdem 2s8hJsKdQc 7d6dTh4d 7cQs3s7s Tc9h8s2d Kh7h3h5h AhJdQhKc"));
  }

  @Test
  public void test_omaha_holdem_2151_2d4h7c8s9h_2s6s5h8d_Ah5cJh2c_3d7s3hAc_7hTh8hKc_AdTsQhQd_5d7d3c4s() {
    assertEquals(
      "Ah5cJh2c 3d7s3hAc AdTsQhQd 5d7d3c4s 7hTh8hKc 2s6s5h8d",
      Solver.process("omaha-holdem 2d4h7c8s9h 2s6s5h8d Ah5cJh2c 3d7s3hAc 7hTh8hKc AdTsQhQd 5d7d3c4s"));
  }

  @Test
  public void test_omaha_holdem_2152_2c4c9hKhTh_Jh7d5hJd_Js6c2dTc() {
    assertEquals(
      "Js6c2dTc Jh7d5hJd",
      Solver.process("omaha-holdem 2c4c9hKhTh Jh7d5hJd Js6c2dTc"));
  }

  @Test
  public void test_omaha_holdem_2153_2s4d5s6hTh_8cTd8hJh_AcKc4cTc_5c3c8s7h_Qd3dQcQs_As6c7d2d_4s2h9sJc_9dJd9h9c_Js7sKd5d_Ks7cTs6d() {
    assertEquals(
      "Js7sKd5d 9dJd9h9c 8cTd8hJh Qd3dQcQs 4s2h9sJc As6c7d2d AcKc4cTc Ks7cTs6d 5c3c8s7h",
      Solver.process("omaha-holdem 2s4d5s6hTh 8cTd8hJh AcKc4cTc 5c3c8s7h Qd3dQcQs As6c7d2d 4s2h9sJc 9dJd9h9c Js7sKd5d Ks7cTs6d"));
  }

  @Test
  public void test_omaha_holdem_2154_4cJcJdKsQh_Ad7cThKh_2h3h4d6d_2c6h3s2d() {
    assertEquals(
      "2c6h3s2d 2h3h4d6d Ad7cThKh",
      Solver.process("omaha-holdem 4cJcJdKsQh Ad7cThKh 2h3h4d6d 2c6h3s2d"));
  }

  @Test
  public void test_omaha_holdem_2155_2c3dJdQhTs_Kd8c2h4h_5dQs5s7s_TdJs3h6c_9sAs7cTh() {
    assertEquals(
      "Kd8c2h4h 9sAs7cTh 5dQs5s7s TdJs3h6c",
      Solver.process("omaha-holdem 2c3dJdQhTs Kd8c2h4h 5dQs5s7s TdJs3h6c 9sAs7cTh"));
  }

  @Test
  public void test_omaha_holdem_2156_7s9cAsKsQs_8d3h5d9s_Ah2s9d6c_KhTd4cQh_KcQd9h7d_4d2d2h6d_8c7h4sAc_3cJhQc3d_3s2cTs7c_ThJs8h5c() {
    assertEquals(
      "4d2d2h6d 8d3h5d9s 3cJhQc3d KcQd9h7d=KhTd4cQh 8c7h4sAc Ah2s9d6c ThJs8h5c 3s2cTs7c",
      Solver.process("omaha-holdem 7s9cAsKsQs 8d3h5d9s Ah2s9d6c KhTd4cQh KcQd9h7d 4d2d2h6d 8c7h4sAc 3cJhQc3d 3s2cTs7c ThJs8h5c"));
  }

  @Test
  public void test_omaha_holdem_2157_4d8h9hAsJd_Ad8sKsQd_9s6d3dQh_Th6cQs2d_9d6s7dAh_7cTsTc5s_4s7h7s2s_8c9cTdQc_Kd2hAc3h() {
    assertEquals(
      "4s7h7s2s 9s6d3dQh Kd2hAc3h Ad8sKsQd 9d6s7dAh 7cTsTc5s 8c9cTdQc=Th6cQs2d",
      Solver.process("omaha-holdem 4d8h9hAsJd Ad8sKsQd 9s6d3dQh Th6cQs2d 9d6s7dAh 7cTsTc5s 4s7h7s2s 8c9cTdQc Kd2hAc3h"));
  }

  @Test
  public void test_omaha_holdem_2158_2h5h7cJcTd_6dTsKc9s_8dTc8sAs_7d4hKd9c_3dQc5c6c_6hQh5dQs_AdJh2sAh_6s4cAc5s_7h2cThJs() {
    assertEquals(
      "3dQc5c6c 6s4cAc5s 7d4hKd9c 6dTsKc9s 8dTc8sAs 6hQh5dQs AdJh2sAh 7h2cThJs",
      Solver.process("omaha-holdem 2h5h7cJcTd 6dTsKc9s 8dTc8sAs 7d4hKd9c 3dQc5c6c 6hQh5dQs AdJh2sAh 6s4cAc5s 7h2cThJs"));
  }

  @Test
  public void test_omaha_holdem_2159_2s6s8d8sJh_Jd9cQd3s_9h9s7s4d_5d2d9d5c_4c7dThAd_Tc8c5s2c_Kd3cJcKh_2hQh4s8h_QcJs4h3h() {
    assertEquals(
      "4c7dThAd 5d2d9d5c Jd9cQd3s=QcJs4h3h Kd3cJcKh 9h9s7s4d 2hQh4s8h=Tc8c5s2c",
      Solver.process("omaha-holdem 2s6s8d8sJh Jd9cQd3s 9h9s7s4d 5d2d9d5c 4c7dThAd Tc8c5s2c Kd3cJcKh 2hQh4s8h QcJs4h3h"));
  }

  @Test
  public void test_omaha_holdem_2160_2c5c7h8c8h_KcAh2hAs_6s3h9hKd_8dAcTs7d_7sQh9sJs_5h6cAd8s_6hJd4sJc_9c2d3c2s_9d6d7cTc_Jh4h5sTh() {
    assertEquals(
      "Jh4h5sTh 7sQh9sJs KcAh2hAs 6hJd4sJc 6s3h9hKd 9d6d7cTc 9c2d3c2s 5h6cAd8s 8dAcTs7d",
      Solver.process("omaha-holdem 2c5c7h8c8h KcAh2hAs 6s3h9hKd 8dAcTs7d 7sQh9sJs 5h6cAd8s 6hJd4sJc 9c2d3c2s 9d6d7cTc Jh4h5sTh"));
  }

  @Test
  public void test_omaha_holdem_2161_3d5d6s7dAs_Kh4dThKs_Kc3hQd4h_Qh8s9cJs_AhTsQcKd_9s2h2sAc() {
    assertEquals(
      "Kh4dThKs 9s2h2sAc AhTsQcKd Kc3hQd4h Qh8s9cJs",
      Solver.process("omaha-holdem 3d5d6s7dAs Kh4dThKs Kc3hQd4h Qh8s9cJs AhTsQcKd 9s2h2sAc"));
  }

  @Test
  public void test_omaha_holdem_2162_6s7s8d9d9s_KcAsKd2d_Qc7d5sQh_8s4cTd6h() {
    assertEquals(
      "KcAsKd2d Qc7d5sQh 8s4cTd6h",
      Solver.process("omaha-holdem 6s7s8d9d9s KcAsKd2d Qc7d5sQh 8s4cTd6h"));
  }

  @Test
  public void test_omaha_holdem_2163_3d6c6d7cJc_5s9h9c4c_QhQc8sKs_KcJsTdAs_QdKh2s5h() {
    assertEquals(
      "QdKh2s5h KcJsTdAs QhQc8sKs 5s9h9c4c",
      Solver.process("omaha-holdem 3d6c6d7cJc 5s9h9c4c QhQc8sKs KcJsTdAs QdKh2s5h"));
  }

  @Test
  public void test_omaha_holdem_2164_2d6sKhQcQd_Qh9sJd3h_AsAhTdKd() {
    assertEquals(
      "AsAhTdKd Qh9sJd3h",
      Solver.process("omaha-holdem 2d6sKhQcQd Qh9sJd3h AsAhTdKd"));
  }

  @Test
  public void test_omaha_holdem_2165_3d6c6s8c9s_6d2hTc8h_9c2dAd4d_3cKs8sKh_3sQc7d7h_5dTh9dTd() {
    assertEquals(
      "3sQc7d7h 9c2dAd4d 5dTh9dTd 3cKs8sKh 6d2hTc8h",
      Solver.process("omaha-holdem 3d6c6s8c9s 6d2hTc8h 9c2dAd4d 3cKs8sKh 3sQc7d7h 5dTh9dTd"));
  }

  @Test
  public void test_omaha_holdem_2166_2h3dJcQcQs_7hAd5c6h_7c3c6sJh_AcTh8h8d_5d6dJs8s_9sQh5s4d_QdAh9dJd_9cKcKh4h_4sTs4cAs() {
    assertEquals(
      "7hAd5c6h 4sTs4cAs AcTh8h8d 7c3c6sJh 5d6dJs8s 9cKcKh4h 9sQh5s4d QdAh9dJd",
      Solver.process("omaha-holdem 2h3dJcQcQs 7hAd5c6h 7c3c6sJh AcTh8h8d 5d6dJs8s 9sQh5s4d QdAh9dJd 9cKcKh4h 4sTs4cAs"));
  }

  @Test
  public void test_omaha_holdem_2167_3s4c5d6dAd_6c9hJhQh_4dAc3h5c_QdTc4s6h_5hQs9c4h_3d3cQc2h() {
    assertEquals(
      "6c9hJhQh 5hQs9c4h QdTc4s6h 4dAc3h5c 3d3cQc2h",
      Solver.process("omaha-holdem 3s4c5d6dAd 6c9hJhQh 4dAc3h5c QdTc4s6h 5hQs9c4h 3d3cQc2h"));
  }

  @Test
  public void test_omaha_holdem_2168_2d2s4s5cQd_3d4hTc7c_8cAc9s6s_3c5hTs9h_6dJh6hJc_4dQc7s8h_5d9c4c6c() {
    assertEquals(
      "8cAc9s6s 3d4hTc7c 3c5hTs9h 5d9c4c6c 6dJh6hJc 4dQc7s8h",
      Solver.process("omaha-holdem 2d2s4s5cQd 3d4hTc7c 8cAc9s6s 3c5hTs9h 6dJh6hJc 4dQc7s8h 5d9c4c6c"));
  }

  @Test
  public void test_omaha_holdem_2169_2d4c8h9cJc_3hJh4dTs_Th6c2cKd_5sAsQcKh() {
    assertEquals(
      "5sAsQcKh 3hJh4dTs Th6c2cKd",
      Solver.process("omaha-holdem 2d4c8h9cJc 3hJh4dTs Th6c2cKd 5sAsQcKh"));
  }

  @Test
  public void test_omaha_holdem_2170_5h6s8c8d9s_9d3s2dKc_7dJh2hJc_Ah8sAdAs_KdQh5sQd_Js9hTd8h_Qc7c4d6c_3hJd4c3c_6hTs7s2c_4hQs3d5c() {
    assertEquals(
      "3hJd4c3c 4hQs3d5c 9d3s2dKc 7dJh2hJc KdQh5sQd Ah8sAdAs Qc7c4d6c 6hTs7s2c Js9hTd8h",
      Solver.process("omaha-holdem 5h6s8c8d9s 9d3s2dKc 7dJh2hJc Ah8sAdAs KdQh5sQd Js9hTd8h Qc7c4d6c 3hJd4c3c 6hTs7s2c 4hQs3d5c"));
  }

  @Test
  public void test_omaha_holdem_2171_5d7c8s9cKs_3sQd9s7h_2dTc2cTd_3h6d3d4d_8cJd4hAd_6h9d8h7d_Qh2hKcKh() {
    assertEquals(
      "8cJd4hAd 2dTc2cTd 3sQd9s7h Qh2hKcKh 3h6d3d4d 6h9d8h7d",
      Solver.process("omaha-holdem 5d7c8s9cKs 3sQd9s7h 2dTc2cTd 3h6d3d4d 8cJd4hAd 6h9d8h7d Qh2hKcKh"));
  }

  @Test
  public void test_omaha_holdem_2172_AsKcKhQcTh_5h8hQh5d_Ad8c2sKs_4d7h2h9h_Ac5cTd4c_3dKdAh7d_9sJh2d3c() {
    assertEquals(
      "4d7h2h9h 5h8hQh5d Ac5cTd4c 9sJh2d3c 3dKdAh7d=Ad8c2sKs",
      Solver.process("omaha-holdem AsKcKhQcTh 5h8hQh5d Ad8c2sKs 4d7h2h9h Ac5cTd4c 3dKdAh7d 9sJh2d3c"));
  }

  @Test
  public void test_omaha_holdem_2173_4d7d7hQsTh_6s7sAcJc_Ad3d3c5h_Kh9c5dQh_Ah7c8s4c_5sTc4h8d_8cQdAsTs() {
    assertEquals(
      "Ad3d3c5h 5sTc4h8d Kh9c5dQh 8cQdAsTs 6s7sAcJc Ah7c8s4c",
      Solver.process("omaha-holdem 4d7d7hQsTh 6s7sAcJc Ad3d3c5h Kh9c5dQh Ah7c8s4c 5sTc4h8d 8cQdAsTs"));
  }

  @Test
  public void test_omaha_holdem_2174_3h7s8hAhJh_8s4hQdKc_7d9c2d3s_5h2cQcKd_3d5cQh9d_Td4dTs6d_Jd4s7c8d() {
    assertEquals(
      "5h2cQcKd 3d5cQh9d 8s4hQdKc Td4dTs6d 7d9c2d3s Jd4s7c8d",
      Solver.process("omaha-holdem 3h7s8hAhJh 8s4hQdKc 7d9c2d3s 5h2cQcKd 3d5cQh9d Td4dTs6d Jd4s7c8d"));
  }

  @Test
  public void test_omaha_holdem_2175_2h5c8dJhQh_QsTc5sJc_4c4d7h6d_8h2c9d8c_7sJdQc6s_5dQdAhKh_4h7dTs5h() {
    assertEquals(
      "4c4d7h6d 7sJdQc6s=QsTc5sJc 8h2c9d8c 4h7dTs5h 5dQdAhKh",
      Solver.process("omaha-holdem 2h5c8dJhQh QsTc5sJc 4c4d7h6d 8h2c9d8c 7sJdQc6s 5dQdAhKh 4h7dTs5h"));
  }

  @Test
  public void test_omaha_holdem_2176_3s5c9dAdQd_AcKs7dJc_4c7h8s7s_Th8h6s6c_9c2d4s5d_9s7c3h5h_2hQhQs6d_Kd6h3cKh_QcKc2s2c_3dTsTcJd() {
    assertEquals(
      "Th8h6s6c 4c7h8s7s QcKc2s2c Kd6h3cKh AcKs7dJc 9s7c3h5h 2hQhQs6d 9c2d4s5d 3dTsTcJd",
      Solver.process("omaha-holdem 3s5c9dAdQd AcKs7dJc 4c7h8s7s Th8h6s6c 9c2d4s5d 9s7c3h5h 2hQhQs6d Kd6h3cKh QcKc2s2c 3dTsTcJd"));
  }

  @Test
  public void test_omaha_holdem_2177_2s6d7hJdQh_Ts4dAc7c_2dKs9s5s_5hAs7d4c_4h3s9h9d_8cThQsKc_8h8dTd3h_KhJcKdJs() {
    assertEquals(
      "2dKs9s5s 5hAs7d4c=Ts4dAc7c 8h8dTd3h 4h3s9h9d 8cThQsKc KhJcKdJs",
      Solver.process("omaha-holdem 2s6d7hJdQh Ts4dAc7c 2dKs9s5s 5hAs7d4c 4h3s9h9d 8cThQsKc 8h8dTd3h KhJcKdJs"));
  }

  @Test
  public void test_omaha_holdem_2178_3s4d5sAsJh_Qh8sKsAc_KdQd6d8h_Td9c7s9d_3h6c8cJc() {
    assertEquals(
      "KdQd6d8h Td9c7s9d 3h6c8cJc Qh8sKsAc",
      Solver.process("omaha-holdem 3s4d5sAsJh Qh8sKsAc KdQd6d8h Td9c7s9d 3h6c8cJc"));
  }

  @Test
  public void test_omaha_holdem_2179_3h8dKcKdTh_6hAdAcQs_Kh8hTc2s_Ah9c7sKs_5cQd2h9h_Js6s3d4c_6dJc5s2c() {
    assertEquals(
      "6dJc5s2c 5cQd2h9h Js6s3d4c 6hAdAcQs Ah9c7sKs Kh8hTc2s",
      Solver.process("omaha-holdem 3h8dKcKdTh 6hAdAcQs Kh8hTc2s Ah9c7sKs 5cQd2h9h Js6s3d4c 6dJc5s2c"));
  }

  @Test
  public void test_omaha_holdem_2180_6h7hKdKhTs_KcTd4d9h_8s3h8h2d() {
    assertEquals(
      "8s3h8h2d KcTd4d9h",
      Solver.process("omaha-holdem 6h7hKdKhTs KcTd4d9h 8s3h8h2d"));
  }

  @Test
  public void test_omaha_holdem_2181_6d7hAcKcQd_5sJd4d3c_2d4h9d6h_Th5d5c2c_3d8h6s3s_AhKdJsQc_Td4s2hKs_Ts4c6c5h() {
    assertEquals(
      "5sJd4d3c Th5d5c2c 3d8h6s3s 2d4h9d6h Ts4c6c5h Td4s2hKs AhKdJsQc",
      Solver.process("omaha-holdem 6d7hAcKcQd 5sJd4d3c 2d4h9d6h Th5d5c2c 3d8h6s3s AhKdJsQc Td4s2hKs Ts4c6c5h"));
  }

  @Test
  public void test_omaha_holdem_2182_2s7sKcQdQs_9s2c4sQc_AdAs9cKs_Td6d6c5d_4h8hJsKd_Ts4d3d6s_Jd8cQh7c() {
    assertEquals(
      "Td6d6c5d 4h8hJsKd Ts4d3d6s AdAs9cKs 9s2c4sQc Jd8cQh7c",
      Solver.process("omaha-holdem 2s7sKcQdQs 9s2c4sQc AdAs9cKs Td6d6c5d 4h8hJsKd Ts4d3d6s Jd8cQh7c"));
  }

  @Test
  public void test_omaha_holdem_2183_2h8dAdAhAs_4hQc9d6d_Tc5h5s5d_Jc2c5c7d_Jh3d3s8s_3c6hKc8h() {
    assertEquals(
      "Jc2c5c7d 4hQc9d6d 3c6hKc8h Jh3d3s8s Tc5h5s5d",
      Solver.process("omaha-holdem 2h8dAdAhAs 4hQc9d6d Tc5h5s5d Jc2c5c7d Jh3d3s8s 3c6hKc8h"));
  }

  @Test
  public void test_omaha_holdem_2184_3s4d5c7cAc_6d8dQs7h_9cAs6c7d_JcTsJs2d_2h3cKc5s_3dQc9d9s_Th4h4cJh() {
    assertEquals(
      "3dQc9d9s JcTsJs2d Th4h4cJh 6d8dQs7h 9cAs6c7d 2h3cKc5s",
      Solver.process("omaha-holdem 3s4d5c7cAc 6d8dQs7h 9cAs6c7d JcTsJs2d 2h3cKc5s 3dQc9d9s Th4h4cJh"));
  }

  @Test
  public void test_omaha_holdem_2185_2s3d3hTcTh_4dQc5sJh_Ks5c8h5h_Kc7dJdAc_4hAd8s2c_AhQd6h9h_2d6cQhAs() {
    assertEquals(
      "4dQc5sJh AhQd6h9h Kc7dJdAc 2d6cQhAs=4hAd8s2c Ks5c8h5h",
      Solver.process("omaha-holdem 2s3d3hTcTh 4dQc5sJh Ks5c8h5h Kc7dJdAc 4hAd8s2c AhQd6h9h 2d6cQhAs"));
  }

  @Test
  public void test_omaha_holdem_2186_3s4s7d8dAc_7hKs3d8c_Ts6s2s4d() {
    assertEquals(
      "Ts6s2s4d 7hKs3d8c",
      Solver.process("omaha-holdem 3s4s7d8dAc 7hKs3d8c Ts6s2s4d"));
  }

  @Test
  public void test_omaha_holdem_2187_6d7s9sAcAs_4c2cJs2d_Ts4d2h5d_8d8c7h6s_3cKdTh3s_8h3dTd9d_5s7cKs9h_7d6hTcQh() {
    assertEquals(
      "Ts4d2h5d 4c2cJs2d 3cKdTh3s 7d6hTcQh 8d8c7h6s 8h3dTd9d 5s7cKs9h",
      Solver.process("omaha-holdem 6d7s9sAcAs 4c2cJs2d Ts4d2h5d 8d8c7h6s 3cKdTh3s 8h3dTd9d 5s7cKs9h 7d6hTcQh"));
  }

  @Test
  public void test_omaha_holdem_2188_4c8cAdQdTd_8h3cJsKh_2h5h5dAc_2sKc8dQc_2c2dJd6s_7d5cKd6d_Ks9hThQs() {
    assertEquals(
      "2h5h5dAc 2sKc8dQc Ks9hThQs 8h3cJsKh 2c2dJd6s 7d5cKd6d",
      Solver.process("omaha-holdem 4c8cAdQdTd 8h3cJsKh 2h5h5dAc 2sKc8dQc 2c2dJd6s 7d5cKd6d Ks9hThQs"));
  }

  @Test
  public void test_omaha_holdem_2189_3h5hJdKsQs_9d5d8h4c_2s9c6c4s_8cAh6hAs_JhJs8dKc_6d7h5sQd() {
    assertEquals(
      "2s9c6c4s 9d5d8h4c 8cAh6hAs 6d7h5sQd JhJs8dKc",
      Solver.process("omaha-holdem 3h5hJdKsQs 9d5d8h4c 2s9c6c4s 8cAh6hAs JhJs8dKc 6d7h5sQd"));
  }

  @Test
  public void test_omaha_holdem_2190_2d5cJhTcTd_KsQcJcKd_8d2s6h6d() {
    assertEquals(
      "8d2s6h6d KsQcJcKd",
      Solver.process("omaha-holdem 2d5cJhTcTd KsQcJcKd 8d2s6h6d"));
  }

  @Test
  public void test_omaha_holdem_2191_4h5h6c6hQc_3s3c2cJh_Ks7hQs2d_9sAhAsAc_Kd8hTd6s_8d8cTs7c_4c3d3h5c_Jc5d2h9d_QhAd5s4d_KhTh8s6d() {
    assertEquals(
      "4c3d3h5c Jc5d2h9d Ks7hQs2d QhAd5s4d 9sAhAsAc Kd8hTd6s 3s3c2cJh 8d8cTs7c KhTh8s6d",
      Solver.process("omaha-holdem 4h5h6c6hQc 3s3c2cJh Ks7hQs2d 9sAhAsAc Kd8hTd6s 8d8cTs7c 4c3d3h5c Jc5d2h9d QhAd5s4d KhTh8s6d"));
  }

  @Test
  public void test_omaha_holdem_2192_3s4d4s7cJd_AcAhJhKc_Qc6h9d4h_6d5cKs4c_8hTcTh2c() {
    assertEquals(
      "8hTcTh2c AcAhJhKc Qc6h9d4h 6d5cKs4c",
      Solver.process("omaha-holdem 3s4d4s7cJd AcAhJhKc Qc6h9d4h 6d5cKs4c 8hTcTh2c"));
  }

  @Test
  public void test_omaha_holdem_2193_4c6d6h8d9s_2h3s4d7d_3hKs4s5h() {
    assertEquals(
      "2h3s4d7d 3hKs4s5h",
      Solver.process("omaha-holdem 4c6d6h8d9s 2h3s4d7d 3hKs4s5h"));
  }

  @Test
  public void test_omaha_holdem_2194_4d6d7h8cKh_9d7s2d8h_5s2sTd3h_Kc7dAsKd_4hKsJsTs_4c8dJd9h_Qh8s2hTc_9s6c3c3s() {
    assertEquals(
      "9s6c3c3s Qh8s2hTc 4c8dJd9h 9d7s2d8h 4hKsJsTs Kc7dAsKd 5s2sTd3h",
      Solver.process("omaha-holdem 4d6d7h8cKh 9d7s2d8h 5s2sTd3h Kc7dAsKd 4hKsJsTs 4c8dJd9h Qh8s2hTc 9s6c3c3s"));
  }

  @Test
  public void test_omaha_holdem_2195_3s8c9cAhTs_Qc7sJdJs_6h5d5h2d_9s4s6sTd_AcJhKh2c_3h4cTc8d_8h5sQh8s_5c7c3d6d_3c4dKsTh() {
    assertEquals(
      "6h5d5h2d AcJhKh2c 3c4dKsTh 3h4cTc8d 9s4s6sTd 8h5sQh8s 5c7c3d6d Qc7sJdJs",
      Solver.process("omaha-holdem 3s8c9cAhTs Qc7sJdJs 6h5d5h2d 9s4s6sTd AcJhKh2c 3h4cTc8d 8h5sQh8s 5c7c3d6d 3c4dKsTh"));
  }

  @Test
  public void test_omaha_holdem_2196_5c5d5h6hJc_Qh9s2dAc_7sQcQd4c_JdQs2h7h() {
    assertEquals(
      "JdQs2h7h Qh9s2dAc 7sQcQd4c",
      Solver.process("omaha-holdem 5c5d5h6hJc Qh9s2dAc 7sQcQd4c JdQs2h7h"));
  }

  @Test
  public void test_omaha_holdem_2197_5d6d7sQdTh_2hKs2cJh_As9h3hTc_5h6s8h4h_3sTs6cJd_7hKhQh2s_3c5sTd8d_4sJsJc9s_4dAh8s4c_9c7dAc2d() {
    assertEquals(
      "2hKs2cJh As9h3hTc 4sJsJc9s 3sTs6cJd 7hKhQh2s 4dAh8s4c=5h6s8h4h 9c7dAc2d 3c5sTd8d",
      Solver.process("omaha-holdem 5d6d7sQdTh 2hKs2cJh As9h3hTc 5h6s8h4h 3sTs6cJd 7hKhQh2s 3c5sTd8d 4sJsJc9s 4dAh8s4c 9c7dAc2d"));
  }

  @Test
  public void test_omaha_holdem_2198_4s7cAcKhQs_Jh3cThAh_7dJc9cTc_Kc5h9hQc_6dTd2d3h() {
    assertEquals(
      "6dTd2d3h Kc5h9hQc 7dJc9cTc=Jh3cThAh",
      Solver.process("omaha-holdem 4s7cAcKhQs Jh3cThAh 7dJc9cTc Kc5h9hQc 6dTd2d3h"));
  }

  @Test
  public void test_omaha_holdem_2199_7s8d8hKsTh_AhAc2hJc_7c4d3dAd_2c3cTs9d_Qh5dTc5c_JsQd2d5s() {
    assertEquals(
      "JsQd2d5s 7c4d3dAd 2c3cTs9d Qh5dTc5c AhAc2hJc",
      Solver.process("omaha-holdem 7s8d8hKsTh AhAc2hJc 7c4d3dAd 2c3cTs9d Qh5dTc5c JsQd2d5s"));
  }

  @Test
  public void test_omaha_holdem_2200_2s6c8s9cTc_Qd5dJcAd_8c4s3c8h_7dTh4h5c_As4d8d2c_Qc3s9dKd_4cJh5h6s_9sQh7cTd() {
    assertEquals(
      "4cJh5h6s Qc3s9dKd As4d8d2c 7dTh4h5c=9sQh7cTd Qd5dJcAd 8c4s3c8h",
      Solver.process("omaha-holdem 2s6c8s9cTc Qd5dJcAd 8c4s3c8h 7dTh4h5c As4d8d2c Qc3s9dKd 4cJh5h6s 9sQh7cTd"));
  }

  @Test
  public void test_omaha_holdem_2201_2s6d9d9sJh_8s4cTh7d_Js3hKc8h_Ah8cTd6h_3sAdAs7h() {
    assertEquals(
      "8s4cTh7d Ah8cTd6h Js3hKc8h 3sAdAs7h",
      Solver.process("omaha-holdem 2s6d9d9sJh 8s4cTh7d Js3hKc8h Ah8cTd6h 3sAdAs7h"));
  }

  @Test
  public void test_omaha_holdem_2202_5cJdJhQdTc_4h2s5h8s_Kh9cAd8c() {
    assertEquals(
      "4h2s5h8s Kh9cAd8c",
      Solver.process("omaha-holdem 5cJdJhQdTc 4h2s5h8s Kh9cAd8c"));
  }

  @Test
  public void test_omaha_holdem_2203_5h6s7dJdJs_Ah6h2dKh_3d3c8dQc() {
    assertEquals(
      "3d3c8dQc Ah6h2dKh",
      Solver.process("omaha-holdem 5h6s7dJdJs Ah6h2dKh 3d3c8dQc"));
  }

  @Test
  public void test_omaha_holdem_2204_4c4h7c9dTc_QsQcQd2c_Qh8h3dJs_5s6d9hJd_3hTs5cAc_Td4s9s7s() {
    assertEquals(
      "5s6d9hJd Qh8h3dJs QsQcQd2c 3hTs5cAc Td4s9s7s",
      Solver.process("omaha-holdem 4c4h7c9dTc QsQcQd2c Qh8h3dJs 5s6d9hJd 3hTs5cAc Td4s9s7s"));
  }

  @Test
  public void test_omaha_holdem_2205_4c4s8hAcTd_5hKcJc6d_6c6h4hKs_Tc5s2s3c_Qs9c3h8c_3s4d9s2c() {
    assertEquals(
      "5hKcJc6d Qs9c3h8c Tc5s2s3c 3s4d9s2c 6c6h4hKs",
      Solver.process("omaha-holdem 4c4s8hAcTd 5hKcJc6d 6c6h4hKs Tc5s2s3c Qs9c3h8c 3s4d9s2c"));
  }

  @Test
  public void test_omaha_holdem_2206_2d3d4s6cTd_8hKsJhQs_6dAs8sKc_ThQh2sQd() {
    assertEquals(
      "8hKsJhQs 6dAs8sKc ThQh2sQd",
      Solver.process("omaha-holdem 2d3d4s6cTd 8hKsJhQs 6dAs8sKc ThQh2sQd"));
  }

  @Test
  public void test_omaha_holdem_2207_8h8sAdJcQc_Ac5h3hJd_JsJh2cKc_9hQh9c6s() {
    assertEquals(
      "9hQh9c6s Ac5h3hJd JsJh2cKc",
      Solver.process("omaha-holdem 8h8sAdJcQc Ac5h3hJd JsJh2cKc 9hQh9c6s"));
  }

  @Test
  public void test_omaha_holdem_2208_2c6s8s9cKd_6h2dJd7h_Jc3c3h9s_KsJs7s6c_9h4sTdTc_9d4cQdAh_2sTh5d3d_Ad7c2hTs() {
    assertEquals(
      "2sTh5d3d Jc3c3h9s 9d4cQdAh 9h4sTdTc 6h2dJd7h KsJs7s6c Ad7c2hTs",
      Solver.process("omaha-holdem 2c6s8s9cKd 6h2dJd7h Jc3c3h9s KsJs7s6c 9h4sTdTc 9d4cQdAh 2sTh5d3d Ad7c2hTs"));
  }

  @Test
  public void test_omaha_holdem_2209_5dAcKdQcTh_3cJd4s5s_3dQhQd9h_Ks2d2c7s_Ah6d6hJh_8d5c2sAs() {
    assertEquals(
      "3cJd4s5s Ks2d2c7s 8d5c2sAs 3dQhQd9h Ah6d6hJh",
      Solver.process("omaha-holdem 5dAcKdQcTh 3cJd4s5s 3dQhQd9h Ks2d2c7s Ah6d6hJh 8d5c2sAs"));
  }

  @Test
  public void test_omaha_holdem_2210_3s4h9sAhJd_5hTc9dJs_KsQdAd4d() {
    assertEquals(
      "5hTc9dJs KsQdAd4d",
      Solver.process("omaha-holdem 3s4h9sAhJd 5hTc9dJs KsQdAd4d"));
  }

  @Test
  public void test_omaha_holdem_2211_4c4h6d7h8h_9dKc2cKs_AcAs4s3s_2s3d3hJd_6s2dQd8d() {
    assertEquals(
      "2s3d3hJd 6s2dQd8d 9dKc2cKs AcAs4s3s",
      Solver.process("omaha-holdem 4c4h6d7h8h 9dKc2cKs AcAs4s3s 2s3d3hJd 6s2dQd8d"));
  }

  @Test
  public void test_omaha_holdem_2212_4d5h8dJhKc_9s7cAd6h_7sThJsQh_5s9h9cAc_Jd6s8h6c_Jc8c2dAs_7hKsTd9d_3c2s4c2h() {
    assertEquals(
      "3c2s4c2h 5s9h9cAc 7sThJsQh 7hKsTd9d Jc8c2dAs=Jd6s8h6c 9s7cAd6h",
      Solver.process("omaha-holdem 4d5h8dJhKc 9s7cAd6h 7sThJsQh 5s9h9cAc Jd6s8h6c Jc8c2dAs 7hKsTd9d 3c2s4c2h"));
  }

  @Test
  public void test_omaha_holdem_2213_2d2sAdTcTh_7s6d4sJc_Ks3dJs5h_8d4hJd8h_3sAhQsQc_5dTd8sQh_As9h2h4c_3c6cKc5s_7c5c8cKh_6sTs7h6h() {
    assertEquals(
      "7s6d4sJc 3c6cKc5s 7c5c8cKh Ks3dJs5h 8d4hJd8h 3sAhQsQc 6sTs7h6h 5dTd8sQh As9h2h4c",
      Solver.process("omaha-holdem 2d2sAdTcTh 7s6d4sJc Ks3dJs5h 8d4hJd8h 3sAhQsQc 5dTd8sQh As9h2h4c 3c6cKc5s 7c5c8cKh 6sTs7h6h"));
  }

  @Test
  public void test_omaha_holdem_2214_4s8cJhKsQs_Jc5h8sAd_6d3s5d3c() {
    assertEquals(
      "6d3s5d3c Jc5h8sAd",
      Solver.process("omaha-holdem 4s8cJhKsQs Jc5h8sAd 6d3s5d3c"));
  }

  @Test
  public void test_omaha_holdem_2215_3d8sJsKdTs_7sJc4s5d_Th4c7d5c_6s8d2c4h_6hQdQh8h() {
    assertEquals(
      "6s8d2c4h Th4c7d5c 6hQdQh8h 7sJc4s5d",
      Solver.process("omaha-holdem 3d8sJsKdTs 7sJc4s5d Th4c7d5c 6s8d2c4h 6hQdQh8h"));
  }

  @Test
  public void test_omaha_holdem_2216_2h3h4c5sTd_Jh5h2cKd_Js6sQdKc_AhQc9sJc_8d7hTcQh_7c4h8s2d_3s7sTs4d_9cAs6d5d_Kh9dAdQs() {
    assertEquals(
      "Js6sQdKc AhQc9sJc Kh9dAdQs 8d7hTcQh 7c4h8s2d Jh5h2cKd 3s7sTs4d 9cAs6d5d",
      Solver.process("omaha-holdem 2h3h4c5sTd Jh5h2cKd Js6sQdKc AhQc9sJc 8d7hTcQh 7c4h8s2d 3s7sTs4d 9cAs6d5d Kh9dAdQs"));
  }

  @Test
  public void test_omaha_holdem_2217_7c9hAsKcQh_9c6h4cAh_3hQdJsTs() {
    assertEquals(
      "9c6h4cAh 3hQdJsTs",
      Solver.process("omaha-holdem 7c9hAsKcQh 9c6h4cAh 3hQdJsTs"));
  }

  @Test
  public void test_omaha_holdem_2218_3c7c8d9sAc_4h8s9h2h_5h4dQc2c_5s8hTcAd_7s8c3h3d_6s9d2sTs_7hKhQsKc_7d5c5d2d() {
    assertEquals(
      "7d5c5d2d 7hKhQsKc 4h8s9h2h 5s8hTcAd 7s8c3h3d 6s9d2sTs 5h4dQc2c",
      Solver.process("omaha-holdem 3c7c8d9sAc 4h8s9h2h 5h4dQc2c 5s8hTcAd 7s8c3h3d 6s9d2sTs 7hKhQsKc 7d5c5d2d"));
  }

  @Test
  public void test_omaha_holdem_2219_2dAcJcKdQc_3s7dTs5c_ThQs9s7s_8h7cQh6h_QdKc6c4d_3hAs2c2s_4c3c4hAd_5sJh8d7h_9cTc4s9h_KhJs5h3d() {
    assertEquals(
      "3s7dTs5c 5sJh8d7h 8h7cQh6h KhJs5h3d 3hAs2c2s ThQs9s7s 4c3c4hAd 9cTc4s9h QdKc6c4d",
      Solver.process("omaha-holdem 2dAcJcKdQc 3s7dTs5c ThQs9s7s 8h7cQh6h QdKc6c4d 3hAs2c2s 4c3c4hAd 5sJh8d7h 9cTc4s9h KhJs5h3d"));
  }

  @Test
  public void test_omaha_holdem_2220_2cAdAhKdTh_8d7h9c5c_2sKcAsTc() {
    assertEquals(
      "8d7h9c5c 2sKcAsTc",
      Solver.process("omaha-holdem 2cAdAhKdTh 8d7h9c5c 2sKcAsTc"));
  }

  @Test
  public void test_omaha_holdem_2221_4c4sAcKhKs_6sJc2h5c_7d8cJhAh_8s2cQh5h_Ts8hQd5d_Kd8d2d6d_3d7s9s3s_7h4dKcAs_9cQc9hAd_Th3h7c2s() {
    assertEquals(
      "Th3h7c2s 6sJc2h5c 8s2cQh5h Ts8hQd5d 3d7s9s3s 7d8cJhAh 9cQc9hAd Kd8d2d6d 7h4dKcAs",
      Solver.process("omaha-holdem 4c4sAcKhKs 6sJc2h5c 7d8cJhAh 8s2cQh5h Ts8hQd5d Kd8d2d6d 3d7s9s3s 7h4dKcAs 9cQc9hAd Th3h7c2s"));
  }

  @Test
  public void test_omaha_holdem_2222_3s5d7h8dAd_8s8hQs6h_7s3d4c9c_2h9sQc4h_5hJsTsJc_4sAh3c5c_2c6d5sKh() {
    assertEquals(
      "2c6d5sKh 5hJsTsJc 7s3d4c9c 4sAh3c5c 8s8hQs6h 2h9sQc4h",
      Solver.process("omaha-holdem 3s5d7h8dAd 8s8hQs6h 7s3d4c9c 2h9sQc4h 5hJsTsJc 4sAh3c5c 2c6d5sKh"));
  }

  @Test
  public void test_omaha_holdem_2223_7sAdKdQhTc_6hJd3d3h_9s4d8h4s_AsKs8d9d_KcJh8sAc_7dQc5sTh_9c2h6s6c_4c5hTd9h_Ah8c2cJc_7h7c5c3s() {
    assertEquals(
      "6hJd3d3h 9s4d8h4s 9c2h6s6c 4c5hTd9h 7dQc5sTh AsKs8d9d 7h7c5c3s Ah8c2cJc=KcJh8sAc",
      Solver.process("omaha-holdem 7sAdKdQhTc 6hJd3d3h 9s4d8h4s AsKs8d9d KcJh8sAc 7dQc5sTh 9c2h6s6c 4c5hTd9h Ah8c2cJc 7h7c5c3s"));
  }

  @Test
  public void test_omaha_holdem_2224_9cKdKhQcTh_5s3h6dKc_2c4h2h3s_5c5hQs8h_AdQh5d2d_AhAsTc9d() {
    assertEquals(
      "2c4h2h3s 5c5hQs8h AdQh5d2d AhAsTc9d 5s3h6dKc",
      Solver.process("omaha-holdem 9cKdKhQcTh 5s3h6dKc 2c4h2h3s 5c5hQs8h AdQh5d2d AhAsTc9d"));
  }

  @Test
  public void test_omaha_holdem_2225_4c4s5c5h8d_Ks4d8hKh_3s7sTcQs_Ad8s6hQc_7d2s8c5d_9h2cQdQh() {
    assertEquals(
      "3s7sTcQs Ad8s6hQc 9h2cQdQh Ks4d8hKh 7d2s8c5d",
      Solver.process("omaha-holdem 4c4s5c5h8d Ks4d8hKh 3s7sTcQs Ad8s6hQc 7d2s8c5d 9h2cQdQh"));
  }

  @Test
  public void test_omaha_holdem_2226_4h5c6c9cJh_Ac7d9d6s_6hKs3d8h_2cTs5dQs() {
    assertEquals(
      "2cTs5dQs 6hKs3d8h Ac7d9d6s",
      Solver.process("omaha-holdem 4h5c6c9cJh Ac7d9d6s 6hKs3d8h 2cTs5dQs"));
  }

  @Test
  public void test_omaha_holdem_2227_4c4s6dAhQd_JdJs6cQs_Th2s8d9s_Td3h9cKd_2dKs2hTc_7d6s2c4d() {
    assertEquals(
      "Th2s8d9s Td3h9cKd 2dKs2hTc JdJs6cQs 7d6s2c4d",
      Solver.process("omaha-holdem 4c4s6dAhQd JdJs6cQs Th2s8d9s Td3h9cKd 2dKs2hTc 7d6s2c4d"));
  }

  @Test
  public void test_omaha_holdem_2228_2c2sJhKcKs_5c5d3dTh_5hTdTc6s() {
    assertEquals(
      "5c5d3dTh 5hTdTc6s",
      Solver.process("omaha-holdem 2c2sJhKcKs 5c5d3dTh 5hTdTc6s"));
  }

  @Test
  public void test_omaha_holdem_2229_2c7d8hAdKd_JdQh7h2h_4cQc3cTs_7sKcQsJh_8c9cKhJs_As4s6c6s() {
    assertEquals(
      "4cQc3cTs As4s6c6s JdQh7h2h 7sKcQsJh 8c9cKhJs",
      Solver.process("omaha-holdem 2c7d8hAdKd JdQh7h2h 4cQc3cTs 7sKcQsJh 8c9cKhJs As4s6c6s"));
  }

  @Test
  public void test_omaha_holdem_2230_3d9hAdAsQc_4sAc8dKc_8s5sJcQh_3hJhKhKd_2cThJdKs_5d7h2dTd_Ts6dQd2s_9c5h6h9d_4dJs3s4c() {
    assertEquals(
      "5d7h2dTd 2cThJdKs 4dJs3s4c Ts6dQd2s 8s5sJcQh 3hJhKhKd 4sAc8dKc 9c5h6h9d",
      Solver.process("omaha-holdem 3d9hAdAsQc 4sAc8dKc 8s5sJcQh 3hJhKhKd 2cThJdKs 5d7h2dTd Ts6dQd2s 9c5h6h9d 4dJs3s4c"));
  }

  @Test
  public void test_omaha_holdem_2231_5h7c8dKsQd_4s4d6c8h_6h9dKdTs_AdTd5c3s_5sAh2d3d_6sAs8s9c() {
    assertEquals(
      "5sAh2d3d=AdTd5c3s 4s4d6c8h 6h9dKdTs=6sAs8s9c",
      Solver.process("omaha-holdem 5h7c8dKsQd 4s4d6c8h 6h9dKdTs AdTd5c3s 5sAh2d3d 6sAs8s9c"));
  }

  @Test
  public void test_omaha_holdem_2232_4c6c7c9sQc_5dKs8hJd_QsThQhJh_5s8c2sAc_Ad5cTs4s_Js3h7h7d_5hAs2dKh_Jc4hQd8d_2c6dKc9c() {
    assertEquals(
      "5hAs2dKh Ad5cTs4s Jc4hQd8d Js3h7h7d QsThQhJh 5dKs8hJd 2c6dKc9c 5s8c2sAc",
      Solver.process("omaha-holdem 4c6c7c9sQc 5dKs8hJd QsThQhJh 5s8c2sAc Ad5cTs4s Js3h7h7d 5hAs2dKh Jc4hQd8d 2c6dKc9c"));
  }

  @Test
  public void test_omaha_holdem_2233_6s8c9sAsJc_4cTh2c3s_Ad9hKdJh_QdJdTs5d() {
    assertEquals(
      "4cTh2c3s Ad9hKdJh QdJdTs5d",
      Solver.process("omaha-holdem 6s8c9sAsJc 4cTh2c3s Ad9hKdJh QdJdTs5d"));
  }

  @Test
  public void test_omaha_holdem_2234_2c7s8s9dQd_Qc2d6s8h_5sAd3c5d_2h6dQh7d_3d9hKhKd_9sAsKs3s_3h4h2s4c_TcJcQsTs() {
    assertEquals(
      "3h4h2s4c 5sAd3c5d 9sAsKs3s 3d9hKhKd 2h6dQh7d Qc2d6s8h TcJcQsTs",
      Solver.process("omaha-holdem 2c7s8s9dQd Qc2d6s8h 5sAd3c5d 2h6dQh7d 3d9hKhKd 9sAsKs3s 3h4h2s4c TcJcQsTs"));
  }

  @Test
  public void test_omaha_holdem_2235_3s4d5c6hJh_Qh5h9c7c_TcQd4s2s_8c3hKhJd_5d7sAsKd_7d6d5s4c_6cKsJc7h_2h8dQsAh_9d9hQc2d() {
    assertEquals(
      "9d9hQc2d 8c3hKhJd 2h8dQsAh TcQd4s2s 5d7sAsKd=6cKsJc7h=7d6d5s4c=Qh5h9c7c",
      Solver.process("omaha-holdem 3s4d5c6hJh Qh5h9c7c TcQd4s2s 8c3hKhJd 5d7sAsKd 7d6d5s4c 6cKsJc7h 2h8dQsAh 9d9hQc2d"));
  }

  @Test
  public void test_omaha_holdem_2236_4h6d6s8dQd_7dKc9h8h_7hKhAcAh_3cTd5cJc_Qs8sKs4s_3h7cThQc_5d5s4d5h_7s2cKdQh() {
    assertEquals(
      "3cTd5cJc 7dKc9h8h 3h7cThQc 7s2cKdQh Qs8sKs4s 7hKhAcAh 5d5s4d5h",
      Solver.process("omaha-holdem 4h6d6s8dQd 7dKc9h8h 7hKhAcAh 3cTd5cJc Qs8sKs4s 3h7cThQc 5d5s4d5h 7s2cKdQh"));
  }

  @Test
  public void test_omaha_holdem_2237_4s7h8sAsQh_3d5d3s6d_Td3hTcAc_8h4d4c2s_9sKs3cKd() {
    assertEquals(
      "Td3hTcAc 8h4d4c2s 3d5d3s6d 9sKs3cKd",
      Solver.process("omaha-holdem 4s7h8sAsQh 3d5d3s6d Td3hTcAc 8h4d4c2s 9sKs3cKd"));
  }

  @Test
  public void test_omaha_holdem_2238_4d6hAhKcTd_AdJd3s4h_QhKh7d6c_QcJc5s9s_9hKs7s4c_2h5c5h6d_4s8cJsKd() {
    assertEquals(
      "2h5c5h6d 4s8cJsKd=9hKs7s4c QhKh7d6c AdJd3s4h QcJc5s9s",
      Solver.process("omaha-holdem 4d6hAhKcTd AdJd3s4h QhKh7d6c QcJc5s9s 9hKs7s4c 2h5c5h6d 4s8cJsKd"));
  }

  @Test
  public void test_omaha_holdem_2239_2c3h9sAsQc_Js6c9c6s_Th3c8s5c_8c7hAh4d_Ks4s8h6d_3sQh2sJd_Kd7c4c5s_5dAdTc9h_TdAcKc7d_5h6hQd2d() {
    assertEquals(
      "Ks4s8h6d Th3c8s5c Js6c9c6s 8c7hAh4d TdAcKc7d 5h6hQd2d 3sQh2sJd 5dAdTc9h Kd7c4c5s",
      Solver.process("omaha-holdem 2c3h9sAsQc Js6c9c6s Th3c8s5c 8c7hAh4d Ks4s8h6d 3sQh2sJd Kd7c4c5s 5dAdTc9h TdAcKc7d 5h6hQd2d"));
  }

  @Test
  public void test_omaha_holdem_2240_3h8dJdKhTd_KcAsJc4d_4s3c4hAc_Ks2s6s4c_7c3sKdJs_5c6hAd8h_7d8s9sJh_Ah6d9cTs_QsQh5d8c_5s2d6c3d() {
    assertEquals(
      "4s3c4hAc 5c6hAd8h Ah6d9cTs QsQh5d8c Ks2s6s4c 7c3sKdJs=KcAsJc4d 7d8s9sJh 5s2d6c3d",
      Solver.process("omaha-holdem 3h8dJdKhTd KcAsJc4d 4s3c4hAc Ks2s6s4c 7c3sKdJs 5c6hAd8h 7d8s9sJh Ah6d9cTs QsQh5d8c 5s2d6c3d"));
  }

  @Test
  public void test_omaha_holdem_2241_6d8s9hJdQd_9s5s5hKd_Ac5cJhQh_KhKsQs7d_Jc2hTc4d_3sAh7s2d_7hQc4s4c_2sAd2c3d_Kc6h6c7c_3hThTsTd() {
    assertEquals(
      "3sAh7s2d 9s5s5hKd 3hThTsTd 7hQc4s4c KhKsQs7d Ac5cJhQh Kc6h6c7c Jc2hTc4d 2sAd2c3d",
      Solver.process("omaha-holdem 6d8s9hJdQd 9s5s5hKd Ac5cJhQh KhKsQs7d Jc2hTc4d 3sAh7s2d 7hQc4s4c 2sAd2c3d Kc6h6c7c 3hThTsTd"));
  }

  @Test
  public void test_omaha_holdem_2242_3s6sKhQhTs_Qs2hJs4c_6dJdQd4s_3d7dAh8d_3cKc7c9h_TdAdJc9d_QcKs2d9s() {
    assertEquals(
      "3d7dAh8d 6dJdQd4s 3cKc7c9h TdAdJc9d Qs2hJs4c QcKs2d9s",
      Solver.process("omaha-holdem 3s6sKhQhTs Qs2hJs4c 6dJdQd4s 3d7dAh8d 3cKc7c9h TdAdJc9d QcKs2d9s"));
  }

  @Test
  public void test_omaha_holdem_2243_7hJsKsQhTc_3c3sQs3d_Jd5sAsAh_Td5c3h4c_9hTsJh6d() {
    assertEquals(
      "Td5c3h4c 3c3sQs3d 9hTsJh6d Jd5sAsAh",
      Solver.process("omaha-holdem 7hJsKsQhTc 3c3sQs3d Jd5sAsAh Td5c3h4c 9hTsJh6d"));
  }

  @Test
  public void test_omaha_holdem_2244_3h3s4h5dQd_4dKs8h3d_2d8s7s7d_4sTdTs2s_Th2hJcTc_6s8dKh9d_JdJh6d7h_AsKc9s6c_7cJs5h4c() {
    assertEquals(
      "6s8dKh9d AsKc9s6c 7cJs5h4c 2d8s7s7d 4sTdTs2s=Th2hJcTc JdJh6d7h 4dKs8h3d",
      Solver.process("omaha-holdem 3h3s4h5dQd 4dKs8h3d 2d8s7s7d 4sTdTs2s Th2hJcTc 6s8dKh9d JdJh6d7h AsKc9s6c 7cJs5h4c"));
  }

  @Test
  public void test_omaha_holdem_2245_7d8hJhKhQd_4d3dQhKs_7h8cQs6h_As7s9h2c_5h5s4sJc() {
    assertEquals(
      "As7s9h2c 5h5s4sJc 4d3dQhKs 7h8cQs6h",
      Solver.process("omaha-holdem 7d8hJhKhQd 4d3dQhKs 7h8cQs6h As7s9h2c 5h5s4sJc"));
  }

  @Test
  public void test_omaha_holdem_2246_4h8hJcKdKh_8sAd3sTs_5h2hKs2c_Ac6h9cJh_9h3d5dTd_4sQd7d6c_2sKc7sAs_7cAhQc8d() {
    assertEquals(
      "9h3d5dTd 4sQd7d6c 7cAhQc8d=8sAd3sTs 2sKc7sAs 5h2hKs2c Ac6h9cJh",
      Solver.process("omaha-holdem 4h8hJcKdKh 8sAd3sTs 5h2hKs2c Ac6h9cJh 9h3d5dTd 4sQd7d6c 2sKc7sAs 7cAhQc8d"));
  }

  @Test
  public void test_omaha_holdem_2247_3d3s7h8hQs_4hTs6d5d_Js8s8d6c_KcAh3cKh_5sQh2h5c_5h2c3h9d_2d8cKsAd() {
    assertEquals(
      "4hTs6d5d 2d8cKsAd 5sQh2h5c 5h2c3h9d KcAh3cKh Js8s8d6c",
      Solver.process("omaha-holdem 3d3s7h8hQs 4hTs6d5d Js8s8d6c KcAh3cKh 5sQh2h5c 5h2c3h9d 2d8cKsAd"));
  }

  @Test
  public void test_omaha_holdem_2248_2h2sKdTdTs_3dAc9cJh_5d4s7h6c_3s2c9hQh_6s8s2dJc_5sAh7cKs_QsKcTh4c_8d6d3cTc_7s6hKhJs() {
    assertEquals(
      "5d4s7h6c 3dAc9cJh 7s6hKhJs 5sAh7cKs 6s8s2dJc 3s2c9hQh 8d6d3cTc QsKcTh4c",
      Solver.process("omaha-holdem 2h2sKdTdTs 3dAc9cJh 5d4s7h6c 3s2c9hQh 6s8s2dJc 5sAh7cKs QsKcTh4c 8d6d3cTc 7s6hKhJs"));
  }

  @Test
  public void test_omaha_holdem_2249_5h6s8dJhKd_8h9hAc2d_Tc2c7hQs() {
    assertEquals(
      "Tc2c7hQs 8h9hAc2d",
      Solver.process("omaha-holdem 5h6s8dJhKd 8h9hAc2d Tc2c7hQs"));
  }

}
