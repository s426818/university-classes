
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver9HiddenTest {


  @Test
  public void test_omaha_holdem_2250_2d4h5d6dAd_6s8d4c7s_2sKc3dQd_7c9cTcAc_6c8h8c7d_5cQs5sKh_Jd7h9dTh_4s2hTs8s_QhJh9sJs_5h4dJcAs() {
    assertEquals(
      "QhJh9sJs 7c9cTcAc 4s2hTs8s 5h4dJcAs 5cQs5sKh 6c8h8c7d=6s8d4c7s Jd7h9dTh 2sKc3dQd",
      Solver.process("omaha-holdem 2d4h5d6dAd 6s8d4c7s 2sKc3dQd 7c9cTcAc 6c8h8c7d 5cQs5sKh Jd7h9dTh 4s2hTs8s QhJh9sJs 5h4dJcAs"));
  }

  @Test
  public void test_omaha_holdem_2251_3c6c9cJdTc_Qd2hQc6h_Qs2s8d9h_Td5s2d9d_6d5d8c8s_Ts5h4cQh() {
    assertEquals(
      "6d5d8c8s Ts5h4cQh Qd2hQc6h Td5s2d9d Qs2s8d9h",
      Solver.process("omaha-holdem 3c6c9cJdTc Qd2hQc6h Qs2s8d9h Td5s2d9d 6d5d8c8s Ts5h4cQh"));
  }

  @Test
  public void test_omaha_holdem_2252_3h4h5h6cQs_7hKh9h7d_7c5c6s9c_2s3c8dKd_8s3dQdAd_4c7sTcTh_8hAh8c2h_TdQh9sAc_QcJc2cJh_Kc5sAs9d() {
    assertEquals(
      "Kc5sAs9d QcJc2cJh TdQh9sAc 8s3dQdAd 2s3c8dKd 4c7sTcTh=7c5c6s9c 7hKh9h7d 8hAh8c2h",
      Solver.process("omaha-holdem 3h4h5h6cQs 7hKh9h7d 7c5c6s9c 2s3c8dKd 8s3dQdAd 4c7sTcTh 8hAh8c2h TdQh9sAc QcJc2cJh Kc5sAs9d"));
  }

  @Test
  public void test_omaha_holdem_2253_3d4c6dKsQh_Kd7c9s6c_2cQsQc7s_KcThTc5s_JhQd5c9c() {
    assertEquals(
      "JhQd5c9c KcThTc5s Kd7c9s6c 2cQsQc7s",
      Solver.process("omaha-holdem 3d4c6dKsQh Kd7c9s6c 2cQsQc7s KcThTc5s JhQd5c9c"));
  }

  @Test
  public void test_omaha_holdem_2254_4d6d6h8d9c_KdJcTc5c_4cQd5h2d_7h3c4s2s_7sQh2hAs() {
    assertEquals(
      "KdJcTc5c 7sQh2hAs 7h3c4s2s 4cQd5h2d",
      Solver.process("omaha-holdem 4d6d6h8d9c KdJcTc5c 4cQd5h2d 7h3c4s2s 7sQh2hAs"));
  }

  @Test
  public void test_omaha_holdem_2255_4c4d5cKdKs_8d4s7h9h_KcQsTh2s_Ad2cAcQd() {
    assertEquals(
      "Ad2cAcQd 8d4s7h9h KcQsTh2s",
      Solver.process("omaha-holdem 4c4d5cKdKs 8d4s7h9h KcQsTh2s Ad2cAcQd"));
  }

  @Test
  public void test_omaha_holdem_2256_5d7sQcQhTc_8c3sKsJh_9dAdKc4h_3hAcAh2h_As2c3c9h() {
    assertEquals(
      "8c3sKsJh As2c3c9h 9dAdKc4h 3hAcAh2h",
      Solver.process("omaha-holdem 5d7sQcQhTc 8c3sKsJh 9dAdKc4h 3hAcAh2h As2c3c9h"));
  }

  @Test
  public void test_omaha_holdem_2257_3h5cJsKhTc_Qd8h6c2c_5hKc5sTd_2d2sQcAd_9c7cAhJc_9h6hTh8s_Qh7d9dKs() {
    assertEquals(
      "Qd8h6c2c 9h6hTh8s 9c7cAhJc 5hKc5sTd Qh7d9dKs 2d2sQcAd",
      Solver.process("omaha-holdem 3h5cJsKhTc Qd8h6c2c 5hKc5sTd 2d2sQcAd 9c7cAhJc 9h6hTh8s Qh7d9dKs"));
  }

  @Test
  public void test_omaha_holdem_2258_2s4dAhQsTh_JdTdKc3d_2c7d6cTc_Ks6s9s7h_9h8s5c6h() {
    assertEquals(
      "9h8s5c6h Ks6s9s7h 2c7d6cTc JdTdKc3d",
      Solver.process("omaha-holdem 2s4dAhQsTh JdTdKc3d 2c7d6cTc Ks6s9s7h 9h8s5c6h"));
  }

  @Test
  public void test_omaha_holdem_2259_3c4dJsThTs_5hJhJc9c_2sAd9s3d_4s6cQs9h_4hAs2d8h_Ah4cKcKd_Qc6d2hKh_5d8c9d7s_3hKsQh5s_6s6h3sTd() {
    assertEquals(
      "5d8c9d7s Qc6d2hKh 3hKsQh5s 2sAd9s3d 4s6cQs9h 4hAs2d8h Ah4cKcKd 6s6h3sTd 5hJhJc9c",
      Solver.process("omaha-holdem 3c4dJsThTs 5hJhJc9c 2sAd9s3d 4s6cQs9h 4hAs2d8h Ah4cKcKd Qc6d2hKh 5d8c9d7s 3hKsQh5s 6s6h3sTd"));
  }

  @Test
  public void test_omaha_holdem_2260_3d4d8hJdTs_Js3hKhQd_6c9d7s8c_4h7dAh5h_3c5dQh2d_8sJc2s7h_2c9s7c4c_6sAc5cAd() {
    assertEquals(
      "4h7dAh5h 6sAc5cAd Js3hKhQd 8sJc2s7h 2c9s7c4c=6c9d7s8c 3c5dQh2d",
      Solver.process("omaha-holdem 3d4d8hJdTs Js3hKhQd 6c9d7s8c 4h7dAh5h 3c5dQh2d 8sJc2s7h 2c9s7c4c 6sAc5cAd"));
  }

  @Test
  public void test_omaha_holdem_2261_3s5s7c8cAs_6hAcKd9h_3c6s4d5c_Qs2dKsQd_JsTsJhQc() {
    assertEquals(
      "3c6s4d5c 6hAcKd9h JsTsJhQc Qs2dKsQd",
      Solver.process("omaha-holdem 3s5s7c8cAs 6hAcKd9h 3c6s4d5c Qs2dKsQd JsTsJhQc"));
  }

  @Test
  public void test_omaha_holdem_2262_4hAhKcQhTs_3s6h8h4d_ThAc8s9h_2s3d5d5h_6d4s6sQc_Jd5sTdJs_9dQs3hAd_8c7sKd8d_6c7c9sAs_3c5c7hKh() {
    assertEquals(
      "2s3d5d5h 8c7sKd8d 6c7c9sAs 6d4s6sQc 9dQs3hAd Jd5sTdJs 3s6h8h4d ThAc8s9h 3c5c7hKh",
      Solver.process("omaha-holdem 4hAhKcQhTs 3s6h8h4d ThAc8s9h 2s3d5d5h 6d4s6sQc Jd5sTdJs 9dQs3hAd 8c7sKd8d 6c7c9sAs 3c5c7hKh"));
  }

  @Test
  public void test_omaha_holdem_2263_7h8c9dAsQs_5d5h9s4c_9c2dKsKh() {
    assertEquals(
      "5d5h9s4c 9c2dKsKh",
      Solver.process("omaha-holdem 7h8c9dAsQs 5d5h9s4c 9c2dKsKh"));
  }

  @Test
  public void test_omaha_holdem_2264_4c7cAcJsKs_5d9sAh9c_6h8sJd3d_Td5h7h2d_Jh4s3s4d() {
    assertEquals(
      "Td5h7h2d 6h8sJd3d 5d9sAh9c Jh4s3s4d",
      Solver.process("omaha-holdem 4c7cAcJsKs 5d9sAh9c 6h8sJd3d Td5h7h2d Jh4s3s4d"));
  }

  @Test
  public void test_omaha_holdem_2265_4c6c6d7cAc_2cKsThKh_Jc5dQs9h_Qd9dTc3d_Td5c2s3h_2dQh3s4d_Ah7d7s5s_9c9s8h6s() {
    assertEquals(
      "Qd9dTc3d Jc5dQs9h 2dQh3s4d 2cKsThKh 9c9s8h6s Td5c2s3h Ah7d7s5s",
      Solver.process("omaha-holdem 4c6c6d7cAc 2cKsThKh Jc5dQs9h Qd9dTc3d Td5c2s3h 2dQh3s4d Ah7d7s5s 9c9s8h6s"));
  }

  @Test
  public void test_omaha_holdem_2266_3s8sKdKhQc_6d9s5d4c_4d2dQd6h_Js8d7c5h_Qs2hAdAc_Qh9d8hTs_3c4h3h7h_AsKc8c6c() {
    assertEquals(
      "6d9s5d4c Js8d7c5h 4d2dQd6h Qh9d8hTs Qs2hAdAc 3c4h3h7h AsKc8c6c",
      Solver.process("omaha-holdem 3s8sKdKhQc 6d9s5d4c 4d2dQd6h Js8d7c5h Qs2hAdAc Qh9d8hTs 3c4h3h7h AsKc8c6c"));
  }

  @Test
  public void test_omaha_holdem_2267_2d5c8cKdQc_8d6d3sTd_5sQsAs5h_Jc2h2c7s_JdJs3d6s_5dAc3cTh_7cKc4sAh_TcJh4h4c_9c8h9dKh_8sKs2s7h() {
    assertEquals(
      "8d6d3sTd JdJs3d6s 8sKs2s7h=9c8h9dKh 5sQsAs5h TcJh4h4c Jc2h2c7s 7cKc4sAh 5dAc3cTh",
      Solver.process("omaha-holdem 2d5c8cKdQc 8d6d3sTd 5sQsAs5h Jc2h2c7s JdJs3d6s 5dAc3cTh 7cKc4sAh TcJh4h4c 9c8h9dKh 8sKs2s7h"));
  }

  @Test
  public void test_omaha_holdem_2268_2sAdQcQsTh_3sJc8hKs_7dKhTd2c_Jd5dTc6h_7h4h5c9s_2h8cTsAh_9dQh7c9c() {
    assertEquals(
      "7h4h5c9s Jd5dTc6h 7dKhTd2c 2h8cTsAh 9dQh7c9c 3sJc8hKs",
      Solver.process("omaha-holdem 2sAdQcQsTh 3sJc8hKs 7dKhTd2c Jd5dTc6h 7h4h5c9s 2h8cTsAh 9dQh7c9c"));
  }

  @Test
  public void test_omaha_holdem_2269_3h3s4h6cKh_5d8cAs2h_5h9dKd6d_Td2dJs7s_4s9h9s2c_AhQh4d7c_3d7h8dTs_3cJcJhTc_QdAd8sKs() {
    assertEquals(
      "Td2dJs7s 4s9h9s2c QdAd8sKs 5h9dKd6d 3d7h8dTs 3cJcJhTc 5d8cAs2h AhQh4d7c",
      Solver.process("omaha-holdem 3h3s4h6cKh 5d8cAs2h 5h9dKd6d Td2dJs7s 4s9h9s2c AhQh4d7c 3d7h8dTs 3cJcJhTc QdAd8sKs"));
  }

  @Test
  public void test_omaha_holdem_2270_2h6d9cAsKc_Th4c5c8s_4h4s2s3s_4d8c9sQd() {
    assertEquals(
      "Th4c5c8s 4h4s2s3s 4d8c9sQd",
      Solver.process("omaha-holdem 2h6d9cAsKc Th4c5c8s 4h4s2s3s 4d8c9sQd"));
  }

  @Test
  public void test_omaha_holdem_2271_3d4d4h5dJs_8dThAd4s_2hTd6d8c_2sJh7h5s_Jc5c6c2d_6sQdQs3s_9dKd9h3h_KcAs6h4c_3c2c5h7d_AcQc7s9s() {
    assertEquals(
      "AcQc7s9s 3c2c5h7d 2sJh7h5s 6sQdQs3s KcAs6h4c Jc5c6c2d 2hTd6d8c 9dKd9h3h 8dThAd4s",
      Solver.process("omaha-holdem 3d4d4h5dJs 8dThAd4s 2hTd6d8c 2sJh7h5s Jc5c6c2d 6sQdQs3s 9dKd9h3h KcAs6h4c 3c2c5h7d AcQc7s9s"));
  }

  @Test
  public void test_omaha_holdem_2272_2c4c4h6dAs_4d9h5c3d_8h7dQhAd_Kh8cTh3h_TdAc9cQs_2hQdJc8d() {
    assertEquals(
      "Kh8cTh3h 2hQdJc8d 8h7dQhAd=TdAc9cQs 4d9h5c3d",
      Solver.process("omaha-holdem 2c4c4h6dAs 4d9h5c3d 8h7dQhAd Kh8cTh3h TdAc9cQs 2hQdJc8d"));
  }

  @Test
  public void test_omaha_holdem_2273_8h9h9sKdQs_Js7c5sTs_Th4hAh2c_3cJh2dKh_4c2h2s6c_7hTdQhAd_8dJdJc9d() {
    assertEquals(
      "Th4hAh2c 4c2h2s6c 7hTdQhAd 3cJh2dKh Js7c5sTs 8dJdJc9d",
      Solver.process("omaha-holdem 8h9h9sKdQs Js7c5sTs Th4hAh2c 3cJh2dKh 4c2h2s6c 7hTdQhAd 8dJdJc9d"));
  }

  @Test
  public void test_omaha_holdem_2274_2s3d7cJsQc_TsAhTc2d_Jd8h4c8s_5dAd9d4d() {
    assertEquals(
      "5dAd9d4d TsAhTc2d Jd8h4c8s",
      Solver.process("omaha-holdem 2s3d7cJsQc TsAhTc2d Jd8h4c8s 5dAd9d4d"));
  }

  @Test
  public void test_omaha_holdem_2275_3c4c4dAcKd_Tc9hTsTd_7c7h8cQh_7s6c2sAs_3d3s9d8d() {
    assertEquals(
      "Tc9hTsTd 7s6c2sAs 7c7h8cQh 3d3s9d8d",
      Solver.process("omaha-holdem 3c4c4dAcKd Tc9hTsTd 7c7h8cQh 7s6c2sAs 3d3s9d8d"));
  }

  @Test
  public void test_omaha_holdem_2276_9c9hAhKdTh_6c3hKh5c_Js5sKc9d_6d6sJcAs_7d7h2cTd_Ks4dAc4s_Qd6hTcQh_3c5hJh8c() {
    assertEquals(
      "7d7h2cTd 6d6sJcAs Ks4dAc4s 3c5hJh8c Qd6hTcQh 6c3hKh5c Js5sKc9d",
      Solver.process("omaha-holdem 9c9hAhKdTh 6c3hKh5c Js5sKc9d 6d6sJcAs 7d7h2cTd Ks4dAc4s Qd6hTcQh 3c5hJh8c"));
  }

  @Test
  public void test_omaha_holdem_2277_6h9cKdQdTh_7h7s9s3d_5s2dAs8h_2sKc3s4d_JhQc5d8c_Ad6dTc7d_9h3cJdAh_4cTs5hKs_Js4h6c4s() {
    assertEquals(
      "5s2dAs8h Js4h6c4s 7h7s9s3d 2sKc3s4d Ad6dTc7d 4cTs5hKs JhQc5d8c 9h3cJdAh",
      Solver.process("omaha-holdem 6h9cKdQdTh 7h7s9s3d 5s2dAs8h 2sKc3s4d JhQc5d8c Ad6dTc7d 9h3cJdAh 4cTs5hKs Js4h6c4s"));
  }

  @Test
  public void test_omaha_holdem_2278_7hAhJcQhTh_8d6hJs2h_JdAdTs3d_6s5dQdQs_Ks8hKd2c_As9hKc9s() {
    assertEquals(
      "Ks8hKd2c JdAdTs3d 6s5dQdQs As9hKc9s 8d6hJs2h",
      Solver.process("omaha-holdem 7hAhJcQhTh 8d6hJs2h JdAdTs3d 6s5dQdQs Ks8hKd2c As9hKc9s"));
  }

  @Test
  public void test_omaha_holdem_2279_7sAcJsKdTc_2d5d7cAh_5h6c3s2s_8c4cQcQh_Jh7h3hKs_2hQdTs7d_Jc9c5c4s_2c6s8dTh_9hKcJd3c_As8h4hTd() {
    assertEquals(
      "5h6c3s2s 2c6s8dTh Jc9c5c4s 8c4cQcQh 9hKcJd3c=Jh7h3hKs 2d5d7cAh As8h4hTd 2hQdTs7d",
      Solver.process("omaha-holdem 7sAcJsKdTc 2d5d7cAh 5h6c3s2s 8c4cQcQh Jh7h3hKs 2hQdTs7d Jc9c5c4s 2c6s8dTh 9hKcJd3c As8h4hTd"));
  }

  @Test
  public void test_omaha_holdem_2280_2h5h7d8sKh_Qh7sJh4c_Kd3sQdTd_Jd4h2s8h() {
    assertEquals(
      "Kd3sQdTd Jd4h2s8h Qh7sJh4c",
      Solver.process("omaha-holdem 2h5h7d8sKh Qh7sJh4c Kd3sQdTd Jd4h2s8h"));
  }

  @Test
  public void test_omaha_holdem_2281_2h4c4d4hJd_QsAd9cTh_2c6d7cTd_Ks3s6cQc() {
    assertEquals(
      "2c6d7cTd Ks3s6cQc QsAd9cTh",
      Solver.process("omaha-holdem 2h4c4d4hJd QsAd9cTh 2c6d7cTd Ks3s6cQc"));
  }

  @Test
  public void test_omaha_holdem_2282_3s9d9hKcTs_6c4cKdKs_6dQcAs4h_Qh6s2c9c() {
    assertEquals(
      "6dQcAs4h Qh6s2c9c 6c4cKdKs",
      Solver.process("omaha-holdem 3s9d9hKcTs 6c4cKdKs 6dQcAs4h Qh6s2c9c"));
  }

  @Test
  public void test_omaha_holdem_2283_4d4s9cAhTc_8h9h9d5h_4c2h8c7s_7cAdKh9s_AcKdJh7h_TdJd7dJs_Ks2cAs6d_QsThTs2s_3s5d5sQc() {
    assertEquals(
      "3s5d5sQc TdJd7dJs AcKdJh7h=Ks2cAs6d 7cAdKh9s 4c2h8c7s 8h9h9d5h QsThTs2s",
      Solver.process("omaha-holdem 4d4s9cAhTc 8h9h9d5h 4c2h8c7s 7cAdKh9s AcKdJh7h TdJd7dJs Ks2cAs6d QsThTs2s 3s5d5sQc"));
  }

  @Test
  public void test_omaha_holdem_2284_3d9sJcTdTs_4s2hJs6h_3h6cKs8d_Kh8s6dQh_AdAc2d7c_As8h5h5c_4c2cJhAh_7h7s7dQs_JdThKd2s_3c5sKc9c() {
    assertEquals(
      "3h6cKs8d As8h5h5c 7h7s7dQs 3c5sKc9c 4s2hJs6h 4c2cJhAh AdAc2d7c Kh8s6dQh JdThKd2s",
      Solver.process("omaha-holdem 3d9sJcTdTs 4s2hJs6h 3h6cKs8d Kh8s6dQh AdAc2d7c As8h5h5c 4c2cJhAh 7h7s7dQs JdThKd2s 3c5sKc9c"));
  }

  @Test
  public void test_omaha_holdem_2285_3d9cAdKhTc_8s5cKdJc_2sTs4h2d_6d8h6h7c_QcJhQsKs_3cQdKc7d_Jd4c5d4s_7hTd9d3s_Ac8cQh9s() {
    assertEquals(
      "Jd4c5d4s 6d8h6h7c 2sTs4h2d 8s5cKdJc 7hTd9d3s 3cQdKc7d Ac8cQh9s QcJhQsKs",
      Solver.process("omaha-holdem 3d9cAdKhTc 8s5cKdJc 2sTs4h2d 6d8h6h7c QcJhQsKs 3cQdKc7d Jd4c5d4s 7hTd9d3s Ac8cQh9s"));
  }

  @Test
  public void test_omaha_holdem_2286_3d4dJdJsQs_4s9sTc3c_3h7hAd4h_9h9dJc8s() {
    assertEquals(
      "4s9sTc3c 3h7hAd4h 9h9dJc8s",
      Solver.process("omaha-holdem 3d4dJdJsQs 4s9sTc3c 3h7hAd4h 9h9dJc8s"));
  }

  @Test
  public void test_omaha_holdem_2287_6s7s9hJdTc_6hJc5sTh_6d2d5dQs() {
    assertEquals(
      "6d2d5dQs 6hJc5sTh",
      Solver.process("omaha-holdem 6s7s9hJdTc 6hJc5sTh 6d2d5dQs"));
  }

  @Test
  public void test_omaha_holdem_2288_2h5dJhJsQd_6dTs2d4h_3d5hAd6c_9s3h2c9c_Qs7s3cKh_Kc9dThTd_6s5s7dQc() {
    assertEquals(
      "6dTs2d4h 3d5hAd6c 9s3h2c9c Kc9dThTd 6s5s7dQc Qs7s3cKh",
      Solver.process("omaha-holdem 2h5dJhJsQd 6dTs2d4h 3d5hAd6c 9s3h2c9c Qs7s3cKh Kc9dThTd 6s5s7dQc"));
  }

  @Test
  public void test_omaha_holdem_2289_6s7hKcKsQh_4h8d5s5h_2sJsJd4s_3s8hTsTc_6d5d8c9h_3h4dQd7c_As7dAd2c_Kd8s2dTd_Kh9d9c7s() {
    assertEquals(
      "4h8d5s5h 6d5d8c9h 3s8hTsTc 2sJsJd4s 3h4dQd7c As7dAd2c Kd8s2dTd Kh9d9c7s",
      Solver.process("omaha-holdem 6s7hKcKsQh 4h8d5s5h 2sJsJd4s 3s8hTsTc 6d5d8c9h 3h4dQd7c As7dAd2c Kd8s2dTd Kh9d9c7s"));
  }

  @Test
  public void test_omaha_holdem_2290_2dAcAhKhTc_3dJcQd2s_6s2h9d7h_6c2c4sAs_4h7dKs9h_3h5dQh4d_9s3c5s4c_8hTh9cTd_Ad8s5h6d() {
    assertEquals(
      "9s3c5s4c 3h5dQh4d 6s2h9d7h 4h7dKs9h Ad8s5h6d 3dJcQd2s 8hTh9cTd 6c2c4sAs",
      Solver.process("omaha-holdem 2dAcAhKhTc 3dJcQd2s 6s2h9d7h 6c2c4sAs 4h7dKs9h 3h5dQh4d 9s3c5s4c 8hTh9cTd Ad8s5h6d"));
  }

  @Test
  public void test_omaha_holdem_2291_4h6h8cAcKh_9h4sTs8h_7d5d9sTc_2s3s7cQd_3dAd2hQs_Jd8s5s8d() {
    assertEquals(
      "2s3s7cQd 3dAd2hQs Jd8s5s8d 7d5d9sTc 9h4sTs8h",
      Solver.process("omaha-holdem 4h6h8cAcKh 9h4sTs8h 7d5d9sTc 2s3s7cQd 3dAd2hQs Jd8s5s8d"));
  }

  @Test
  public void test_omaha_holdem_2292_3h5c8sAcQc_As6s4h9h_QsKc4d9c_Tc6c6h3d() {
    assertEquals(
      "As6s4h9h Tc6c6h3d QsKc4d9c",
      Solver.process("omaha-holdem 3h5c8sAcQc As6s4h9h QsKc4d9c Tc6c6h3d"));
  }

  @Test
  public void test_omaha_holdem_2293_3s4h6c9hTc_8hQs7c9c_AhQd2dKc_5dJc2h8s_As8cAc7h_KhJd8d2c() {
    assertEquals(
      "KhJd8d2c AhQd2dKc 5dJc2h8s 8hQs7c9c=As8cAc7h",
      Solver.process("omaha-holdem 3s4h6c9hTc 8hQs7c9c AhQd2dKc 5dJc2h8s As8cAc7h KhJd8d2c"));
  }

  @Test
  public void test_omaha_holdem_2294_8sKcQcQdQh_Ts4cTd6d_9h5s9c2d_2hJcKd7h_3s2c4sAc_Jd7d5h9s_6sKs8d4h_Js9d5d5c_KhJh3c8h() {
    assertEquals(
      "Jd7d5h9s 6sKs8d4h 2hJcKd7h=KhJh3c8h 3s2c4sAc Js9d5d5c 9h5s9c2d Ts4cTd6d",
      Solver.process("omaha-holdem 8sKcQcQdQh Ts4cTd6d 9h5s9c2d 2hJcKd7h 3s2c4sAc Jd7d5h9s 6sKs8d4h Js9d5d5c KhJh3c8h"));
  }

  @Test
  public void test_omaha_holdem_2295_2s4d7cKhQh_8d8c7hQd_Ad4c4h3h_8s6dAcAs_Kd2c3d3s() {
    assertEquals(
      "8s6dAcAs 8d8c7hQd Kd2c3d3s Ad4c4h3h",
      Solver.process("omaha-holdem 2s4d7cKhQh 8d8c7hQd Ad4c4h3h 8s6dAcAs Kd2c3d3s"));
  }

  @Test
  public void test_omaha_holdem_2296_2d4s5sAdAs_Kc4h9sKd_7sJhTh6d_9c2h3sJs_6c8d8c5c_7d3c8s3d_9dQsJdTd_Ac5h4c7c_8h5dQh3h() {
    assertEquals(
      "7sJhTh6d 9dQsJdTd 7d3c8s3d 6c8d8c5c Kc4h9sKd 8h5dQh3h 9c2h3sJs Ac5h4c7c",
      Solver.process("omaha-holdem 2d4s5sAdAs Kc4h9sKd 7sJhTh6d 9c2h3sJs 6c8d8c5c 7d3c8s3d 9dQsJdTd Ac5h4c7c 8h5dQh3h"));
  }

  @Test
  public void test_omaha_holdem_2297_2d4d8sJhKs_6sThTsKd_4cAcKc2h_5h9dAsQs_3dAdJdKh_6d7c9sQc_6h4s8hAh_JsQh4hTd_7h3cTcQd() {
    assertEquals(
      "6d7c9sQc 7h3cTcQd 5h9dAsQs 6sThTsKd 6h4s8hAh JsQh4hTd 4cAcKc2h 3dAdJdKh",
      Solver.process("omaha-holdem 2d4d8sJhKs 6sThTsKd 4cAcKc2h 5h9dAsQs 3dAdJdKh 6d7c9sQc 6h4s8hAh JsQh4hTd 7h3cTcQd"));
  }

  @Test
  public void test_omaha_holdem_2298_2d2h7dKcQs_8d4cTdKh_Qh8h4sQd() {
    assertEquals(
      "8d4cTdKh Qh8h4sQd",
      Solver.process("omaha-holdem 2d2h7dKcQs 8d4cTdKh Qh8h4sQd"));
  }

  @Test
  public void test_omaha_holdem_2299_3c7s8h9hKd_Jd2s2hJs_3d9d8s9c() {
    assertEquals(
      "Jd2s2hJs 3d9d8s9c",
      Solver.process("omaha-holdem 3c7s8h9hKd Jd2s2hJs 3d9d8s9c"));
  }

  @Test
  public void test_omaha_holdem_2300_2c2s5dAdKh_3d9s9dTs_7cKc5c6h_5s4dJd2d_3s8hKdAc_Qh3c2hQc_Tc8d6s6d_7hQsAsAh_5h4cJhQd_8c4hJc7s() {
    assertEquals(
      "8c4hJc7s 5h4cJhQd Tc8d6s6d 3d9s9dTs 7cKc5c6h 3s8hKdAc Qh3c2hQc 5s4dJd2d 7hQsAsAh",
      Solver.process("omaha-holdem 2c2s5dAdKh 3d9s9dTs 7cKc5c6h 5s4dJd2d 3s8hKdAc Qh3c2hQc Tc8d6s6d 7hQsAsAh 5h4cJhQd 8c4hJc7s"));
  }

  @Test
  public void test_omaha_holdem_2301_2c2h6s7dAh_Ac5d3hQc_QdJd9h8d_3sKdAdTd_7s9d9c3c_8h6cTc4s() {
    assertEquals(
      "QdJd9h8d 8h6cTc4s 7s9d9c3c Ac5d3hQc 3sKdAdTd",
      Solver.process("omaha-holdem 2c2h6s7dAh Ac5d3hQc QdJd9h8d 3sKdAdTd 7s9d9c3c 8h6cTc4s"));
  }

  @Test
  public void test_omaha_holdem_2302_5c6s9sJsTh_Kh7hQdJc_9h8cAh4h_3hKd7s2s_QhTd7dAc_3s3c7c6d() {
    assertEquals(
      "3s3c7c6d 9h8cAh4h QhTd7dAc Kh7hQdJc 3hKd7s2s",
      Solver.process("omaha-holdem 5c6s9sJsTh Kh7hQdJc 9h8cAh4h 3hKd7s2s QhTd7dAc 3s3c7c6d"));
  }

  @Test
  public void test_omaha_holdem_2303_7d8c9dAsQs_2d8d3d6c_3sQcKc6h() {
    assertEquals(
      "2d8d3d6c 3sQcKc6h",
      Solver.process("omaha-holdem 7d8c9dAsQs 2d8d3d6c 3sQcKc6h"));
  }

  @Test
  public void test_omaha_holdem_2304_2h4d5dThTs_6dQh7d9s_2sAd8sTc_2dKhAh9h_AsJh7h4s_Kc8h6s3d_Ks4hJs3h() {
    assertEquals(
      "6dQh7d9s 2dKhAh9h Ks4hJs3h AsJh7h4s Kc8h6s3d 2sAd8sTc",
      Solver.process("omaha-holdem 2h4d5dThTs 6dQh7d9s 2sAd8sTc 2dKhAh9h AsJh7h4s Kc8h6s3d Ks4hJs3h"));
  }

  @Test
  public void test_omaha_holdem_2305_2d5h6h9hQh_Qs4s3h8h_JdJs3sKd_6d8c8dJc_9sKhTcJh_Kc3d7h2c() {
    assertEquals(
      "Kc3d7h2c 6d8c8dJc JdJs3sKd Qs4s3h8h 9sKhTcJh",
      Solver.process("omaha-holdem 2d5h6h9hQh Qs4s3h8h JdJs3sKd 6d8c8dJc 9sKhTcJh Kc3d7h2c"));
  }

  @Test
  public void test_omaha_holdem_2306_2d4c4hAsTd_6d6c3s9d_8dTh6s9c_5s9h6hTc_Ts9sQdJh_Jd8c8h5h_5cQh3h8s_5d2s4sJs_QcKs7s3c() {
    assertEquals(
      "QcKs7s3c 6d6c3s9d Jd8c8h5h 5s9h6hTc=8dTh6s9c Ts9sQdJh 5cQh3h8s 5d2s4sJs",
      Solver.process("omaha-holdem 2d4c4hAsTd 6d6c3s9d 8dTh6s9c 5s9h6hTc Ts9sQdJh Jd8c8h5h 5cQh3h8s 5d2s4sJs QcKs7s3c"));
  }

  @Test
  public void test_omaha_holdem_2307_2d3d8dAdQs_4c2hTh9h_KcTcTs9c_KhQh4h5d_JcJh7h5h() {
    assertEquals(
      "4c2hTh9h KcTcTs9c JcJh7h5h KhQh4h5d",
      Solver.process("omaha-holdem 2d3d8dAdQs 4c2hTh9h KcTcTs9c KhQh4h5d JcJh7h5h"));
  }

  @Test
  public void test_omaha_holdem_2308_4s5c6h9sTd_9h7d7hAd_AsAc3cQd_8dKcQcQs_Qh2c5d2d_Tc5sJcAh_9cKh6s4c_8h7c6d3s_Js4h2hKd() {
    assertEquals(
      "Js4h2hKd Qh2c5d2d 9h7d7hAd 8dKcQcQs AsAc3cQd 9cKh6s4c Tc5sJcAh 8h7c6d3s",
      Solver.process("omaha-holdem 4s5c6h9sTd 9h7d7hAd AsAc3cQd 8dKcQcQs Qh2c5d2d Tc5sJcAh 9cKh6s4c 8h7c6d3s Js4h2hKd"));
  }

  @Test
  public void test_omaha_holdem_2309_2d3s6d7dAc_Jc8c6sQs_4d9s8dKh_4h3d9d8h_4s2c5cTd_9h7hQdTs_AdAh9cTc_Kc3h5dJh_5hJs7sKs_AsJd6c2h() {
    assertEquals(
      "Kc3h5dJh Jc8c6sQs 9h7hQdTs 5hJs7sKs AsJd6c2h AdAh9cTc 4s2c5cTd 4d9s8dKh 4h3d9d8h",
      Solver.process("omaha-holdem 2d3s6d7dAc Jc8c6sQs 4d9s8dKh 4h3d9d8h 4s2c5cTd 9h7hQdTs AdAh9cTc Kc3h5dJh 5hJs7sKs AsJd6c2h"));
  }

  @Test
  public void test_omaha_holdem_2310_3d4h6c9cQd_2h8s3hAc_TcQc3s8h_ThKsJdKd_9h7s5s5c() {
    assertEquals(
      "2h8s3hAc ThKsJdKd TcQc3s8h 9h7s5s5c",
      Solver.process("omaha-holdem 3d4h6c9cQd 2h8s3hAc TcQc3s8h ThKsJdKd 9h7s5s5c"));
  }

  @Test
  public void test_omaha_holdem_2311_2s3h4dJsTd_Kd5s8dJd_6s6hTsAd_Kh2d4sTc_Jc7d9cQd_Ac5c8c2c_3s5h7cQs() {
    assertEquals(
      "3s5h7cQs 6s6hTsAd Jc7d9cQd Kd5s8dJd Kh2d4sTc Ac5c8c2c",
      Solver.process("omaha-holdem 2s3h4dJsTd Kd5s8dJd 6s6hTsAd Kh2d4sTc Jc7d9cQd Ac5c8c2c 3s5h7cQs"));
  }

  @Test
  public void test_omaha_holdem_2312_5c6h8c9cKs_Jd8d7h2s_4c4hAhKh_7cKc5hTc() {
    assertEquals(
      "4c4hAhKh Jd8d7h2s 7cKc5hTc",
      Solver.process("omaha-holdem 5c6h8c9cKs Jd8d7h2s 4c4hAhKh 7cKc5hTc"));
  }

  @Test
  public void test_omaha_holdem_2313_3h6cAdAhTc_4sQcAsJs_2c3d6hJc_5d7cKcTs_9sKh2dJd_Ac3s8h5s_7hQs5hTd_4d7d6d8d_Kd9h7s9c() {
    assertEquals(
      "9sKh2dJd 4d7d6d8d 2c3d6hJc Kd9h7s9c 7hQs5hTd 5d7cKcTs 4sQcAsJs Ac3s8h5s",
      Solver.process("omaha-holdem 3h6cAdAhTc 4sQcAsJs 2c3d6hJc 5d7cKcTs 9sKh2dJd Ac3s8h5s 7hQs5hTd 4d7d6d8d Kd9h7s9c"));
  }

  @Test
  public void test_omaha_holdem_2314_2c9h9sAcAh_Kc3d4cQs_ThKs8s6c_7c7s5cTc() {
    assertEquals(
      "ThKs8s6c Kc3d4cQs 7c7s5cTc",
      Solver.process("omaha-holdem 2c9h9sAcAh Kc3d4cQs ThKs8s6c 7c7s5cTc"));
  }

  @Test
  public void test_omaha_holdem_2315_3c5d7cAsTd_QcQd5hTc_4d2s4c7s_5s3h5cAc_9d8sTs8h_4h8d8c3d_KsQhJh7h_Jc7dQs6d_6cJsAh3s() {
    assertEquals(
      "Jc7dQs6d KsQhJh7h 4h8d8c3d 9d8sTs8h QcQd5hTc 6cJsAh3s 5s3h5cAc 4d2s4c7s",
      Solver.process("omaha-holdem 3c5d7cAsTd QcQd5hTc 4d2s4c7s 5s3h5cAc 9d8sTs8h 4h8d8c3d KsQhJh7h Jc7dQs6d 6cJsAh3s"));
  }

  @Test
  public void test_omaha_holdem_2316_4d5s9c9hTd_8h9sKs3h_As5dJc8c_7d6sAh9d_5c8dKhKc_3sJd4s3d_3cKdTh6d_8sAc2c5h() {
    assertEquals(
      "3sJd4s3d 8sAc2c5h=As5dJc8c 3cKdTh6d 5c8dKhKc 8h9sKs3h 7d6sAh9d",
      Solver.process("omaha-holdem 4d5s9c9hTd 8h9sKs3h As5dJc8c 7d6sAh9d 5c8dKhKc 3sJd4s3d 3cKdTh6d 8sAc2c5h"));
  }

  @Test
  public void test_omaha_holdem_2317_6s7s9cAhTc_8cAc5h7c_Kc3cAs3h_9d8dKdKh_Qh4h5d2h() {
    assertEquals(
      "Qh4h5d2h Kc3cAs3h 8cAc5h7c=9d8dKdKh",
      Solver.process("omaha-holdem 6s7s9cAhTc 8cAc5h7c Kc3cAs3h 9d8dKdKh Qh4h5d2h"));
  }

  @Test
  public void test_omaha_holdem_2318_4d8s9dJsQs_Ks2dJc5c_Kh8hKdTc_TsJh6d8c_4c4hTd7d_5sAd8d7s_5h3cJd9c() {
    assertEquals(
      "Ks2dJc5c 5h3cJd9c 4c4hTd7d TsJh6d8c Kh8hKdTc 5sAd8d7s",
      Solver.process("omaha-holdem 4d8s9dJsQs Ks2dJc5c Kh8hKdTc TsJh6d8c 4c4hTd7d 5sAd8d7s 5h3cJd9c"));
  }

  @Test
  public void test_omaha_holdem_2319_2s4c4dJsQs_6hKs7dJc_5s5d5c7c_Qh5hJhAd_Ac3c4h8s_Qd9c6sTc() {
    assertEquals(
      "5s5d5c7c 6hKs7dJc Qd9c6sTc Qh5hJhAd Ac3c4h8s",
      Solver.process("omaha-holdem 2s4c4dJsQs 6hKs7dJc 5s5d5c7c Qh5hJhAd Ac3c4h8s Qd9c6sTc"));
  }

  @Test
  public void test_omaha_holdem_2320_3c5d5hAcTd_8dQs8hTs_3s9c2s9d_QhJcQc9h_Ks2d2h4d_Ah8c7d9s_6h5s4s5c_4hJs2cKh_7c4cKd8s() {
    assertEquals(
      "7c4cKd8s 3s9c2s9d 8dQs8hTs QhJcQc9h Ah8c7d9s 4hJs2cKh=Ks2d2h4d 6h5s4s5c",
      Solver.process("omaha-holdem 3c5d5hAcTd 8dQs8hTs 3s9c2s9d QhJcQc9h Ks2d2h4d Ah8c7d9s 6h5s4s5c 4hJs2cKh 7c4cKd8s"));
  }

  @Test
  public void test_omaha_holdem_2321_2s3d3s9hTs_7h8hAdQs_2c4d9sAh() {
    assertEquals(
      "7h8hAdQs 2c4d9sAh",
      Solver.process("omaha-holdem 2s3d3s9hTs 7h8hAdQs 2c4d9sAh"));
  }

  @Test
  public void test_omaha_holdem_2322_3s8cJcQsTs_6d6h4s6c_3dThJsQc_4c3c6sQh_4h7h2hKd_4dQd9cTc_5cTd5dKs_Ah2c5sAd_9h9s2dKh_8h5h7cJh() {
    assertEquals(
      "4h7h2hKd 6d6h4s6c 5cTd5dKs Ah2c5sAd 8h5h7cJh 4c3c6sQh 3dThJsQc 4dQd9cTc 9h9s2dKh",
      Solver.process("omaha-holdem 3s8cJcQsTs 6d6h4s6c 3dThJsQc 4c3c6sQh 4h7h2hKd 4dQd9cTc 5cTd5dKs Ah2c5sAd 9h9s2dKh 8h5h7cJh"));
  }

  @Test
  public void test_omaha_holdem_2323_5d9cQcTcTs_2h4dTdKd_4s8sKcAh_4c9d2d3h_Js7d5s7s() {
    assertEquals(
      "4s8sKcAh Js7d5s7s 4c9d2d3h 2h4dTdKd",
      Solver.process("omaha-holdem 5d9cQcTcTs 2h4dTdKd 4s8sKcAh 4c9d2d3h Js7d5s7s"));
  }

  @Test
  public void test_omaha_holdem_2324_2h3c4d8dTs_QsJdKh2s_5h3d9h7d_6s8h5d3h_Td7h8cKd() {
    assertEquals(
      "QsJdKh2s 5h3d9h7d Td7h8cKd 6s8h5d3h",
      Solver.process("omaha-holdem 2h3c4d8dTs QsJdKh2s 5h3d9h7d 6s8h5d3h Td7h8cKd"));
  }

  @Test
  public void test_omaha_holdem_2325_3c7h8dAdTs_4s4c5dQs_7d2s7sJs_8c7c3dAc_Ah9c8s5s_TdQhAs9d_Kd3s5h2h_8h9sTc6s_2c6cKh6h() {
    assertEquals(
      "Kd3s5h2h 4s4c5dQs 2c6cKh6h 8c7c3dAc=Ah9c8s5s TdQhAs9d 7d2s7sJs 8h9sTc6s",
      Solver.process("omaha-holdem 3c7h8dAdTs 4s4c5dQs 7d2s7sJs 8c7c3dAc Ah9c8s5s TdQhAs9d Kd3s5h2h 8h9sTc6s 2c6cKh6h"));
  }

  @Test
  public void test_omaha_holdem_2326_4h7s8c9hTc_5d6sTdKs_2hJsAsKd_6hTh8hJh_9d7h7cKh_8d3s8s3c_5sTsAcJd_4sQh9c5c_Ad4cQc2s() {
    assertEquals(
      "2hJsAsKd Ad4cQc2s 4sQh9c5c 9d7h7cKh 8d3s8s3c 5d6sTdKs 5sTsAcJd=6hTh8hJh",
      Solver.process("omaha-holdem 4h7s8c9hTc 5d6sTdKs 2hJsAsKd 6hTh8hJh 9d7h7cKh 8d3s8s3c 5sTsAcJd 4sQh9c5c Ad4cQc2s"));
  }

  @Test
  public void test_omaha_holdem_2327_2d2h5hAhJs_7dKd8sAd_4s6cJc9d_As7h7c9c_QcJdTh9s() {
    assertEquals(
      "4s6cJc9d QcJdTh9s As7h7c9c 7dKd8sAd",
      Solver.process("omaha-holdem 2d2h5hAhJs 7dKd8sAd 4s6cJc9d As7h7c9c QcJdTh9s"));
  }

  @Test
  public void test_omaha_holdem_2328_3c5d7c8hAs_7h2sTd3d_Qh4d8dKs_2dJcTs6d_Th8c7d8s_Jd9d2h4s_KhQcKd5s_6c6hAhAc_9hKc9c3s() {
    assertEquals(
      "2dJcTs6d Qh4d8dKs 9hKc9c3s KhQcKd5s 7h2sTd3d Th8c7d8s 6c6hAhAc Jd9d2h4s",
      Solver.process("omaha-holdem 3c5d7c8hAs 7h2sTd3d Qh4d8dKs 2dJcTs6d Th8c7d8s Jd9d2h4s KhQcKd5s 6c6hAhAc 9hKc9c3s"));
  }

  @Test
  public void test_omaha_holdem_2329_3d5cJcJhKc_5h8hTd4d_Tc9c6dTh_Qc6c7c5d_KhAh2h7h_2sKd9dQd_4s3s4c8c_2cQhJsKs_3cAs4h6h_Qs3h2dAd() {
    assertEquals(
      "3cAs4h6h=Qs3h2dAd 5h8hTd4d 2sKd9dQd KhAh2h7h 4s3s4c8c Tc9c6dTh Qc6c7c5d 2cQhJsKs",
      Solver.process("omaha-holdem 3d5cJcJhKc 5h8hTd4d Tc9c6dTh Qc6c7c5d KhAh2h7h 2sKd9dQd 4s3s4c8c 2cQhJsKs 3cAs4h6h Qs3h2dAd"));
  }

  @Test
  public void test_omaha_holdem_2330_2s4s5sQdQs_8h3h4c5h_QcJdTdKd_9d2cKc6h_9c3sQhJs_8s7c7h8d_2hJcJh2d_Th6s4hTc_9hAc6d7d_5d3d4dAs() {
    assertEquals(
      "9hAc6d7d 9d2cKc6h 8h3h4c5h 8s7c7h8d Th6s4hTc QcJdTdKd 5d3d4dAs 9c3sQhJs 2hJcJh2d",
      Solver.process("omaha-holdem 2s4s5sQdQs 8h3h4c5h QcJdTdKd 9d2cKc6h 9c3sQhJs 8s7c7h8d 2hJcJh2d Th6s4hTc 9hAc6d7d 5d3d4dAs"));
  }

  @Test
  public void test_omaha_holdem_2331_3h5s9sJdQh_Jh4h5h7c_8c3sTdAs_5c6cTc4c_8sTsKdJs_4d6h8h2h_Qd7s3cAc_2dAh5d4s_2c7d6dKc() {
    assertEquals(
      "4d6h8h2h 2c7d6dKc 5c6cTc4c 2dAh5d4s Jh4h5h7c Qd7s3cAc 8c3sTdAs 8sTsKdJs",
      Solver.process("omaha-holdem 3h5s9sJdQh Jh4h5h7c 8c3sTdAs 5c6cTc4c 8sTsKdJs 4d6h8h2h Qd7s3cAc 2dAh5d4s 2c7d6dKc"));
  }

  @Test
  public void test_omaha_holdem_2332_4c5cAcAsKs_7dTdThQh_9dQd6d9s_3c7hJh2d_8s6c9cKh_QcJd2hAd_4s6h3dTc_2s2c9hQs_8c4hTs5d() {
    assertEquals(
      "2s2c9hQs 4s6h3dTc 8c4hTs5d 9dQd6d9s 7dTdThQh QcJd2hAd 3c7hJh2d 8s6c9cKh",
      Solver.process("omaha-holdem 4c5cAcAsKs 7dTdThQh 9dQd6d9s 3c7hJh2d 8s6c9cKh QcJd2hAd 4s6h3dTc 2s2c9hQs 8c4hTs5d"));
  }

  @Test
  public void test_omaha_holdem_2333_8hKdTcTdTh_2hQh6c3c_Jc7hJh4c_Ah2dQcKc_3s5c6dAs_Qd4d9sKs_5s3d6hAd() {
    assertEquals(
      "2hQh6c3c Qd4d9sKs 3s5c6dAs=5s3d6hAd Ah2dQcKc Jc7hJh4c",
      Solver.process("omaha-holdem 8hKdTcTdTh 2hQh6c3c Jc7hJh4c Ah2dQcKc 3s5c6dAs Qd4d9sKs 5s3d6hAd"));
  }

  @Test
  public void test_omaha_holdem_2334_6d7cAdJdJs_9d6sQc8d_5h4d2sAh_4cKcTdTh_TsQsQh3s_3d5s2cJh_Kd3h8s6h_4h5d7s7h_Jc6c9sQd_4s8c2h2d() {
    assertEquals(
      "4s8c2h2d Kd3h8s6h 4cKcTdTh TsQsQh3s 5h4d2sAh 3d5s2cJh 9d6sQc8d 4h5d7s7h Jc6c9sQd",
      Solver.process("omaha-holdem 6d7cAdJdJs 9d6sQc8d 5h4d2sAh 4cKcTdTh TsQsQh3s 3d5s2cJh Kd3h8s6h 4h5d7s7h Jc6c9sQd 4s8c2h2d"));
  }

  @Test
  public void test_omaha_holdem_2335_6h8h8s9dTd_6d6sQhAs_7c4h7sKs_2hJd3hKc_5d3dAdQc() {
    assertEquals(
      "2hJd3hKc 5d3dAdQc 7c4h7sKs 6d6sQhAs",
      Solver.process("omaha-holdem 6h8h8s9dTd 6d6sQhAs 7c4h7sKs 2hJd3hKc 5d3dAdQc"));
  }

  @Test
  public void test_omaha_holdem_2336_3c3d4c7d7h_7s6cTsTd_2dQh6s9c_8s6d4d2s_Kd9s2cAc_Jd8c3h5c_As9dTcJh_Kc3s6h9h() {
    assertEquals(
      "2dQh6s9c As9dTcJh Kd9s2cAc 8s6d4d2s Jd8c3h5c Kc3s6h9h 7s6cTsTd",
      Solver.process("omaha-holdem 3c3d4c7d7h 7s6cTsTd 2dQh6s9c 8s6d4d2s Kd9s2cAc Jd8c3h5c As9dTcJh Kc3s6h9h"));
  }

  @Test
  public void test_omaha_holdem_2337_5d5h7h8sKs_ThAd4d2h_Qd4cTd3d_3sQc6s7c_Ah3c9s5c_Ts3h4s7s() {
    assertEquals(
      "Qd4cTd3d ThAd4d2h Ts3h4s7s 3sQc6s7c Ah3c9s5c",
      Solver.process("omaha-holdem 5d5h7h8sKs ThAd4d2h Qd4cTd3d 3sQc6s7c Ah3c9s5c Ts3h4s7s"));
  }

  @Test
  public void test_omaha_holdem_2338_6dAsJsKsQh_Ah7d3s4s_8d2c5c4c_KdTc7c8s_2s7s3d8c() {
    assertEquals(
      "8d2c5c4c KdTc7c8s Ah7d3s4s 2s7s3d8c",
      Solver.process("omaha-holdem 6dAsJsKsQh Ah7d3s4s 8d2c5c4c KdTc7c8s 2s7s3d8c"));
  }

  @Test
  public void test_omaha_holdem_2339_2h2s4s7h8d_2dAh6cJd_Th3sQcQh_Qd9h7d3d_7sKhJhAs_TcTs5dAd_5h3c8hAc_5sKdKc4d_9d9c4h5c_2c6hJs3h() {
    assertEquals(
      "Qd9h7d3d 7sKhJhAs 5h3c8hAc 9d9c4h5c TcTs5dAd Th3sQcQh 5sKdKc4d 2c6hJs3h 2dAh6cJd",
      Solver.process("omaha-holdem 2h2s4s7h8d 2dAh6cJd Th3sQcQh Qd9h7d3d 7sKhJhAs TcTs5dAd 5h3c8hAc 5sKdKc4d 9d9c4h5c 2c6hJs3h"));
  }

  @Test
  public void test_omaha_holdem_2340_4s8sAhKhQd_Th8c3hJh_9s7cKsQc() {
    assertEquals(
      "9s7cKsQc Th8c3hJh",
      Solver.process("omaha-holdem 4s8sAhKhQd Th8c3hJh 9s7cKsQc"));
  }

  @Test
  public void test_omaha_holdem_2341_5c6d6h8sJh_4sAcKdQc_Kh7d8c2s() {
    assertEquals(
      "4sAcKdQc Kh7d8c2s",
      Solver.process("omaha-holdem 5c6d6h8sJh 4sAcKdQc Kh7d8c2s"));
  }

  @Test
  public void test_omaha_holdem_2342_5c8sAcJcQd_KdQc9dAs_4d7sTcKc_2c3s5dAd_2hJs3h5s_6h9c5h4h() {
    assertEquals(
      "6h9c5h4h 2hJs3h5s 2c3s5dAd KdQc9dAs 4d7sTcKc",
      Solver.process("omaha-holdem 5c8sAcJcQd KdQc9dAs 4d7sTcKc 2c3s5dAd 2hJs3h5s 6h9c5h4h"));
  }

  @Test
  public void test_omaha_holdem_2343_2d4h5hAdQc_Jh2sKh3s_5sTc4cKd_8s6hKc7d_3hTdAh6s() {
    assertEquals(
      "8s6hKc7d 5sTc4cKd Jh2sKh3s 3hTdAh6s",
      Solver.process("omaha-holdem 2d4h5hAdQc Jh2sKh3s 5sTc4cKd 8s6hKc7d 3hTdAh6s"));
  }

  @Test
  public void test_omaha_holdem_2344_9cAcJcQsTs_QdAdTd7s_3s8dQcJs_5s5d5h6h_4dKc9d9h_3cKsQh7c() {
    assertEquals(
      "5s5d5h6h QdAdTd7s 3s8dQcJs 4dKc9d9h 3cKsQh7c",
      Solver.process("omaha-holdem 9cAcJcQsTs QdAdTd7s 3s8dQcJs 5s5d5h6h 4dKc9d9h 3cKsQh7c"));
  }

  @Test
  public void test_omaha_holdem_2345_2s3c4s7dKh_KsQc6d8d_5dQh3s2d_5c6cJhQs_9hThKcJs_Jc9c7s4c_3d7h4hQd_AhAs6h9d_7c4d9s8c() {
    assertEquals(
      "9hThKcJs KsQc6d8d AhAs6h9d 5dQh3s2d 3d7h4hQd=7c4d9s8c=Jc9c7s4c 5c6cJhQs",
      Solver.process("omaha-holdem 2s3c4s7dKh KsQc6d8d 5dQh3s2d 5c6cJhQs 9hThKcJs Jc9c7s4c 3d7h4hQd AhAs6h9d 7c4d9s8c"));
  }

  @Test
  public void test_omaha_holdem_2346_3d5h8h9hAs_4d9sQcQh_Kh6hTc6d_2s6c2dTs_7d4c7c7h_5dKc7sJh_Td8s3sQs_3cAhJs6s() {
    assertEquals(
      "2s6c2dTs 5dKc7sJh 7d4c7c7h 4d9sQcQh Td8s3sQs 3cAhJs6s Kh6hTc6d",
      Solver.process("omaha-holdem 3d5h8h9hAs 4d9sQcQh Kh6hTc6d 2s6c2dTs 7d4c7c7h 5dKc7sJh Td8s3sQs 3cAhJs6s"));
  }

  @Test
  public void test_omaha_holdem_2347_3h6d9sJhQh_Ts3s6c4c_8c7dAd8h_4h4sTh2h_Ac8d4dAh() {
    assertEquals(
      "8c7dAd8h Ac8d4dAh Ts3s6c4c 4h4sTh2h",
      Solver.process("omaha-holdem 3h6d9sJhQh Ts3s6c4c 8c7dAd8h 4h4sTh2h Ac8d4dAh"));
  }

  @Test
  public void test_omaha_holdem_2348_4c5c6c8cAs_Qs2hTcKc_3h4d7s9c_ThAh7h9s_Qc9d5h4s() {
    assertEquals(
      "Qc9d5h4s 3h4d7s9c=ThAh7h9s Qs2hTcKc",
      Solver.process("omaha-holdem 4c5c6c8cAs Qs2hTcKc 3h4d7s9c ThAh7h9s Qc9d5h4s"));
  }

  @Test
  public void test_omaha_holdem_2349_2hAcJdKhKs_8s2cQc9s_9dKd9c4h_3s2s5hQd_5d8c3d3c_Tc5s6s7d_Th4sQh3h_6h4c8h2d_AdKc6c4d() {
    assertEquals(
      "Tc5s6s7d 6h4c8h2d 3s2s5hQd=8s2cQc9s 5d8c3d3c 9dKd9c4h Th4sQh3h AdKc6c4d",
      Solver.process("omaha-holdem 2hAcJdKhKs 8s2cQc9s 9dKd9c4h 3s2s5hQd 5d8c3d3c Tc5s6s7d Th4sQh3h 6h4c8h2d AdKc6c4d"));
  }

  @Test
  public void test_omaha_holdem_2350_2c5h6hJcTd_9h4c3d4s_9s7dAdKc() {
    assertEquals(
      "9s7dAdKc 9h4c3d4s",
      Solver.process("omaha-holdem 2c5h6hJcTd 9h4c3d4s 9s7dAdKc"));
  }

  @Test
  public void test_omaha_holdem_2351_5h6c6s7hQd_QhQc7dQs_9cJc2c4h_9s2h8d4c_6h3cKc3d() {
    assertEquals(
      "9cJc2c4h 6h3cKc3d 9s2h8d4c QhQc7dQs",
      Solver.process("omaha-holdem 5h6c6s7hQd QhQc7dQs 9cJc2c4h 9s2h8d4c 6h3cKc3d"));
  }

  @Test
  public void test_omaha_holdem_2352_3d7s9sAdKs_Kd5s7cQd_TsJh6hJc_6sQh5c4h_KcTh6d9c_Kh9dQsAs() {
    assertEquals(
      "6sQh5c4h TsJh6hJc Kd5s7cQd KcTh6d9c Kh9dQsAs",
      Solver.process("omaha-holdem 3d7s9sAdKs Kd5s7cQd TsJh6hJc 6sQh5c4h KcTh6d9c Kh9dQsAs"));
  }

  @Test
  public void test_omaha_holdem_2353_2h6c9dJhKd_7s6h3c6s_2c7h7cQs() {
    assertEquals(
      "2c7h7cQs 7s6h3c6s",
      Solver.process("omaha-holdem 2h6c9dJhKd 7s6h3c6s 2c7h7cQs"));
  }

  @Test
  public void test_omaha_holdem_2354_4s8d9sAsTc_6s7s5d3d_9d7dJd2s_8hQc4cKd_9cAc4dTh_Jh7h7c2c_9hAd6h3s_JcQsKh6d_3hKs3cTd_8sJsKc6c() {
    assertEquals(
      "3hKs3cTd 8hQc4cKd 9hAd6h3s 9cAc4dTh 9d7dJd2s=Jh7h7c2c JcQsKh6d 6s7s5d3d 8sJsKc6c",
      Solver.process("omaha-holdem 4s8d9sAsTc 6s7s5d3d 9d7dJd2s 8hQc4cKd 9cAc4dTh Jh7h7c2c 9hAd6h3s JcQsKh6d 3hKs3cTd 8sJsKc6c"));
  }

  @Test
  public void test_omaha_holdem_2355_AcKcKdQsTd_Qd2sTs2d_5d4dTc3d_Jc8c2hJs_8h3h5s8d() {
    assertEquals(
      "8h3h5s8d 5d4dTc3d Jc8c2hJs Qd2sTs2d",
      Solver.process("omaha-holdem AcKcKdQsTd Qd2sTs2d 5d4dTc3d Jc8c2hJs 8h3h5s8d"));
  }

  @Test
  public void test_omaha_holdem_2356_4s5hAdQdTd_5dKh3d2s_Tc2d4c9h() {
    assertEquals(
      "Tc2d4c9h 5dKh3d2s",
      Solver.process("omaha-holdem 4s5hAdQdTd 5dKh3d2s Tc2d4c9h"));
  }

  @Test
  public void test_omaha_holdem_2357_3d6s8h9dJh_5s9s5c3c_6cThQs7h_6dAdAh5d_9h4dQh7s_8s2d4h4c_3sQc2hJs() {
    assertEquals(
      "8s2d4h4c 9h4dQh7s 6dAdAh5d 5s9s5c3c 3sQc2hJs 6cThQs7h",
      Solver.process("omaha-holdem 3d6s8h9dJh 5s9s5c3c 6cThQs7h 6dAdAh5d 9h4dQh7s 8s2d4h4c 3sQc2hJs"));
  }

  @Test
  public void test_omaha_holdem_2358_2c2d7c7dJh_KdQhJd6s_Ah8h9dKh_3h3c8dKc_Tc9cJcKs_Ac4s7s8s() {
    assertEquals(
      "Ah8h9dKh 3h3c8dKc KdQhJd6s=Tc9cJcKs Ac4s7s8s",
      Solver.process("omaha-holdem 2c2d7c7dJh KdQhJd6s Ah8h9dKh 3h3c8dKc Tc9cJcKs Ac4s7s8s"));
  }

  @Test
  public void test_omaha_holdem_2359_3d6s7dKsTh_2d5dAh8d_4cQs8s6h_9s5sQcAc_7sAd6c9d() {
    assertEquals(
      "2d5dAh8d 9s5sQcAc 4cQs8s6h 7sAd6c9d",
      Solver.process("omaha-holdem 3d6s7dKsTh 2d5dAh8d 4cQs8s6h 9s5sQcAc 7sAd6c9d"));
  }

  @Test
  public void test_omaha_holdem_2360_5c7h9dJcJs_8dJh4d2c_Ts5h2sKh_8cAs7sKs_7c3s7dQs_3h4cAc9h_AdTd5dKd_QdQc6dTh() {
    assertEquals(
      "Ts5h2sKh AdTd5dKd 8cAs7sKs 3h4cAc9h QdQc6dTh 8dJh4d2c 7c3s7dQs",
      Solver.process("omaha-holdem 5c7h9dJcJs 8dJh4d2c Ts5h2sKh 8cAs7sKs 7c3s7dQs 3h4cAc9h AdTd5dKd QdQc6dTh"));
  }

  @Test
  public void test_omaha_holdem_2361_3d4c4h8hQh_Td5d5h9h_Kc2h7h4d_9s4sQs8c_Ac8d5sQd_7c2sJdTs_TcJh5c3h() {
    assertEquals(
      "7c2sJdTs Ac8d5sQd Kc2h7h4d Td5d5h9h TcJh5c3h 9s4sQs8c",
      Solver.process("omaha-holdem 3d4c4h8hQh Td5d5h9h Kc2h7h4d 9s4sQs8c Ac8d5sQd 7c2sJdTs TcJh5c3h"));
  }

  @Test
  public void test_omaha_holdem_2362_8h9cJcJhKc_7c3c9hQc_Qd8s2s8c_Th9dTd9s_Kh2c7s3h() {
    assertEquals(
      "Kh2c7s3h 7c3c9hQc Qd8s2s8c Th9dTd9s",
      Solver.process("omaha-holdem 8h9cJcJhKc 7c3c9hQc Qd8s2s8c Th9dTd9s Kh2c7s3h"));
  }

  @Test
  public void test_omaha_holdem_2363_2c5d7sJdJs_9d9s7d7h_5h9cJc4h_8s7cQdKd_3dQcJhQs_2dTs8h6h_3hTd5s2h_Ks3c4cAs() {
    assertEquals(
      "Ks3c4cAs 2dTs8h6h 3hTd5s2h 8s7cQdKd 3dQcJhQs 9d9s7d7h 5h9cJc4h",
      Solver.process("omaha-holdem 2c5d7sJdJs 9d9s7d7h 5h9cJc4h 8s7cQdKd 3dQcJhQs 2dTs8h6h 3hTd5s2h Ks3c4cAs"));
  }

  @Test
  public void test_omaha_holdem_2364_2c5s7s8cTs_3h4sQs9s_6d5hJhAh_Kh2s6cJs_5c9dKc2h_9hJc3sKd_6h4hAsJd_8sTc9c5d_TdQc3d7d_4c7h2dKs() {
    assertEquals(
      "6d5hJhAh 5c9dKc2h 4c7h2dKs TdQc3d7d 8sTc9c5d 6h4hAsJd 9hJc3sKd Kh2s6cJs 3h4sQs9s",
      Solver.process("omaha-holdem 2c5s7s8cTs 3h4sQs9s 6d5hJhAh Kh2s6cJs 5c9dKc2h 9hJc3sKd 6h4hAsJd 8sTc9c5d TdQc3d7d 4c7h2dKs"));
  }

  @Test
  public void test_omaha_holdem_2365_3d3s4c8sAd_Ts7d5dJs_9d6h7h2s_KcJh4s5c_7sTd6dAs_4h3cAhQh_5sTc7c6s_JdQdQc4d_ThKd5hJc_3hQs8h6c() {
    assertEquals(
      "9d6h7h2s 5sTc7c6s Ts7d5dJs ThKd5hJc KcJh4s5c JdQdQc4d 7sTd6dAs 3hQs8h6c 4h3cAhQh",
      Solver.process("omaha-holdem 3d3s4c8sAd Ts7d5dJs 9d6h7h2s KcJh4s5c 7sTd6dAs 4h3cAhQh 5sTc7c6s JdQdQc4d ThKd5hJc 3hQs8h6c"));
  }

  @Test
  public void test_omaha_holdem_2366_3h6s9cAhTh_Tc6cKh8d_3d9sQd4c_3s2s5h8s_5s4s4d7d_9h2hKdKc() {
    assertEquals(
      "3s2s5h8s 5s4s4d7d 3d9sQd4c Tc6cKh8d 9h2hKdKc",
      Solver.process("omaha-holdem 3h6s9cAhTh Tc6cKh8d 3d9sQd4c 3s2s5h8s 5s4s4d7d 9h2hKdKc"));
  }

  @Test
  public void test_omaha_holdem_2367_2c3c4h9hTd_5c5s3sAd_5h4d4c6d_Kh8sQd8d_9d9sQc6s_3h2s7hJh_9c8cAh4s_6c3d8hQh_ThKdQs7c() {
    assertEquals(
      "6c3d8hQh Kh8sQd8d ThKdQs7c 3h2s7hJh 9c8cAh4s 9d9sQc6s 5c5s3sAd 5h4d4c6d",
      Solver.process("omaha-holdem 2c3c4h9hTd 5c5s3sAd 5h4d4c6d Kh8sQd8d 9d9sQc6s 3h2s7hJh 9c8cAh4s 6c3d8hQh ThKdQs7c"));
  }

  @Test
  public void test_omaha_holdem_2368_2d4s6cJcQh_QdQc9dKc_5c3hAc5s_JhQs6h7h_2h5d6s8c() {
    assertEquals(
      "2h5d6s8c JhQs6h7h QdQc9dKc 5c3hAc5s",
      Solver.process("omaha-holdem 2d4s6cJcQh QdQc9dKc 5c3hAc5s JhQs6h7h 2h5d6s8c"));
  }

  @Test
  public void test_omaha_holdem_2369_5c5hKdQcTs_KcAc7dKs_4sJd3cJh_5sTd5dJc_Tc8d2hKh() {
    assertEquals(
      "4sJd3cJh Tc8d2hKh KcAc7dKs 5sTd5dJc",
      Solver.process("omaha-holdem 5c5hKdQcTs KcAc7dKs 4sJd3cJh 5sTd5dJc Tc8d2hKh"));
  }

  @Test
  public void test_omaha_holdem_2370_2c9cAsJhQh_6s7h8hQs_Kc2s9d3d_4c8s4s4d_Js9sTd7c_8d5d4hTh() {
    assertEquals(
      "4c8s4s4d 6s7h8hQs Kc2s9d3d Js9sTd7c 8d5d4hTh",
      Solver.process("omaha-holdem 2c9cAsJhQh 6s7h8hQs Kc2s9d3d 4c8s4s4d Js9sTd7c 8d5d4hTh"));
  }

  @Test
  public void test_omaha_holdem_2371_5cAdJhQcTs_Ah6s7s5h_As9sKsJs_7c5sQd3s_4sKd2sQs_4c6cTc8d_5d8c4h8h_2h6d9dJc_Kc4d6h3c_Qh3h9hTd() {
    assertEquals(
      "Kc4d6h3c 5d8c4h8h 4c6cTc8d 2h6d9dJc 7c5sQd3s Qh3h9hTd Ah6s7s5h 4sKd2sQs=As9sKsJs",
      Solver.process("omaha-holdem 5cAdJhQcTs Ah6s7s5h As9sKsJs 7c5sQd3s 4sKd2sQs 4c6cTc8d 5d8c4h8h 2h6d9dJc Kc4d6h3c Qh3h9hTd"));
  }

  @Test
  public void test_omaha_holdem_2372_6c6dAsQhTd_3sAh9h3h_Ks7dJh4s_5d5s4d8s_6h4h3dAd_7hJd2sKh() {
    assertEquals(
      "5d5s4d8s 3sAh9h3h 7hJd2sKh=Ks7dJh4s 6h4h3dAd",
      Solver.process("omaha-holdem 6c6dAsQhTd 3sAh9h3h Ks7dJh4s 5d5s4d8s 6h4h3dAd 7hJd2sKh"));
  }

  @Test
  public void test_omaha_holdem_2373_2h3dKhQsTh_2sJdKd5s_Kc9c3s7d_5d9s4hAs_8sAc7s5c_8h7c2d6h() {
    assertEquals(
      "8sAc7s5c 5d9s4hAs 2sJdKd5s Kc9c3s7d 8h7c2d6h",
      Solver.process("omaha-holdem 2h3dKhQsTh 2sJdKd5s Kc9c3s7d 5d9s4hAs 8sAc7s5c 8h7c2d6h"));
  }

  @Test
  public void test_omaha_holdem_2374_6hAhQcQhTd_9d8cJdQs_Jc4dTcAd_Th7h2s8d_JhJs4sKd_KcAc5h7s_9c5c2h9h() {
    assertEquals(
      "Jc4dTcAd KcAc5h7s 9d8cJdQs JhJs4sKd 9c5c2h9h Th7h2s8d",
      Solver.process("omaha-holdem 6hAhQcQhTd 9d8cJdQs Jc4dTcAd Th7h2s8d JhJs4sKd KcAc5h7s 9c5c2h9h"));
  }

  @Test
  public void test_omaha_holdem_2375_2s8d8hJsTs_Ks4c2cKd_JcJh9d5c() {
    assertEquals(
      "Ks4c2cKd JcJh9d5c",
      Solver.process("omaha-holdem 2s8d8hJsTs Ks4c2cKd JcJh9d5c"));
  }

  @Test
  public void test_omaha_holdem_2376_6h7c7sAsTh_4d6dQd3d_2d2c5hAc_9hJc9s6c() {
    assertEquals(
      "4d6dQd3d 9hJc9s6c 2d2c5hAc",
      Solver.process("omaha-holdem 6h7c7sAsTh 4d6dQd3d 2d2c5hAc 9hJc9s6c"));
  }

  @Test
  public void test_omaha_holdem_2377_2dKhKsQdTd_8d5h8c3c_JsKd3sQc_Jc7h8h3d_9h8s9s7s_7c3hJd9c_4c6s2s4d_As2hAdQs() {
    assertEquals(
      "Jc7h8h3d 4c6s2s4d 8d5h8c3c 9h8s9s7s As2hAdQs 7c3hJd9c JsKd3sQc",
      Solver.process("omaha-holdem 2dKhKsQdTd 8d5h8c3c JsKd3sQc Jc7h8h3d 9h8s9s7s 7c3hJd9c 4c6s2s4d As2hAdQs"));
  }

  @Test
  public void test_omaha_holdem_2378_3c9c9hAdQc_2hJd3hKs_7c3s6c6h() {
    assertEquals(
      "2hJd3hKs 7c3s6c6h",
      Solver.process("omaha-holdem 3c9c9hAdQc 2hJd3hKs 7c3s6c6h"));
  }

  @Test
  public void test_omaha_holdem_2379_5s7sJdKhKs_7d6cJh3d_8cTsQh6s() {
    assertEquals(
      "7d6cJh3d 8cTsQh6s",
      Solver.process("omaha-holdem 5s7sJdKhKs 7d6cJh3d 8cTsQh6s"));
  }

  @Test
  public void test_omaha_holdem_2380_4d6d9h9sTh_3d4cJh5d_2dTcJs2h_QdKhJd8s_8d5sQcQh() {
    assertEquals(
      "QdKhJd8s 3d4cJh5d 2dTcJs2h 8d5sQcQh",
      Solver.process("omaha-holdem 4d6d9h9sTh 3d4cJh5d 2dTcJs2h QdKhJd8s 8d5sQcQh"));
  }

  @Test
  public void test_omaha_holdem_2381_3d7s9c9hQc_8cTcAs5h_4d7cJsQh() {
    assertEquals(
      "8cTcAs5h 4d7cJsQh",
      Solver.process("omaha-holdem 3d7s9c9hQc 8cTcAs5h 4d7cJsQh"));
  }

  @Test
  public void test_omaha_holdem_2382_5s6sAsKcKh_TcAh9hTh_6h8d8cQc_9s9cAdAc_7hJd4dJs_8h2dQh7c_Ts5h4sJc_6d3d6c3h() {
    assertEquals(
      "8h2dQh7c 6h8d8cQc 7hJd4dJs TcAh9hTh Ts5h4sJc 6d3d6c3h 9s9cAdAc",
      Solver.process("omaha-holdem 5s6sAsKcKh TcAh9hTh 6h8d8cQc 9s9cAdAc 7hJd4dJs 8h2dQh7c Ts5h4sJc 6d3d6c3h"));
  }

  @Test
  public void test_omaha_holdem_2383_2s3h3s6h9h_5h8d8cJh_TcTs7d3d_Ah2h9d8s_JsKs7h8h_JdQc9s6s_Ac7cQdAd_As5dThQs_Kh7s6c4h() {
    assertEquals(
      "As5dThQs JdQc9s6s Ac7cQdAd TcTs7d3d JsKs7h8h 5h8d8cJh Kh7s6c4h Ah2h9d8s",
      Solver.process("omaha-holdem 2s3h3s6h9h 5h8d8cJh TcTs7d3d Ah2h9d8s JsKs7h8h JdQc9s6s Ac7cQdAd As5dThQs Kh7s6c4h"));
  }

  @Test
  public void test_omaha_holdem_2384_4h5s7dAcKd_5h2cTd6c_QhKcJc4s() {
    assertEquals(
      "5h2cTd6c QhKcJc4s",
      Solver.process("omaha-holdem 4h5s7dAcKd 5h2cTd6c QhKcJc4s"));
  }

  @Test
  public void test_omaha_holdem_2385_6s9cAcJhKs_2c7h4c9d_7d9s3c9h_5cTcThQd() {
    assertEquals(
      "2c7h4c9d 7d9s3c9h 5cTcThQd",
      Solver.process("omaha-holdem 6s9cAcJhKs 2c7h4c9d 7d9s3c9h 5cTcThQd"));
  }

  @Test
  public void test_omaha_holdem_2386_2d2s8cKdTh_As2c7hKh_4d7s6hJh_Ah6s4cJc_4hJs5hTc() {
    assertEquals(
      "4d7s6hJh Ah6s4cJc 4hJs5hTc As2c7hKh",
      Solver.process("omaha-holdem 2d2s8cKdTh As2c7hKh 4d7s6hJh Ah6s4cJc 4hJs5hTc"));
  }

  @Test
  public void test_omaha_holdem_2387_3s4h4s5c5h_7sTs6c3h_8c2sJh8d_Kh6hQc9h_Jc5sThKs_AcQh8sAh_Tc2c7h9s_5dJd9d4c() {
    assertEquals(
      "Tc2c7h9s Kh6hQc9h 8c2sJh8d AcQh8sAh Jc5sThKs 7sTs6c3h 5dJd9d4c",
      Solver.process("omaha-holdem 3s4h4s5c5h 7sTs6c3h 8c2sJh8d Kh6hQc9h Jc5sThKs AcQh8sAh Tc2c7h9s 5dJd9d4c"));
  }

  @Test
  public void test_omaha_holdem_2388_2s5c5d9hAs_4d4h8hTd_KsAh3c7h_4cQsJd8c_TsTc7c2h_3h8d9cKd_Qd2c3d9d_6s6c6hAd_9sQh2dJh() {
    assertEquals(
      "4cQsJd8c 4d4h8hTd 9sQh2dJh=Qd2c3d9d 3h8d9cKd TsTc7c2h 6s6c6hAd KsAh3c7h",
      Solver.process("omaha-holdem 2s5c5d9hAs 4d4h8hTd KsAh3c7h 4cQsJd8c TsTc7c2h 3h8d9cKd Qd2c3d9d 6s6c6hAd 9sQh2dJh"));
  }

  @Test
  public void test_omaha_holdem_2389_5s9sJdJhKs_4c7dJc6s_5d7c9d4s_2c3d5hTs_2s8hThAd_9cQs4dKd_Kc4h6hTd() {
    assertEquals(
      "2s8hThAd 2c3d5hTs 5d7c9d4s Kc4h6hTd 9cQs4dKd 4c7dJc6s",
      Solver.process("omaha-holdem 5s9sJdJhKs 4c7dJc6s 5d7c9d4s 2c3d5hTs 2s8hThAd 9cQs4dKd Kc4h6hTd"));
  }

  @Test
  public void test_omaha_holdem_2390_4c6s7d9hKc_5dQc3d6c_Ac8s9sAh_As6h6dQs_Qd9cKh2c_Th5h2d4h_7h7s3h9d() {
    assertEquals(
      "Th5h2d4h Ac8s9sAh Qd9cKh2c As6h6dQs 7h7s3h9d 5dQc3d6c",
      Solver.process("omaha-holdem 4c6s7d9hKc 5dQc3d6c Ac8s9sAh As6h6dQs Qd9cKh2c Th5h2d4h 7h7s3h9d"));
  }

  @Test
  public void test_omaha_holdem_2391_3h6h9dKhKs_Ah5d2d7c_Tc8s3c2s() {
    assertEquals(
      "Ah5d2d7c Tc8s3c2s",
      Solver.process("omaha-holdem 3h6h9dKhKs Ah5d2d7c Tc8s3c2s"));
  }

  @Test
  public void test_omaha_holdem_2392_4c4s6dJhTs_3s2cJc5h_KhQd2dAc_9s9d8sQs_7d9h8d2s_6s4h3dQc() {
    assertEquals(
      "7d9h8d2s KhQd2dAc 9s9d8sQs 3s2cJc5h 6s4h3dQc",
      Solver.process("omaha-holdem 4c4s6dJhTs 3s2cJc5h KhQd2dAc 9s9d8sQs 7d9h8d2s 6s4h3dQc"));
  }

  @Test
  public void test_omaha_holdem_2393_6d9sQcTcTd_2d6c3d5d_2cKs9h6s_Jc8hJsTs_7c6h2sQd_Jh2h4sTh_7sAd5c4d_3c7d7h8s() {
    assertEquals(
      "7sAd5c4d 2d6c3d5d 2cKs9h6s 7c6h2sQd Jh2h4sTh 3c7d7h8s Jc8hJsTs",
      Solver.process("omaha-holdem 6d9sQcTcTd 2d6c3d5d 2cKs9h6s Jc8hJsTs 7c6h2sQd Jh2h4sTh 7sAd5c4d 3c7d7h8s"));
  }

  @Test
  public void test_omaha_holdem_2394_2c2s6sJcKh_JhKd5cQs_7sAhKcQh_8h4d9hAc_6d6h5hJs_3s4h2d3h_Qd3d7c9s_9c4cTdKs() {
    assertEquals(
      "Qd3d7c9s 8h4d9hAc 9c4cTdKs 7sAhKcQh JhKd5cQs 3s4h2d3h 6d6h5hJs",
      Solver.process("omaha-holdem 2c2s6sJcKh JhKd5cQs 7sAhKcQh 8h4d9hAc 6d6h5hJs 3s4h2d3h Qd3d7c9s 9c4cTdKs"));
  }

  @Test
  public void test_omaha_holdem_2395_4c4dAdQdQs_6h3c9dJc_2sTc6cKs() {
    assertEquals(
      "6h3c9dJc 2sTc6cKs",
      Solver.process("omaha-holdem 4c4dAdQdQs 6h3c9dJc 2sTc6cKs"));
  }

  @Test
  public void test_omaha_holdem_2396_3d6s7h7sAs_6d4cTd2h_8cTh3s6h_8d4dKhJc_8sTsKdQc_7c2s5d2d_Qd9cAdAc_6c4sQs2c_5s3h3cKc() {
    assertEquals(
      "8d4dKhJc 6d4cTd2h=8cTh3s6h 7c2s5d2d 8sTsKdQc 6c4sQs2c 5s3h3cKc Qd9cAdAc",
      Solver.process("omaha-holdem 3d6s7h7sAs 6d4cTd2h 8cTh3s6h 8d4dKhJc 8sTsKdQc 7c2s5d2d Qd9cAdAc 6c4sQs2c 5s3h3cKc"));
  }

  @Test
  public void test_omaha_holdem_2397_3d6c6d9sKc_5d2sAhJh_4c5s7h3s_4dJc7sAd_2hQsJsKh_Tc4sTd6h_5c9cQc9d_Ac6s7cKd() {
    assertEquals(
      "4dJc7sAd=5d2sAhJh 4c5s7h3s 2hQsJsKh Tc4sTd6h Ac6s7cKd 5c9cQc9d",
      Solver.process("omaha-holdem 3d6c6d9sKc 5d2sAhJh 4c5s7h3s 4dJc7sAd 2hQsJsKh Tc4sTd6h 5c9cQc9d Ac6s7cKd"));
  }

  @Test
  public void test_omaha_holdem_2398_2d4c6hAhJc_5sTd9h5d_ThQd9s2s_Qs7h9cTs_5c4h8sAc_2hKs6s3c_5hQc3sJh_6c3dJsKc() {
    assertEquals(
      "Qs7h9cTs ThQd9s2s 5sTd9h5d 2hKs6s3c 6c3dJsKc 5c4h8sAc 5hQc3sJh",
      Solver.process("omaha-holdem 2d4c6hAhJc 5sTd9h5d ThQd9s2s Qs7h9cTs 5c4h8sAc 2hKs6s3c 5hQc3sJh 6c3dJsKc"));
  }

  @Test
  public void test_omaha_holdem_2399_4s6d7dAhKs_8sAs7c7h_3h8c8d5s_8h9dThQd_7s3cKd5d_3s9s3dKc_JcTd2sQs_AdJh4hTs() {
    assertEquals(
      "8h9dThQd JcTd2sQs 3s9s3dKc AdJh4hTs 8sAs7c7h 7s3cKd5d 3h8c8d5s",
      Solver.process("omaha-holdem 4s6d7dAhKs 8sAs7c7h 3h8c8d5s 8h9dThQd 7s3cKd5d 3s9s3dKc JcTd2sQs AdJh4hTs"));
  }

  @Test
  public void test_omaha_holdem_2400_3c5cJhQcTh_4c6d7s5h_Jc7d2c8h() {
    assertEquals(
      "4c6d7s5h Jc7d2c8h",
      Solver.process("omaha-holdem 3c5cJhQcTh 4c6d7s5h Jc7d2c8h"));
  }

  @Test
  public void test_omaha_holdem_2401_5c6h8sJcQs_9hKc4c2s_2h3h3c9s_3s6cQh7d_AhTdKdJh_5h4hAsJd_9d7cQdTs_Tc8cKs3d_7s9cAc5s() {
    assertEquals(
      "9hKc4c2s 2h3h3c9s Tc8cKs3d AhTdKdJh 5h4hAsJd 3s6cQh7d 7s9cAc5s 9d7cQdTs",
      Solver.process("omaha-holdem 5c6h8sJcQs 9hKc4c2s 2h3h3c9s 3s6cQh7d AhTdKdJh 5h4hAsJd 9d7cQdTs Tc8cKs3d 7s9cAc5s"));
  }

  @Test
  public void test_omaha_holdem_2402_2c5h7sAdKc_9d9cQcJh_3c6c6dKd_5d6s5sAs_Js9sQs3h() {
    assertEquals(
      "Js9sQs3h 9d9cQcJh 3c6c6dKd 5d6s5sAs",
      Solver.process("omaha-holdem 2c5h7sAdKc 9d9cQcJh 3c6c6dKd 5d6s5sAs Js9sQs3h"));
  }

  @Test
  public void test_omaha_holdem_2403_2d6h9cJcQd_6sKh2c7d_3c6c7hQs_4hQh4sAh() {
    assertEquals(
      "4hQh4sAh 6sKh2c7d 3c6c7hQs",
      Solver.process("omaha-holdem 2d6h9cJcQd 6sKh2c7d 3c6c7hQs 4hQh4sAh"));
  }

  @Test
  public void test_omaha_holdem_2404_2c2s7sKsQs_2dThAd9c_4cAc4s7d_KcJs8h3d() {
    assertEquals(
      "4cAc4s7d KcJs8h3d 2dThAd9c",
      Solver.process("omaha-holdem 2c2s7sKsQs 2dThAd9c 4cAc4s7d KcJs8h3d"));
  }

  @Test
  public void test_omaha_holdem_2405_4s7sAhKsTc_9dJh7h4h_2s9h9c8s_7dJs2d4d_2h8d3sKd_KhTh3c4c_Ac6c5hTs() {
    assertEquals(
      "2h8d3sKd 7dJs2d4d=9dJh7h4h KhTh3c4c Ac6c5hTs 2s9h9c8s",
      Solver.process("omaha-holdem 4s7sAhKsTc 9dJh7h4h 2s9h9c8s 7dJs2d4d 2h8d3sKd KhTh3c4c Ac6c5hTs"));
  }

  @Test
  public void test_omaha_holdem_2406_3s6cAcKhQs_As5dJs4c_Ad4dAh6s_Qd7s2c6d_Kc3c2d9h_Tc2s9c8h_6hQh9s5s() {
    assertEquals(
      "Tc2s9c8h As5dJs4c 6hQh9s5s=Qd7s2c6d Kc3c2d9h Ad4dAh6s",
      Solver.process("omaha-holdem 3s6cAcKhQs As5dJs4c Ad4dAh6s Qd7s2c6d Kc3c2d9h Tc2s9c8h 6hQh9s5s"));
  }

  @Test
  public void test_omaha_holdem_2407_3s4sAsJhTh_9cQh5h4d_Ah3h2dKs() {
    assertEquals(
      "9cQh5h4d Ah3h2dKs",
      Solver.process("omaha-holdem 3s4sAsJhTh 9cQh5h4d Ah3h2dKs"));
  }

  @Test
  public void test_omaha_holdem_2408_6c7c7d7hQs_JsTc8cKc_Ac6dJdQh() {
    assertEquals(
      "JsTc8cKc Ac6dJdQh",
      Solver.process("omaha-holdem 6c7c7d7hQs JsTc8cKc Ac6dJdQh"));
  }

  @Test
  public void test_omaha_holdem_2409_4d5s7d7h8d_8h3dAs3c_Ad4sJh8c_6sKs2s2c_Kh7cQd5h_8sTcKcQs_4cTdThTs_Qh5c3sAc_9c6dJc4h() {
    assertEquals(
      "6sKs2s2c Qh5c3sAc 8sTcKcQs 8h3dAs3c=Ad4sJh8c 4cTdThTs 9c6dJc4h Kh7cQd5h",
      Solver.process("omaha-holdem 4d5s7d7h8d 8h3dAs3c Ad4sJh8c 6sKs2s2c Kh7cQd5h 8sTcKcQs 4cTdThTs Qh5c3sAc 9c6dJc4h"));
  }

  @Test
  public void test_omaha_holdem_2410_7d8h9dKdKh_Ts8s6h9c_Ac7s8dAh_4h3cJc4d_8c7c2d4c() {
    assertEquals(
      "4h3cJc4d 8c7c2d4c Ac7s8dAh Ts8s6h9c",
      Solver.process("omaha-holdem 7d8h9dKdKh Ts8s6h9c Ac7s8dAh 4h3cJc4d 8c7c2d4c"));
  }

  @Test
  public void test_omaha_holdem_2411_3c8sAhQcTd_6dKcAdKh_8d6s4dJs_8hJcQh6h() {
    assertEquals(
      "8d6s4dJs 6dKcAdKh 8hJcQh6h",
      Solver.process("omaha-holdem 3c8sAhQcTd 6dKcAdKh 8d6s4dJs 8hJcQh6h"));
  }

  @Test
  public void test_omaha_holdem_2412_3d4h6h7d8h_JcTcQs2c_Ad2s4cJs_2h4d2d3h_QcQh8c9d_8sTd7s5c() {
    assertEquals(
      "JcTcQs2c Ad2s4cJs QcQh8c9d 8sTd7s5c 2h4d2d3h",
      Solver.process("omaha-holdem 3d4h6h7d8h JcTcQs2c Ad2s4cJs 2h4d2d3h QcQh8c9d 8sTd7s5c"));
  }

  @Test
  public void test_omaha_holdem_2413_2hAsKdKsQs_7c6s8hAh_9h7h6hJh_3s2c3c6d() {
    assertEquals(
      "9h7h6hJh 3s2c3c6d 7c6s8hAh",
      Solver.process("omaha-holdem 2hAsKdKsQs 7c6s8hAh 9h7h6hJh 3s2c3c6d"));
  }

  @Test
  public void test_omaha_holdem_2414_5h8cAdKcTh_Ks7dJcTc_Qd2c4dKd_Qh7hTsAc_4s6c8s8d() {
    assertEquals(
      "Qd2c4dKd Ks7dJcTc Qh7hTsAc 4s6c8s8d",
      Solver.process("omaha-holdem 5h8cAdKcTh Ks7dJcTc Qd2c4dKd Qh7hTsAc 4s6c8s8d"));
  }

  @Test
  public void test_omaha_holdem_2415_2d4d5c8sKh_6hTd8hAc_ThAd3c3h_5hJd5d8d_3s7h6cQd_As4s9d7s() {
    assertEquals(
      "As4s9d7s 6hTd8hAc 5hJd5d8d ThAd3c3h 3s7h6cQd",
      Solver.process("omaha-holdem 2d4d5c8sKh 6hTd8hAc ThAd3c3h 5hJd5d8d 3s7h6cQd As4s9d7s"));
  }

  @Test
  public void test_omaha_holdem_2416_6d7h8d9hKd_8cQcAdKs_Td2s9s2c_AsTs3dTc_7cJsKc3c_3s3h2h8h() {
    assertEquals(
      "3s3h2h8h AsTs3dTc 7cJsKc3c 8cQcAdKs Td2s9s2c",
      Solver.process("omaha-holdem 6d7h8d9hKd 8cQcAdKs Td2s9s2c AsTs3dTc 7cJsKc3c 3s3h2h8h"));
  }

  @Test
  public void test_omaha_holdem_2417_3h6c6s9dQd_KdTs3dAh_9c5d8s5s_TdThJdKs_2h4h2dAc_Tc9sQs8c_4d6d8d7s_KhKc7h7d_5c4cJs9h_Ad7c6h8h() {
    assertEquals(
      "2h4h2dAc KdTs3dAh 9c5d8s5s 5c4cJs9h TdThJdKs Tc9sQs8c KhKc7h7d 4d6d8d7s Ad7c6h8h",
      Solver.process("omaha-holdem 3h6c6s9dQd KdTs3dAh 9c5d8s5s TdThJdKs 2h4h2dAc Tc9sQs8c 4d6d8d7s KhKc7h7d 5c4cJs9h Ad7c6h8h"));
  }

  @Test
  public void test_omaha_holdem_2418_2c5s6cAsKs_9h5hTh2h_Qd8sAc6d_8d4dTc3c() {
    assertEquals(
      "9h5hTh2h Qd8sAc6d 8d4dTc3c",
      Solver.process("omaha-holdem 2c5s6cAsKs 9h5hTh2h Qd8sAc6d 8d4dTc3c"));
  }

  @Test
  public void test_omaha_holdem_2419_2c5s6c7c8h_Ts9dJc4c_4s8cAhQd_7d2dKhQc_6sKdKc3c_QsJhTd3d_Jd2s6d9c() {
    assertEquals(
      "QsJhTd3d 7d2dKhQc 4s8cAhQd Jd2s6d9c Ts9dJc4c 6sKdKc3c",
      Solver.process("omaha-holdem 2c5s6c7c8h Ts9dJc4c 4s8cAhQd 7d2dKhQc 6sKdKc3c QsJhTd3d Jd2s6d9c"));
  }

  @Test
  public void test_omaha_holdem_2420_5dAdAhKsQh_7h2h5s6s_Qc3c5c5h_QdKc9c4h_9h7s4c9d_8d6hTd8c_TsAcKhJh() {
    assertEquals(
      "7h2h5s6s 8d6hTd8c 9h7s4c9d QdKc9c4h Qc3c5c5h TsAcKhJh",
      Solver.process("omaha-holdem 5dAdAhKsQh 7h2h5s6s Qc3c5c5h QdKc9c4h 9h7s4c9d 8d6hTd8c TsAcKhJh"));
  }

  @Test
  public void test_omaha_holdem_2421_4s5s6c7h9d_2sJhTd6d_3s2dQs6s_Js7dTs5h_4d5dKdQh_KsKc8c3c_Tc7sJcTh_Ac8d4h5c() {
    assertEquals(
      "2sJhTd6d Tc7sJcTh KsKc8c3c 4d5dKdQh Js7dTs5h 3s2dQs6s Ac8d4h5c",
      Solver.process("omaha-holdem 4s5s6c7h9d 2sJhTd6d 3s2dQs6s Js7dTs5h 4d5dKdQh KsKc8c3c Tc7sJcTh Ac8d4h5c"));
  }

  @Test
  public void test_omaha_holdem_2422_2d5c6h8sJd_Kh4d9c2s_Js6d3c9h_Kc9d9s8d_JcAh4cAd() {
    assertEquals(
      "Kh4d9c2s Kc9d9s8d JcAh4cAd Js6d3c9h",
      Solver.process("omaha-holdem 2d5c6h8sJd Kh4d9c2s Js6d3c9h Kc9d9s8d JcAh4cAd"));
  }

  @Test
  public void test_omaha_holdem_2423_2c4d6c9cQh_8c4cJd6s_Ac5c7hTh_4h8sTdJs_2h6h7s4s_KsJh3h9d_Tc7cJc2d() {
    assertEquals(
      "4h8sTdJs KsJh3h9d 2h6h7s4s 8c4cJd6s Tc7cJc2d Ac5c7hTh",
      Solver.process("omaha-holdem 2c4d6c9cQh 8c4cJd6s Ac5c7hTh 4h8sTdJs 2h6h7s4s KsJh3h9d Tc7cJc2d"));
  }

  @Test
  public void test_omaha_holdem_2424_2c5dKdKhQh_TdTcAh3h_Qs9d8d6c_6hJs3c4c_AcJd6dJh_8cJc4s3s_9cKs5s7h_4h8sTsQd_Th5c2hQc() {
    assertEquals(
      "6hJs3c4c 8cJc4s3s TdTcAh3h AcJd6dJh Qs9d8d6c 4h8sTsQd=Th5c2hQc 9cKs5s7h",
      Solver.process("omaha-holdem 2c5dKdKhQh TdTcAh3h Qs9d8d6c 6hJs3c4c AcJd6dJh 8cJc4s3s 9cKs5s7h 4h8sTsQd Th5c2hQc"));
  }

  @Test
  public void test_omaha_holdem_2425_9sAdKdQdTh_5d9d5s8s_4d4cTsQc_JhKs2c3d_9hAsJs7d_Jc3cQs2h_2s8d6s5c_Qh9cTc5h_7sAc8c7c() {
    assertEquals(
      "2s8d6s5c 7sAc8c7c 4d4cTsQc=Qh9cTc5h 9hAsJs7d=Jc3cQs2h=JhKs2c3d 5d9d5s8s",
      Solver.process("omaha-holdem 9sAdKdQdTh 5d9d5s8s 4d4cTsQc JhKs2c3d 9hAsJs7d Jc3cQs2h 2s8d6s5c Qh9cTc5h 7sAc8c7c"));
  }

  @Test
  public void test_omaha_holdem_2426_4d5c5s8dJs_2s3hKh7h_Qc9s6dKd_Ah6h4h6s_Qs7cTd5d_8hJc7s8c_7d3sJhTc() {
    assertEquals(
      "2s3hKh7h Qc9s6dKd Ah6h4h6s 7d3sJhTc Qs7cTd5d 8hJc7s8c",
      Solver.process("omaha-holdem 4d5c5s8dJs 2s3hKh7h Qc9s6dKd Ah6h4h6s Qs7cTd5d 8hJc7s8c 7d3sJhTc"));
  }

  @Test
  public void test_omaha_holdem_2427_6d9sAhAsQs_9h3c7d9c_9d2d4dJc_6s5c5sQc_Qd8s6h2h() {
    assertEquals(
      "9d2d4dJc Qd8s6h2h 6s5c5sQc 9h3c7d9c",
      Solver.process("omaha-holdem 6d9sAhAsQs 9h3c7d9c 9d2d4dJc 6s5c5sQc Qd8s6h2h"));
  }

  @Test
  public void test_omaha_holdem_2428_2d4d6d7d9h_3d5cQcTd_TcJh3cKs() {
    assertEquals(
      "TcJh3cKs 3d5cQcTd",
      Solver.process("omaha-holdem 2d4d6d7d9h 3d5cQcTd TcJh3cKs"));
  }

  @Test
  public void test_omaha_holdem_2429_4s5s8c9cTd_3h5h2s3c_Qc4h7d4c_6h7hQs9h_Js6d8d2c_3s9dKd5d_7sAsThAh_KcQdKhKs_Qh6cAc5c() {
    assertEquals(
      "3h5h2s3c Qh6cAc5c Js6d8d2c KcQdKhKs 7sAsThAh 3s9dKd5d Qc4h7d4c 6h7hQs9h",
      Solver.process("omaha-holdem 4s5s8c9cTd 3h5h2s3c Qc4h7d4c 6h7hQs9h Js6d8d2c 3s9dKd5d 7sAsThAh KcQdKhKs Qh6cAc5c"));
  }

  @Test
  public void test_omaha_holdem_2430_2s3c4s8sAh_2d5c8hKh_Tc9cJs9h_Qs6cQhAc_Qc8d3h4d_7d9s6hJh_3s6dAd5s_6s7s2cTs_KsQdKdTh_Td7hAs8c() {
    assertEquals(
      "7d9s6hJh Tc9cJs9h KsQdKdTh Qs6cQhAc Qc8d3h4d Td7hAs8c 2d5c8hKh 3s6dAd5s 6s7s2cTs",
      Solver.process("omaha-holdem 2s3c4s8sAh 2d5c8hKh Tc9cJs9h Qs6cQhAc Qc8d3h4d 7d9s6hJh 3s6dAd5s 6s7s2cTs KsQdKdTh Td7hAs8c"));
  }

  @Test
  public void test_omaha_holdem_2431_3h4c4hQcTs_8s3dQsKs_9s5d4s5h_6s9d2hKc_AhThJc2c() {
    assertEquals(
      "6s9d2hKc AhThJc2c 8s3dQsKs 9s5d4s5h",
      Solver.process("omaha-holdem 3h4c4hQcTs 8s3dQsKs 9s5d4s5h 6s9d2hKc AhThJc2c"));
  }

  @Test
  public void test_omaha_holdem_2432_2c3c6sAsQs_9s4c6h8c_7sJd2dKd_Ts7d4h8d_JsJcJh2h_3sQd5s9d_AhTd5dQc_5c6d4s9c_KsAd3hAc_KcTc9h5h() {
    assertEquals(
      "Ts7d4h8d KcTc9h5h 7sJd2dKd 9s4c6h8c JsJcJh2h AhTd5dQc KsAd3hAc 5c6d4s9c 3sQd5s9d",
      Solver.process("omaha-holdem 2c3c6sAsQs 9s4c6h8c 7sJd2dKd Ts7d4h8d JsJcJh2h 3sQd5s9d AhTd5dQc 5c6d4s9c KsAd3hAc KcTc9h5h"));
  }

  @Test
  public void test_omaha_holdem_2433_4h5h8h9c9h_Jc5c2sKs_Ac2c3h3d_TcTs7cQs_4dQdTd8d() {
    assertEquals(
      "Ac2c3h3d Jc5c2sKs 4dQdTd8d TcTs7cQs",
      Solver.process("omaha-holdem 4h5h8h9c9h Jc5c2sKs Ac2c3h3d TcTs7cQs 4dQdTd8d"));
  }

  @Test
  public void test_omaha_holdem_2434_5d6dJcJdTd_8d7d5cQs_Qc9h7cAd() {
    assertEquals(
      "Qc9h7cAd 8d7d5cQs",
      Solver.process("omaha-holdem 5d6dJcJdTd 8d7d5cQs Qc9h7cAd"));
  }

  @Test
  public void test_omaha_holdem_2435_2s6hAsThTs_9sJs4s8h_3s7hAcTd_7sTcAd4c_6c6d5dQd_Kd8d5hQc_8c4hKs4d_3cJcKc8s_Ah2h6s3d() {
    assertEquals(
      "3cJcKc8s Kd8d5hQc 8c4hKs4d Ah2h6s3d 9sJs4s8h 6c6d5dQd 3s7hAcTd=7sTcAd4c",
      Solver.process("omaha-holdem 2s6hAsThTs 9sJs4s8h 3s7hAcTd 7sTcAd4c 6c6d5dQd Kd8d5hQc 8c4hKs4d 3cJcKc8s Ah2h6s3d"));
  }

  @Test
  public void test_omaha_holdem_2436_2h3sJcJhKh_7d6s8s8d_5d2cAs9d_8c7sKsKc_KdAd7hTc_4s3c9c6d() {
    assertEquals(
      "5d2cAs9d 4s3c9c6d 7d6s8s8d KdAd7hTc 8c7sKsKc",
      Solver.process("omaha-holdem 2h3sJcJhKh 7d6s8s8d 5d2cAs9d 8c7sKsKc KdAd7hTc 4s3c9c6d"));
  }

  @Test
  public void test_omaha_holdem_2437_4d6c6d6s9c_Tc4c2sAc_5s8s3sTh_KcTs4h3h_7c2c5c3d_AhJdKsQh_2h8cJh3c() {
    assertEquals(
      "7c2c5c3d 5s8s3sTh 2h8cJh3c KcTs4h3h Tc4c2sAc AhJdKsQh",
      Solver.process("omaha-holdem 4d6c6d6s9c Tc4c2sAc 5s8s3sTh KcTs4h3h 7c2c5c3d AhJdKsQh 2h8cJh3c"));
  }

  @Test
  public void test_omaha_holdem_2438_3h4d7dAsKs_2h7s4h4c_ThQh3s3c_2s5dJhKd_TsAc6d5s_6s8cQc9h_Qd7h3dAh() {
    assertEquals(
      "6s8cQc9h Qd7h3dAh ThQh3s3c 2h7s4h4c 2s5dJhKd TsAc6d5s",
      Solver.process("omaha-holdem 3h4d7dAsKs 2h7s4h4c ThQh3s3c 2s5dJhKd TsAc6d5s 6s8cQc9h Qd7h3dAh"));
  }

  @Test
  public void test_omaha_holdem_2439_2s5s6dAhJc_4sThQc8c_7sTsKd9c_7h4hAc6s_6h3sKs5d_3dQsJs4c_8dQhKhAd() {
    assertEquals(
      "4sThQc8c 7sTsKd9c 8dQhKhAd 6h3sKs5d 7h4hAc6s 3dQsJs4c",
      Solver.process("omaha-holdem 2s5s6dAhJc 4sThQc8c 7sTsKd9c 7h4hAc6s 6h3sKs5d 3dQsJs4c 8dQhKhAd"));
  }

  @Test
  public void test_omaha_holdem_2440_3c5d7h8c9h_Kc4c6cQh_4sAsAdTd_Jc7c9d8d_2h9cJs4d_8sJh3sQc() {
    assertEquals(
      "2h9cJs4d 4sAsAdTd 8sJh3sQc Jc7c9d8d Kc4c6cQh",
      Solver.process("omaha-holdem 3c5d7h8c9h Kc4c6cQh 4sAsAdTd Jc7c9d8d 2h9cJs4d 8sJh3sQc"));
  }

  @Test
  public void test_omaha_holdem_2441_2d3s8dAcJh_Jd5d2hKh_2c7d7c3d_9s8c5hJc() {
    assertEquals(
      "2c7d7c3d Jd5d2hKh 9s8c5hJc",
      Solver.process("omaha-holdem 2d3s8dAcJh Jd5d2hKh 2c7d7c3d 9s8c5hJc"));
  }

  @Test
  public void test_omaha_holdem_2442_3h5c9sJhQh_2sTh5dAs_Ac8s7c8c() {
    assertEquals(
      "2sTh5dAs Ac8s7c8c",
      Solver.process("omaha-holdem 3h5c9sJhQh 2sTh5dAs Ac8s7c8c"));
  }

  @Test
  public void test_omaha_holdem_2443_3s9dQcTcTh_3c6dKs2s_2c5s4s7d() {
    assertEquals(
      "2c5s4s7d 3c6dKs2s",
      Solver.process("omaha-holdem 3s9dQcTcTh 3c6dKs2s 2c5s4s7d"));
  }

  @Test
  public void test_omaha_holdem_2444_8c8d8h9sJd_AsTd4dQh_7dKc4s5d() {
    assertEquals(
      "7dKc4s5d AsTd4dQh",
      Solver.process("omaha-holdem 8c8d8h9sJd AsTd4dQh 7dKc4s5d"));
  }

  @Test
  public void test_omaha_holdem_2445_4h5c8cKcKd_2c9c7cAs_TsAhAc5h_3hTc4c2h() {
    assertEquals(
      "TsAhAc5h 2c9c7cAs 3hTc4c2h",
      Solver.process("omaha-holdem 4h5c8cKcKd 2c9c7cAs TsAhAc5h 3hTc4c2h"));
  }

  @Test
  public void test_omaha_holdem_2446_3h7hJcQhTs_8sAcJs3d_4c7s3c4d_Qs9h9sQc_KcKh7dTc_Td2h8c9d_6hKs5dQd_6c8h5sJd() {
    assertEquals(
      "6c8h5sJd 6hKs5dQd 4c7s3c4d KcKh7dTc 8sAcJs3d Qs9h9sQc Td2h8c9d",
      Solver.process("omaha-holdem 3h7hJcQhTs 8sAcJs3d 4c7s3c4d Qs9h9sQc KcKh7dTc Td2h8c9d 6hKs5dQd 6c8h5sJd"));
  }

  @Test
  public void test_omaha_holdem_2447_2c3s7s8s9c_KdTdKc2d_3dJd4c2s_8cQsQh2h_6sKsJc5h() {
    assertEquals(
      "KdTdKc2d 3dJd4c2s 8cQsQh2h 6sKsJc5h",
      Solver.process("omaha-holdem 2c3s7s8s9c KdTdKc2d 3dJd4c2s 8cQsQh2h 6sKsJc5h"));
  }

  @Test
  public void test_omaha_holdem_2448_5s7cAhAsQc_KsTc2sKc_KhJh3h4s_7s5d3c7h_7d8h3sAd_Th4c6c9h_2dJs9s4h_JdQsTd2c_6s6h2h6d() {
    assertEquals(
      "Th4c6c9h 2dJs9s4h KhJh3h4s 6s6h2h6d JdQsTd2c KsTc2sKc 7s5d3c7h 7d8h3sAd",
      Solver.process("omaha-holdem 5s7cAhAsQc KsTc2sKc KhJh3h4s 7s5d3c7h 7d8h3sAd Th4c6c9h 2dJs9s4h JdQsTd2c 6s6h2h6d"));
  }

  @Test
  public void test_omaha_holdem_2449_3s8d9hKdQh_5c9c5dAs_6d2hJsAc() {
    assertEquals(
      "6d2hJsAc 5c9c5dAs",
      Solver.process("omaha-holdem 3s8d9hKdQh 5c9c5dAs 6d2hJsAc"));
  }

  @Test
  public void test_omaha_holdem_2450_4s6cAhKdTc_6hKsAs8d_8h2dQh6s() {
    assertEquals(
      "8h2dQh6s 6hKsAs8d",
      Solver.process("omaha-holdem 4s6cAhKdTc 6hKsAs8d 8h2dQh6s"));
  }

  @Test
  public void test_omaha_holdem_2451_3h4cAdAhAs_8cAc2d6s_5c8hQs6d_4sKcJh3d_JsKh4hTh_6c9hTs2h() {
    assertEquals(
      "6c9hTs2h 5c8hQs6d 4sKcJh3d=JsKh4hTh 8cAc2d6s",
      Solver.process("omaha-holdem 3h4cAdAhAs 8cAc2d6s 5c8hQs6d 4sKcJh3d JsKh4hTh 6c9hTs2h"));
  }

  @Test
  public void test_omaha_holdem_2452_3d6s8hAdTc_QsQdQh8c_As4dAc3s_4hThJcTs_7cJd2d6d_Kc9d7h6h_9h5h7s2s() {
    assertEquals(
      "7cJd2d6d QsQdQh8c 4hThJcTs As4dAc3s 9h5h7s2s=Kc9d7h6h",
      Solver.process("omaha-holdem 3d6s8hAdTc QsQdQh8c As4dAc3s 4hThJcTs 7cJd2d6d Kc9d7h6h 9h5h7s2s"));
  }

  @Test
  public void test_omaha_holdem_2453_3s6h8h9hKc_7sQd2cAc_9dJh4h4c_2h7hQc5d() {
    assertEquals(
      "7sQd2cAc 2h7hQc5d 9dJh4h4c",
      Solver.process("omaha-holdem 3s6h8h9hKc 7sQd2cAc 9dJh4h4c 2h7hQc5d"));
  }

  @Test
  public void test_omaha_holdem_2454_2s8d9cKdTh_KhKs3h8h_TcJsTs9h_Qh5dKcJd_As8c6cJc_2d7dQd4s() {
    assertEquals(
      "2d7dQd4s As8c6cJc TcJsTs9h KhKs3h8h Qh5dKcJd",
      Solver.process("omaha-holdem 2s8d9cKdTh KhKs3h8h TcJsTs9h Qh5dKcJd As8c6cJc 2d7dQd4s"));
  }

  @Test
  public void test_omaha_holdem_2455_3h7h7sJcQs_5d9h9s6h_6c7d4c4d_Ks8hKd3s_5s8s4h8d() {
    assertEquals(
      "5s8s4h8d 5d9h9s6h Ks8hKd3s 6c7d4c4d",
      Solver.process("omaha-holdem 3h7h7sJcQs 5d9h9s6h 6c7d4c4d Ks8hKd3s 5s8s4h8d"));
  }

  @Test
  public void test_omaha_holdem_2456_5d9hAdKsTd_Ah9c4s9d_QcJc8h6d_3d8s2sQh_8d7c8c9s_4d4cKd3h_3c6sJd2d_Js7sThQd() {
    assertEquals(
      "3d8s2sQh 8d7c8c9s Ah9c4s9d Js7sThQd=QcJc8h6d 3c6sJd2d 4d4cKd3h",
      Solver.process("omaha-holdem 5d9hAdKsTd Ah9c4s9d QcJc8h6d 3d8s2sQh 8d7c8c9s 4d4cKd3h 3c6sJd2d Js7sThQd"));
  }

  @Test
  public void test_omaha_holdem_2457_2h9cJdQhQs_Kh2cQdAs_Tc5h3d8s_7c8h8c4c_4s9d3cKd_Qc5sAc9s_4d7hTdAh_Ts5cJc2s() {
    assertEquals(
      "4d7hTdAh 7c8h8c4c 4s9d3cKd Ts5cJc2s Tc5h3d8s Kh2cQdAs Qc5sAc9s",
      Solver.process("omaha-holdem 2h9cJdQhQs Kh2cQdAs Tc5h3d8s 7c8h8c4c 4s9d3cKd Qc5sAc9s 4d7hTdAh Ts5cJc2s"));
  }

  @Test
  public void test_omaha_holdem_2458_2c8dJdJhQh_6c2hAh2s_Qc7sQs6s_KcAcKs5s_4cAdKd8h() {
    assertEquals(
      "4cAdKd8h KcAcKs5s 6c2hAh2s Qc7sQs6s",
      Solver.process("omaha-holdem 2c8dJdJhQh 6c2hAh2s Qc7sQs6s KcAcKs5s 4cAdKd8h"));
  }

  @Test
  public void test_omaha_holdem_2459_2c3s8h9dJh_5sKc6h3c_7h2h2dAh_5c6s4c7d_Kd9s5d4d_3dKh9cQs() {
    assertEquals(
      "5c6s4c7d 5sKc6h3c Kd9s5d4d 3dKh9cQs 7h2h2dAh",
      Solver.process("omaha-holdem 2c3s8h9dJh 5sKc6h3c 7h2h2dAh 5c6s4c7d Kd9s5d4d 3dKh9cQs"));
  }

  @Test
  public void test_omaha_holdem_2460_4c5cJsTcTh_2d8dKsTs_4dQs4s2h_8hAc9d9c_2c9s3sAd_8c3cQh5h_KhKd3d5s_7cTd6dAs_3h5d2s7s_8sQc7hJh() {
    assertEquals(
      "2c9s3sAd 3h5d2s7s 8sQc7hJh KhKd3d5s 2d8dKsTs 7cTd6dAs 8c3cQh5h 8hAc9d9c 4dQs4s2h",
      Solver.process("omaha-holdem 4c5cJsTcTh 2d8dKsTs 4dQs4s2h 8hAc9d9c 2c9s3sAd 8c3cQh5h KhKd3d5s 7cTd6dAs 3h5d2s7s 8sQc7hJh"));
  }

  @Test
  public void test_omaha_holdem_2461_4h6c7d7s8c_2c2hAd4c_8h5dQs3h_4dTcKs3c_5c5sJcKh() {
    assertEquals(
      "4dTcKs3c 2c2hAd4c 5c5sJcKh 8h5dQs3h",
      Solver.process("omaha-holdem 4h6c7d7s8c 2c2hAd4c 8h5dQs3h 4dTcKs3c 5c5sJcKh"));
  }

  @Test
  public void test_omaha_holdem_2462_2c4s6d6hTc_9dQh5c2d_AdTs7h5d_3h6cAcKs_9c3cTdKd_4h5sQd3d_Qs8h7c9h_8d3s8c6s_4dThQcJh_As7s9s8s() {
    assertEquals(
      "Qs8h7c9h As7s9s8s 9dQh5c2d 4dThQcJh 9c3cTdKd AdTs7h5d 8d3s8c6s 3h6cAcKs 4h5sQd3d",
      Solver.process("omaha-holdem 2c4s6d6hTc 9dQh5c2d AdTs7h5d 3h6cAcKs 9c3cTdKd 4h5sQd3d Qs8h7c9h 8d3s8c6s 4dThQcJh As7s9s8s"));
  }

  @Test
  public void test_omaha_holdem_2463_2s4c6c9cJh_5d5s6dTc_Ac8c6s3s_4dAd9hQh_9dQdJs4h_3hKc7s3c_8hAs2h5h_Ts7hJdAh_Td3d7dTh_9sJc4s6h() {
    assertEquals(
      "8hAs2h5h 5d5s6dTc Td3d7dTh Ts7hJdAh 4dAd9hQh 9dQdJs4h=9sJc4s6h 3hKc7s3c Ac8c6s3s",
      Solver.process("omaha-holdem 2s4c6c9cJh 5d5s6dTc Ac8c6s3s 4dAd9hQh 9dQdJs4h 3hKc7s3c 8hAs2h5h Ts7hJdAh Td3d7dTh 9sJc4s6h"));
  }

  @Test
  public void test_omaha_holdem_2464_3c3sAcTdTh_Qd9hJs9s_6s8hJhAs_Kc6h8s7s_5dTc5c3h_7h2hKd2c_6c2dKhKs_4c7c4dQs_8dJdQh6d_AdQc4h9c() {
    assertEquals(
      "8dJdQh6d Kc6h8s7s 7h2hKd2c 4c7c4dQs Qd9hJs9s 6c2dKhKs 6s8hJhAs AdQc4h9c 5dTc5c3h",
      Solver.process("omaha-holdem 3c3sAcTdTh Qd9hJs9s 6s8hJhAs Kc6h8s7s 5dTc5c3h 7h2hKd2c 6c2dKhKs 4c7c4dQs 8dJdQh6d AdQc4h9c"));
  }

  @Test
  public void test_omaha_holdem_2465_2c4s6dAhAs_Ks2s5h4d_6cJc9hTd_4h9s8cTs_6hTcKdQc_3h7dJsAd_4c3s7cTh_5c5d9dQh() {
    assertEquals(
      "4c3s7cTh=4h9s8cTs Ks2s5h4d 5c5d9dQh 6cJc9hTd 6hTcKdQc 3h7dJsAd",
      Solver.process("omaha-holdem 2c4s6dAhAs Ks2s5h4d 6cJc9hTd 4h9s8cTs 6hTcKdQc 3h7dJsAd 4c3s7cTh 5c5d9dQh"));
  }

  @Test
  public void test_omaha_holdem_2466_3h8d8sJcTd_9cJh8c3c_JsAh4cQc_2s9d2h6d() {
    assertEquals(
      "2s9d2h6d JsAh4cQc 9cJh8c3c",
      Solver.process("omaha-holdem 3h8d8sJcTd 9cJh8c3c JsAh4cQc 2s9d2h6d"));
  }

  @Test
  public void test_omaha_holdem_2467_4h4s5s9dTd_JcJs3dTs_Qs8c7c9c_4c7h8h4d_6d2s7sJd_AsKd3cAd_Jh5cQcKc_6s7d6h3h_5dAcAhKs_ThQd2d9s() {
    assertEquals(
      "6d2s7sJd Jh5cQcKc 6s7d6h3h Qs8c7c9c ThQd2d9s JcJs3dTs 5dAcAhKs=AsKd3cAd 4c7h8h4d",
      Solver.process("omaha-holdem 4h4s5s9dTd JcJs3dTs Qs8c7c9c 4c7h8h4d 6d2s7sJd AsKd3cAd Jh5cQcKc 6s7d6h3h 5dAcAhKs ThQd2d9s"));
  }

  @Test
  public void test_omaha_holdem_2468_4s6s8hKcKs_3c4d7s3d_8d6dKh2h_9dTsJhQs_AdQh9cTd() {
    assertEquals(
      "AdQh9cTd 3c4d7s3d 9dTsJhQs 8d6dKh2h",
      Solver.process("omaha-holdem 4s6s8hKcKs 3c4d7s3d 8d6dKh2h 9dTsJhQs AdQh9cTd"));
  }

  @Test
  public void test_omaha_holdem_2469_6h6s8h9h9s_3c9d5d8c_2d5h7dKh_Td4sThKs_3d8dJs6c_3sAhQhAc() {
    assertEquals(
      "Td4sThKs 2d5h7dKh 3sAhQhAc 3d8dJs6c 3c9d5d8c",
      Solver.process("omaha-holdem 6h6s8h9h9s 3c9d5d8c 2d5h7dKh Td4sThKs 3d8dJs6c 3sAhQhAc"));
  }

  @Test
  public void test_omaha_holdem_2470_2d6c6s8d8h_4s3h5hKs_QsJdQhKc_8sKh4c5c_9hAd7h4d_9dJhAs7s() {
    assertEquals(
      "4s3h5hKs 9hAd7h4d 9dJhAs7s QsJdQhKc 8sKh4c5c",
      Solver.process("omaha-holdem 2d6c6s8d8h 4s3h5hKs QsJdQhKc 8sKh4c5c 9hAd7h4d 9dJhAs7s"));
  }

  @Test
  public void test_omaha_holdem_2471_4d5dAhJcTh_5c6hKdKc_7cJh7d7h_Qc6c3h6d_As7sKsQh_KhQd5s9d() {
    assertEquals(
      "Qc6c3h6d 7cJh7d7h 5c6hKdKc As7sKsQh=KhQd5s9d",
      Solver.process("omaha-holdem 4d5dAhJcTh 5c6hKdKc 7cJh7d7h Qc6c3h6d As7sKsQh KhQd5s9d"));
  }

  @Test
  public void test_omaha_holdem_2472_5d6c8cKsTc_QcQd2c2s_9dAdTs2h_Jd4dJh4s_Ac2dAs7h_3h4hKd3c_TdKh7dQh() {
    assertEquals(
      "9dAdTs2h Jd4dJh4s 3h4hKd3c Ac2dAs7h TdKh7dQh QcQd2c2s",
      Solver.process("omaha-holdem 5d6c8cKsTc QcQd2c2s 9dAdTs2h Jd4dJh4s Ac2dAs7h 3h4hKd3c TdKh7dQh"));
  }

  @Test
  public void test_omaha_holdem_2473_3h3s8d9dQd_7sThJd2h_JcJs7h9c_4cKd8hTd_Qs9h5h5c_Ks4s5s5d_8s6c6hAd() {
    assertEquals(
      "Ks4s5s5d 8s6c6hAd JcJs7h9c Qs9h5h5c 7sThJd2h 4cKd8hTd",
      Solver.process("omaha-holdem 3h3s8d9dQd 7sThJd2h JcJs7h9c 4cKd8hTd Qs9h5h5c Ks4s5s5d 8s6c6hAd"));
  }

  @Test
  public void test_omaha_holdem_2474_2h3s5s6c8s_3h6dKdQh_2c7d4s4h_JsKhTd9s_8hKc9c3d() {
    assertEquals(
      "3h6dKdQh 8hKc9c3d 2c7d4s4h JsKhTd9s",
      Solver.process("omaha-holdem 2h3s5s6c8s 3h6dKdQh 2c7d4s4h JsKhTd9s 8hKc9c3d"));
  }

  @Test
  public void test_omaha_holdem_2475_2c4s7s8cTc_Kh8dTdKd_Ts3h2sAc() {
    assertEquals(
      "Ts3h2sAc Kh8dTdKd",
      Solver.process("omaha-holdem 2c4s7s8cTc Kh8dTdKd Ts3h2sAc"));
  }

  @Test
  public void test_omaha_holdem_2476_4h8sKdQsTs_9d4cTcQd_7d5c4sAh_3cAsJs9c_4d6h2d2s_6s8hKs9s() {
    assertEquals(
      "4d6h2d2s 7d5c4sAh 9d4cTcQd 6s8hKs9s 3cAsJs9c",
      Solver.process("omaha-holdem 4h8sKdQsTs 9d4cTcQd 7d5c4sAh 3cAsJs9c 4d6h2d2s 6s8hKs9s"));
  }

  @Test
  public void test_omaha_holdem_2477_3d5h9hKdTs_AsQd6c2h_5dJs9cJd_8h7c7d5s() {
    assertEquals(
      "AsQd6c2h 8h7c7d5s 5dJs9cJd",
      Solver.process("omaha-holdem 3d5h9hKdTs AsQd6c2h 5dJs9cJd 8h7c7d5s"));
  }

  @Test
  public void test_omaha_holdem_2478_3d5dJhKcQc_9d7d9s9h_As7cJc7h_Ks6s2d4h_5h8d8h5c_KdKh4s9c_Qs3hJd4d_3s6d2hQh() {
    assertEquals(
      "9d7d9s9h As7cJc7h Ks6s2d4h 3s6d2hQh Qs3hJd4d 5h8d8h5c KdKh4s9c",
      Solver.process("omaha-holdem 3d5dJhKcQc 9d7d9s9h As7cJc7h Ks6s2d4h 5h8d8h5c KdKh4s9c Qs3hJd4d 3s6d2hQh"));
  }

  @Test
  public void test_omaha_holdem_2479_2s3h7h9sKh_5cAdQd8h_Qc2d4cJs() {
    assertEquals(
      "5cAdQd8h Qc2d4cJs",
      Solver.process("omaha-holdem 2s3h7h9sKh 5cAdQd8h Qc2d4cJs"));
  }

  @Test
  public void test_omaha_holdem_2480_4s7s8cKcQs_5sKhJhQc_7d4cQd3s_TdJd9d3c_Js7h4h6c() {
    assertEquals(
      "TdJd9d3c Js7h4h6c 7d4cQd3s 5sKhJhQc",
      Solver.process("omaha-holdem 4s7s8cKcQs 5sKhJhQc 7d4cQd3s TdJd9d3c Js7h4h6c"));
  }

  @Test
  public void test_omaha_holdem_2481_2s8dAdJdKd_3h6s5d4s_5s3cAcJc_6dKs8cTs_Td9s3sKc() {
    assertEquals(
      "3h6s5d4s Td9s3sKc 6dKs8cTs 5s3cAcJc",
      Solver.process("omaha-holdem 2s8dAdJdKd 3h6s5d4s 5s3cAcJc 6dKs8cTs Td9s3sKc"));
  }

  @Test
  public void test_omaha_holdem_2482_4d6s9hAsKs_8c3cQc6h_3dJd7dAd_4c8h7cTh_5c2s9cTs_Qd2dQhTc() {
    assertEquals(
      "4c8h7cTh 8c3cQc6h Qd2dQhTc 3dJd7dAd 5c2s9cTs",
      Solver.process("omaha-holdem 4d6s9hAsKs 8c3cQc6h 3dJd7dAd 4c8h7cTh 5c2s9cTs Qd2dQhTc"));
  }

  @Test
  public void test_omaha_holdem_2483_3d5h6c9hJs_4c8h9s4h_3h9c6dKd_Jh4s5cKs_4d6hQc8s_Ad2cQd6s_Tc7c8dJc_Ah7dQsTs_KcJdQh3c_7hThAcKh() {
    assertEquals(
      "Ah7dQsTs 7hThAcKh 4d6hQc8s Ad2cQd6s 4c8h9s4h 3h9c6dKd KcJdQh3c Jh4s5cKs Tc7c8dJc",
      Solver.process("omaha-holdem 3d5h6c9hJs 4c8h9s4h 3h9c6dKd Jh4s5cKs 4d6hQc8s Ad2cQd6s Tc7c8dJc Ah7dQsTs KcJdQh3c 7hThAcKh"));
  }

  @Test
  public void test_omaha_holdem_2484_2h4c5s7d7s_6d3d8sQd_Ah2s5h4h_9sJd3h8d_JsJc5cKc_Ts3cKh6h_7h6cTdQc_JhQsKd8c() {
    assertEquals(
      "9sJd3h8d JhQsKd8c Ah2s5h4h JsJc5cKc 7h6cTdQc Ts3cKh6h 6d3d8sQd",
      Solver.process("omaha-holdem 2h4c5s7d7s 6d3d8sQd Ah2s5h4h 9sJd3h8d JsJc5cKc Ts3cKh6h 7h6cTdQc JhQsKd8c"));
  }

  @Test
  public void test_omaha_holdem_2485_4d5s6d9sQc_9h5h3s2h_7hJh2sAs_2c5c8c8s_Ac6sTsAd_Js2d7d3d_Kc6cJcTc_9d8h7sAh_4c3h4hKd_7cTdTh6h() {
    assertEquals(
      "7hJh2sAs Kc6cJcTc 2c5c8c8s 7cTdTh6h Ac6sTsAd 4c3h4hKd 9h5h3s2h Js2d7d3d 9d8h7sAh",
      Solver.process("omaha-holdem 4d5s6d9sQc 9h5h3s2h 7hJh2sAs 2c5c8c8s Ac6sTsAd Js2d7d3d Kc6cJcTc 9d8h7sAh 4c3h4hKd 7cTdTh6h"));
  }

  @Test
  public void test_omaha_holdem_2486_2s3c6d9hTh_AhJsTd5h_Qh9c8d4h_4sKdKhAs_3h3d5cAd_7cQdJhAc_2d8h6c6s_Jc9d4c7d_Ks9sQs4d() {
    assertEquals(
      "7cQdJhAc Jc9d4c7d Qh9c8d4h Ks9sQs4d AhJsTd5h 4sKdKhAs 3h3d5cAd 2d8h6c6s",
      Solver.process("omaha-holdem 2s3c6d9hTh AhJsTd5h Qh9c8d4h 4sKdKhAs 3h3d5cAd 7cQdJhAc 2d8h6c6s Jc9d4c7d Ks9sQs4d"));
  }

  @Test
  public void test_omaha_holdem_2487_5c8c8sQsTs_Kd2sKh6s_Td3hAsKs_Kc3sTh7h_9h5hJhJd_9cTcQc2d_6c8h9d3c_7sAd8dAc() {
    assertEquals(
      "Kc3sTh7h 9cTcQc2d 6c8h9d3c 7sAd8dAc 9h5hJhJd Kd2sKh6s Td3hAsKs",
      Solver.process("omaha-holdem 5c8c8sQsTs Kd2sKh6s Td3hAsKs Kc3sTh7h 9h5hJhJd 9cTcQc2d 6c8h9d3c 7sAd8dAc"));
  }

  @Test
  public void test_omaha_holdem_2488_3h8s9hAdQd_2dTc6sJs_9s3d4dKd_Qh6h4c3s_6c8hJcAh_4h7h8c9c_7d7sQs2h_Jd8d5cAc_7c6d5dKh_Qc5hJhAs() {
    assertEquals(
      "7c6d5dKh 7d7sQs2h 9s3d4dKd 4h7h8c9c Qh6h4c3s 6c8hJcAh=Jd8d5cAc Qc5hJhAs 2dTc6sJs",
      Solver.process("omaha-holdem 3h8s9hAdQd 2dTc6sJs 9s3d4dKd Qh6h4c3s 6c8hJcAh 4h7h8c9c 7d7sQs2h Jd8d5cAc 7c6d5dKh Qc5hJhAs"));
  }

  @Test
  public void test_omaha_holdem_2489_4c5h7c9sKc_4h5dKd3h_8hQhJsAs_5cQc7d4d_Qd6h9h5s_Ts7h3cJd() {
    assertEquals(
      "8hQhJsAs Ts7h3cJd Qd6h9h5s 4h5dKd3h 5cQc7d4d",
      Solver.process("omaha-holdem 4c5h7c9sKc 4h5dKd3h 8hQhJsAs 5cQc7d4d Qd6h9h5s Ts7h3cJd"));
  }

  @Test
  public void test_omaha_holdem_2490_2d3h9hQcQd_8s7dQhKs_2c9s4d7c_3s4s7h3c() {
    assertEquals(
      "2c9s4d7c 8s7dQhKs 3s4s7h3c",
      Solver.process("omaha-holdem 2d3h9hQcQd 8s7dQhKs 2c9s4d7c 3s4s7h3c"));
  }

  @Test
  public void test_omaha_holdem_2491_2d2s6c6s8s_Qh9h5cAc_Kd2hQsAs_Js4s2cJc_Kh9c3d5d_9dAhQcKs() {
    assertEquals(
      "Kh9c3d5d Qh9h5cAc 9dAhQcKs Js4s2cJc Kd2hQsAs",
      Solver.process("omaha-holdem 2d2s6c6s8s Qh9h5cAc Kd2hQsAs Js4s2cJc Kh9c3d5d 9dAhQcKs"));
  }

  @Test
  public void test_omaha_holdem_2492_3s9dJsQhTh_4d5hTd8s_6s2c4sTs() {
    assertEquals(
      "6s2c4sTs 4d5hTd8s",
      Solver.process("omaha-holdem 3s9dJsQhTh 4d5hTd8s 6s2c4sTs"));
  }

  @Test
  public void test_omaha_holdem_2493_4h4s5d8sJc_TcJsAc8h_Ts3d4d7d_7h2d9c9d_Kd6c4cAh_QcJdThJh_As9h8d6d_3s6h3h7s() {
    assertEquals(
      "As9h8d6d 7h2d9c9d TcJsAc8h Ts3d4d7d Kd6c4cAh 3s6h3h7s QcJdThJh",
      Solver.process("omaha-holdem 4h4s5d8sJc TcJsAc8h Ts3d4d7d 7h2d9c9d Kd6c4cAh QcJdThJh As9h8d6d 3s6h3h7s"));
  }

  @Test
  public void test_omaha_holdem_2494_2d5h8c9hKc_Ts9sJs3s_QsAs3cKd_4c9d6h7h_7cAc6dTh_7s2cJd2h_5dKh3h6c() {
    assertEquals(
      "Ts9sJs3s QsAs3cKd 5dKh3h6c 7s2cJd2h 4c9d6h7h=7cAc6dTh",
      Solver.process("omaha-holdem 2d5h8c9hKc Ts9sJs3s QsAs3cKd 4c9d6h7h 7cAc6dTh 7s2cJd2h 5dKh3h6c"));
  }

  @Test
  public void test_omaha_holdem_2495_3h4d8sQhTd_7cQsJd8d_Tc5dJc4s_5cKh8hTh() {
    assertEquals(
      "Tc5dJc4s 5cKh8hTh 7cQsJd8d",
      Solver.process("omaha-holdem 3h4d8sQhTd 7cQsJd8d Tc5dJc4s 5cKh8hTh"));
  }

  @Test
  public void test_omaha_holdem_2496_2h8c8sJsKs_7c9dAdTh_Kc5hTd5d() {
    assertEquals(
      "7c9dAdTh Kc5hTd5d",
      Solver.process("omaha-holdem 2h8c8sJsKs 7c9dAdTh Kc5hTd5d"));
  }

  @Test
  public void test_omaha_holdem_2497_3c5hJdJhKs_Ah8d3hAs_Qd6d3d4c_2d6s5dAc_AdTcKhTh_6h4sKd8s_5cTs7dKc_6cQsQh7s_9c7c3s2h_9h9dTd8c() {
    assertEquals(
      "9c7c3s2h Qd6d3d4c 2d6s5dAc 9h9dTd8c 6cQsQh7s 6h4sKd8s 5cTs7dKc AdTcKhTh Ah8d3hAs",
      Solver.process("omaha-holdem 3c5hJdJhKs Ah8d3hAs Qd6d3d4c 2d6s5dAc AdTcKhTh 6h4sKd8s 5cTs7dKc 6cQsQh7s 9c7c3s2h 9h9dTd8c"));
  }

  @Test
  public void test_omaha_holdem_2498_2c9hAcTcTs_KhJdJc3c_Ad4s3d8c() {
    assertEquals(
      "Ad4s3d8c KhJdJc3c",
      Solver.process("omaha-holdem 2c9hAcTcTs KhJdJc3c Ad4s3d8c"));
  }

  @Test
  public void test_omaha_holdem_2499_4d7c7sKcTs_8cAcAd6d_AhKh2h5d_6c8d3s2d_Qc5sJdKs() {
    assertEquals(
      "6c8d3s2d Qc5sJdKs AhKh2h5d 8cAcAd6d",
      Solver.process("omaha-holdem 4d7c7sKcTs 8cAcAd6d AhKh2h5d 6c8d3s2d Qc5sJdKs"));
  }

}
