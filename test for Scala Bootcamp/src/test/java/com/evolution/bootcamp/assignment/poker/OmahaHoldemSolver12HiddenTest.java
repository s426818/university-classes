
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver12HiddenTest {


  @Test
  public void test_omaha_holdem_3000_7hAhAsJhQd_Tc4sJsKd_2h8dKc6c_6h3c9c8c_9s4c4d2d_7s4h8h6d_9d5hKsQh_2cAc3d3s() {
    assertEquals(
      "6h3c9c8c 2h8dKc6c 9s4c4d2d 2cAc3d3s Tc4sJsKd 7s4h8h6d 9d5hKsQh",
      Solver.process("omaha-holdem 7hAhAsJhQd Tc4sJsKd 2h8dKc6c 6h3c9c8c 9s4c4d2d 7s4h8h6d 9d5hKsQh 2cAc3d3s"));
  }

  @Test
  public void test_omaha_holdem_3001_2d2s4hQdQh_3s6dTc5c_2h7s8s3d_As5h8cQs_8d6s9sQc_7d5sJh6c_9c7c2cTh_7h4dJc4c() {
    assertEquals(
      "3s6dTc5c 7d5sJh6c 2h7s8s3d 9c7c2cTh 8d6s9sQc As5h8cQs 7h4dJc4c",
      Solver.process("omaha-holdem 2d2s4hQdQh 3s6dTc5c 2h7s8s3d As5h8cQs 8d6s9sQc 7d5sJh6c 9c7c2cTh 7h4dJc4c"));
  }

  @Test
  public void test_omaha_holdem_3002_3h8c9sAsKs_Ad8hKc4h_Qs5d9d2d_QcTd6h7h_TsJc4dKd_3sAhQh8d_6dJd2hTh_7sKh4cJs() {
    assertEquals(
      "6dJd2hTh QcTd6h7h Qs5d9d2d TsJc4dKd 3sAhQh8d Ad8hKc4h 7sKh4cJs",
      Solver.process("omaha-holdem 3h8c9sAsKs Ad8hKc4h Qs5d9d2d QcTd6h7h TsJc4dKd 3sAhQh8d 6dJd2hTh 7sKh4cJs"));
  }

  @Test
  public void test_omaha_holdem_3003_4s5c6s8dTh_Qs2s2h4c_2dQd6hQc_6c5sTd3d() {
    assertEquals(
      "Qs2s2h4c 2dQd6hQc 6c5sTd3d",
      Solver.process("omaha-holdem 4s5c6s8dTh Qs2s2h4c 2dQd6hQc 6c5sTd3d"));
  }

  @Test
  public void test_omaha_holdem_3004_3d4d7c8c8h_Qs4sAcAd_Jd9sTdQd_Th7hKsJs_Ts5c7d2c() {
    assertEquals(
      "Jd9sTdQd Ts5c7d2c Th7hKsJs Qs4sAcAd",
      Solver.process("omaha-holdem 3d4d7c8c8h Qs4sAcAd Jd9sTdQd Th7hKsJs Ts5c7d2c"));
  }

  @Test
  public void test_omaha_holdem_3005_4dJhKdKsTc_Js3cTh8c_KcAsKhAc_7s2c2d7h() {
    assertEquals(
      "7s2c2d7h Js3cTh8c KcAsKhAc",
      Solver.process("omaha-holdem 4dJhKdKsTc Js3cTh8c KcAsKhAc 7s2c2d7h"));
  }

  @Test
  public void test_omaha_holdem_3006_4d5c7s8cKd_KcQc8dQd_7dJd3d4s_8hThQhQs_TsTc4cTd_KsAhKh8s() {
    assertEquals(
      "TsTc4cTd 8hThQhQs 7dJd3d4s KcQc8dQd KsAhKh8s",
      Solver.process("omaha-holdem 4d5c7s8cKd KcQc8dQd 7dJd3d4s 8hThQhQs TsTc4cTd KsAhKh8s"));
  }

  @Test
  public void test_omaha_holdem_3007_2d3s8c8h8s_2hKhTcKc_Jd6hAs9c_3hQc5c8d() {
    assertEquals(
      "Jd6hAs9c 2hKhTcKc 3hQc5c8d",
      Solver.process("omaha-holdem 2d3s8c8h8s 2hKhTcKc Jd6hAs9c 3hQc5c8d"));
  }

  @Test
  public void test_omaha_holdem_3008_2h8dAhKcTd_9hAc4dKs_6s5d9sTs() {
    assertEquals(
      "6s5d9sTs 9hAc4dKs",
      Solver.process("omaha-holdem 2h8dAhKcTd 9hAc4dKs 6s5d9sTs"));
  }

  @Test
  public void test_omaha_holdem_3009_4s6d8cQdQs_8hAh2s7d_7sKhKsAd_JcThAcTc_2h5h6c9h_5cQh4h2d_Js3h9c7h_3d4cAs3c() {
    assertEquals(
      "Js3h9c7h 3d4cAs3c 2h5h6c9h 8hAh2s7d JcThAcTc 7sKhKsAd 5cQh4h2d",
      Solver.process("omaha-holdem 4s6d8cQdQs 8hAh2s7d 7sKhKsAd JcThAcTc 2h5h6c9h 5cQh4h2d Js3h9c7h 3d4cAs3c"));
  }

  @Test
  public void test_omaha_holdem_3010_2c4d5s6c9h_AdTd9d2s_9s5d7cKc_3s5hAcTs() {
    assertEquals(
      "AdTd9d2s 9s5d7cKc 3s5hAcTs",
      Solver.process("omaha-holdem 2c4d5s6c9h AdTd9d2s 9s5d7cKc 3s5hAcTs"));
  }

  @Test
  public void test_omaha_holdem_3011_2d6d8sAcAs_5d4sJd5s_4d2c5hKh_AdKd6h7d_3c3dKcTd_Qs3s4h9h_QhTsAh6s_Ks9s8c7s_QdJc3h9d_Tc4cJsJh() {
    assertEquals(
      "Qs3s4h9h QdJc3h9d 4d2c5hKh 3c3dKcTd 5d4sJd5s Ks9s8c7s Tc4cJsJh AdKd6h7d=QhTsAh6s",
      Solver.process("omaha-holdem 2d6d8sAcAs 5d4sJd5s 4d2c5hKh AdKd6h7d 3c3dKcTd Qs3s4h9h QhTsAh6s Ks9s8c7s QdJc3h9d Tc4cJsJh"));
  }

  @Test
  public void test_omaha_holdem_3012_2h3hAhJsKh_4s9h3c8c_Ts6dAd4c_5hTc2cJh() {
    assertEquals(
      "4s9h3c8c Ts6dAd4c 5hTc2cJh",
      Solver.process("omaha-holdem 2h3hAhJsKh 4s9h3c8c Ts6dAd4c 5hTc2cJh"));
  }

  @Test
  public void test_omaha_holdem_3013_7h8c8d8sKc_9h9c2dTd_QhJs7s6s_Jc3s5h9s_Ts2sJh2h() {
    assertEquals(
      "Jc3s5h9s QhJs7s6s Ts2sJh2h 9h9c2dTd",
      Solver.process("omaha-holdem 7h8c8d8sKc 9h9c2dTd QhJs7s6s Jc3s5h9s Ts2sJh2h"));
  }

  @Test
  public void test_omaha_holdem_3014_2s3s5h9dKc_QhAdQdKs_3dJd5d9c_5cJs6cKd_7dJhAh3h_Th4c6h7c_Ts6dTd6s_QsKh8hTc_4s4dAs2h() {
    assertEquals(
      "7dJhAh3h Ts6dTd6s QsKh8hTc QhAdQdKs 3dJd5d9c 5cJs6cKd 4s4dAs2h Th4c6h7c",
      Solver.process("omaha-holdem 2s3s5h9dKc QhAdQdKs 3dJd5d9c 5cJs6cKd 7dJhAh3h Th4c6h7c Ts6dTd6s QsKh8hTc 4s4dAs2h"));
  }

  @Test
  public void test_omaha_holdem_3015_3s6c9cQcTc_8h3cAhQh_KhKd4h6h_2sTs7s9h_9d4c3dJd_5d8sAd6d_Td7d8dKc() {
    assertEquals(
      "5d8sAd6d KhKd4h6h 9d4c3dJd 2sTs7s9h 8h3cAhQh Td7d8dKc",
      Solver.process("omaha-holdem 3s6c9cQcTc 8h3cAhQh KhKd4h6h 2sTs7s9h 9d4c3dJd 5d8sAd6d Td7d8dKc"));
  }

  @Test
  public void test_omaha_holdem_3016_6c6d7cQdQh_JsTcJh3h_Ts4sKcAc_6h4d9h3d_5sAdAh2h_4c4hAs7h_9cJcQsTh() {
    assertEquals(
      "Ts4sKcAc 4c4hAs7h JsTcJh3h 5sAdAh2h 6h4d9h3d 9cJcQsTh",
      Solver.process("omaha-holdem 6c6d7cQdQh JsTcJh3h Ts4sKcAc 6h4d9h3d 5sAdAh2h 4c4hAs7h 9cJcQsTh"));
  }

  @Test
  public void test_omaha_holdem_3017_2h2s5c6sKs_TsKh8hTd_3cQhAd6h_Kd6d4dKc_3d9s3h4c_9h7h2c3s_5h6cJd4h_9dQs8sTh_Jc7d2d5d_Jh8c8dTc() {
    assertEquals(
      "3cQhAd6h 5h6cJd4h Jh8c8dTc TsKh8hTd 9h7h2c3s 3d9s3h4c 9dQs8sTh Jc7d2d5d Kd6d4dKc",
      Solver.process("omaha-holdem 2h2s5c6sKs TsKh8hTd 3cQhAd6h Kd6d4dKc 3d9s3h4c 9h7h2c3s 5h6cJd4h 9dQs8sTh Jc7d2d5d Jh8c8dTc"));
  }

  @Test
  public void test_omaha_holdem_3018_6c7hJhJsTc_Qc7sAd5s_Ts4s2hKc_As9sQs6s_Jc3h2cQh_Kd2dAh4d_8d3c9dTh_Ac2s7cTd_3s8h4c5c_6d9cKh3d() {
    assertEquals(
      "3s8h4c5c Kd2dAh4d 6d9cKh3d As9sQs6s Qc7sAd5s Ts4s2hKc Ac2s7cTd Jc3h2cQh 8d3c9dTh",
      Solver.process("omaha-holdem 6c7hJhJsTc Qc7sAd5s Ts4s2hKc As9sQs6s Jc3h2cQh Kd2dAh4d 8d3c9dTh Ac2s7cTd 3s8h4c5c 6d9cKh3d"));
  }

  @Test
  public void test_omaha_holdem_3019_2c3d3s9cKd_5d9s4dQh_4s7s6sTh_As5hTdAc_6h7dKh3c() {
    assertEquals(
      "4s7s6sTh 5d9s4dQh As5hTdAc 6h7dKh3c",
      Solver.process("omaha-holdem 2c3d3s9cKd 5d9s4dQh 4s7s6sTh As5hTdAc 6h7dKh3c"));
  }

  @Test
  public void test_omaha_holdem_3020_2d2s6dJhQc_3s6sKsAc_4c8d9d3c_7s8h7dTc_4s5hJdKd_9s5d2c3d_QdQhJsJc_Kc7hKh6c_5c3h7c5s() {
    assertEquals(
      "4c8d9d3c 5c3h7c5s 3s6sKsAc 7s8h7dTc 4s5hJdKd Kc7hKh6c 9s5d2c3d QdQhJsJc",
      Solver.process("omaha-holdem 2d2s6dJhQc 3s6sKsAc 4c8d9d3c 7s8h7dTc 4s5hJdKd 9s5d2c3d QdQhJsJc Kc7hKh6c 5c3h7c5s"));
  }

  @Test
  public void test_omaha_holdem_3021_3h4d8d9hJs_4sAhTs7h_6d8c8hQd_9c2h4cAc_8s7sAd9d_3sQhKc5d_As4h5c9s_KdThQcJh_3dJc3cJd() {
    assertEquals(
      "3sQhKc5d 9c2h4cAc=As4h5c9s 8s7sAd9d 6d8c8hQd 3dJc3cJd 4sAhTs7h KdThQcJh",
      Solver.process("omaha-holdem 3h4d8d9hJs 4sAhTs7h 6d8c8hQd 9c2h4cAc 8s7sAd9d 3sQhKc5d As4h5c9s KdThQcJh 3dJc3cJd"));
  }

  @Test
  public void test_omaha_holdem_3022_6d7s9d9sQd_ThJdJh3c_5hJsAhTd() {
    assertEquals(
      "5hJsAhTd ThJdJh3c",
      Solver.process("omaha-holdem 6d7s9d9sQd ThJdJh3c 5hJsAhTd"));
  }

  @Test
  public void test_omaha_holdem_3023_4d6h8cAcJh_5dJd4h7c_2s6cQd7d_9hQsKsTs_AsKd6sTh_9c5s4cKc() {
    assertEquals(
      "9hQsKsTs 9c5s4cKc 2s6cQd7d AsKd6sTh 5dJd4h7c",
      Solver.process("omaha-holdem 4d6h8cAcJh 5dJd4h7c 2s6cQd7d 9hQsKsTs AsKd6sTh 9c5s4cKc"));
  }

  @Test
  public void test_omaha_holdem_3024_2d3h5h8c8s_6c5d7cTc_JsTd4c5s_Jh4d9sQd_AdJc4hKd_9dQhThKc_AcAsKhAh_Jd8h8d3s() {
    assertEquals(
      "Jh4d9sQd 9dQhThKc 6c5d7cTc JsTd4c5s AcAsKhAh AdJc4hKd Jd8h8d3s",
      Solver.process("omaha-holdem 2d3h5h8c8s 6c5d7cTc JsTd4c5s Jh4d9sQd AdJc4hKd 9dQhThKc AcAsKhAh Jd8h8d3s"));
  }

  @Test
  public void test_omaha_holdem_3025_4c4h6sKsTd_AcQc9cAh_Tc5cAd7s() {
    assertEquals(
      "Tc5cAd7s AcQc9cAh",
      Solver.process("omaha-holdem 4c4h6sKsTd AcQc9cAh Tc5cAd7s"));
  }

  @Test
  public void test_omaha_holdem_3026_2c2h6c8cAs_9hQd6s2s_4c5hQh7s_Jc7c3hTd_Ks5c5s7d_8sTsKhJh_Qc6hAc7h_JdAh8dKd_4h8h9cQs() {
    assertEquals(
      "4c5hQh7s Ks5c5s7d 4h8h9cQs 8sTsKhJh JdAh8dKd Jc7c3hTd Qc6hAc7h 9hQd6s2s",
      Solver.process("omaha-holdem 2c2h6c8cAs 9hQd6s2s 4c5hQh7s Jc7c3hTd Ks5c5s7d 8sTsKhJh Qc6hAc7h JdAh8dKd 4h8h9cQs"));
  }

  @Test
  public void test_omaha_holdem_3027_2d5cKhTdTh_5h2cKcKd_Qc7d4d6s_8d4s9s9h_As3sJs8c_QsQh6h3d_Jd6c7hAc() {
    assertEquals(
      "Qc7d4d6s As3sJs8c=Jd6c7hAc 8d4s9s9h QsQh6h3d 5h2cKcKd",
      Solver.process("omaha-holdem 2d5cKhTdTh 5h2cKcKd Qc7d4d6s 8d4s9s9h As3sJs8c QsQh6h3d Jd6c7hAc"));
  }

  @Test
  public void test_omaha_holdem_3028_3s6sAsKcTd_Kh7dJs9c_6c4d4cJd_Tc3d8dTs_7h3c7s5h_Qs6dAh5d_Qh2s4hAc_Th5cKsKd_9d2c2hJh() {
    assertEquals(
      "9d2c2hJh 6c4d4cJd 7h3c7s5h Kh7dJs9c Qh2s4hAc Qs6dAh5d Tc3d8dTs Th5cKsKd",
      Solver.process("omaha-holdem 3s6sAsKcTd Kh7dJs9c 6c4d4cJd Tc3d8dTs 7h3c7s5h Qs6dAh5d Qh2s4hAc Th5cKsKd 9d2c2hJh"));
  }

  @Test
  public void test_omaha_holdem_3029_3h7d8cJcKd_4s8hAhJh_2c3d6c3c() {
    assertEquals(
      "4s8hAhJh 2c3d6c3c",
      Solver.process("omaha-holdem 3h7d8cJcKd 4s8hAhJh 2c3d6c3c"));
  }

  @Test
  public void test_omaha_holdem_3030_2c2d4s5dKd_6h4hTh9h_3dJdTd3c_QdAdQc5h_7c3sJsKc_2s3hKsJh_9s9d9c5c() {
    assertEquals(
      "6h4hTh9h 9s9d9c5c 7c3sJsKc 3dJdTd3c QdAdQc5h 2s3hKsJh",
      Solver.process("omaha-holdem 2c2d4s5dKd 6h4hTh9h 3dJdTd3c QdAdQc5h 7c3sJsKc 2s3hKsJh 9s9d9c5c"));
  }

  @Test
  public void test_omaha_holdem_3031_2c3h5sKhTh_5h7h8sJh_5d9hTsTd_Jd2d8hQd_8dAs7c6h_4d4c5c7d_3s9dKsJc_7s2hQs2s() {
    assertEquals(
      "8dAs7c6h Jd2d8hQd 4d4c5c7d 3s9dKsJc 7s2hQs2s 5d9hTsTd 5h7h8sJh",
      Solver.process("omaha-holdem 2c3h5sKhTh 5h7h8sJh 5d9hTsTd Jd2d8hQd 8dAs7c6h 4d4c5c7d 3s9dKsJc 7s2hQs2s"));
  }

  @Test
  public void test_omaha_holdem_3032_2c6h8c8sKh_AhTsAc2d_7dJc6s3d_6d5c7c4d_QsAd9dJs_9s4s3c5d() {
    assertEquals(
      "9s4s3c5d QsAd9dJs 6d5c7c4d 7dJc6s3d AhTsAc2d",
      Solver.process("omaha-holdem 2c6h8c8sKh AhTsAc2d 7dJc6s3d 6d5c7c4d QsAd9dJs 9s4s3c5d"));
  }

  @Test
  public void test_omaha_holdem_3033_7c8hAsKhQc_5cTs9h2h_3sQdAd5d_9cJs8c7s() {
    assertEquals(
      "5cTs9h2h 9cJs8c7s 3sQdAd5d",
      Solver.process("omaha-holdem 7c8hAsKhQc 5cTs9h2h 3sQdAd5d 9cJs8c7s"));
  }

  @Test
  public void test_omaha_holdem_3034_3d5c9dQdTh_3c4c7hKd_2hQh8h8c_Ts8d6sJd_AdTc6h3h_JhJsKcQs_AcAs7d6c_4d5d7c4h_2d9s4s9h_6d5sJc2s() {
    assertEquals(
      "3c4c7hKd 6d5sJc2s 2hQh8h8c AcAs7d6c AdTc6h3h 2d9s4s9h JhJsKcQs 4d5d7c4h Ts8d6sJd",
      Solver.process("omaha-holdem 3d5c9dQdTh 3c4c7hKd 2hQh8h8c Ts8d6sJd AdTc6h3h JhJsKcQs AcAs7d6c 4d5d7c4h 2d9s4s9h 6d5sJc2s"));
  }

  @Test
  public void test_omaha_holdem_3035_2h4c6d9cAs_ThJsQh2s_9d7c8d4d_JcKcJd7d_KhTdTs6h_5h4h5d9s_4sKd5c3d_8c3s3c5s() {
    assertEquals(
      "ThJsQh2s KhTdTs6h JcKcJd7d 5h4h5d9s=9d7c8d4d 4sKd5c3d=8c3s3c5s",
      Solver.process("omaha-holdem 2h4c6d9cAs ThJsQh2s 9d7c8d4d JcKcJd7d KhTdTs6h 5h4h5d9s 4sKd5c3d 8c3s3c5s"));
  }

  @Test
  public void test_omaha_holdem_3036_2h3s7h8hKh_KsTd3cJd_7d2s3d7c_Ts6h5c5h_7sAd2c4s_6d9hAcTc_4dAsJc4c_Th8d8s9c() {
    assertEquals(
      "6d9hAcTc 4dAsJc4c 7sAd2c4s KsTd3cJd 7d2s3d7c Th8d8s9c Ts6h5c5h",
      Solver.process("omaha-holdem 2h3s7h8hKh KsTd3cJd 7d2s3d7c Ts6h5c5h 7sAd2c4s 6d9hAcTc 4dAsJc4c Th8d8s9c"));
  }

  @Test
  public void test_omaha_holdem_3037_2d6sKhQhTc_Qd6d9d5s_4d7h2sQc_Ah8c3hKs_6hAs2cJd() {
    assertEquals(
      "Ah8c3hKs 4d7h2sQc Qd6d9d5s 6hAs2cJd",
      Solver.process("omaha-holdem 2d6sKhQhTc Qd6d9d5s 4d7h2sQc Ah8c3hKs 6hAs2cJd"));
  }

  @Test
  public void test_omaha_holdem_3038_3c6d8c8sQs_AdJsTd2c_Ks2sKd6s_9s5dKhQd_8d4s6hTs_7c8h5h3d_9hKcQc7h_Th6c2d7d_AcJdAs4d_2h3h9d7s() {
    assertEquals(
      "AdJsTd2c 2h3h9d7s Th6c2d7d 9hKcQc7h=9s5dKhQd Ks2sKd6s AcJdAs4d 7c8h5h3d 8d4s6hTs",
      Solver.process("omaha-holdem 3c6d8c8sQs AdJsTd2c Ks2sKd6s 9s5dKhQd 8d4s6hTs 7c8h5h3d 9hKcQc7h Th6c2d7d AcJdAs4d 2h3h9d7s"));
  }

  @Test
  public void test_omaha_holdem_3039_5s6h9dKcTh_7s5cJd5h_Qd8s2h6d_Js2sTd9s_Qh8d7dAs_3h8c6c6s_Kd5d4c4h_4sAdTcAc() {
    assertEquals(
      "Qd8s2h6d 4sAdTcAc Js2sTd9s Kd5d4c4h 7s5cJd5h 3h8c6c6s Qh8d7dAs",
      Solver.process("omaha-holdem 5s6h9dKcTh 7s5cJd5h Qd8s2h6d Js2sTd9s Qh8d7dAs 3h8c6c6s Kd5d4c4h 4sAdTcAc"));
  }

  @Test
  public void test_omaha_holdem_3040_3s5h7c8cQs_5cJh6d6h_8s9hAcJd_3hAs5dKd_QdAd7dQh_5sTsKsTc_2dAh3dJc_Kc4s2h4h_4d9c7h4c() {
    assertEquals(
      "2dAh3dJc Kc4s2h4h 5cJh6d6h 4d9c7h4c 8s9hAcJd 5sTsKsTc 3hAs5dKd QdAd7dQh",
      Solver.process("omaha-holdem 3s5h7c8cQs 5cJh6d6h 8s9hAcJd 3hAs5dKd QdAd7dQh 5sTsKsTc 2dAh3dJc Kc4s2h4h 4d9c7h4c"));
  }

  @Test
  public void test_omaha_holdem_3041_4d9hJcKsTs_4cQh4h8d_6cAcJdJh_5hAdQs7c_Kh7d7h6h_8hQcJs9c_5c6d8c9s_2d7s6s9d() {
    assertEquals(
      "2d7s6s9d 5c6d8c9s Kh7d7h6h 6cAcJdJh 4cQh4h8d 8hQcJs9c 5hAdQs7c",
      Solver.process("omaha-holdem 4d9hJcKsTs 4cQh4h8d 6cAcJdJh 5hAdQs7c Kh7d7h6h 8hQcJs9c 5c6d8c9s 2d7s6s9d"));
  }

  @Test
  public void test_omaha_holdem_3042_5c5dKdKsQd_Ac9hJd8h_3d9d4d3c_AhAd5s4s_4hKh7hKc() {
    assertEquals(
      "Ac9hJd8h AhAd5s4s 3d9d4d3c 4hKh7hKc",
      Solver.process("omaha-holdem 5c5dKdKsQd Ac9hJd8h 3d9d4d3c AhAd5s4s 4hKh7hKc"));
  }

  @Test
  public void test_omaha_holdem_3043_4d7d7h8h9h_Kd8d3c4c_AcThTs5d_Jd3s5c6d_3d4hQd6h_Jc6s5sTc_AsKs5h8c_Kh2cQh9d() {
    assertEquals(
      "Kd8d3c4c AsKs5h8c AcThTs5d Jd3s5c6d Jc6s5sTc 3d4hQd6h Kh2cQh9d",
      Solver.process("omaha-holdem 4d7d7h8h9h Kd8d3c4c AcThTs5d Jd3s5c6d 3d4hQd6h Jc6s5sTc AsKs5h8c Kh2cQh9d"));
  }

  @Test
  public void test_omaha_holdem_3044_2d5s6dJhTd_Js5cAhJc_Qc9sKc4h_4d9dJd3c_6s8h9h3s_TcTsQs7c_8c2c3h7s_8d5hQd8s_As6cAc7h_KhQhKsTh() {
    assertEquals(
      "Qc9sKc4h 8c2c3h7s 6s8h9h3s KhQhKsTh As6cAc7h TcTsQs7c Js5cAhJc 4d9dJd3c 8d5hQd8s",
      Solver.process("omaha-holdem 2d5s6dJhTd Js5cAhJc Qc9sKc4h 4d9dJd3c 6s8h9h3s TcTsQs7c 8c2c3h7s 8d5hQd8s As6cAc7h KhQhKsTh"));
  }

  @Test
  public void test_omaha_holdem_3045_6c9dKcTdTh_Qc5s8d6d_QhAs2s6s() {
    assertEquals(
      "Qc5s8d6d QhAs2s6s",
      Solver.process("omaha-holdem 6c9dKcTdTh Qc5s8d6d QhAs2s6s"));
  }

  @Test
  public void test_omaha_holdem_3046_6c6s7hKcTs_Js4sQs5d_4cKsJhKh_9s8h3h2c_8sJd6d5s_Kd4d2dTh() {
    assertEquals(
      "Js4sQs5d Kd4d2dTh 8sJd6d5s 9s8h3h2c 4cKsJhKh",
      Solver.process("omaha-holdem 6c6s7hKcTs Js4sQs5d 4cKsJhKh 9s8h3h2c 8sJd6d5s Kd4d2dTh"));
  }

  @Test
  public void test_omaha_holdem_3047_6d7c8sKsTh_Kc7hQs3d_Ac5c9d9c_9s2hTd6s_4h2c6cQh_2sQc6hJs_4c9h8hKd_5d5s8d3s_TcTsJh7s_4d4sAd5h() {
    assertEquals(
      "2sQc6hJs=4h2c6cQh 5d5s8d3s Kc7hQs3d TcTsJh7s 4d4sAd5h Ac5c9d9c 4c9h8hKd=9s2hTd6s",
      Solver.process("omaha-holdem 6d7c8sKsTh Kc7hQs3d Ac5c9d9c 9s2hTd6s 4h2c6cQh 2sQc6hJs 4c9h8hKd 5d5s8d3s TcTsJh7s 4d4sAd5h"));
  }

  @Test
  public void test_omaha_holdem_3048_4d5d5h8s9h_JhJcAh3s_6c2h5sKc_7dQcQdJd_9sKs2s8d_KhAs3c5c() {
    assertEquals(
      "9sKs2s8d JhJcAh3s 7dQcQdJd 6c2h5sKc KhAs3c5c",
      Solver.process("omaha-holdem 4d5d5h8s9h JhJcAh3s 6c2h5sKc 7dQcQdJd 9sKs2s8d KhAs3c5c"));
  }

  @Test
  public void test_omaha_holdem_3049_3c6d8c8h9d_4s8s5hTs_Th3dTc8d_Ad9hTd5d_6h6c3s7d_9sQdJh5c_4h6sJcAc_JdKc9c2s_Qh7h2c2h() {
    assertEquals(
      "Qh7h2c2h 4h6sJcAc 9sQdJh5c JdKc9c2s Ad9hTd5d 4s8s5hTs 6h6c3s7d Th3dTc8d",
      Solver.process("omaha-holdem 3c6d8c8h9d 4s8s5hTs Th3dTc8d Ad9hTd5d 6h6c3s7d 9sQdJh5c 4h6sJcAc JdKc9c2s Qh7h2c2h"));
  }

  @Test
  public void test_omaha_holdem_3050_3c6h9sJcTd_Jd7h9c7s_Tc3hTsQd_2s5hAcKs_6dKc5c9d_QhTh5sKh_4sKd3d8d_3s6c2c8s() {
    assertEquals(
      "2s5hAcKs 4sKd3d8d 3s6c2c8s 6dKc5c9d Jd7h9c7s Tc3hTsQd QhTh5sKh",
      Solver.process("omaha-holdem 3c6h9sJcTd Jd7h9c7s Tc3hTsQd 2s5hAcKs 6dKc5c9d QhTh5sKh 4sKd3d8d 3s6c2c8s"));
  }

  @Test
  public void test_omaha_holdem_3051_2s8h8sQcTh_Qs6c7d9c_3h3sKs8c_JhTs4sTd_Kd8dAs6d_Js9s9hJd() {
    assertEquals(
      "Qs6c7d9c 3h3sKs8c Kd8dAs6d Js9s9hJd JhTs4sTd",
      Solver.process("omaha-holdem 2s8h8sQcTh Qs6c7d9c 3h3sKs8c JhTs4sTd Kd8dAs6d Js9s9hJd"));
  }

  @Test
  public void test_omaha_holdem_3052_2h5c9hKhTc_Qd8hAh8d_6c4s8c5h() {
    assertEquals(
      "6c4s8c5h Qd8hAh8d",
      Solver.process("omaha-holdem 2h5c9hKhTc Qd8hAh8d 6c4s8c5h"));
  }

  @Test
  public void test_omaha_holdem_3053_3c3d7dAcTc_4dKs5d2c_Qh8d8hTh_JsQsAd9h_2d4hTdKc() {
    assertEquals(
      "4dKs5d2c Qh8d8hTh 2d4hTdKc JsQsAd9h",
      Solver.process("omaha-holdem 3c3d7dAcTc 4dKs5d2c Qh8d8hTh JsQsAd9h 2d4hTdKc"));
  }

  @Test
  public void test_omaha_holdem_3054_3c3d5hKhQd_9sKc7s9h_Js8h2cKs_TcQcJh2h_4c6c8c4h_7h4sKdTd_7d5d4d9c_As6d5c9d() {
    assertEquals(
      "4c6c8c4h 7d5d4d9c As6d5c9d TcQcJh2h 9sKc7s9h 7h4sKdTd Js8h2cKs",
      Solver.process("omaha-holdem 3c3d5hKhQd 9sKc7s9h Js8h2cKs TcQcJh2h 4c6c8c4h 7h4sKdTd 7d5d4d9c As6d5c9d"));
  }

  @Test
  public void test_omaha_holdem_3055_3d5d6c6sKc_9dKsJcJs_Jh4dKhJd() {
    assertEquals(
      "9dKsJcJs=Jh4dKhJd",
      Solver.process("omaha-holdem 3d5d6c6sKc 9dKsJcJs Jh4dKhJd"));
  }

  @Test
  public void test_omaha_holdem_3056_3c3dKcQhTc_4cQd8sAs_Jh8h7d7h_QcTh9d6c_Td5hAc8d_AdAh4d2d_9h4s7cJc_4h6hKs3h() {
    assertEquals(
      "Jh8h7d7h Td5hAc8d 4cQd8sAs AdAh4d2d 9h4s7cJc QcTh9d6c 4h6hKs3h",
      Solver.process("omaha-holdem 3c3dKcQhTc 4cQd8sAs Jh8h7d7h QcTh9d6c Td5hAc8d AdAh4d2d 9h4s7cJc 4h6hKs3h"));
  }

  @Test
  public void test_omaha_holdem_3057_2s6c9sJsQc_6sQh7dJd_As8s5s3h_6h2c2h8h_9c9d4c8c_KcTs5c2d_TdTc6d7h_4s3d3s4d_KdJhThAd() {
    assertEquals(
      "TdTc6d7h 6sQh7dJd 6h2c2h8h 9c9d4c8c KcTs5c2d=KdJhThAd 4s3d3s4d As8s5s3h",
      Solver.process("omaha-holdem 2s6c9sJsQc 6sQh7dJd As8s5s3h 6h2c2h8h 9c9d4c8c KcTs5c2d TdTc6d7h 4s3d3s4d KdJhThAd"));
  }

  @Test
  public void test_omaha_holdem_3058_5h5s6sJdTc_8h2s5cKh_JcQd9sQh_4c4d7h3s_Kc6h3dKs_As6c8c2c() {
    assertEquals(
      "4c4d7h3s As6c8c2c JcQd9sQh Kc6h3dKs 8h2s5cKh",
      Solver.process("omaha-holdem 5h5s6sJdTc 8h2s5cKh JcQd9sQh 4c4d7h3s Kc6h3dKs As6c8c2c"));
  }

  @Test
  public void test_omaha_holdem_3059_5d7dAdQsTd_2s9dKh8c_7sAc5h3c_3d4sQcJh_Kd4d9h3s() {
    assertEquals(
      "2s9dKh8c 3d4sQcJh 7sAc5h3c Kd4d9h3s",
      Solver.process("omaha-holdem 5d7dAdQsTd 2s9dKh8c 7sAc5h3c 3d4sQcJh Kd4d9h3s"));
  }

  @Test
  public void test_omaha_holdem_3060_6s8dJcQcTs_8s5h6dQh_2cAc7h9c_7d3s9dTh_Jd5c4s4h_Jh3cAhTc_6h7s7cKh_6c8h5dKs_Qs2sAsKd() {
    assertEquals(
      "6h7s7cKh Jd5c4s4h 6c8h5dKs Jh3cAhTc 8s5h6dQh 2cAc7h9c 7d3s9dTh Qs2sAsKd",
      Solver.process("omaha-holdem 6s8dJcQcTs 8s5h6dQh 2cAc7h9c 7d3s9dTh Jd5c4s4h Jh3cAhTc 6h7s7cKh 6c8h5dKs Qs2sAsKd"));
  }

  @Test
  public void test_omaha_holdem_3061_5s7s9hKdTd_5dAhTc2c_4c3dJh3s() {
    assertEquals(
      "4c3dJh3s 5dAhTc2c",
      Solver.process("omaha-holdem 5s7s9hKdTd 5dAhTc2c 4c3dJh3s"));
  }

  @Test
  public void test_omaha_holdem_3062_5c6sAcKsQd_2s8h6d7h_3d5hJdTc_Ad8c3s7d_2d6c6hJh() {
    assertEquals(
      "2s8h6d7h Ad8c3s7d 2d6c6hJh 3d5hJdTc",
      Solver.process("omaha-holdem 5c6sAcKsQd 2s8h6d7h 3d5hJdTc Ad8c3s7d 2d6c6hJh"));
  }

  @Test
  public void test_omaha_holdem_3063_5c5s6d7h9c_Qd2dAcJs_2hJdTd6h() {
    assertEquals(
      "Qd2dAcJs 2hJdTd6h",
      Solver.process("omaha-holdem 5c5s6d7h9c Qd2dAcJs 2hJdTd6h"));
  }

  @Test
  public void test_omaha_holdem_3064_2c4h5c6d9d_Kd6s2d7s_4sTh4d7c_8hKs6c8s_Qd8cKhKc_Jd3h2sAs_5dJs8dAd_JhJcQh9h_AhTc9sQs_TsQc6h3c() {
    assertEquals(
      "5dJs8dAd 8hKs6c8s AhTc9sQs JhJcQh9h Qd8cKhKc Kd6s2d7s 4sTh4d7c Jd3h2sAs=TsQc6h3c",
      Solver.process("omaha-holdem 2c4h5c6d9d Kd6s2d7s 4sTh4d7c 8hKs6c8s Qd8cKhKc Jd3h2sAs 5dJs8dAd JhJcQh9h AhTc9sQs TsQc6h3c"));
  }

  @Test
  public void test_omaha_holdem_3065_7c7hKdTcTs_6d6hQc3d_3s6s4sJs() {
    assertEquals(
      "3s6s4sJs 6d6hQc3d",
      Solver.process("omaha-holdem 7c7hKdTcTs 6d6hQc3d 3s6s4sJs"));
  }

  @Test
  public void test_omaha_holdem_3066_3d3s5h9d9h_7h4s6d8h_7d9sJhQh_Th6hAc4d() {
    assertEquals(
      "7h4s6d8h Th6hAc4d 7d9sJhQh",
      Solver.process("omaha-holdem 3d3s5h9d9h 7h4s6d8h 7d9sJhQh Th6hAc4d"));
  }

  @Test
  public void test_omaha_holdem_3067_2d2h3s5d9c_8d6h8hAd_7s8c7c4s_5h4h5c6c_Qc4c2c9s_9d2sKhJs() {
    assertEquals(
      "7s8c7c4s 8d6h8hAd 9d2sKhJs=Qc4c2c9s 5h4h5c6c",
      Solver.process("omaha-holdem 2d2h3s5d9c 8d6h8hAd 7s8c7c4s 5h4h5c6c Qc4c2c9s 9d2sKhJs"));
  }

  @Test
  public void test_omaha_holdem_3068_2h3c6sAcQs_3sAdJcKc_Td8c9c6h_Ah2s2cQc_9s2d8hJd_Js3h5s5h_5d4c6c8s() {
    assertEquals(
      "9s2d8hJd Js3h5s5h Td8c9c6h 3sAdJcKc Ah2s2cQc 5d4c6c8s",
      Solver.process("omaha-holdem 2h3c6sAcQs 3sAdJcKc Td8c9c6h Ah2s2cQc 9s2d8hJd Js3h5s5h 5d4c6c8s"));
  }

  @Test
  public void test_omaha_holdem_3069_4s8dJdJhQs_6cAdTh7h_As4hQd2c() {
    assertEquals(
      "6cAdTh7h As4hQd2c",
      Solver.process("omaha-holdem 4s8dJdJhQs 6cAdTh7h As4hQd2c"));
  }

  @Test
  public void test_omaha_holdem_3070_2d5d6c6dAs_Ts5sAh4s_Kh7s6h8d_Js7h8s6s_3dQd4d9h() {
    assertEquals(
      "Ts5sAh4s Js7h8s6s Kh7s6h8d 3dQd4d9h",
      Solver.process("omaha-holdem 2d5d6c6dAs Ts5sAh4s Kh7s6h8d Js7h8s6s 3dQd4d9h"));
  }

  @Test
  public void test_omaha_holdem_3071_5h9dAdJsTc_Ac7c3d8c_8h4c8d2c_9sKs6c2h_Th5dKc6d_KhJc6h7d_4sTs6s4h_Jd4d5cAs_QhQd8sAh() {
    assertEquals(
      "8h4c8d2c 9sKs6c2h 4sTs6s4h KhJc6h7d Th5dKc6d Jd4d5cAs Ac7c3d8c QhQd8sAh",
      Solver.process("omaha-holdem 5h9dAdJsTc Ac7c3d8c 8h4c8d2c 9sKs6c2h Th5dKc6d KhJc6h7d 4sTs6s4h Jd4d5cAs QhQd8sAh"));
  }

  @Test
  public void test_omaha_holdem_3072_5c7hJdKdKs_4dJhTh7c_9hAhKc8s_Qc6s9dJc() {
    assertEquals(
      "4dJhTh7c Qc6s9dJc 9hAhKc8s",
      Solver.process("omaha-holdem 5c7hJdKdKs 4dJhTh7c 9hAhKc8s Qc6s9dJc"));
  }

  @Test
  public void test_omaha_holdem_3073_4s9dAdAhQd_Js9cKc5d_TdTcKd9h_6dAs6c3c() {
    assertEquals(
      "Js9cKc5d 6dAs6c3c TdTcKd9h",
      Solver.process("omaha-holdem 4s9dAdAhQd Js9cKc5d TdTcKd9h 6dAs6c3c"));
  }

  @Test
  public void test_omaha_holdem_3074_7d8dAhJsQh_QsQd2d9h_Kc7hKd6c_9c3s5d4s_9d2c5c6d_3c3d6sJh_TcTs7sTd_AdTh2s4d_Jc2hKsKh_6h4c9s8c() {
    assertEquals(
      "9c3s5d4s 9d2c5c6d 6h4c9s8c TcTs7sTd 3c3d6sJh Jc2hKsKh=Kc7hKd6c AdTh2s4d QsQd2d9h",
      Solver.process("omaha-holdem 7d8dAhJsQh QsQd2d9h Kc7hKd6c 9c3s5d4s 9d2c5c6d 3c3d6sJh TcTs7sTd AdTh2s4d Jc2hKsKh 6h4c9s8c"));
  }

  @Test
  public void test_omaha_holdem_3075_5h6h8sKdKh_Th7hTsQc_4h8hAsJc_6d5d3d9c_Qh7sQs6s() {
    assertEquals(
      "6d5d3d9c Qh7sQs6s 4h8hAsJc Th7hTsQc",
      Solver.process("omaha-holdem 5h6h8sKdKh Th7hTsQc 4h8hAsJc 6d5d3d9c Qh7sQs6s"));
  }

  @Test
  public void test_omaha_holdem_3076_4d8dAcAsTh_5d6h4s2s_KcTcQs6c_8sKdQh7d_2h4cAdJh_6d4h9cJc() {
    assertEquals(
      "5d6h4s2s 6d4h9cJc 8sKdQh7d KcTcQs6c 2h4cAdJh",
      Solver.process("omaha-holdem 4d8dAcAsTh 5d6h4s2s KcTcQs6c 8sKdQh7d 2h4cAdJh 6d4h9cJc"));
  }

  @Test
  public void test_omaha_holdem_3077_6h7h8c8dQc_AcThKcQh_6s2c4s4d_Kh9s3s9h_Ts5cAhKs_8s3c6d4h() {
    assertEquals(
      "Ts5cAhKs 6s2c4s4d Kh9s3s9h AcThKcQh 8s3c6d4h",
      Solver.process("omaha-holdem 6h7h8c8dQc AcThKcQh 6s2c4s4d Kh9s3s9h Ts5cAhKs 8s3c6d4h"));
  }

  @Test
  public void test_omaha_holdem_3078_2c5s6h8h9c_4c3sQhQc_7d7s9h6s() {
    assertEquals(
      "4c3sQhQc 7d7s9h6s",
      Solver.process("omaha-holdem 2c5s6h8h9c 4c3sQhQc 7d7s9h6s"));
  }

  @Test
  public void test_omaha_holdem_3079_4h9sAcAhJd_Ad6sTc9h_7c9c3sTd_8d5c6h7s_5s2h7d3c_4c2cKhJh_Qs7h4s2d_Ts8cJcKs_8s6d5h5d_QcTh8h2s() {
    assertEquals(
      "5s2h7d3c 8d5c6h7s QcTh8h2s Qs7h4s2d 8s6d5h5d 7c9c3sTd 4c2cKhJh=Ts8cJcKs Ad6sTc9h",
      Solver.process("omaha-holdem 4h9sAcAhJd Ad6sTc9h 7c9c3sTd 8d5c6h7s 5s2h7d3c 4c2cKhJh Qs7h4s2d Ts8cJcKs 8s6d5h5d QcTh8h2s"));
  }

  @Test
  public void test_omaha_holdem_3080_4c4h7hAhJh_6d5hKhKs_6h7d8h3s_Jd8d3hAd_9sQcKd7s() {
    assertEquals(
      "9sQcKd7s Jd8d3hAd 6h7d8h3s 6d5hKhKs",
      Solver.process("omaha-holdem 4c4h7hAhJh 6d5hKhKs 6h7d8h3s Jd8d3hAd 9sQcKd7s"));
  }

  @Test
  public void test_omaha_holdem_3081_2h3s5s7hAd_6c9d7c9c_JdKsJsKc() {
    assertEquals(
      "6c9d7c9c JdKsJsKc",
      Solver.process("omaha-holdem 2h3s5s7hAd 6c9d7c9c JdKsJsKc"));
  }

  @Test
  public void test_omaha_holdem_3082_3d6d8hKcQs_8d7s9c3s_AhAc6h4s_7dAdJsQd_7c5cTsKd() {
    assertEquals(
      "7dAdJsQd 7c5cTsKd AhAc6h4s 8d7s9c3s",
      Solver.process("omaha-holdem 3d6d8hKcQs 8d7s9c3s AhAc6h4s 7dAdJsQd 7c5cTsKd"));
  }

  @Test
  public void test_omaha_holdem_3083_3c4h6c6h9c_4sKh7d2s_8sQs3d8h_Th4d8cQh_6d9sAhQd_AdAs3h2c_7h3sAcKd_Ts4cQc9h() {
    assertEquals(
      "7h3sAcKd Th4d8cQh 4sKh7d2s 8sQs3d8h AdAs3h2c Ts4cQc9h 6d9sAhQd",
      Solver.process("omaha-holdem 3c4h6c6h9c 4sKh7d2s 8sQs3d8h Th4d8cQh 6d9sAhQd AdAs3h2c 7h3sAcKd Ts4cQc9h"));
  }

  @Test
  public void test_omaha_holdem_3084_2c4s5c9hKd_KcAhQd3c_Jd7d6h4h_8hTd9dJs_AcTs2hQc_Tc3sKs8d_AsKh9sAd_5s7h6c6d_Jh6sQs7s() {
    assertEquals(
      "Jh6sQs7s AcTs2hQc Jd7d6h4h 5s7h6c6d 8hTd9dJs Tc3sKs8d AsKh9sAd KcAhQd3c",
      Solver.process("omaha-holdem 2c4s5c9hKd KcAhQd3c Jd7d6h4h 8hTd9dJs AcTs2hQc Tc3sKs8d AsKh9sAd 5s7h6c6d Jh6sQs7s"));
  }

  @Test
  public void test_omaha_holdem_3085_2h7s9d9hKc_Ks7hAh3d_3hQs5h5d() {
    assertEquals(
      "3hQs5h5d Ks7hAh3d",
      Solver.process("omaha-holdem 2h7s9d9hKc Ks7hAh3d 3hQs5h5d"));
  }

  @Test
  public void test_omaha_holdem_3086_3h4d6c9dJh_4s8dAd7s_7dQd8hQs_Td2d6sTs_2sTcAs5d_QcJd9c2h_7hTh3d7c_4h9h9sKh_Ac6dJs5h_Kc8cAh4c() {
    assertEquals(
      "4s8dAd7s=Kc8cAh4c 7hTh3d7c Td2d6sTs 7dQd8hQs Ac6dJs5h QcJd9c2h 4h9h9sKh 2sTcAs5d",
      Solver.process("omaha-holdem 3h4d6c9dJh 4s8dAd7s 7dQd8hQs Td2d6sTs 2sTcAs5d QcJd9c2h 7hTh3d7c 4h9h9sKh Ac6dJs5h Kc8cAh4c"));
  }

  @Test
  public void test_omaha_holdem_3087_2h3c7cAdTd_6dAsAh6c_6s7s3d4d_Ks8s8dQh_4h9dQsKh_TcJcKd5c_9hJd5h6h_8cQd3h2s() {
    assertEquals(
      "9hJd5h6h 4h9dQsKh Ks8s8dQh TcJcKd5c 8cQd3h2s 6s7s3d4d 6dAsAh6c",
      Solver.process("omaha-holdem 2h3c7cAdTd 6dAsAh6c 6s7s3d4d Ks8s8dQh 4h9dQsKh TcJcKd5c 9hJd5h6h 8cQd3h2s"));
  }

  @Test
  public void test_omaha_holdem_3088_4c6d7cJdJs_QdTd5s3s_3d8hAhKc_2d9cTc4d_5h6cAc8s() {
    assertEquals(
      "3d8hAhKc 2d9cTc4d QdTd5s3s 5h6cAc8s",
      Solver.process("omaha-holdem 4c6d7cJdJs QdTd5s3s 3d8hAhKc 2d9cTc4d 5h6cAc8s"));
  }

  @Test
  public void test_omaha_holdem_3089_5c5d9cJcTc_Ac5s4s3d_6d3hJhKs_3cQh2h7h_AsAhTs9h_9s9d7dTd_8s7s4hAd() {
    assertEquals(
      "3cQh2h7h 6d3hJhKs AsAhTs9h Ac5s4s3d 8s7s4hAd 9s9d7dTd",
      Solver.process("omaha-holdem 5c5d9cJcTc Ac5s4s3d 6d3hJhKs 3cQh2h7h AsAhTs9h 9s9d7dTd 8s7s4hAd"));
  }

  @Test
  public void test_omaha_holdem_3090_2d4h6h6sKd_Ts3s2s4c_Js9s2h7h() {
    assertEquals(
      "Js9s2h7h Ts3s2s4c",
      Solver.process("omaha-holdem 2d4h6h6sKd Ts3s2s4c Js9s2h7h"));
  }

  @Test
  public void test_omaha_holdem_3091_3h4h5hKcQh_3d5d2dQs_7s2c9c2s_JcAdJh3c_2h8c9d4s_9s6c5s6s_6dKsTd7d() {
    assertEquals(
      "7s2c9c2s 2h8c9d4s 9s6c5s6s JcAdJh3c 3d5d2dQs 6dKsTd7d",
      Solver.process("omaha-holdem 3h4h5hKcQh 3d5d2dQs 7s2c9c2s JcAdJh3c 2h8c9d4s 9s6c5s6s 6dKsTd7d"));
  }

  @Test
  public void test_omaha_holdem_3092_4h5c6d7cJc_JhTh4cKs_Tc3c2sAs_2hAd6h7h_5h8s9d5d_2c3h6cKd_9h9cQdKh_7dQc8hKc_Ah5sJd2d_4dQh7s9s() {
    assertEquals(
      "9h9cQdKh 4dQh7s9s 2hAd6h7h JhTh4cKs Ah5sJd2d 5h8s9d5d 2c3h6cKd Tc3c2sAs 7dQc8hKc",
      Solver.process("omaha-holdem 4h5c6d7cJc JhTh4cKs Tc3c2sAs 2hAd6h7h 5h8s9d5d 2c3h6cKd 9h9cQdKh 7dQc8hKc Ah5sJd2d 4dQh7s9s"));
  }

  @Test
  public void test_omaha_holdem_3093_2c5d9hQdTh_8c7h5sJd_Qc9c3hKd_QsJh8d9d_Ah8hTs7c_6s4cKc9s_4h3s2h5c_QhKs4s2d_3dTdTcAs() {
    assertEquals(
      "6s4cKc9s Ah8hTs7c 4h3s2h5c QhKs4s2d Qc9c3hKd 3dTdTcAs 8c7h5sJd=QsJh8d9d",
      Solver.process("omaha-holdem 2c5d9hQdTh 8c7h5sJd Qc9c3hKd QsJh8d9d Ah8hTs7c 6s4cKc9s 4h3s2h5c QhKs4s2d 3dTdTcAs"));
  }

  @Test
  public void test_omaha_holdem_3094_2d7h9dQcTs_Ah7s3cTh_4sTdAdKc_4h2s7d3s_Qd5c3d4d_5s3h7c9h_Qh9sJcKh() {
    assertEquals(
      "4sTdAdKc Qd5c3d4d 4h2s7d3s 5s3h7c9h Ah7s3cTh Qh9sJcKh",
      Solver.process("omaha-holdem 2d7h9dQcTs Ah7s3cTh 4sTdAdKc 4h2s7d3s Qd5c3d4d 5s3h7c9h Qh9sJcKh"));
  }

  @Test
  public void test_omaha_holdem_3095_3c3d4hJsQh_9cTd3s9s_Ks5s4dQd_Kd8hAh6d_4s7cJc7d_5d8cAc7h_KcTc9h2d_JdJh8sQc_2sKh5hAd_As6s7s6h() {
    assertEquals(
      "KcTc9h2d 5d8cAc7h 2sKh5hAd=Kd8hAh6d As6s7s6h 4s7cJc7d Ks5s4dQd 9cTd3s9s JdJh8sQc",
      Solver.process("omaha-holdem 3c3d4hJsQh 9cTd3s9s Ks5s4dQd Kd8hAh6d 4s7cJc7d 5d8cAc7h KcTc9h2d JdJh8sQc 2sKh5hAd As6s7s6h"));
  }

  @Test
  public void test_omaha_holdem_3096_2d4h5h8sQh_Jd8hQdJh_Ts2s7h3c_3sQsAh3d_3h7c6sAd_5d4cJsKd_7dQcAsTh() {
    assertEquals(
      "Ts2s7h3c 7dQcAsTh 5d4cJsKd 3sQsAh3d 3h7c6sAd Jd8hQdJh",
      Solver.process("omaha-holdem 2d4h5h8sQh Jd8hQdJh Ts2s7h3c 3sQsAh3d 3h7c6sAd 5d4cJsKd 7dQcAsTh"));
  }

  @Test
  public void test_omaha_holdem_3097_AcJcKsQcQd_9h5h9d7s_8h5sQh6d() {
    assertEquals(
      "9h5h9d7s 8h5sQh6d",
      Solver.process("omaha-holdem AcJcKsQcQd 9h5h9d7s 8h5sQh6d"));
  }

  @Test
  public void test_omaha_holdem_3098_5s6hKcQcQs_7hQh6d4d_Ah2cJs2d_3sKhTdJh_Jd8dTh8h() {
    assertEquals(
      "Ah2cJs2d Jd8dTh8h 3sKhTdJh 7hQh6d4d",
      Solver.process("omaha-holdem 5s6hKcQcQs 7hQh6d4d Ah2cJs2d 3sKhTdJh Jd8dTh8h"));
  }

  @Test
  public void test_omaha_holdem_3099_3d5c7sAhKh_6s4c8hJc_4d6dAc9c() {
    assertEquals(
      "4d6dAc9c=6s4c8hJc",
      Solver.process("omaha-holdem 3d5c7sAhKh 6s4c8hJc 4d6dAc9c"));
  }

  @Test
  public void test_omaha_holdem_3100_3c4s5c7hTs_9s3h6sJh_4hTd6d8s_As8cQd5d_8dAc7cJc_QcQsJs8h() {
    assertEquals(
      "As8cQd5d 8dAc7cJc QcQsJs8h 9s3h6sJh 4hTd6d8s",
      Solver.process("omaha-holdem 3c4s5c7hTs 9s3h6sJh 4hTd6d8s As8cQd5d 8dAc7cJc QcQsJs8h"));
  }

  @Test
  public void test_omaha_holdem_3101_2c7dKdKhTd_Js4d9s8d_4sAcTh3d() {
    assertEquals(
      "4sAcTh3d Js4d9s8d",
      Solver.process("omaha-holdem 2c7dKdKhTd Js4d9s8d 4sAcTh3d"));
  }

  @Test
  public void test_omaha_holdem_3102_3c3dAsJdQh_Qs8d6d4s_2hKd6h5c_KsTh5sJs_8hQc3sJc_Tc4dAh5d_QdAdKhTd_8c3h9hTs() {
    assertEquals(
      "2hKd6h5c Qs8d6d4s Tc4dAh5d 8c3h9hTs KsTh5sJs=QdAdKhTd 8hQc3sJc",
      Solver.process("omaha-holdem 3c3dAsJdQh Qs8d6d4s 2hKd6h5c KsTh5sJs 8hQc3sJc Tc4dAh5d QdAdKhTd 8c3h9hTs"));
  }

  @Test
  public void test_omaha_holdem_3103_6s7cAcAdJd_2hTh7hQs_6d8h7d3h_Jc3d6hJs_Kc8s4hTs_5c9c2c3c_5hTcAhAs_Kd6cTd4s() {
    assertEquals(
      "5c9c2c3c Kc8s4hTs Kd6cTd4s 6d8h7d3h 2hTh7hQs Jc3d6hJs 5hTcAhAs",
      Solver.process("omaha-holdem 6s7cAcAdJd 2hTh7hQs 6d8h7d3h Jc3d6hJs Kc8s4hTs 5c9c2c3c 5hTcAhAs Kd6cTd4s"));
  }

  @Test
  public void test_omaha_holdem_3104_3h5s8dQcQh_8c6d5hAc_7c2sJhTs_7h9s9c5c() {
    assertEquals(
      "7c2sJhTs 8c6d5hAc 7h9s9c5c",
      Solver.process("omaha-holdem 3h5s8dQcQh 8c6d5hAc 7c2sJhTs 7h9s9c5c"));
  }

  @Test
  public void test_omaha_holdem_3105_2s3c3d7hJh_4s6dJcAd_7sKc5cQd_Kd8c3h2d() {
    assertEquals(
      "7sKc5cQd 4s6dJcAd Kd8c3h2d",
      Solver.process("omaha-holdem 2s3c3d7hJh 4s6dJcAd 7sKc5cQd Kd8c3h2d"));
  }

  @Test
  public void test_omaha_holdem_3106_2h6c6s7h7s_6dJsAhJh_Td9h7d4h_9d2d8hJd() {
    assertEquals(
      "9d2d8hJd 6dJsAhJh Td9h7d4h",
      Solver.process("omaha-holdem 2h6c6s7h7s 6dJsAhJh Td9h7d4h 9d2d8hJd"));
  }

  @Test
  public void test_omaha_holdem_3107_2s4c5sTcTd_Th3s9cJs_9sQcKdKh_3h2h3dAs_8d8s9dQs_3cTs2d7h_6s6h7s2c_5dAd5hJc() {
    assertEquals(
      "6s6h7s2c 8d8s9dQs 9sQcKdKh Th3s9cJs 3h2h3dAs 5dAd5hJc 3cTs2d7h",
      Solver.process("omaha-holdem 2s4c5sTcTd Th3s9cJs 9sQcKdKh 3h2h3dAs 8d8s9dQs 3cTs2d7h 6s6h7s2c 5dAd5hJc"));
  }

  @Test
  public void test_omaha_holdem_3108_4d5h7d8cAs_AdJh2c2d_7hQs7cQh_4hKdQd9d() {
    assertEquals(
      "4hKdQd9d AdJh2c2d 7hQs7cQh",
      Solver.process("omaha-holdem 4d5h7d8cAs AdJh2c2d 7hQs7cQh 4hKdQd9d"));
  }

  @Test
  public void test_omaha_holdem_3109_8c9cAcQhQs_7hQd6c6h_KhTh3d8d_3c4d7c9s_Ad2h2sAh() {
    assertEquals(
      "KhTh3d8d 7hQd6c6h 3c4d7c9s Ad2h2sAh",
      Solver.process("omaha-holdem 8c9cAcQhQs 7hQd6c6h KhTh3d8d 3c4d7c9s Ad2h2sAh"));
  }

  @Test
  public void test_omaha_holdem_3110_5c8d8hAhKs_7d2c6h5h_Ac8cQh3s_6d2dQs4h_6cTcKh5d_Jc3c9c3h_JhAsQd8s() {
    assertEquals(
      "6d2dQs4h Jc3c9c3h 7d2c6h5h 6cTcKh5d Ac8cQh3s=JhAsQd8s",
      Solver.process("omaha-holdem 5c8d8hAhKs 7d2c6h5h Ac8cQh3s 6d2dQs4h 6cTcKh5d Jc3c9c3h JhAsQd8s"));
  }

  @Test
  public void test_omaha_holdem_3111_4c6hJsKcTs_4h3d4d4s_9hKh7cTc_8cKd5d9d_2dAc7s3c_3s5c5s2c_7d5hJhQc_6dAd9c9s() {
    assertEquals(
      "2dAc7s3c 3s5c5s2c 6dAd9c9s 7d5hJhQc 8cKd5d9d 9hKh7cTc 4h3d4d4s",
      Solver.process("omaha-holdem 4c6hJsKcTs 4h3d4d4s 9hKh7cTc 8cKd5d9d 2dAc7s3c 3s5c5s2c 7d5hJhQc 6dAd9c9s"));
  }

  @Test
  public void test_omaha_holdem_3112_4h5c6dQdQs_2d6c7cJd_2h9cKc8h() {
    assertEquals(
      "2h9cKc8h 2d6c7cJd",
      Solver.process("omaha-holdem 4h5c6dQdQs 2d6c7cJd 2h9cKc8h"));
  }

  @Test
  public void test_omaha_holdem_3113_2d4c5dAcKd_3h7d7hJh_Qd9c8dTc_Ah6hKcAs_2s6c5s8s_8hKh2c4h() {
    assertEquals(
      "3h7d7hJh 2s6c5s8s 8hKh2c4h Ah6hKcAs Qd9c8dTc",
      Solver.process("omaha-holdem 2d4c5dAcKd 3h7d7hJh Qd9c8dTc Ah6hKcAs 2s6c5s8s 8hKh2c4h"));
  }

  @Test
  public void test_omaha_holdem_3114_2s9dAhQdTs_5s4dAs6s_6d5cQcJd() {
    assertEquals(
      "6d5cQcJd 5s4dAs6s",
      Solver.process("omaha-holdem 2s9dAhQdTs 5s4dAs6s 6d5cQcJd"));
  }

  @Test
  public void test_omaha_holdem_3115_2h5c6sKdQs_9h4d8c9d_5dQc8hTh_9s2sAcTs_QdAdAhQh_2dJhTc5h_3h3c6dKc_4h8dJs7s() {
    assertEquals(
      "4h8dJs7s 9s2sAcTs 9h4d8c9d 2dJhTc5h 5dQc8hTh 3h3c6dKc QdAdAhQh",
      Solver.process("omaha-holdem 2h5c6sKdQs 9h4d8c9d 5dQc8hTh 9s2sAcTs QdAdAhQh 2dJhTc5h 3h3c6dKc 4h8dJs7s"));
  }

  @Test
  public void test_omaha_holdem_3116_2c5h6c7sJh_4s8dJs5s_3c6h3sTc_JcThAdKh() {
    assertEquals(
      "3c6h3sTc JcThAdKh 4s8dJs5s",
      Solver.process("omaha-holdem 2c5h6c7sJh 4s8dJs5s 3c6h3sTc JcThAdKh"));
  }

  @Test
  public void test_omaha_holdem_3117_2c6c7d9cKh_JcQh2h3c_QdAsQcAd_4hJs7c4s_QsAh5s9h_8hTc2sTs_Th6h9sJh_8c4c7s4d_Ac5h6dKs() {
    assertEquals(
      "4hJs7c4s QsAh5s9h QdAsQcAd Th6h9sJh Ac5h6dKs 8hTc2sTs 8c4c7s4d JcQh2h3c",
      Solver.process("omaha-holdem 2c6c7d9cKh JcQh2h3c QdAsQcAd 4hJs7c4s QsAh5s9h 8hTc2sTs Th6h9sJh 8c4c7s4d Ac5h6dKs"));
  }

  @Test
  public void test_omaha_holdem_3118_4h5s7h9dTs_6h2c7c2s_Td3d8h6c_Ac8c3h7s_KhTc2dAh_8sAsKd3c_JdAdQs9h_9cKsQd4s_6s3s4d4c_5d6dTh5c() {
    assertEquals(
      "8sAsKd3c 6h2c7c2s Ac8c3h7s JdAdQs9h KhTc2dAh 9cKsQd4s 5d6dTh5c 6s3s4d4c Td3d8h6c",
      Solver.process("omaha-holdem 4h5s7h9dTs 6h2c7c2s Td3d8h6c Ac8c3h7s KhTc2dAh 8sAsKd3c JdAdQs9h 9cKsQd4s 6s3s4d4c 5d6dTh5c"));
  }

  @Test
  public void test_omaha_holdem_3119_2c4sJdJhQh_TcQsTh8h_KhTs4c7s_Ks2h6d8s_2dAc3h8c_6hQc9d5c_As2s7h6c_8dAdAh5s() {
    assertEquals(
      "Ks2h6d8s 2dAc3h8c=As2s7h6c KhTs4c7s 6hQc9d5c TcQsTh8h 8dAdAh5s",
      Solver.process("omaha-holdem 2c4sJdJhQh TcQsTh8h KhTs4c7s Ks2h6d8s 2dAc3h8c 6hQc9d5c As2s7h6c 8dAdAh5s"));
  }

  @Test
  public void test_omaha_holdem_3120_4s5c7cAsJd_AdKd8d8s_Qd5s8h9h_5dAhTd3d() {
    assertEquals(
      "Qd5s8h9h AdKd8d8s 5dAhTd3d",
      Solver.process("omaha-holdem 4s5c7cAsJd AdKd8d8s Qd5s8h9h 5dAhTd3d"));
  }

  @Test
  public void test_omaha_holdem_3121_2c4d5dKsTs_5hQc5s3h_9cKhTh7s_QsJc8d5c_7dAc8h2d_TcAd2sAh() {
    assertEquals(
      "7dAc8h2d QsJc8d5c TcAd2sAh 9cKhTh7s 5hQc5s3h",
      Solver.process("omaha-holdem 2c4d5dKsTs 5hQc5s3h 9cKhTh7s QsJc8d5c 7dAc8h2d TcAd2sAh"));
  }

  @Test
  public void test_omaha_holdem_3122_2s4s8hAsJs_6sJhTh9s_3s5c8c6h_6d4cQh7c_3hKd2dAh_7sKcKs5h_TcJd7h9h_5dAdTs3c_QsJc8sQd() {
    assertEquals(
      "6d4cQh7c TcJd7h9h 3hKd2dAh 3s5c8c6h=5dAdTs3c 6sJhTh9s QsJc8sQd 7sKcKs5h",
      Solver.process("omaha-holdem 2s4s8hAsJs 6sJhTh9s 3s5c8c6h 6d4cQh7c 3hKd2dAh 7sKcKs5h TcJd7h9h 5dAdTs3c QsJc8sQd"));
  }

  @Test
  public void test_omaha_holdem_3123_6cQcQdTdTs_KdKhJs9d_4d7cAsKs_6hAd7dTc_7sKcJdAc_2s8h9c3d() {
    assertEquals(
      "2s8h9c3d 4d7cAsKs=7sKcJdAc KdKhJs9d 6hAd7dTc",
      Solver.process("omaha-holdem 6cQcQdTdTs KdKhJs9d 4d7cAsKs 6hAd7dTc 7sKcJdAc 2s8h9c3d"));
  }

  @Test
  public void test_omaha_holdem_3124_3c9cAsJhQc_5dJcJs8s_3dAcKsTs_7c5sTc9s_4d9h2c7d_7sJd7h8d_2h5c6c3s_4h6h8c6s_6dQhKdTd() {
    assertEquals(
      "4h6h8c6s 4d9h2c7d 7sJd7h8d 5dJcJs8s 3dAcKsTs=6dQhKdTd 2h5c6c3s 7c5sTc9s",
      Solver.process("omaha-holdem 3c9cAsJhQc 5dJcJs8s 3dAcKsTs 7c5sTc9s 4d9h2c7d 7sJd7h8d 2h5c6c3s 4h6h8c6s 6dQhKdTd"));
  }

  @Test
  public void test_omaha_holdem_3125_2h3d4d5hQs_Tc9h8h3s_8cJs4h5c_Qc6h4c9s_7c7sAsTs_AhQhAd5d_9dAcKcKd() {
    assertEquals(
      "Tc9h8h3s 7c7sAsTs 9dAcKcKd 8cJs4h5c AhQhAd5d Qc6h4c9s",
      Solver.process("omaha-holdem 2h3d4d5hQs Tc9h8h3s 8cJs4h5c Qc6h4c9s 7c7sAsTs AhQhAd5d 9dAcKcKd"));
  }

  @Test
  public void test_omaha_holdem_3126_AdKsQcQdQh_As3c4s2h_Jh9s5d4h_3h2c8hTd_Ac7h5s7s_Qs7d5hJs_Kh2d9h9d_Ts8s8dAh_6d6c6h7c_4cTcKd5c() {
    assertEquals(
      "3h2c8hTd Jh9s5d4h 4cTcKd5c As3c4s2h 6d6c6h7c Ac7h5s7s Ts8s8dAh Kh2d9h9d Qs7d5hJs",
      Solver.process("omaha-holdem AdKsQcQdQh As3c4s2h Jh9s5d4h 3h2c8hTd Ac7h5s7s Qs7d5hJs Kh2d9h9d Ts8s8dAh 6d6c6h7c 4cTcKd5c"));
  }

  @Test
  public void test_omaha_holdem_3127_3s4h6d9sKs_7dAd9hAc_6s2h7h7s_TsAsQh2c_Td4dAh8d_Tc3hQs8c_5c8h2d4s() {
    assertEquals(
      "Tc3hQs8c Td4dAh8d 7dAd9hAc 5c8h2d4s 6s2h7h7s TsAsQh2c",
      Solver.process("omaha-holdem 3s4h6d9sKs 7dAd9hAc 6s2h7h7s TsAsQh2c Td4dAh8d Tc3hQs8c 5c8h2d4s"));
  }

  @Test
  public void test_omaha_holdem_3128_5d8sAcJhKd_5s6h4c3h_6dTs2sJs_2d6c3c9c_As4s7hTd_6sKs9h7d() {
    assertEquals(
      "2d6c3c9c 5s6h4c3h 6dTs2sJs 6sKs9h7d As4s7hTd",
      Solver.process("omaha-holdem 5d8sAcJhKd 5s6h4c3h 6dTs2sJs 2d6c3c9c As4s7hTd 6sKs9h7d"));
  }

  @Test
  public void test_omaha_holdem_3129_9cJcKsQsTh_4s7dAh3s_Jd8d7s2d_2s3c8cTd_9sAd4c3d_5cAcTsQh_9dKcKh6s_Kd7c3h6h_5h2h7hJs_5d4h8s2c() {
    assertEquals(
      "5d4h8s2c 4s7dAh3s 9sAd4c3d 5h2h7hJs Kd7c3h6h 2s3c8cTd=Jd8d7s2d 9dKcKh6s 5cAcTsQh",
      Solver.process("omaha-holdem 9cJcKsQsTh 4s7dAh3s Jd8d7s2d 2s3c8cTd 9sAd4c3d 5cAcTsQh 9dKcKh6s Kd7c3h6h 5h2h7hJs 5d4h8s2c"));
  }

  @Test
  public void test_omaha_holdem_3130_4s6h8d9cTh_Tc8sKdJh_7s5cJs3c_Qd4h8c2d() {
    assertEquals(
      "Qd4h8c2d Tc8sKdJh 7s5cJs3c",
      Solver.process("omaha-holdem 4s6h8d9cTh Tc8sKdJh 7s5cJs3c Qd4h8c2d"));
  }

  @Test
  public void test_omaha_holdem_3131_2h5d6c7hTs_JcAsAhJs_4h5hQs3c_3h8s8hJh_4c7s9dTh_2d9c6d8c_4dKcKsAd_QhTdTc7d() {
    assertEquals(
      "3h8s8hJh 4dKcKsAd JcAsAhJs 4c7s9dTh QhTdTc7d 4h5hQs3c 2d9c6d8c",
      Solver.process("omaha-holdem 2h5d6c7hTs JcAsAhJs 4h5hQs3c 3h8s8hJh 4c7s9dTh 2d9c6d8c 4dKcKsAd QhTdTc7d"));
  }

  @Test
  public void test_omaha_holdem_3132_5d8c9hAcKc_5c2s3sTh_Kh3hAh7s_9c8s9sTd() {
    assertEquals(
      "5c2s3sTh Kh3hAh7s 9c8s9sTd",
      Solver.process("omaha-holdem 5d8c9hAcKc 5c2s3sTh Kh3hAh7s 9c8s9sTd"));
  }

  @Test
  public void test_omaha_holdem_3133_2h7hAsJcJh_KsQdQc7d_4h6cQhKd_4s9sJd3s_JsQs6d3d_5s2d2c6h_3h8c7sKc_6sKhTh5d() {
    assertEquals(
      "3h8c7sKc KsQdQc7d 4s9sJd3s JsQs6d3d 4h6cQhKd 6sKhTh5d 5s2d2c6h",
      Solver.process("omaha-holdem 2h7hAsJcJh KsQdQc7d 4h6cQhKd 4s9sJd3s JsQs6d3d 5s2d2c6h 3h8c7sKc 6sKhTh5d"));
  }

  @Test
  public void test_omaha_holdem_3134_3d5h6h9dAc_9hAh3cAd_4c4d9cTs_Kd8dAs5d() {
    assertEquals(
      "4c4d9cTs Kd8dAs5d 9hAh3cAd",
      Solver.process("omaha-holdem 3d5h6h9dAc 9hAh3cAd 4c4d9cTs Kd8dAs5d"));
  }

  @Test
  public void test_omaha_holdem_3135_2d7h9sKsQc_2s3d7cKd_9cKh8d9d_4d8hJs3s_2h3h8s6h_Jd3cTd5h_4hQsTcAs_8cAc6sQh() {
    assertEquals(
      "4d8hJs3s 2h3h8s6h 4hQsTcAs=8cAc6sQh 2s3d7cKd 9cKh8d9d Jd3cTd5h",
      Solver.process("omaha-holdem 2d7h9sKsQc 2s3d7cKd 9cKh8d9d 4d8hJs3s 2h3h8s6h Jd3cTd5h 4hQsTcAs 8cAc6sQh"));
  }

  @Test
  public void test_omaha_holdem_3136_2d5d5h9cQc_9sKcQs3s_5c3d7h8s_Qh7d7c8c_2sTs8h2c_Th6s6cJd() {
    assertEquals(
      "Th6s6cJd Qh7d7c8c 9sKcQs3s 5c3d7h8s 2sTs8h2c",
      Solver.process("omaha-holdem 2d5d5h9cQc 9sKcQs3s 5c3d7h8s Qh7d7c8c 2sTs8h2c Th6s6cJd"));
  }

  @Test
  public void test_omaha_holdem_3137_2d3s5s6cQs_4c6hKd7c_2h4hTh5c_Qc8s2cAs_Tc5h9c6d_7d8c3h5d() {
    assertEquals(
      "7d8c3h5d Tc5h9c6d 2h4hTh5c 4c6hKd7c Qc8s2cAs",
      Solver.process("omaha-holdem 2d3s5s6cQs 4c6hKd7c 2h4hTh5c Qc8s2cAs Tc5h9c6d 7d8c3h5d"));
  }

  @Test
  public void test_omaha_holdem_3138_6sJdKcKdKs_Js5hTcJc_7hQh8c7c_2h7s5sQc_3h8d3sJh_Th7d2s6d_8h8s6h9h_Qs4h5d4s_9s5cAhAd_3d2cTd4c() {
    assertEquals(
      "3d2cTd4c Th7d2s6d 2h7s5sQc 3h8d3sJh Qs4h5d4s 7hQh8c7c 8h8s6h9h Js5hTcJc 9s5cAhAd",
      Solver.process("omaha-holdem 6sJdKcKdKs Js5hTcJc 7hQh8c7c 2h7s5sQc 3h8d3sJh Th7d2s6d 8h8s6h9h Qs4h5d4s 9s5cAhAd 3d2cTd4c"));
  }

  @Test
  public void test_omaha_holdem_3139_3d9hAhQdTd_8sTs5sKc_Kh5c2s3s_4s6sJs3h_ThQsJd6h_QhAc5d7c() {
    assertEquals(
      "4s6sJs3h Kh5c2s3s 8sTs5sKc ThQsJd6h QhAc5d7c",
      Solver.process("omaha-holdem 3d9hAhQdTd 8sTs5sKc Kh5c2s3s 4s6sJs3h ThQsJd6h QhAc5d7c"));
  }

  @Test
  public void test_omaha_holdem_3140_4d5c5dAdTh_Jc8c7c2d_2cTd7hTs_8hQh8dAc_Jd7sAsQc_4c6sKh4h_9cTc5s9d_2s6hKs8s() {
    assertEquals(
      "Jc8c7c2d 2s6hKs8s 8hQh8dAc=Jd7sAsQc 4c6sKh4h 9cTc5s9d 2cTd7hTs",
      Solver.process("omaha-holdem 4d5c5dAdTh Jc8c7c2d 2cTd7hTs 8hQh8dAc Jd7sAsQc 4c6sKh4h 9cTc5s9d 2s6hKs8s"));
  }

  @Test
  public void test_omaha_holdem_3141_5d6s9hJcKc_5s3h4c6c_Kd9dAh7h_Ad3s3c6d_2d4hQs5c_8sKh7c2s_4dQh3d6h_9sTsTh2c_4sAcKs9c_Qc5h7sJh() {
    assertEquals(
      "2d4hQs5c 4dQh3d6h Ad3s3c6d 9sTsTh2c 5s3h4c6c Qc5h7sJh 4sAcKs9c=Kd9dAh7h 8sKh7c2s",
      Solver.process("omaha-holdem 5d6s9hJcKc 5s3h4c6c Kd9dAh7h Ad3s3c6d 2d4hQs5c 8sKh7c2s 4dQh3d6h 9sTsTh2c 4sAcKs9c Qc5h7sJh"));
  }

  @Test
  public void test_omaha_holdem_3142_3s8hAdKsTs_9h8dJc5c_2d3h8cQs() {
    assertEquals(
      "9h8dJc5c 2d3h8cQs",
      Solver.process("omaha-holdem 3s8hAdKsTs 9h8dJc5c 2d3h8cQs"));
  }

  @Test
  public void test_omaha_holdem_3143_4d4hAhKdTs_QdAc6h7c_6sJdQc9h_8c7d9c4c_2hKh8sAs_6c6d9sJc_Qh3h2s5c_AdTh7hTd() {
    assertEquals(
      "Qh3h2s5c 6c6d9sJc QdAc6h7c 2hKh8sAs 8c7d9c4c 6sJdQc9h AdTh7hTd",
      Solver.process("omaha-holdem 4d4hAhKdTs QdAc6h7c 6sJdQc9h 8c7d9c4c 2hKh8sAs 6c6d9sJc Qh3h2s5c AdTh7hTd"));
  }

  @Test
  public void test_omaha_holdem_3144_3c5h6s9dKs_9hTc4c9s_5sKdQc2c() {
    assertEquals(
      "5sKdQc2c 9hTc4c9s",
      Solver.process("omaha-holdem 3c5h6s9dKs 9hTc4c9s 5sKdQc2c"));
  }

  @Test
  public void test_omaha_holdem_3145_3c4d7cAcQd_7s6c4c7d_3h5s2hKc_Tc6h6sKs_Td9hAhJh_9s2dQhQc_8s8d2c3s() {
    assertEquals(
      "Tc6h6sKs 8s8d2c3s Td9hAhJh 9s2dQhQc 3h5s2hKc 7s6c4c7d",
      Solver.process("omaha-holdem 3c4d7cAcQd 7s6c4c7d 3h5s2hKc Tc6h6sKs Td9hAhJh 9s2dQhQc 8s8d2c3s"));
  }

  @Test
  public void test_omaha_holdem_3146_6h8d9dJsKh_6dJcQhTs_8cAs5hTc_7dJhJd9s_Ac3h5s2d_Kc2hKd7c_6s3s2s3c() {
    assertEquals(
      "Ac3h5s2d 6s3s2s3c 8cAs5hTc 7dJhJd9s Kc2hKd7c 6dJcQhTs",
      Solver.process("omaha-holdem 6h8d9dJsKh 6dJcQhTs 8cAs5hTc 7dJhJd9s Ac3h5s2d Kc2hKd7c 6s3s2s3c"));
  }

  @Test
  public void test_omaha_holdem_3147_5s8d9h9sTd_7s8c2d4c_7c6c9cQc_2hAd2sJs_8h3s4s6h_6d4hQh5h_9dJd7d5d_Jc4d8sQd_ThAsTsAh_3d3cTc5c() {
    assertEquals(
      "2hAd2sJs 6d4hQh5h 8h3s4s6h 7s8c2d4c 3d3cTc5c 7c6c9cQc Jc4d8sQd 9dJd7d5d ThAsTsAh",
      Solver.process("omaha-holdem 5s8d9h9sTd 7s8c2d4c 7c6c9cQc 2hAd2sJs 8h3s4s6h 6d4hQh5h 9dJd7d5d Jc4d8sQd ThAsTsAh 3d3cTc5c"));
  }

  @Test
  public void test_omaha_holdem_3148_3h3s6d7dQs_JsQc9d2c_Qh9cQdJc_4h6c7sKs_Ts8cKc8d_3cJd9h7h_Kd4c8s2h_Tc5sJhAd_3d5d8h2d() {
    assertEquals(
      "Kd4c8s2h Tc5sJhAd 4h6c7sKs Ts8cKc8d JsQc9d2c 3d5d8h2d 3cJd9h7h Qh9cQdJc",
      Solver.process("omaha-holdem 3h3s6d7dQs JsQc9d2c Qh9cQdJc 4h6c7sKs Ts8cKc8d 3cJd9h7h Kd4c8s2h Tc5sJhAd 3d5d8h2d"));
  }

  @Test
  public void test_omaha_holdem_3149_6d7c9dQcQs_QdKc8s4s_Ad4h3hTd_Jh9s5dQh_5s8c3dJs_ThKh2s4d_8d5h2d6c_3s7hJd6h() {
    assertEquals(
      "ThKh2s4d Ad4h3hTd 3s7hJd6h QdKc8s4s 5s8c3dJs=8d5h2d6c Jh9s5dQh",
      Solver.process("omaha-holdem 6d7c9dQcQs QdKc8s4s Ad4h3hTd Jh9s5dQh 5s8c3dJs ThKh2s4d 8d5h2d6c 3s7hJd6h"));
  }

  @Test
  public void test_omaha_holdem_3150_3h7cKdQdQh_TcJh3dTs_4hAh5d5s_Ac2h3s4s_6s7d8h2d() {
    assertEquals(
      "Ac2h3s4s 4hAh5d5s 6s7d8h2d TcJh3dTs",
      Solver.process("omaha-holdem 3h7cKdQdQh TcJh3dTs 4hAh5d5s Ac2h3s4s 6s7d8h2d"));
  }

  @Test
  public void test_omaha_holdem_3151_3c4s9d9sTc_JdKdQh4c_Ac3dAsKs_9cTsTh5d_8c3s4h2d_6d2c3h7d_Kc2h5s8h_Td6cQs7s_JcAd6sJh() {
    assertEquals(
      "Kc2h5s8h 6d2c3h7d 8c3s4h2d JdKdQh4c Td6cQs7s JcAd6sJh Ac3dAsKs 9cTsTh5d",
      Solver.process("omaha-holdem 3c4s9d9sTc JdKdQh4c Ac3dAsKs 9cTsTh5d 8c3s4h2d 6d2c3h7d Kc2h5s8h Td6cQs7s JcAd6sJh"));
  }

  @Test
  public void test_omaha_holdem_3152_6d9dJdJhQd_8h3h5d3s_5s4dAh3c_QhTs7sQc() {
    assertEquals(
      "5s4dAh3c 8h3h5d3s QhTs7sQc",
      Solver.process("omaha-holdem 6d9dJdJhQd 8h3h5d3s 5s4dAh3c QhTs7sQc"));
  }

  @Test
  public void test_omaha_holdem_3153_4h6h8cKhQc_Qd3d2cAh_4d9c8hAc_2hKdAd6d_ThQh7s4s_JsKs5cQs_7hTd9h5h_Ts8s5sJd_Kc6sTc2d() {
    assertEquals(
      "Ts8s5sJd Qd3d2cAh 4d9c8hAc 2hKdAd6d=Kc6sTc2d JsKs5cQs 7hTd9h5h ThQh7s4s",
      Solver.process("omaha-holdem 4h6h8cKhQc Qd3d2cAh 4d9c8hAc 2hKdAd6d ThQh7s4s JsKs5cQs 7hTd9h5h Ts8s5sJd Kc6sTc2d"));
  }

  @Test
  public void test_omaha_holdem_3154_2h3c4sAdQd_Kc7s3d6s_As7hJd8h_Kh4cAc3h_6h5s6dJs() {
    assertEquals(
      "Kc7s3d6s As7hJd8h Kh4cAc3h 6h5s6dJs",
      Solver.process("omaha-holdem 2h3c4sAdQd Kc7s3d6s As7hJd8h Kh4cAc3h 6h5s6dJs"));
  }

  @Test
  public void test_omaha_holdem_3155_5c6s8c9cTd_6h5hTc7s_4cQh4sTh_Ks9s3sTs_Kc3c2sJs_8s6cKhQc_7d8h2hAs_9h3h7c9d() {
    assertEquals(
      "4cQh4sTh Ks9s3sTs 6h5hTc7s=7d8h2hAs=9h3h7c9d 8s6cKhQc Kc3c2sJs",
      Solver.process("omaha-holdem 5c6s8c9cTd 6h5hTc7s 4cQh4sTh Ks9s3sTs Kc3c2sJs 8s6cKhQc 7d8h2hAs 9h3h7c9d"));
  }

  @Test
  public void test_omaha_holdem_3156_2h5s9hKdQc_5d9s7c6s_Th7dJc4c_6dAcTs3s_7s4hKc9c_KhTcQsQd_Td3dKs8c_8d7hJs5c_4sJd8s3h() {
    assertEquals(
      "4sJd8s3h 6dAcTs3s 8d7hJs5c Td3dKs8c 5d9s7c6s 7s4hKc9c KhTcQsQd Th7dJc4c",
      Solver.process("omaha-holdem 2h5s9hKdQc 5d9s7c6s Th7dJc4c 6dAcTs3s 7s4hKc9c KhTcQsQd Td3dKs8c 8d7hJs5c 4sJd8s3h"));
  }

  @Test
  public void test_omaha_holdem_3157_3d6c8c9c9s_Ac4dQhJd_5dQcJs6s_8s5cKd4s_6hTcTs7s_JhJcKs5s_8d7d4c2s_5hKhAd7c() {
    assertEquals(
      "Ac4dQhJd 5dQcJs6s 8d7d4c2s 8s5cKd4s JhJcKs5s 5hKhAd7c 6hTcTs7s",
      Solver.process("omaha-holdem 3d6c8c9c9s Ac4dQhJd 5dQcJs6s 8s5cKd4s 6hTcTs7s JhJcKs5s 8d7d4c2s 5hKhAd7c"));
  }

  @Test
  public void test_omaha_holdem_3158_2s4c9c9dJs_8d7c4d5c_AhJd4s6h_JhQd3hTd() {
    assertEquals(
      "8d7c4d5c JhQd3hTd AhJd4s6h",
      Solver.process("omaha-holdem 2s4c9c9dJs 8d7c4d5c AhJd4s6h JhQd3hTd"));
  }

  @Test
  public void test_omaha_holdem_3159_2d7h8hAcTd_5s4s3hTs_Ad2s5h9c_QsJc6c8s_Th9sJs6s_9h3c6dJh_2hAh5d7s_3dQcQd8d_7cKcKs4c() {
    assertEquals(
      "QsJc6c8s 5s4s3hTs 3dQcQd8d 7cKcKs4c Ad2s5h9c 2hAh5d7s 9h3c6dJh=Th9sJs6s",
      Solver.process("omaha-holdem 2d7h8hAcTd 5s4s3hTs Ad2s5h9c QsJc6c8s Th9sJs6s 9h3c6dJh 2hAh5d7s 3dQcQd8d 7cKcKs4c"));
  }

  @Test
  public void test_omaha_holdem_3160_2h3h4d5sJs_9cAc4s8s_7cAh5d3d_TdQd6hKd_8dTh5c2s_7hJc3cAs() {
    assertEquals(
      "TdQd6hKd 8dTh5c2s 7cAh5d3d=7hJc3cAs=9cAc4s8s",
      Solver.process("omaha-holdem 2h3h4d5sJs 9cAc4s8s 7cAh5d3d TdQd6hKd 8dTh5c2s 7hJc3cAs"));
  }

  @Test
  public void test_omaha_holdem_3161_7sAhKsQhQs_3d5s4s3c_8cAsTs9s_9d8s5c5d() {
    assertEquals(
      "9d8s5c5d 3d5s4s3c 8cAsTs9s",
      Solver.process("omaha-holdem 7sAhKsQhQs 3d5s4s3c 8cAsTs9s 9d8s5c5d"));
  }

  @Test
  public void test_omaha_holdem_3162_4h9h9sJhTh_Ts8h5dAs_KsJcJsAh_Kh4d5s8d_7cQs7d5h_2sQcKdKc_QdAc8s9c() {
    assertEquals(
      "Kh4d5s8d 7cQs7d5h Ts8h5dAs QdAc8s9c 2sQcKdKc KsJcJsAh",
      Solver.process("omaha-holdem 4h9h9sJhTh Ts8h5dAs KsJcJsAh Kh4d5s8d 7cQs7d5h 2sQcKdKc QdAc8s9c"));
  }

  @Test
  public void test_omaha_holdem_3163_4s5c5s9sKs_2sAh6h5h_2d8hJh6s_3hTc4hTh_9cQdTd6d_7d6c3dJd_4cJcKc8s() {
    assertEquals(
      "7d6c3dJd 2d8hJh6s 9cQdTd6d 3hTc4hTh 4cJcKc8s 2sAh6h5h",
      Solver.process("omaha-holdem 4s5c5s9sKs 2sAh6h5h 2d8hJh6s 3hTc4hTh 9cQdTd6d 7d6c3dJd 4cJcKc8s"));
  }

  @Test
  public void test_omaha_holdem_3164_4d5c7dAsKc_Th8h5sKh_3c4c4s3h_9hJdJc9c_8c7c6d4h_2dQh7hKs_2hAhQs8d_9sTc5h9d_5dKd7s8s() {
    assertEquals(
      "9sTc5h9d 9hJdJc9c 2hAhQs8d Th8h5sKh 2dQh7hKs=5dKd7s8s 3c4c4s3h 8c7c6d4h",
      Solver.process("omaha-holdem 4d5c7dAsKc Th8h5sKh 3c4c4s3h 9hJdJc9c 8c7c6d4h 2dQh7hKs 2hAhQs8d 9sTc5h9d 5dKd7s8s"));
  }

  @Test
  public void test_omaha_holdem_3165_2s4h5s6cQs_3hQdTc9c_2d5c9h6s() {
    assertEquals(
      "3hQdTc9c 2d5c9h6s",
      Solver.process("omaha-holdem 2s4h5s6cQs 3hQdTc9c 2d5c9h6s"));
  }

  @Test
  public void test_omaha_holdem_3166_2h4h6c9hJc_4d4c4s6s_9cKdAcTd_5hQhQsKh_7sAh2c6d_7c3c8sTc() {
    assertEquals(
      "7c3c8sTc 9cKdAcTd 7sAh2c6d 4d4c4s6s 5hQhQsKh",
      Solver.process("omaha-holdem 2h4h6c9hJc 4d4c4s6s 9cKdAcTd 5hQhQsKh 7sAh2c6d 7c3c8sTc"));
  }

  @Test
  public void test_omaha_holdem_3167_5c6cAdKhQs_2d4d6d8d_AhThJc9d_AcKd7s5s_2sQh8sTd_3sTs7cKc_Ks4hJh3h_2h9s4c5h() {
    assertEquals(
      "2h9s4c5h 2d4d6d8d 2sQh8sTd 3sTs7cKc Ks4hJh3h AcKd7s5s AhThJc9d",
      Solver.process("omaha-holdem 5c6cAdKhQs 2d4d6d8d AhThJc9d AcKd7s5s 2sQh8sTd 3sTs7cKc Ks4hJh3h 2h9s4c5h"));
  }

  @Test
  public void test_omaha_holdem_3168_6s8sJdKsQh_9h8cQd4d_5sAdKd4s_8h2cAc6d_6h5dQs7s_TdThJc2h_9sJs3dTs_2dTc8dAh() {
    assertEquals(
      "TdThJc2h 8h2cAc6d 9h8cQd4d 2dTc8dAh 5sAdKd4s 9sJs3dTs 6h5dQs7s",
      Solver.process("omaha-holdem 6s8sJdKsQh 9h8cQd4d 5sAdKd4s 8h2cAc6d 6h5dQs7s TdThJc2h 9sJs3dTs 2dTc8dAh"));
  }

  @Test
  public void test_omaha_holdem_3169_3h9cAcAdAs_KhKdTdTs_Js8sJd2c_5s6sQs4h_Jh8c7sJc_5c8d2dQh_3d6h3s4c_Tc6c7h5d_KcQcTh2h_7d9sQd6d() {
    assertEquals(
      "Tc6c7h5d 5s6sQs4h 5c8d2dQh 7d9sQd6d KcQcTh2h 3d6h3s4c Jh8c7sJc=Js8sJd2c KhKdTdTs",
      Solver.process("omaha-holdem 3h9cAcAdAs KhKdTdTs Js8sJd2c 5s6sQs4h Jh8c7sJc 5c8d2dQh 3d6h3s4c Tc6c7h5d KcQcTh2h 7d9sQd6d"));
  }

  @Test
  public void test_omaha_holdem_3170_4dAhJdKdQc_5h8c4cKh_Ad7hThKs_6cJs3s4s_Td5d9hJh_3dQhAs2h_6h8h9s6d() {
    assertEquals(
      "6h8h9s6d 6cJs3s4s 5h8c4cKh 3dQhAs2h Ad7hThKs Td5d9hJh",
      Solver.process("omaha-holdem 4dAhJdKdQc 5h8c4cKh Ad7hThKs 6cJs3s4s Td5d9hJh 3dQhAs2h 6h8h9s6d"));
  }

  @Test
  public void test_omaha_holdem_3171_2s4c6h7cQs_QhAc4dJc_Td4sTcJs_5h7sKs9c() {
    assertEquals(
      "5h7sKs9c Td4sTcJs QhAc4dJc",
      Solver.process("omaha-holdem 2s4c6h7cQs QhAc4dJc Td4sTcJs 5h7sKs9c"));
  }

  @Test
  public void test_omaha_holdem_3172_2h9c9dJsQs_Jc4h5sKs_3s7cQd6s_7dTd2c2d_6cAd8s7s_4d4c5cAc_7h5d8h5h_Tc2sAh9s_3h4s3cAs_6dQcTsJd() {
    assertEquals(
      "6cAd8s7s 3h4s3cAs 4d4c5cAc 7h5d8h5h Jc4h5sKs 3s7cQd6s 6dQcTsJd 7dTd2c2d Tc2sAh9s",
      Solver.process("omaha-holdem 2h9c9dJsQs Jc4h5sKs 3s7cQd6s 7dTd2c2d 6cAd8s7s 4d4c5cAc 7h5d8h5h Tc2sAh9s 3h4s3cAs 6dQcTsJd"));
  }

  @Test
  public void test_omaha_holdem_3173_3d4c4d6sKh_7s8c2c3c_6h2hAc9c_9s8dTcJh_Ad5dKdAh_As4h3hJs() {
    assertEquals(
      "9s8dTcJh 7s8c2c3c 6h2hAc9c Ad5dKdAh As4h3hJs",
      Solver.process("omaha-holdem 3d4c4d6sKh 7s8c2c3c 6h2hAc9c 9s8dTcJh Ad5dKdAh As4h3hJs"));
  }

  @Test
  public void test_omaha_holdem_3174_2d3d6sJdTd_Ks7h5d5h_6c9cQdQc_9sAd2c8d_2sKh4s7d_8hKd5c4c_6hJh9d3c_4d3sTc7s_As7c2h4h() {
    assertEquals(
      "2sKh4s7d As7c2h4h Ks7h5d5h 6c9cQdQc 4d3sTc7s 6hJh9d3c 8hKd5c4c 9sAd2c8d",
      Solver.process("omaha-holdem 2d3d6sJdTd Ks7h5d5h 6c9cQdQc 9sAd2c8d 2sKh4s7d 8hKd5c4c 6hJh9d3c 4d3sTc7s As7c2h4h"));
  }

  @Test
  public void test_omaha_holdem_3175_7h8sJdQcTd_Ks9d3hAh_2cKd4d3s_6hQs4h9s() {
    assertEquals(
      "2cKd4d3s 6hQs4h9s Ks9d3hAh",
      Solver.process("omaha-holdem 7h8sJdQcTd Ks9d3hAh 2cKd4d3s 6hQs4h9s"));
  }

  @Test
  public void test_omaha_holdem_3176_3h5h5sJsQc_7cAsQd9c_7hKdAc3d_8hJdKh2h_9sJc8d5d() {
    assertEquals(
      "7hKdAc3d 8hJdKh2h 7cAsQd9c 9sJc8d5d",
      Solver.process("omaha-holdem 3h5h5sJsQc 7cAsQd9c 7hKdAc3d 8hJdKh2h 9sJc8d5d"));
  }

  @Test
  public void test_omaha_holdem_3177_3s6hJhKsQs_3c5hTh3d_8c4sQd4h_Qh7sAdTs() {
    assertEquals(
      "8c4sQd4h 3c5hTh3d Qh7sAdTs",
      Solver.process("omaha-holdem 3s6hJhKsQs 3c5hTh3d 8c4sQd4h Qh7sAdTs"));
  }

  @Test
  public void test_omaha_holdem_3178_3c4c5cJhTd_7hAh8cKh_Qs6c5hTs_QcKs8dJc_Jd2hTc9c_4s3hKd9s_6d4dQd9h_9d7d4h8h_Js6sKc2s() {
    assertEquals(
      "7hAh8cKh 9d7d4h8h 6d4dQd9h 4s3hKd9s Qs6c5hTs Js6sKc2s Jd2hTc9c QcKs8dJc",
      Solver.process("omaha-holdem 3c4c5cJhTd 7hAh8cKh Qs6c5hTs QcKs8dJc Jd2hTc9c 4s3hKd9s 6d4dQd9h 9d7d4h8h Js6sKc2s"));
  }

  @Test
  public void test_omaha_holdem_3179_6s8c8h9dJh_2c7hJc2s_3d2hKh3s_2dQs4d9s_5sAsThQh_4cJs6h8d() {
    assertEquals(
      "3d2hKh3s 2dQs4d9s 2c7hJc2s 5sAsThQh 4cJs6h8d",
      Solver.process("omaha-holdem 6s8c8h9dJh 2c7hJc2s 3d2hKh3s 2dQs4d9s 5sAsThQh 4cJs6h8d"));
  }

  @Test
  public void test_omaha_holdem_3180_4c5d8dKcTc_2d6d3hQh_7c2s4h7h_9c7d9s4s() {
    assertEquals(
      "2d6d3hQh 7c2s4h7h 9c7d9s4s",
      Solver.process("omaha-holdem 4c5d8dKcTc 2d6d3hQh 7c2s4h7h 9c7d9s4s"));
  }

  @Test
  public void test_omaha_holdem_3181_5s6d9dJsQc_9s4h5c3c_JdKsTc5h_4sAs8h2c_7h4dQh3s_2dKc3d6s() {
    assertEquals(
      "4sAs8h2c 2dKc3d6s 7h4dQh3s 9s4h5c3c JdKsTc5h",
      Solver.process("omaha-holdem 5s6d9dJsQc 9s4h5c3c JdKsTc5h 4sAs8h2c 7h4dQh3s 2dKc3d6s"));
  }

  @Test
  public void test_omaha_holdem_3182_2s3s4s8sQh_2h3d4d8d_5s5cQc3h_9dAsAc7s_Th4c8h7c() {
    assertEquals(
      "2h3d4d8d=Th4c8h7c 5s5cQc3h 9dAsAc7s",
      Solver.process("omaha-holdem 2s3s4s8sQh 2h3d4d8d 5s5cQc3h 9dAsAc7s Th4c8h7c"));
  }

  @Test
  public void test_omaha_holdem_3183_4c6sKsQdQh_9hKd8d9s_3sJc9dTh_6c5s7hTs_Js5c4hKc() {
    assertEquals(
      "3sJc9dTh 6c5s7hTs 9hKd8d9s Js5c4hKc",
      Solver.process("omaha-holdem 4c6sKsQdQh 9hKd8d9s 3sJc9dTh 6c5s7hTs Js5c4hKc"));
  }

  @Test
  public void test_omaha_holdem_3184_4d4s5d7cAd_Kd9s3c8h_7s2h2s2d_8sJs6h7h() {
    assertEquals(
      "Kd9s3c8h 7s2h2s2d 8sJs6h7h",
      Solver.process("omaha-holdem 4d4s5d7cAd Kd9s3c8h 7s2h2s2d 8sJs6h7h"));
  }

  @Test
  public void test_omaha_holdem_3185_5h6h8sQdQs_Ad2sTd8h_Th8dTc7s_JsKh7hAh_8c2dJd2h_3cQhKd9h_5c6sTs7d() {
    assertEquals(
      "JsKh7hAh 5c6sTs7d 8c2dJd2h Ad2sTd8h Th8dTc7s 3cQhKd9h",
      Solver.process("omaha-holdem 5h6h8sQdQs Ad2sTd8h Th8dTc7s JsKh7hAh 8c2dJd2h 3cQhKd9h 5c6sTs7d"));
  }

  @Test
  public void test_omaha_holdem_3186_2s8cAcAhKc_KhJdQh5h_Ks7c5sKd_9dAd5cTs_4s3cJh9s_6d7h7s4c_Qd3hAs9c_TcJc3dQs() {
    assertEquals(
      "4s3cJh9s 6d7h7s4c KhJdQh5h 9dAd5cTs Qd3hAs9c TcJc3dQs Ks7c5sKd",
      Solver.process("omaha-holdem 2s8cAcAhKc KhJdQh5h Ks7c5sKd 9dAd5cTs 4s3cJh9s 6d7h7s4c Qd3hAs9c TcJc3dQs"));
  }

  @Test
  public void test_omaha_holdem_3187_4d4s7dTcTs_6cKs2d8h_Kc9sQs3c_8c7sJd9h_Js2h3d5d() {
    assertEquals(
      "Js2h3d5d 6cKs2d8h Kc9sQs3c 8c7sJd9h",
      Solver.process("omaha-holdem 4d4s7dTcTs 6cKs2d8h Kc9sQs3c 8c7sJd9h Js2h3d5d"));
  }

  @Test
  public void test_omaha_holdem_3188_2c3c3d3h4d_8d8c2s8h_Ks6sJcTs_AdQdAs6h_4cJdAh9s_TdQhKc5c() {
    assertEquals(
      "Ks6sJcTs TdQhKc5c 4cJdAh9s 8d8c2s8h AdQdAs6h",
      Solver.process("omaha-holdem 2c3c3d3h4d 8d8c2s8h Ks6sJcTs AdQdAs6h 4cJdAh9s TdQhKc5c"));
  }

  @Test
  public void test_omaha_holdem_3189_4d6c6sJcKd_8d9dKcJd_2cQd3dAh_2s4s5h9h_4h8h4c6h_Qc9sQhAs_QsTd3c5c_7h9c3hAd() {
    assertEquals(
      "QsTd3c5c 7h9c3hAd 2cQd3dAh 2s4s5h9h Qc9sQhAs 8d9dKcJd 4h8h4c6h",
      Solver.process("omaha-holdem 4d6c6sJcKd 8d9dKcJd 2cQd3dAh 2s4s5h9h 4h8h4c6h Qc9sQhAs QsTd3c5c 7h9c3hAd"));
  }

  @Test
  public void test_omaha_holdem_3190_2c6d7c7sQh_Tc8sQsTs_ThTd9sKs_9c7d5c6c_3s2d9h4d_AcQdJc5s_Jh7hAs8d_6s5dJs4s_KhJd9d4h_Kd3h5h6h() {
    assertEquals(
      "KhJd9d4h 3s2d9h4d 6s5dJs4s Kd3h5h6h ThTd9sKs Tc8sQsTs AcQdJc5s Jh7hAs8d 9c7d5c6c",
      Solver.process("omaha-holdem 2c6d7c7sQh Tc8sQsTs ThTd9sKs 9c7d5c6c 3s2d9h4d AcQdJc5s Jh7hAs8d 6s5dJs4s KhJd9d4h Kd3h5h6h"));
  }

  @Test
  public void test_omaha_holdem_3191_5c6d6h8hKc_2hQdTh7d_Js7hTd3d() {
    assertEquals(
      "Js7hTd3d 2hQdTh7d",
      Solver.process("omaha-holdem 5c6d6h8hKc 2hQdTh7d Js7hTd3d"));
  }

  @Test
  public void test_omaha_holdem_3192_2c6c6s9hJh_Th6hKs7h_As9sKh8c_Ts3hKcAc_2h5c9cQs_Qc4hJdQd() {
    assertEquals(
      "Ts3hKcAc 2h5c9cQs As9sKh8c Qc4hJdQd Th6hKs7h",
      Solver.process("omaha-holdem 2c6c6s9hJh Th6hKs7h As9sKh8c Ts3hKcAc 2h5c9cQs Qc4hJdQd"));
  }

  @Test
  public void test_omaha_holdem_3193_2h5hAcJhQc_7h2dTd7s_9d6hJc9h_8h8d6cTs_3sTh3hJd_9sQs7c4d_2cAh4s5s() {
    assertEquals(
      "7h2dTd7s 8h8d6cTs 9sQs7c4d 2cAh4s5s 9d6hJc9h 3sTh3hJd",
      Solver.process("omaha-holdem 2h5hAcJhQc 7h2dTd7s 9d6hJc9h 8h8d6cTs 3sTh3hJd 9sQs7c4d 2cAh4s5s"));
  }

  @Test
  public void test_omaha_holdem_3194_4d5d5sKsQc_Td7s6c3h_8dJh3s6h_2dJsQdJc_3d7c9s8s_9dJd7d8c_6dTcTh4c() {
    assertEquals(
      "3d7c9s8s Td7s6c3h 8dJh3s6h 9dJd7d8c 6dTcTh4c 2dJsQdJc",
      Solver.process("omaha-holdem 4d5d5sKsQc Td7s6c3h 8dJh3s6h 2dJsQdJc 3d7c9s8s 9dJd7d8c 6dTcTh4c"));
  }

  @Test
  public void test_omaha_holdem_3195_2c3c3h6h8c_QdTh6d9d_2dAd8s5d_Jc6c4cQc_AcKcQs7h_TcTd3dKd_2h7d8d2s_Ts8hKh4h_5hJh9s3s_9hKs9cJd() {
    assertEquals(
      "QdTh6d9d Ts8hKh4h 2dAd8s5d 9hKs9cJd 5hJh9s3s TcTd3dKd Jc6c4cQc AcKcQs7h 2h7d8d2s",
      Solver.process("omaha-holdem 2c3c3h6h8c QdTh6d9d 2dAd8s5d Jc6c4cQc AcKcQs7h TcTd3dKd 2h7d8d2s Ts8hKh4h 5hJh9s3s 9hKs9cJd"));
  }

  @Test
  public void test_omaha_holdem_3196_3s4d5s8hTc_7d3h6s2c_3c7c7s9h_5cQs3d8d_QcAhTh5d_2hTsKhAd_9cJhJcKs_8s8cQh4h_5h2s4sJs() {
    assertEquals(
      "3c7c7s9h 9cJhJcKs 5h2s4sJs 5cQs3d8d QcAhTh5d 8s8cQh4h 2hTsKhAd 7d3h6s2c",
      Solver.process("omaha-holdem 3s4d5s8hTc 7d3h6s2c 3c7c7s9h 5cQs3d8d QcAhTh5d 2hTsKhAd 9cJhJcKs 8s8cQh4h 5h2s4sJs"));
  }

  @Test
  public void test_omaha_holdem_3197_3s4d6d6s8s_5h7dQcAc_3h2c5dJh_Qd9dKc4s_As3d9s2d_KsJd2h8d_3c5s8c4c_AdQs2s7c_6c7sTdKh_4hKdTcJs() {
    assertEquals(
      "4hKdTcJs=Qd9dKc4s 3c5s8c4c KsJd2h8d 6c7sTdKh 3h2c5dJh 5h7dQcAc AdQs2s7c As3d9s2d",
      Solver.process("omaha-holdem 3s4d6d6s8s 5h7dQcAc 3h2c5dJh Qd9dKc4s As3d9s2d KsJd2h8d 3c5s8c4c AdQs2s7c 6c7sTdKh 4hKdTcJs"));
  }

  @Test
  public void test_omaha_holdem_3198_2d5c7hQsTd_Ah2h4cTc_8c4sKd9h_8d6c9s5s_9dJcQc5d_4dTh3hKs_Kh6d7cJd_AsKcAd7d_JsQh5h7s() {
    assertEquals(
      "8c4sKd9h 8d6c9s5s Kh6d7cJd 4dTh3hKs AsKcAd7d Ah2h4cTc 9dJcQc5d JsQh5h7s",
      Solver.process("omaha-holdem 2d5c7hQsTd Ah2h4cTc 8c4sKd9h 8d6c9s5s 9dJcQc5d 4dTh3hKs Kh6d7cJd AsKcAd7d JsQh5h7s"));
  }

  @Test
  public void test_omaha_holdem_3199_3s9dQsTcTd_KhJs7d6s_9cAh9h5h_7h4s3h3d_8s7c4d5c_6hAdQd6c_Qh2hJcJh_7s4cTsTh_Qc2sAc8d() {
    assertEquals(
      "8s7c4d5c Qh2hJcJh 6hAdQd6c=Qc2sAc8d KhJs7d6s 7h4s3h3d 9cAh9h5h 7s4cTsTh",
      Solver.process("omaha-holdem 3s9dQsTcTd KhJs7d6s 9cAh9h5h 7h4s3h3d 8s7c4d5c 6hAdQd6c Qh2hJcJh 7s4cTsTh Qc2sAc8d"));
  }

  @Test
  public void test_omaha_holdem_3200_2s5c5h8hJd_2c7dQsTd_2d3h2h6d_6hAc5dKs() {
    assertEquals(
      "2c7dQsTd 6hAc5dKs 2d3h2h6d",
      Solver.process("omaha-holdem 2s5c5h8hJd 2c7dQsTd 2d3h2h6d 6hAc5dKs"));
  }

  @Test
  public void test_omaha_holdem_3201_2h4c9dAsTc_6dTdJd4h_8dAdKs7s_AcJs9cAh_8cKdKcTh_3s3c7d6c_Kh2s2c4d_Jh6s7h5c() {
    assertEquals(
      "Jh6s7h5c 3s3c7d6c 8cKdKcTh 8dAdKs7s 6dTdJd4h Kh2s2c4d AcJs9cAh",
      Solver.process("omaha-holdem 2h4c9dAsTc 6dTdJd4h 8dAdKs7s AcJs9cAh 8cKdKcTh 3s3c7d6c Kh2s2c4d Jh6s7h5c"));
  }

  @Test
  public void test_omaha_holdem_3202_2h3d7h9d9s_4dTs5dKh_7cQdQsAd_5s2d2s8h_7d6dJdKs_8cJcAhJs_3hAsKc5h() {
    assertEquals(
      "4dTs5dKh 3hAsKc5h 7d6dJdKs 8cJcAhJs 7cQdQsAd 5s2d2s8h",
      Solver.process("omaha-holdem 2h3d7h9d9s 4dTs5dKh 7cQdQsAd 5s2d2s8h 7d6dJdKs 8cJcAhJs 3hAsKc5h"));
  }

  @Test
  public void test_omaha_holdem_3203_4h6hKhKsQs_6c2h3h3d_JdAhJh8c_7hQd6s5c() {
    assertEquals(
      "7hQd6s5c 6c2h3h3d JdAhJh8c",
      Solver.process("omaha-holdem 4h6hKhKsQs 6c2h3h3d JdAhJh8c 7hQd6s5c"));
  }

  @Test
  public void test_omaha_holdem_3204_3d4c5sAdTc_Ah4s2d5h_2cKsKd5d_Js8d8s9s_8h7d3s5c_7c6c4hJd_6d7sAsQd() {
    assertEquals(
      "Js8d8s9s 8h7d3s5c 2cKsKd5d=Ah4s2d5h 6d7sAsQd=7c6c4hJd",
      Solver.process("omaha-holdem 3d4c5sAdTc Ah4s2d5h 2cKsKd5d Js8d8s9s 8h7d3s5c 7c6c4hJd 6d7sAsQd"));
  }

  @Test
  public void test_omaha_holdem_3205_3c5dJcJsKd_Jd9h7s5s_2c3s2sKc_Qs8s2d6d_TdJhKhAh_4dQh9c2h_6sQd8hAc() {
    assertEquals(
      "Qs8s2d6d 4dQh9c2h 6sQd8hAc 2c3s2sKc Jd9h7s5s TdJhKhAh",
      Solver.process("omaha-holdem 3c5dJcJsKd Jd9h7s5s 2c3s2sKc Qs8s2d6d TdJhKhAh 4dQh9c2h 6sQd8hAc"));
  }

  @Test
  public void test_omaha_holdem_3206_2h6c8hJhTs_3sTd4c9h_9sAdQc5h_9dAc8c3c_QdTh6h5c_Tc6sKs4s_7c7h4h2c_8s5d2d5s() {
    assertEquals(
      "9dAc8c3c 3sTd4c9h 8s5d2d5s Tc6sKs4s 9sAdQc5h 7c7h4h2c QdTh6h5c",
      Solver.process("omaha-holdem 2h6c8hJhTs 3sTd4c9h 9sAdQc5h 9dAc8c3c QdTh6h5c Tc6sKs4s 7c7h4h2c 8s5d2d5s"));
  }

  @Test
  public void test_omaha_holdem_3207_2h3d5dQcQs_7c7h8h5h_4h4dJdAh_Jc2c8s2d_4cKhAs8c_Js9c5sQd_7d9h8dTd_QhTc7sAd_3s5cKc3c() {
    assertEquals(
      "7d9h8dTd 7c7h8h5h QhTc7sAd 4cKhAs8c=4h4dJdAh Jc2c8s2d 3s5cKc3c Js9c5sQd",
      Solver.process("omaha-holdem 2h3d5dQcQs 7c7h8h5h 4h4dJdAh Jc2c8s2d 4cKhAs8c Js9c5sQd 7d9h8dTd QhTc7sAd 3s5cKc3c"));
  }

  @Test
  public void test_omaha_holdem_3208_4h6dAdKdQc_TdAhKhQd_8d7c5h9s_JdKs3h3c_Kc6c8hQh_9dAsTs3s_5d9h7s4s_2h4dTcJh_3d7h2sJs() {
    assertEquals(
      "8d7c5h9s 3d7h2sJs 5d9h7s4s JdKs3h3c 9dAsTs3s Kc6c8hQh 2h4dTcJh TdAhKhQd",
      Solver.process("omaha-holdem 4h6dAdKdQc TdAhKhQd 8d7c5h9s JdKs3h3c Kc6c8hQh 9dAsTs3s 5d9h7s4s 2h4dTcJh 3d7h2sJs"));
  }

  @Test
  public void test_omaha_holdem_3209_2h6d7cAsJd_5dTh4s9d_KdQsJh7h_6cTs9sJs_8d4dKs2d_QhQcQd2s_Ah8s8c9h() {
    assertEquals(
      "5dTh4s9d 8d4dKs2d QhQcQd2s Ah8s8c9h 6cTs9sJs KdQsJh7h",
      Solver.process("omaha-holdem 2h6d7cAsJd 5dTh4s9d KdQsJh7h 6cTs9sJs 8d4dKs2d QhQcQd2s Ah8s8c9h"));
  }

  @Test
  public void test_omaha_holdem_3210_3h6dAhJhKs_8cQhKc5s_9sTc9dKh_Js7sAd2d_2hTs4sJd() {
    assertEquals(
      "2hTs4sJd 9sTc9dKh 8cQhKc5s Js7sAd2d",
      Solver.process("omaha-holdem 3h6dAhJhKs 8cQhKc5s 9sTc9dKh Js7sAd2d 2hTs4sJd"));
  }

  @Test
  public void test_omaha_holdem_3211_2h6c6s9cTd_3c5h2dKd_3hQhTs9s() {
    assertEquals(
      "3c5h2dKd 3hQhTs9s",
      Solver.process("omaha-holdem 2h6c6s9cTd 3c5h2dKd 3hQhTs9s"));
  }

  @Test
  public void test_omaha_holdem_3212_2h3h5c5h8h_Qd9d5s9c_7hKc3cTd_4dQh2s8c_9hAs4h6c_JhJd5d8s_8d9sTc6h() {
    assertEquals(
      "7hKc3cTd 8d9sTc6h 4dQh2s8c Qd9d5s9c 9hAs4h6c JhJd5d8s",
      Solver.process("omaha-holdem 2h3h5c5h8h Qd9d5s9c 7hKc3cTd 4dQh2s8c 9hAs4h6c JhJd5d8s 8d9sTc6h"));
  }

  @Test
  public void test_omaha_holdem_3213_3d5c5hAhKh_8h2s6c6d_3s4h6hTc_2dTh2cKs_3h4cAdAc_7d9cTsQh_AsJdJc8c_7sKc2h7h_4sTd8sQc_Qs7c9d5d() {
    assertEquals(
      "4sTd8sQc=7d9cTsQh 8h2s6c6d 2dTh2cKs AsJdJc8c Qs7c9d5d 3s4h6hTc 7sKc2h7h 3h4cAdAc",
      Solver.process("omaha-holdem 3d5c5hAhKh 8h2s6c6d 3s4h6hTc 2dTh2cKs 3h4cAdAc 7d9cTsQh AsJdJc8c 7sKc2h7h 4sTd8sQc Qs7c9d5d"));
  }

  @Test
  public void test_omaha_holdem_3214_3c5c6d8cAd_TsJc7cJs_Td5h4h7h() {
    assertEquals(
      "Td5h4h7h TsJc7cJs",
      Solver.process("omaha-holdem 3c5c6d8cAd TsJc7cJs Td5h4h7h"));
  }

  @Test
  public void test_omaha_holdem_3215_5hAcKcKhQh_9hJc8h8c_3d9dAhJs_2c2d5c7s_8dKsTsJd_7d4s2hKd_Qc3c4c6s_2s9sJhQd_As3h7c6h_Qs3s7hAd() {
    assertEquals(
      "2c2d5c7s Qc3c4c6s 2s9sJhQd 3d9dAhJs Qs3s7hAd 7d4s2hKd 8dKsTsJd As3h7c6h 9hJc8h8c",
      Solver.process("omaha-holdem 5hAcKcKhQh 9hJc8h8c 3d9dAhJs 2c2d5c7s 8dKsTsJd 7d4s2hKd Qc3c4c6s 2s9sJhQd As3h7c6h Qs3s7hAd"));
  }

  @Test
  public void test_omaha_holdem_3216_2s4h6sJdQh_2h6h4d7c_7dKs4cQc_8sKc7sQs_9d2d3cJc() {
    assertEquals(
      "8sKc7sQs 2h6h4d7c 9d2d3cJc 7dKs4cQc",
      Solver.process("omaha-holdem 2s4h6sJdQh 2h6h4d7c 7dKs4cQc 8sKc7sQs 9d2d3cJc"));
  }

  @Test
  public void test_omaha_holdem_3217_4h5h7h9dQc_Jd8sJh8d_5sTd3c6s_Ts8h8c5c_JsAc4d9h_6h6cJc2s_5d2dKh9c_QdAdQhTh() {
    assertEquals(
      "6h6cJc2s Ts8h8c5c Jd8sJh8d JsAc4d9h 5d2dKh9c 5sTd3c6s QdAdQhTh",
      Solver.process("omaha-holdem 4h5h7h9dQc Jd8sJh8d 5sTd3c6s Ts8h8c5c JsAc4d9h 6h6cJc2s 5d2dKh9c QdAdQhTh"));
  }

  @Test
  public void test_omaha_holdem_3218_3h3s6hJhTd_Qs7cAhKh_3cTcKc2h_3d7sTs2s_8s8dAcTh_4cKd4d7d_6s5sJc9c_Ks6c2dJs() {
    assertEquals(
      "4cKd4d7d 8s8dAcTh 6s5sJc9c=Ks6c2dJs Qs7cAhKh 3cTcKc2h=3d7sTs2s",
      Solver.process("omaha-holdem 3h3s6hJhTd Qs7cAhKh 3cTcKc2h 3d7sTs2s 8s8dAcTh 4cKd4d7d 6s5sJc9c Ks6c2dJs"));
  }

  @Test
  public void test_omaha_holdem_3219_3d4h9cQhTh_9h4s7h9s_5cAd2d6h_7cKhJcJs_4d3c2sTs_As7d4c8s_KcAc6sJh_KdTcAh2h() {
    assertEquals(
      "5cAd2d6h As7d4c8s 4d3c2sTs 7cKhJcJs=KcAc6sJh 9h4s7h9s KdTcAh2h",
      Solver.process("omaha-holdem 3d4h9cQhTh 9h4s7h9s 5cAd2d6h 7cKhJcJs 4d3c2sTs As7d4c8s KcAc6sJh KdTcAh2h"));
  }

  @Test
  public void test_omaha_holdem_3220_4h8cAcQsTd_5cAh3dKs_8h3c5s6s_Qd7h6hTs() {
    assertEquals(
      "8h3c5s6s 5cAh3dKs Qd7h6hTs",
      Solver.process("omaha-holdem 4h8cAcQsTd 5cAh3dKs 8h3c5s6s Qd7h6hTs"));
  }

  @Test
  public void test_omaha_holdem_3221_4d4hJdJhKd_Kh3d2h9h_3s4sTsAs_Ac9cJsQh_8s8d2d4c_Th7h9d5s_6hQs3hAh_2s6dKc5h_Jc9s8c5c() {
    assertEquals(
      "Th7h9d5s 6hQs3hAh 2s6dKc5h Kh3d2h9h 3s4sTsAs Jc9s8c5c Ac9cJsQh 8s8d2d4c",
      Solver.process("omaha-holdem 4d4hJdJhKd Kh3d2h9h 3s4sTsAs Ac9cJsQh 8s8d2d4c Th7h9d5s 6hQs3hAh 2s6dKc5h Jc9s8c5c"));
  }

  @Test
  public void test_omaha_holdem_3222_3d5d5hAsKs_JsTs4cJh_Qh6s2h4s_KhKd6d5c_7sTcJdTh_8h7hKc8d_7d9h6h3c_9s5s9d6c_Qc2s4d2c() {
    assertEquals(
      "7d9h6h3c 7sTcJdTh JsTs4cJh 8h7hKc8d 9s5s9d6c Qc2s4d2c=Qh6s2h4s KhKd6d5c",
      Solver.process("omaha-holdem 3d5d5hAsKs JsTs4cJh Qh6s2h4s KhKd6d5c 7sTcJdTh 8h7hKc8d 7d9h6h3c 9s5s9d6c Qc2s4d2c"));
  }

  @Test
  public void test_omaha_holdem_3223_2c3h7d8hAc_7c2dAd4s_4h4dAh8d_6h4c9h5d_Kh5sQc6d_7h3dQd2h() {
    assertEquals(
      "Kh5sQc6d 7h3dQd2h 7c2dAd4s 4h4dAh8d 6h4c9h5d",
      Solver.process("omaha-holdem 2c3h7d8hAc 7c2dAd4s 4h4dAh8d 6h4c9h5d Kh5sQc6d 7h3dQd2h"));
  }

  @Test
  public void test_omaha_holdem_3224_2d5s7h8d9d_2c3dKs3h_8cAdKcKd_JdTc2h4s_5d7sQc2s() {
    assertEquals(
      "2c3dKs3h 5d7sQc2s JdTc2h4s 8cAdKcKd",
      Solver.process("omaha-holdem 2d5s7h8d9d 2c3dKs3h 8cAdKcKd JdTc2h4s 5d7sQc2s"));
  }

  @Test
  public void test_omaha_holdem_3225_6c7c9sKsTh_4d5d8s8h_Js7hTs9d_Ad8c4s6s_KdQsJh6d() {
    assertEquals(
      "Js7hTs9d 4d5d8s8h Ad8c4s6s KdQsJh6d",
      Solver.process("omaha-holdem 6c7c9sKsTh 4d5d8s8h Js7hTs9d Ad8c4s6s KdQsJh6d"));
  }

  @Test
  public void test_omaha_holdem_3226_3d7c8hAsKs_6d2hAhTs_8s3s8d7s_7h5c2d4d_2cJc7d5s_QcKdTh5d_6sJd4s4c() {
    assertEquals(
      "6sJd4s4c 7h5c2d4d 2cJc7d5s QcKdTh5d 6d2hAhTs 8s3s8d7s",
      Solver.process("omaha-holdem 3d7c8hAsKs 6d2hAhTs 8s3s8d7s 7h5c2d4d 2cJc7d5s QcKdTh5d 6sJd4s4c"));
  }

  @Test
  public void test_omaha_holdem_3227_2s3d5sAsJh_6h6s9cQs_9d4d8hKd_Ts7sTh5d_5h3h8s9s() {
    assertEquals(
      "9d4d8hKd 5h3h8s9s Ts7sTh5d 6h6s9cQs",
      Solver.process("omaha-holdem 2s3d5sAsJh 6h6s9cQs 9d4d8hKd Ts7sTh5d 5h3h8s9s"));
  }

  @Test
  public void test_omaha_holdem_3228_3d6cAcJhTc_8h9h4cTh_3h9cTsQc_4d8s6d4h_7h4s7c6s_8c6hKd5s_Kc5d8dTd_Kh3sJcAd_Ah3c5h2d() {
    assertEquals(
      "4d8s6d4h 8c6hKd5s 7h4s7c6s 8h9h4cTh Kc5d8dTd Ah3c5h2d Kh3sJcAd 3h9cTsQc",
      Solver.process("omaha-holdem 3d6cAcJhTc 8h9h4cTh 3h9cTsQc 4d8s6d4h 7h4s7c6s 8c6hKd5s Kc5d8dTd Kh3sJcAd Ah3c5h2d"));
  }

  @Test
  public void test_omaha_holdem_3229_3s7cAhAsKd_Ac6cTs8h_TdQdQcQh_2cKc3c5d_6d4dJcQs_Th3d4s7d() {
    assertEquals(
      "6d4dJcQs Th3d4s7d TdQdQcQh 2cKc3c5d Ac6cTs8h",
      Solver.process("omaha-holdem 3s7cAhAsKd Ac6cTs8h TdQdQcQh 2cKc3c5d 6d4dJcQs Th3d4s7d"));
  }

  @Test
  public void test_omaha_holdem_3230_6c8d8s9sTs_7d7c3s2d_8hAd3h4d() {
    assertEquals(
      "7d7c3s2d 8hAd3h4d",
      Solver.process("omaha-holdem 6c8d8s9sTs 7d7c3s2d 8hAd3h4d"));
  }

  @Test
  public void test_omaha_holdem_3231_2h4c8sAhTd_5dJh9s3d_2dTcJc7d() {
    assertEquals(
      "2dTcJc7d 5dJh9s3d",
      Solver.process("omaha-holdem 2h4c8sAhTd 5dJh9s3d 2dTcJc7d"));
  }

  @Test
  public void test_omaha_holdem_3232_2d4c4s7hKd_Th7dQdKs_TsAcTdKh_Qs6dJs8s_Jh5dTc8d_Jd2h4hKc_5s3d6s9c_Qh8h5c8c_3h9h9s4d() {
    assertEquals(
      "5s3d6s9c Jh5dTc8d Qs6dJs8s Qh8h5c8c TsAcTdKh Th7dQdKs 3h9h9s4d Jd2h4hKc",
      Solver.process("omaha-holdem 2d4c4s7hKd Th7dQdKs TsAcTdKh Qs6dJs8s Jh5dTc8d Jd2h4hKc 5s3d6s9c Qh8h5c8c 3h9h9s4d"));
  }

  @Test
  public void test_omaha_holdem_3233_3c3h7h8hQs_9hThTdKh_6cAd4cKd_5cQh8d5h_2d8s5s5d() {
    assertEquals(
      "6cAd4cKd 2d8s5s5d 5cQh8d5h 9hThTdKh",
      Solver.process("omaha-holdem 3c3h7h8hQs 9hThTdKh 6cAd4cKd 5cQh8d5h 2d8s5s5d"));
  }

  @Test
  public void test_omaha_holdem_3234_3s5h7sAhQc_Ts5d3dTd_AdKcKhKs_6d5s4d7d_9h2c9cQs() {
    assertEquals(
      "9h2c9cQs AdKcKhKs Ts5d3dTd 6d5s4d7d",
      Solver.process("omaha-holdem 3s5h7sAhQc Ts5d3dTd AdKcKhKs 6d5s4d7d 9h2c9cQs"));
  }

  @Test
  public void test_omaha_holdem_3235_7h8c8hKcKs_9sAs9h8d_6s3cTcQs_5sJh7dAh_ThKh2h3d() {
    assertEquals(
      "6s3cTcQs 5sJh7dAh 9sAs9h8d ThKh2h3d",
      Solver.process("omaha-holdem 7h8c8hKcKs 9sAs9h8d 6s3cTcQs 5sJh7dAh ThKh2h3d"));
  }

  @Test
  public void test_omaha_holdem_3236_2h3c3d9dAc_4d9h8hTc_7dAsQh6s_Ks4c5h9c_Ad8d5d5c() {
    assertEquals(
      "4d9h8hTc Ad8d5d5c 7dAsQh6s Ks4c5h9c",
      Solver.process("omaha-holdem 2h3c3d9dAc 4d9h8hTc 7dAsQh6s Ks4c5h9c Ad8d5d5c"));
  }

  @Test
  public void test_omaha_holdem_3237_3d6c7hJsTh_AdTs4h5s_Qd3s8c2s_6dTd7d8d_As4s8s7c_Ks6s3cKh_9c5dJd2d() {
    assertEquals(
      "Qd3s8c2s As4s8s7c 9c5dJd2d Ks6s3cKh 6dTd7d8d AdTs4h5s",
      Solver.process("omaha-holdem 3d6c7hJsTh AdTs4h5s Qd3s8c2s 6dTd7d8d As4s8s7c Ks6s3cKh 9c5dJd2d"));
  }

  @Test
  public void test_omaha_holdem_3238_2h3h6dKdTc_Kc9sJh3s_Qc9hAsAc_JdTd4dQh_5h5s9cTh_7s4c8sJc_8c4s9dJs_2d2s4h3d_Ah8h6cKs() {
    assertEquals(
      "7s4c8sJc 8c4s9dJs 5h5s9cTh JdTd4dQh Qc9hAsAc Kc9sJh3s Ah8h6cKs 2d2s4h3d",
      Solver.process("omaha-holdem 2h3h6dKdTc Kc9sJh3s Qc9hAsAc JdTd4dQh 5h5s9cTh 7s4c8sJc 8c4s9dJs 2d2s4h3d Ah8h6cKs"));
  }

  @Test
  public void test_omaha_holdem_3239_AcAsJhQcTc_4d5h3c2d_7h3h5sQs() {
    assertEquals(
      "4d5h3c2d 7h3h5sQs",
      Solver.process("omaha-holdem AcAsJhQcTc 4d5h3c2d 7h3h5sQs"));
  }

  @Test
  public void test_omaha_holdem_3240_2s6c7c9cJd_Ah5c5s5h_3hQd4dJh_4s8cTc2c_KcAs8sKd_Qc8hTh2h_5dTs3dJc() {
    assertEquals(
      "Ah5c5s5h 5dTs3dJc 3hQd4dJh KcAs8sKd Qc8hTh2h 4s8cTc2c",
      Solver.process("omaha-holdem 2s6c7c9cJd Ah5c5s5h 3hQd4dJh 4s8cTc2c KcAs8sKd Qc8hTh2h 5dTs3dJc"));
  }

  @Test
  public void test_omaha_holdem_3241_2d5s6h8hTs_7c5c3s2h_Qc7dKhTc_Jh9c9dTd_9hAc4cJc_ThAs8d6c_QsKsAd7s() {
    assertEquals(
      "9hAc4cJc QsKsAd7s Jh9c9dTd Qc7dKhTc 7c5c3s2h ThAs8d6c",
      Solver.process("omaha-holdem 2d5s6h8hTs 7c5c3s2h Qc7dKhTc Jh9c9dTd 9hAc4cJc ThAs8d6c QsKsAd7s"));
  }

  @Test
  public void test_omaha_holdem_3242_5s7c7sJhQc_6c4c8dTd_2cJsQs3s_4h9c2hKc_TcQhAc9h_2s9s8cTh_Ad8hJcAh_6s4dKh8s_3h3c7hAs() {
    assertEquals(
      "6c4c8dTd 2s9s8cTh 6s4dKh8s 4h9c2hKc TcQhAc9h 2cJsQs3s Ad8hJcAh 3h3c7hAs",
      Solver.process("omaha-holdem 5s7c7sJhQc 6c4c8dTd 2cJsQs3s 4h9c2hKc TcQhAc9h 2s9s8cTh Ad8hJcAh 6s4dKh8s 3h3c7hAs"));
  }

  @Test
  public void test_omaha_holdem_3243_2c6d6h9hQs_3hQc9sAs_Ts8d2hAd_8sKc3s4s_JdQdKh4c_5h6cKs5s_KdTh8c8h_2d4hJhQh_Td7s7d4d_Js7hTcJc() {
    assertEquals(
      "8sKc3s4s Ts8d2hAd Td7s7d4d KdTh8c8h Js7hTcJc 2d4hJhQh JdQdKh4c 3hQc9sAs 5h6cKs5s",
      Solver.process("omaha-holdem 2c6d6h9hQs 3hQc9sAs Ts8d2hAd 8sKc3s4s JdQdKh4c 5h6cKs5s KdTh8c8h 2d4hJhQh Td7s7d4d Js7hTcJc"));
  }

  @Test
  public void test_omaha_holdem_3244_2d5s6d7c7d_Qd5cKh8s_QsAcTh7s() {
    assertEquals(
      "Qd5cKh8s QsAcTh7s",
      Solver.process("omaha-holdem 2d5s6d7c7d Qd5cKh8s QsAcTh7s"));
  }

  @Test
  public void test_omaha_holdem_3245_7h9hJcKsTc_ThAdQcJh_4hAs4s3d_QdJs6c5d_5s2cTd2s_4dKd2hKh_6d9c9s8h_6h3s8sQs() {
    assertEquals(
      "4hAs4s3d 5s2cTd2s 4dKd2hKh 6d9c9s8h 6h3s8sQs QdJs6c5d ThAdQcJh",
      Solver.process("omaha-holdem 7h9hJcKsTc ThAdQcJh 4hAs4s3d QdJs6c5d 5s2cTd2s 4dKd2hKh 6d9c9s8h 6h3s8sQs"));
  }

  @Test
  public void test_omaha_holdem_3246_4d8sAsKcKd_9s4h8dQh_9hAdTs7c_5c6hTh6d_Qs2d6cJc_JsJd9cQd_Ac2c7h8h_KsKh4c7d_4s5s3c7s_Tc5h2s5d() {
    assertEquals(
      "Qs2d6cJc 4s5s3c7s Tc5h2s5d 5c6hTh6d 9s4h8dQh JsJd9cQd Ac2c7h8h 9hAdTs7c KsKh4c7d",
      Solver.process("omaha-holdem 4d8sAsKcKd 9s4h8dQh 9hAdTs7c 5c6hTh6d Qs2d6cJc JsJd9cQd Ac2c7h8h KsKh4c7d 4s5s3c7s Tc5h2s5d"));
  }

  @Test
  public void test_omaha_holdem_3247_3h3s7s9hAc_2d7dTc7h_5c5s6h4h_9sKh2h3c() {
    assertEquals(
      "5c5s6h4h 9sKh2h3c 2d7dTc7h",
      Solver.process("omaha-holdem 3h3s7s9hAc 2d7dTc7h 5c5s6h4h 9sKh2h3c"));
  }

  @Test
  public void test_omaha_holdem_3248_2c3d5d6hKs_4h2h3h8s_9sJs8c8h_4d6sJh7h_8dAhTcKd_2dJc2s3s_QdTsTh6c() {
    assertEquals(
      "9sJs8c8h QdTsTh6c 8dAhTcKd 2dJc2s3s 4h2h3h8s 4d6sJh7h",
      Solver.process("omaha-holdem 2c3d5d6hKs 4h2h3h8s 9sJs8c8h 4d6sJh7h 8dAhTcKd 2dJc2s3s QdTsTh6c"));
  }

  @Test
  public void test_omaha_holdem_3249_3d6h6s9dTd_8hAh6dJs_9c8cAd4c_7h2d5cAc_6c5h4hTc_5dQs3s7s_5sQc2hQh() {
    assertEquals(
      "7h2d5cAc 5dQs3s7s 9c8cAd4c 5sQc2hQh 8hAh6dJs 6c5h4hTc",
      Solver.process("omaha-holdem 3d6h6s9dTd 8hAh6dJs 9c8cAd4c 7h2d5cAc 6c5h4hTc 5dQs3s7s 5sQc2hQh"));
  }

}
