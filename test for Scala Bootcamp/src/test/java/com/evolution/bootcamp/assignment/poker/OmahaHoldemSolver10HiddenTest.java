
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver10HiddenTest {


  @Test
  public void test_omaha_holdem_2500_4c7c7hAhAs_6c2hTcQd_Ks8hKhTd_4d3cAd4h_2d7dJd3h_6d7s5c9s_Th9d2c8s_9h5dAc6s_9cJh5h3d_Js6h2sQc() {
    assertEquals(
      "Th9d2c8s 9cJh5h3d 6c2hTcQd Js6h2sQc Ks8hKhTd 6d7s5c9s 2d7dJd3h 9h5dAc6s 4d3cAd4h",
      Solver.process("omaha-holdem 4c7c7hAhAs 6c2hTcQd Ks8hKhTd 4d3cAd4h 2d7dJd3h 6d7s5c9s Th9d2c8s 9h5dAc6s 9cJh5h3d Js6h2sQc"));
  }

  @Test
  public void test_omaha_holdem_2501_4d5s6sJhKs_Th9c4h6h_Td2c9h7s_As2d3hQc_7dJd2hKd_Ts6dQs5h() {
    assertEquals(
      "Td2c9h7s Th9c4h6h 7dJd2hKd As2d3hQc Ts6dQs5h",
      Solver.process("omaha-holdem 4d5s6sJhKs Th9c4h6h Td2c9h7s As2d3hQc 7dJd2hKd Ts6dQs5h"));
  }

  @Test
  public void test_omaha_holdem_2502_4s5c9hAsKd_4h6d6s8h_9sJc7d9d_8s5hJs7c_3cAd2dTs_Kc5d6h2s_AhTdKs8c_Tc4dThKh_6c3s4cQc() {
    assertEquals(
      "6c3s4cQc 8s5hJs7c 4h6d6s8h Tc4dThKh Kc5d6h2s AhTdKs8c 9sJc7d9d 3cAd2dTs",
      Solver.process("omaha-holdem 4s5c9hAsKd 4h6d6s8h 9sJc7d9d 8s5hJs7c 3cAd2dTs Kc5d6h2s AhTdKs8c Tc4dThKh 6c3s4cQc"));
  }

  @Test
  public void test_omaha_holdem_2503_2d3s6dAcAd_3hQhJh5c_9cQdQc7d_4c4d9sJd_Tc5h8h5s_8c9d8s2s_8d4hJsQs_7h6sKsJc_Th3c7cAs() {
    assertEquals(
      "8d4hJsQs 3hQhJh5c Tc5h8h5s 7h6sKsJc 8c9d8s2s 4c4d9sJd 9cQdQc7d Th3c7cAs",
      Solver.process("omaha-holdem 2d3s6dAcAd 3hQhJh5c 9cQdQc7d 4c4d9sJd Tc5h8h5s 8c9d8s2s 8d4hJsQs 7h6sKsJc Th3c7cAs"));
  }

  @Test
  public void test_omaha_holdem_2504_2c6cJcJhQc_3dKh4d5c_Th2h9hKd_5hTc4cQh_6h3h7cQs() {
    assertEquals(
      "3dKh4d5c Th2h9hKd 6h3h7cQs 5hTc4cQh",
      Solver.process("omaha-holdem 2c6cJcJhQc 3dKh4d5c Th2h9hKd 5hTc4cQh 6h3h7cQs"));
  }

  @Test
  public void test_omaha_holdem_2505_2s4c7hQdQh_3sAc7cKc_5hQs9s2c_5d3c2h7s() {
    assertEquals(
      "5d3c2h7s 3sAc7cKc 5hQs9s2c",
      Solver.process("omaha-holdem 2s4c7hQdQh 3sAc7cKc 5hQs9s2c 5d3c2h7s"));
  }

  @Test
  public void test_omaha_holdem_2506_3c4cJcQcQh_2s8h3d8s_5cQd3sTh_7s9sJh4d_5s4s4hKs() {
    assertEquals(
      "2s8h3d8s 7s9sJh4d 5s4s4hKs 5cQd3sTh",
      Solver.process("omaha-holdem 3c4cJcQcQh 2s8h3d8s 5cQd3sTh 7s9sJh4d 5s4s4hKs"));
  }

  @Test
  public void test_omaha_holdem_2507_2c3c7h8cTs_3s7c9sTd_3dJhKs3h_8h4c6d8d_4h7d2sKd_9c2dAdKh_Qh6c4s9h_8sQc5sAs_QsAcJsQd() {
    assertEquals(
      "9c2dAdKh 8sQc5sAs QsAcJsQd 4h7d2sKd 3s7c9sTd 3dJhKs3h 8h4c6d8d Qh6c4s9h",
      Solver.process("omaha-holdem 2c3c7h8cTs 3s7c9sTd 3dJhKs3h 8h4c6d8d 4h7d2sKd 9c2dAdKh Qh6c4s9h 8sQc5sAs QsAcJsQd"));
  }

  @Test
  public void test_omaha_holdem_2508_2h7s9hAsKs_5s3s8c6s_3d3cJh6h_Kd4cTc5d_6d9d5cKh_4d2c3hQs() {
    assertEquals(
      "4d2c3hQs 3d3cJh6h Kd4cTc5d 6d9d5cKh 5s3s8c6s",
      Solver.process("omaha-holdem 2h7s9hAsKs 5s3s8c6s 3d3cJh6h Kd4cTc5d 6d9d5cKh 4d2c3hQs"));
  }

  @Test
  public void test_omaha_holdem_2509_7d8h9c9sAh_Ac2dQcTd_7h6s4c5c_9h3d6c8c_2h2sQs7s_Jh5sKh7c_KcAsQh4s() {
    assertEquals(
      "2h2sQs7s Jh5sKh7c Ac2dQcTd KcAsQh4s 7h6s4c5c 9h3d6c8c",
      Solver.process("omaha-holdem 7d8h9c9sAh Ac2dQcTd 7h6s4c5c 9h3d6c8c 2h2sQs7s Jh5sKh7c KcAsQh4s"));
  }

  @Test
  public void test_omaha_holdem_2510_2c2d2h8cTd_3c4d4c4h_AhAc3h5c_QsAdKhJc() {
    assertEquals(
      "QsAdKhJc 3c4d4c4h AhAc3h5c",
      Solver.process("omaha-holdem 2c2d2h8cTd 3c4d4c4h AhAc3h5c QsAdKhJc"));
  }

  @Test
  public void test_omaha_holdem_2511_6h7sJhQcTc_KdKc7d5c_Jd2h2c6s_9h2d3d7h_4dAd5dQd_3c4h6d4c() {
    assertEquals(
      "3c4h6d4c 9h2d3d7h 4dAd5dQd KdKc7d5c Jd2h2c6s",
      Solver.process("omaha-holdem 6h7sJhQcTc KdKc7d5c Jd2h2c6s 9h2d3d7h 4dAd5dQd 3c4h6d4c"));
  }

  @Test
  public void test_omaha_holdem_2512_3c5cJcJsTh_2s6c9s8h_8sQd4cQs_KsJdKd7h_Ts2h3hAd_4hQc6s7s_Td8d7cAc() {
    assertEquals(
      "2s6c9s8h 4hQc6s7s Ts2h3hAd 8sQd4cQs KsJdKd7h Td8d7cAc",
      Solver.process("omaha-holdem 3c5cJcJsTh 2s6c9s8h 8sQd4cQs KsJdKd7h Ts2h3hAd 4hQc6s7s Td8d7cAc"));
  }

  @Test
  public void test_omaha_holdem_2513_3d5d6h9dAh_7cKs2d6s_3s2hQc5c_9hQh7s9c() {
    assertEquals(
      "7cKs2d6s 3s2hQc5c 9hQh7s9c",
      Solver.process("omaha-holdem 3d5d6h9dAh 7cKs2d6s 3s2hQc5c 9hQh7s9c"));
  }

  @Test
  public void test_omaha_holdem_2514_2d3h4s6s9s_6h5d3c3d_Tc3sAh6c_Kh7h7sQd_Qs8c9c5s_9d4c8hKs() {
    assertEquals(
      "Kh7h7sQd Tc3sAh6c 9d4c8hKs 6h5d3c3d Qs8c9c5s",
      Solver.process("omaha-holdem 2d3h4s6s9s 6h5d3c3d Tc3sAh6c Kh7h7sQd Qs8c9c5s 9d4c8hKs"));
  }

  @Test
  public void test_omaha_holdem_2515_3h4d8cAcKs_2d9cQdKd_4h5dAh5h_2h6s9d7s_AdKcQcJs() {
    assertEquals(
      "2h6s9d7s 2d9cQdKd 4h5dAh5h AdKcQcJs",
      Solver.process("omaha-holdem 3h4d8cAcKs 2d9cQdKd 4h5dAh5h 2h6s9d7s AdKcQcJs"));
  }

  @Test
  public void test_omaha_holdem_2516_2s5s6d9cJc_JhJd4h7s_4d4cAd9s_8cAc3dKd_6s7dAsQd_Kh5d6hTh() {
    assertEquals(
      "8cAc3dKd 6s7dAsQd 4d4cAd9s Kh5d6hTh JhJd4h7s",
      Solver.process("omaha-holdem 2s5s6d9cJc JhJd4h7s 4d4cAd9s 8cAc3dKd 6s7dAsQd Kh5d6hTh"));
  }

  @Test
  public void test_omaha_holdem_2517_6s7d8hQdTd_8sJc9s4c_As6d6hKd_Jh2cKs9d_2s2d5d7c_3sJsAcTs_7h4s3d2h_4d6c3h9c() {
    assertEquals(
      "7h4s3d2h 3sJsAcTs 4d6c3h9c 8sJc9s4c=Jh2cKs9d 2s2d5d7c As6d6hKd",
      Solver.process("omaha-holdem 6s7d8hQdTd 8sJc9s4c As6d6hKd Jh2cKs9d 2s2d5d7c 3sJsAcTs 7h4s3d2h 4d6c3h9c"));
  }

  @Test
  public void test_omaha_holdem_2518_2h6cAcAdQc_4s4h6s8d_8hQd5cJh_9s7cKd2c_6hJc3hKc_TcQh2sKs_5sTsJs5h_3c4c9hAh_5d8cQs7d_Td9dTh3d() {
    assertEquals(
      "5sTsJs5h 4s4h6s8d Td9dTh3d 5d8cQs7d 8hQd5cJh TcQh2sKs 3c4c9hAh 9s7cKd2c 6hJc3hKc",
      Solver.process("omaha-holdem 2h6cAcAdQc 4s4h6s8d 8hQd5cJh 9s7cKd2c 6hJc3hKc TcQh2sKs 5sTsJs5h 3c4c9hAh 5d8cQs7d Td9dTh3d"));
  }

  @Test
  public void test_omaha_holdem_2519_6c8d8s9cJd_7s3c4dKd_TcAs6h5h_Ad5d9s9d_QhJhThKc_4sKs2d8h_2hTs3d3h() {
    assertEquals(
      "7s3c4dKd 2hTs3d3h TcAs6h5h 4sKs2d8h QhJhThKc Ad5d9s9d",
      Solver.process("omaha-holdem 6c8d8s9cJd 7s3c4dKd TcAs6h5h Ad5d9s9d QhJhThKc 4sKs2d8h 2hTs3d3h"));
  }

  @Test
  public void test_omaha_holdem_2520_2d3c7hAcJs_Ts6s5hQd_Ah7s6dTd_4dQc4cKh_Ks2cAdAs_5s8h2s9d_Jd3s4h6h_Qs9h6c3h() {
    assertEquals(
      "Ts6s5hQd 5s8h2s9d Qs9h6c3h 4dQc4cKh Jd3s4h6h Ah7s6dTd Ks2cAdAs",
      Solver.process("omaha-holdem 2d3c7hAcJs Ts6s5hQd Ah7s6dTd 4dQc4cKh Ks2cAdAs 5s8h2s9d Jd3s4h6h Qs9h6c3h"));
  }

  @Test
  public void test_omaha_holdem_2521_4s8d9c9dKh_4h7hKd3c_Td6s7s4d_5d3sTh9s_5hJsQc6c_Qs8h8sAs_2dAcAh9h_QhAdJdTs_2h2cKs5c() {
    assertEquals(
      "5hJsQc6c QhAdJdTs Td6s7s4d 2h2cKs5c 4h7hKd3c 5d3sTh9s 2dAcAh9h Qs8h8sAs",
      Solver.process("omaha-holdem 4s8d9c9dKh 4h7hKd3c Td6s7s4d 5d3sTh9s 5hJsQc6c Qs8h8sAs 2dAcAh9h QhAdJdTs 2h2cKs5c"));
  }

  @Test
  public void test_omaha_holdem_2522_4c8hJdKhTc_9h2c2sAc_4d7h7d6d_AsAdTh7c_Kd6h8s6s_KsJh9c4s_3s3cJsQh_5cQs6c3d_Td9s8c3h() {
    assertEquals(
      "5cQs6c3d 9h2c2sAc 4d7h7d6d 3s3cJsQh AsAdTh7c Td9s8c3h Kd6h8s6s KsJh9c4s",
      Solver.process("omaha-holdem 4c8hJdKhTc 9h2c2sAc 4d7h7d6d AsAdTh7c Kd6h8s6s KsJh9c4s 3s3cJsQh 5cQs6c3d Td9s8c3h"));
  }

  @Test
  public void test_omaha_holdem_2523_2c4c6c9dJd_TdKh5hAd_7d2sQh9c_Ac7h6d4s() {
    assertEquals(
      "TdKh5hAd Ac7h6d4s 7d2sQh9c",
      Solver.process("omaha-holdem 2c4c6c9dJd TdKh5hAd 7d2sQh9c Ac7h6d4s"));
  }

  @Test
  public void test_omaha_holdem_2524_6c6s7cKdQd_Th4cQc8h_3cTsJc3s_5s2d8sKs_5dKhTc2h_9c2cJs3d_7h4h6hAc_4d5hAh9h_8dAs9sKc_Qs4sQh5c() {
    assertEquals(
      "9c2cJs3d 4d5hAh9h 3cTsJc3s Th4cQc8h 5s2d8sKs 5dKhTc2h 8dAs9sKc 7h4h6hAc Qs4sQh5c",
      Solver.process("omaha-holdem 6c6s7cKdQd Th4cQc8h 3cTsJc3s 5s2d8sKs 5dKhTc2h 9c2cJs3d 7h4h6hAc 4d5hAh9h 8dAs9sKc Qs4sQh5c"));
  }

  @Test
  public void test_omaha_holdem_2525_3h5d9hKhQh_Jh5s2h7h_4h3cAd9s() {
    assertEquals(
      "4h3cAd9s Jh5s2h7h",
      Solver.process("omaha-holdem 3h5d9hKhQh Jh5s2h7h 4h3cAd9s"));
  }

  @Test
  public void test_omaha_holdem_2526_JdKdTcTdTs_6sQsTh7d_4c5dKs8s_9c5h4d3s_5s6d3dAh() {
    assertEquals(
      "9c5h4d3s 4c5dKs8s 5s6d3dAh 6sQsTh7d",
      Solver.process("omaha-holdem JdKdTcTdTs 6sQsTh7d 4c5dKs8s 9c5h4d3s 5s6d3dAh"));
  }

  @Test
  public void test_omaha_holdem_2527_4hAhJhKcQc_3h7c2h8d_4c7h7s4s_Qs8sAsTc_6h8hKsQh_3cAc9h5h_6cAd4dTd_9dJdTs6d_8c9c7d3d() {
    assertEquals(
      "8c9c7d3d 4c7h7s4s 6cAd4dTd=9dJdTs6d=Qs8sAsTc 3h7c2h8d 3cAc9h5h 6h8hKsQh",
      Solver.process("omaha-holdem 4hAhJhKcQc 3h7c2h8d 4c7h7s4s Qs8sAsTc 6h8hKsQh 3cAc9h5h 6cAd4dTd 9dJdTs6d 8c9c7d3d"));
  }

  @Test
  public void test_omaha_holdem_2528_4s8h9hAsQs_3hTh7c7h_Ad3sQh5c_9d2h5hQd_KsJhTs8s_2dJd4h4c_4dTc7d6d_3d7sJcKc_6h5sKh2s() {
    assertEquals(
      "3d7sJcKc 4dTc7d6d 3hTh7c7h 9d2h5hQd Ad3sQh5c 2dJd4h4c 6h5sKh2s KsJhTs8s",
      Solver.process("omaha-holdem 4s8h9hAsQs 3hTh7c7h Ad3sQh5c 9d2h5hQd KsJhTs8s 2dJd4h4c 4dTc7d6d 3d7sJcKc 6h5sKh2s"));
  }

  @Test
  public void test_omaha_holdem_2529_2h4h7sQdTc_7h8hAcKs_3hQh8s6c_3s4c6d6h_2s4sKdJc_JsQs2dAd_3d3c5sJd_8d9sKc8c_5hTd4d7c_Ah5c2cTs() {
    assertEquals(
      "3d3c5sJd 3s4c6d6h 7h8hAcKs 8d9sKc8c 3hQh8s6c 2s4sKdJc Ah5c2cTs 5hTd4d7c JsQs2dAd",
      Solver.process("omaha-holdem 2h4h7sQdTc 7h8hAcKs 3hQh8s6c 3s4c6d6h 2s4sKdJc JsQs2dAd 3d3c5sJd 8d9sKc8c 5hTd4d7c Ah5c2cTs"));
  }

  @Test
  public void test_omaha_holdem_2530_2c5d5hKdQd_4h2sQs9d_3d2h6s4d_QhAsJh3h() {
    assertEquals(
      "4h2sQs9d QhAsJh3h 3d2h6s4d",
      Solver.process("omaha-holdem 2c5d5hKdQd 4h2sQs9d 3d2h6s4d QhAsJh3h"));
  }

  @Test
  public void test_omaha_holdem_2531_4h7cAcAhJc_3h6c2h4c_4sTd3c7d_Tc2s2c8d_AdJdQcQd_JsQs9h6d_9s7s5d5c_7hKh9d3d_8hAs4d2d_9c5s6sTs() {
    assertEquals(
      "9c5s6sTs 9s7s5d5c 4sTd3c7d 7hKh9d3d JsQs9h6d 3h6c2h4c Tc2s2c8d 8hAs4d2d AdJdQcQd",
      Solver.process("omaha-holdem 4h7cAcAhJc 3h6c2h4c 4sTd3c7d Tc2s2c8d AdJdQcQd JsQs9h6d 9s7s5d5c 7hKh9d3d 8hAs4d2d 9c5s6sTs"));
  }

  @Test
  public void test_omaha_holdem_2532_2c3d3h9sAh_7s9d3s6d_QcJsKh6h_Th6cJh5s() {
    assertEquals(
      "Th6cJh5s QcJsKh6h 7s9d3s6d",
      Solver.process("omaha-holdem 2c3d3h9sAh 7s9d3s6d QcJsKh6h Th6cJh5s"));
  }

  @Test
  public void test_omaha_holdem_2533_3h3s8sJdQc_Ad2s6c9c_6s2d4d7c_8c2h5d5h() {
    assertEquals(
      "6s2d4d7c Ad2s6c9c 8c2h5d5h",
      Solver.process("omaha-holdem 3h3s8sJdQc Ad2s6c9c 6s2d4d7c 8c2h5d5h"));
  }

  @Test
  public void test_omaha_holdem_2534_4c5d7s8hQh_Th8cKs7h_8s2s2h3h() {
    assertEquals(
      "8s2s2h3h Th8cKs7h",
      Solver.process("omaha-holdem 4c5d7s8hQh Th8cKs7h 8s2s2h3h"));
  }

  @Test
  public void test_omaha_holdem_2535_3d7c9dKcKh_3cAs3sTs_4d6d8cQs_Tc5c9h5s_Ks9c6c7h_Th4s6sAd() {
    assertEquals(
      "4d6d8cQs Th4s6sAd Tc5c9h5s 3cAs3sTs Ks9c6c7h",
      Solver.process("omaha-holdem 3d7c9dKcKh 3cAs3sTs 4d6d8cQs Tc5c9h5s Ks9c6c7h Th4s6sAd"));
  }

  @Test
  public void test_omaha_holdem_2536_2d2s4c6hAd_9s8cJs6c_6d5dAsJc() {
    assertEquals(
      "9s8cJs6c 6d5dAsJc",
      Solver.process("omaha-holdem 2d2s4c6hAd 9s8cJs6c 6d5dAsJc"));
  }

  @Test
  public void test_omaha_holdem_2537_4h5cAsJhKd_Qc6s6dJc_4cAc8h7h_8d4s8s6h_AdTdJd5d_7d2dTc2c_9h9c6c3c_Js3s3hTs_QhAh4dKs_9s2sKh3d() {
    assertEquals(
      "7d2dTc2c 8d4s8s6h 9h9c6c3c Js3s3hTs Qc6s6dJc 4cAc8h7h AdTdJd5d QhAh4dKs 9s2sKh3d",
      Solver.process("omaha-holdem 4h5cAsJhKd Qc6s6dJc 4cAc8h7h 8d4s8s6h AdTdJd5d 7d2dTc2c 9h9c6c3c Js3s3hTs QhAh4dKs 9s2sKh3d"));
  }

  @Test
  public void test_omaha_holdem_2538_6sAhJcKhTc_3h8d9h2s_AcJhTh4h_5c9dJd9c_5dJs2d8c() {
    assertEquals(
      "3h8d9h2s 5dJs2d8c 5c9dJd9c AcJhTh4h",
      Solver.process("omaha-holdem 6sAhJcKhTc 3h8d9h2s AcJhTh4h 5c9dJd9c 5dJs2d8c"));
  }

  @Test
  public void test_omaha_holdem_2539_4h6hJhQcQd_7d8s9hKs_Ad5sQh3c_2sAs2dTc_8cTh5hTs_Jc3h6s3d_2c7hKh7c_9c8hKc7s_6dKd4dTd_3s4cJs9s() {
    assertEquals(
      "7d8s9hKs=9c8hKc7s 2sAs2dTc 6dKd4dTd Jc3h6s3d 3s4cJs9s Ad5sQh3c 8cTh5hTs 2c7hKh7c",
      Solver.process("omaha-holdem 4h6hJhQcQd 7d8s9hKs Ad5sQh3c 2sAs2dTc 8cTh5hTs Jc3h6s3d 2c7hKh7c 9c8hKc7s 6dKd4dTd 3s4cJs9s"));
  }

  @Test
  public void test_omaha_holdem_2540_5d9sAhTcTh_8sTd8d2c_Jc5s4sJh_2h4cKh3d_Jd5hQh8h() {
    assertEquals(
      "2h4cKh3d Jd5hQh8h Jc5s4sJh 8sTd8d2c",
      Solver.process("omaha-holdem 5d9sAhTcTh 8sTd8d2c Jc5s4sJh 2h4cKh3d Jd5hQh8h"));
  }

  @Test
  public void test_omaha_holdem_2541_2h4s7dAcTh_Ks5d8d4h_3cJc4cTc_9dJsAs4d_AdKhKcQd_6h3d3sQh_9c3h6d5s_8s2dQsTd_Ah6c8c7c_Ts7h2c9h() {
    assertEquals(
      "6h3d3sQh Ks5d8d4h AdKhKcQd 8s2dQsTd 3cJc4cTc Ts7h2c9h 9dJsAs4d Ah6c8c7c 9c3h6d5s",
      Solver.process("omaha-holdem 2h4s7dAcTh Ks5d8d4h 3cJc4cTc 9dJsAs4d AdKhKcQd 6h3d3sQh 9c3h6d5s 8s2dQsTd Ah6c8c7c Ts7h2c9h"));
  }

  @Test
  public void test_omaha_holdem_2542_3s4cKsQcTs_6d9cAhJc_2hTd4dJs_Tc8sJdAd_KdJhKc6c_9dAs7s9h_8dKh5hQh_5c2s9s3c_4hQs5s7h_2c6s3d4s() {
    assertEquals(
      "2hTd4dJs 8dKh5hQh KdJhKc6c 6d9cAhJc=Tc8sJdAd 2c6s3d4s 5c2s9s3c 4hQs5s7h 9dAs7s9h",
      Solver.process("omaha-holdem 3s4cKsQcTs 6d9cAhJc 2hTd4dJs Tc8sJdAd KdJhKc6c 9dAs7s9h 8dKh5hQh 5c2s9s3c 4hQs5s7h 2c6s3d4s"));
  }

  @Test
  public void test_omaha_holdem_2543_2d4s5h6h9s_3sTc4c2c_TdKc4h6c_Ac7d2s9h_Qd9cJdQc_8h7s8cAs_Js3cTsTh_6s8s5c4d() {
    assertEquals(
      "Js3cTsTh Qd9cJdQc TdKc4h6c 6s8s5c4d Ac7d2s9h 3sTc4c2c 8h7s8cAs",
      Solver.process("omaha-holdem 2d4s5h6h9s 3sTc4c2c TdKc4h6c Ac7d2s9h Qd9cJdQc 8h7s8cAs Js3cTsTh 6s8s5c4d"));
  }

  @Test
  public void test_omaha_holdem_2544_2c4d7h7s8c_5hJh3dTh_6hQd3cAd() {
    assertEquals(
      "5hJh3dTh 6hQd3cAd",
      Solver.process("omaha-holdem 2c4d7h7s8c 5hJh3dTh 6hQd3cAd"));
  }

  @Test
  public void test_omaha_holdem_2545_4h6h9d9sKc_9c3h5dJd_7c2c3dKs_6d2d2h3c_As9hAh6c_5h3s6sJc() {
    assertEquals(
      "6d2d2h3c 5h3s6sJc 7c2c3dKs 9c3h5dJd As9hAh6c",
      Solver.process("omaha-holdem 4h6h9d9sKc 9c3h5dJd 7c2c3dKs 6d2d2h3c As9hAh6c 5h3s6sJc"));
  }

  @Test
  public void test_omaha_holdem_2546_3s7d9sKcQc_2hQd9cKd_Jc9h6c3d_8hAsKh7c_4dJd5sTs_Ad6s3c4h_5dTdJs2c_Ks2dAhTc_AcQs9dJh_7hQh8c8d() {
    assertEquals(
      "Ad6s3c4h Ks2dAhTc Jc9h6c3d 7hQh8c8d AcQs9dJh 8hAsKh7c 2hQd9cKd 4dJd5sTs=5dTdJs2c",
      Solver.process("omaha-holdem 3s7d9sKcQc 2hQd9cKd Jc9h6c3d 8hAsKh7c 4dJd5sTs Ad6s3c4h 5dTdJs2c Ks2dAhTc AcQs9dJh 7hQh8c8d"));
  }

  @Test
  public void test_omaha_holdem_2547_2d6h8h9sKd_8sTs5dJd_Kc7sKsQh_3d2h7cAc_3sJs7d4s() {
    assertEquals(
      "3sJs7d4s 3d2h7cAc 8sTs5dJd Kc7sKsQh",
      Solver.process("omaha-holdem 2d6h8h9sKd 8sTs5dJd Kc7sKsQh 3d2h7cAc 3sJs7d4s"));
  }

  @Test
  public void test_omaha_holdem_2548_2c5h8c8h9s_4h6c7s8s_Kh6sTcKd_5c2s6hQd_5d7cAdKs_5sJdJhJs_ThTd4d6d() {
    assertEquals(
      "5c2s6hQd 5d7cAdKs ThTd4d6d 5sJdJhJs Kh6sTcKd 4h6c7s8s",
      Solver.process("omaha-holdem 2c5h8c8h9s 4h6c7s8s Kh6sTcKd 5c2s6hQd 5d7cAdKs 5sJdJhJs ThTd4d6d"));
  }

  @Test
  public void test_omaha_holdem_2549_3c4s6h8dTc_Qc3h7cQd_9s2h6cKd_2d8h7h6s_As5c7d3d_KcAc5hQh_QsKh4d2c() {
    assertEquals(
      "KcAc5hQh QsKh4d2c 9s2h6cKd Qc3h7cQd 2d8h7h6s As5c7d3d",
      Solver.process("omaha-holdem 3c4s6h8dTc Qc3h7cQd 9s2h6cKd 2d8h7h6s As5c7d3d KcAc5hQh QsKh4d2c"));
  }

  @Test
  public void test_omaha_holdem_2550_3d9dAdJhQh_3s9h3h8s_Kc2cQdTh_Ah7s6c9s_4hQc6hJs() {
    assertEquals(
      "4hQc6hJs Ah7s6c9s 3s9h3h8s Kc2cQdTh",
      Solver.process("omaha-holdem 3d9dAdJhQh 3s9h3h8s Kc2cQdTh Ah7s6c9s 4hQc6hJs"));
  }

  @Test
  public void test_omaha_holdem_2551_4d4sKdTcTs_8h5c7s2h_Qd9s4c5s_2s7cAsAd_2c2dJcTh_Qh8cAhJh_Jd3c6hKc_Qc6s8s7h_Js5h9dTd() {
    assertEquals(
      "8h5c7s2h Qc6s8s7h Qh8cAhJh Jd3c6hKc 2s7cAsAd Qd9s4c5s 2c2dJcTh=Js5h9dTd",
      Solver.process("omaha-holdem 4d4sKdTcTs 8h5c7s2h Qd9s4c5s 2s7cAsAd 2c2dJcTh Qh8cAhJh Jd3c6hKc Qc6s8s7h Js5h9dTd"));
  }

  @Test
  public void test_omaha_holdem_2552_2s4d6h8hTh_2hJh9hAd_7h5h9sJs_Jc3d7d4c_3h3c2d6s_As2c5dKs() {
    assertEquals(
      "As2c5dKs Jc3d7d4c 3h3c2d6s 7h5h9sJs 2hJh9hAd",
      Solver.process("omaha-holdem 2s4d6h8hTh 2hJh9hAd 7h5h9sJs Jc3d7d4c 3h3c2d6s As2c5dKs"));
  }

  @Test
  public void test_omaha_holdem_2553_3d6h7cAhQh_Jh6cKh4s_TdJd9h4d_7s9s6sAd() {
    assertEquals(
      "TdJd9h4d 7s9s6sAd Jh6cKh4s",
      Solver.process("omaha-holdem 3d6h7cAhQh Jh6cKh4s TdJd9h4d 7s9s6sAd"));
  }

  @Test
  public void test_omaha_holdem_2554_3h7cQcQhTs_5d9c4s6c_QdKsAcKd() {
    assertEquals(
      "5d9c4s6c QdKsAcKd",
      Solver.process("omaha-holdem 3h7cQcQhTs 5d9c4s6c QdKsAcKd"));
  }

  @Test
  public void test_omaha_holdem_2555_5c6sJsQcTd_3h8s2hQh_Ad4dAh7c_Ts6c3cTc_QsJd2d8d_QdKd7d3d_5hKs8hAs() {
    assertEquals(
      "3h8s2hQh QdKd7d3d Ad4dAh7c QsJd2d8d Ts6c3cTc 5hKs8hAs",
      Solver.process("omaha-holdem 5c6sJsQcTd 3h8s2hQh Ad4dAh7c Ts6c3cTc QsJd2d8d QdKd7d3d 5hKs8hAs"));
  }

  @Test
  public void test_omaha_holdem_2556_4h5c7s9cTc_6c3hKdAd_Th8d3s4c_Qc9d4s6d_7h5d6hKh() {
    assertEquals(
      "7h5d6hKh Qc9d4s6d Th8d3s4c 6c3hKdAd",
      Solver.process("omaha-holdem 4h5c7s9cTc 6c3hKdAd Th8d3s4c Qc9d4s6d 7h5d6hKh"));
  }

  @Test
  public void test_omaha_holdem_2557_6c8hJcKsQs_3s6sQc5s_Tc7d8cTd() {
    assertEquals(
      "Tc7d8cTd 3s6sQc5s",
      Solver.process("omaha-holdem 6c8hJcKsQs 3s6sQc5s Tc7d8cTd"));
  }

  @Test
  public void test_omaha_holdem_2558_4h9hJhJsQs_Td2s8dQc_AcKh9sKc_5h4s5c3c_6sQd9c4d_Qh2d8c8s_JdAd5dJc_Ks7h4c7c_TcTh6h9d() {
    assertEquals(
      "5h4s5c3c Ks7h4c7c Qh2d8c8s 6sQd9c4d AcKh9sKc Td2s8dQc TcTh6h9d JdAd5dJc",
      Solver.process("omaha-holdem 4h9hJhJsQs Td2s8dQc AcKh9sKc 5h4s5c3c 6sQd9c4d Qh2d8c8s JdAd5dJc Ks7h4c7c TcTh6h9d"));
  }

  @Test
  public void test_omaha_holdem_2559_2s5d6c7cAh_4hKs5c6s_4sQs9h8h_8d4c3s5s_JsQd2h7h_Th6d2dKd_TcJdAs7d_3dTs3c4d_3h8c5hAd_2c9c7sKh() {
    assertEquals(
      "Th6d2dKd 4hKs5c6s 2c9c7sKh=JsQd2h7h 3h8c5hAd TcJdAs7d 3dTs3c4d 8d4c3s5s 4sQs9h8h",
      Solver.process("omaha-holdem 2s5d6c7cAh 4hKs5c6s 4sQs9h8h 8d4c3s5s JsQd2h7h Th6d2dKd TcJdAs7d 3dTs3c4d 3h8c5hAd 2c9c7sKh"));
  }

  @Test
  public void test_omaha_holdem_2560_3d7d7h9dKc_Qs5h9hKd_5cKs7cAs_8cTh4c9c_9s4s8dQh() {
    assertEquals(
      "8cTh4c9c 9s4s8dQh Qs5h9hKd 5cKs7cAs",
      Solver.process("omaha-holdem 3d7d7h9dKc Qs5h9hKd 5cKs7cAs 8cTh4c9c 9s4s8dQh"));
  }

  @Test
  public void test_omaha_holdem_2561_2h6s8h9dJd_5h2d4c5c_Jc7c3d5d_8d9h9sQc_QsKc7dTd() {
    assertEquals(
      "5h2d4c5c 8d9h9sQc Jc7c3d5d QsKc7dTd",
      Solver.process("omaha-holdem 2h6s8h9dJd 5h2d4c5c Jc7c3d5d 8d9h9sQc QsKc7dTd"));
  }

  @Test
  public void test_omaha_holdem_2562_2d3c5c5d9h_Tc4sKs9d_AhJc7s6c() {
    assertEquals(
      "AhJc7s6c Tc4sKs9d",
      Solver.process("omaha-holdem 2d3c5c5d9h Tc4sKs9d AhJc7s6c"));
  }

  @Test
  public void test_omaha_holdem_2563_6d9cAcAdJc_AsJhKd6h_2d6sQs4c_3c5h7d9d_TcQd9h8s_5dAhKhJd_8c8h4s3s() {
    assertEquals(
      "2d6sQs4c 8c8h4s3s 3c5h7d9d TcQd9h8s 5dAhKhJd=AsJhKd6h",
      Solver.process("omaha-holdem 6d9cAcAdJc AsJhKd6h 2d6sQs4c 3c5h7d9d TcQd9h8s 5dAhKhJd 8c8h4s3s"));
  }

  @Test
  public void test_omaha_holdem_2564_2h3d7h7sQc_6d9c4cKd_6cJcAhJh() {
    assertEquals(
      "6d9c4cKd 6cJcAhJh",
      Solver.process("omaha-holdem 2h3d7h7sQc 6d9c4cKd 6cJcAhJh"));
  }

  @Test
  public void test_omaha_holdem_2565_3h4c4d5h8d_Td3cQsJd_7dQh8sAh_Ts5d4hTh_Kc4s7cJs_Ks2h8h8c() {
    assertEquals(
      "Td3cQsJd 7dQh8sAh Kc4s7cJs Ts5d4hTh Ks2h8h8c",
      Solver.process("omaha-holdem 3h4c4d5h8d Td3cQsJd 7dQh8sAh Ts5d4hTh Kc4s7cJs Ks2h8h8c"));
  }

  @Test
  public void test_omaha_holdem_2566_2c2d5c8hJc_9dTcJdKc_4hThAd6d() {
    assertEquals(
      "4hThAd6d 9dTcJdKc",
      Solver.process("omaha-holdem 2c2d5c8hJc 9dTcJdKc 4hThAd6d"));
  }

  @Test
  public void test_omaha_holdem_2567_2h5c6hQhQs_6d4h8h3h_AsAc4cJh_4dTc9cJc() {
    assertEquals(
      "4dTc9cJc AsAc4cJh 6d4h8h3h",
      Solver.process("omaha-holdem 2h5c6hQhQs 6d4h8h3h AsAc4cJh 4dTc9cJc"));
  }

  @Test
  public void test_omaha_holdem_2568_5s7d7s9c9s_Ad5hQsQd_Kc3s4sAc() {
    assertEquals(
      "Ad5hQsQd Kc3s4sAc",
      Solver.process("omaha-holdem 5s7d7s9c9s Ad5hQsQd Kc3s4sAc"));
  }

  @Test
  public void test_omaha_holdem_2569_2h4h7s8dTc_7d9c8cAd_AhTsJh5d_Js3c2c8s() {
    assertEquals(
      "AhTsJh5d Js3c2c8s 7d9c8cAd",
      Solver.process("omaha-holdem 2h4h7s8dTc 7d9c8cAd AhTsJh5d Js3c2c8s"));
  }

  @Test
  public void test_omaha_holdem_2570_4c6c7s9cKc_6hTsKs3h_9d7dTh5s_2c6dTcAc_QdAs8h7h_Qh8s5hQc_4d9hTdJc_6s3dJdAh_QsJhJs2d() {
    assertEquals(
      "6s3dJdAh QdAs8h7h QsJhJs2d 4d9hTdJc 9d7dTh5s 6hTsKs3h Qh8s5hQc 2c6dTcAc",
      Solver.process("omaha-holdem 4c6c7s9cKc 6hTsKs3h 9d7dTh5s 2c6dTcAc QdAs8h7h Qh8s5hQc 4d9hTdJc 6s3dJdAh QsJhJs2d"));
  }

  @Test
  public void test_omaha_holdem_2571_4s6sAsJsQd_5c7cTd7s_4d2d6cAh_5d8dTsJh_7dKc5s8s_4h2c3h6h() {
    assertEquals(
      "5c7cTd7s 5d8dTsJh 4h2c3h6h 4d2d6cAh 7dKc5s8s",
      Solver.process("omaha-holdem 4s6sAsJsQd 5c7cTd7s 4d2d6cAh 5d8dTsJh 7dKc5s8s 4h2c3h6h"));
  }

  @Test
  public void test_omaha_holdem_2572_3c3s4sKcTd_Qd5h5d8d_4h2d5sJh_6d8h2c3h() {
    assertEquals(
      "4h2d5sJh Qd5h5d8d 6d8h2c3h",
      Solver.process("omaha-holdem 3c3s4sKcTd Qd5h5d8d 4h2d5sJh 6d8h2c3h"));
  }

  @Test
  public void test_omaha_holdem_2573_3h6d7hJcTh_5h6c5dAs_8h3d2c3c_4h5s6hJs_9h6s9sQs_7d7sTd2h_2s9d2dQc_9c4cTcQd_8c5cKsKd() {
    assertEquals(
      "2s9d2dQc 5h6c5dAs 9h6s9sQs 9c4cTcQd 8c5cKsKd 8h3d2c3c 7d7sTd2h 4h5s6hJs",
      Solver.process("omaha-holdem 3h6d7hJcTh 5h6c5dAs 8h3d2c3c 4h5s6hJs 9h6s9sQs 7d7sTd2h 2s9d2dQc 9c4cTcQd 8c5cKsKd"));
  }

  @Test
  public void test_omaha_holdem_2574_5s6c7s9sTh_9dQdJh6s_2c9hKd5d_Td4cJsKc_5h6h4s2h_Ac9c2dKh() {
    assertEquals(
      "Ac9c2dKh Td4cJsKc 5h6h4s2h 2c9hKd5d 9dQdJh6s",
      Solver.process("omaha-holdem 5s6c7s9sTh 9dQdJh6s 2c9hKd5d Td4cJsKc 5h6h4s2h Ac9c2dKh"));
  }

  @Test
  public void test_omaha_holdem_2575_2d8sAsKcKh_8dTh4cKs_AdAc3sJs_6c7d6d2c_4dTc9dAh_8h2h5h4s_3d4h9sQd() {
    assertEquals(
      "3d4h9sQd 6c7d6d2c 8h2h5h4s 4dTc9dAh 8dTh4cKs AdAc3sJs",
      Solver.process("omaha-holdem 2d8sAsKcKh 8dTh4cKs AdAc3sJs 6c7d6d2c 4dTc9dAh 8h2h5h4s 3d4h9sQd"));
  }

  @Test
  public void test_omaha_holdem_2576_4h5s6hJsTc_Ts9cQc2h_4s3h2cQs_Qd6d5d7c_Jd4c8c6s_JcKhQh7d_7h4d8d7s() {
    assertEquals(
      "Ts9cQc2h JcKhQh7d Qd6d5d7c Jd4c8c6s 4s3h2cQs 7h4d8d7s",
      Solver.process("omaha-holdem 4h5s6hJsTc Ts9cQc2h 4s3h2cQs Qd6d5d7c Jd4c8c6s JcKhQh7d 7h4d8d7s"));
  }

  @Test
  public void test_omaha_holdem_2577_2h4d5h9sQd_5sTs7dJs_8d3cJc5c_6dTcQhQc_Kd4h4sTh_3hKh4c7c_Jd6s3dTd_6h9cAh3s_Ad2c7s6c_As8s9d7h() {
    assertEquals(
      "Ad2c7s6c 3hKh4c7c 5sTs7dJs=8d3cJc5c As8s9d7h Kd4h4sTh 6dTcQhQc 6h9cAh3s=Jd6s3dTd",
      Solver.process("omaha-holdem 2h4d5h9sQd 5sTs7dJs 8d3cJc5c 6dTcQhQc Kd4h4sTh 3hKh4c7c Jd6s3dTd 6h9cAh3s Ad2c7s6c As8s9d7h"));
  }

  @Test
  public void test_omaha_holdem_2578_3d4c6c6hQc_3sQd2c3c_Jd2hKh5h_5d7cThAd_2dTd6s8c_3hAc6d8h() {
    assertEquals(
      "2dTd6s8c Jd2hKh5h 5d7cThAd 3sQd2c3c 3hAc6d8h",
      Solver.process("omaha-holdem 3d4c6c6hQc 3sQd2c3c Jd2hKh5h 5d7cThAd 2dTd6s8c 3hAc6d8h"));
  }

  @Test
  public void test_omaha_holdem_2579_5d7cKcTcTs_Th4dAs5c_Ks7h7d9d_3sQd3h8s_Td8cJcQh() {
    assertEquals(
      "3sQd3h8s Td8cJcQh Ks7h7d9d Th4dAs5c",
      Solver.process("omaha-holdem 5d7cKcTcTs Th4dAs5c Ks7h7d9d 3sQd3h8s Td8cJcQh"));
  }

  @Test
  public void test_omaha_holdem_2580_6h6sAcKdTh_Ah5hQc4c_2h2dJd4h_KhQh7h7s_5s9c8sTd_8dQs2c6d_7d9hJsQd_6c8h3c5c_JhTc4sKc() {
    assertEquals(
      "2h2dJd4h 5s9c8sTd KhQh7h7s JhTc4sKc Ah5hQc4c 6c8h3c5c 8dQs2c6d 7d9hJsQd",
      Solver.process("omaha-holdem 6h6sAcKdTh Ah5hQc4c 2h2dJd4h KhQh7h7s 5s9c8sTd 8dQs2c6d 7d9hJsQd 6c8h3c5c JhTc4sKc"));
  }

  @Test
  public void test_omaha_holdem_2581_3h4c6hKsQd_TcQh8h4h_9hJc6s5h_TsJd9s3d_2cAc8d6c() {
    assertEquals(
      "TsJd9s3d 9hJc6s5h 2cAc8d6c TcQh8h4h",
      Solver.process("omaha-holdem 3h4c6hKsQd TcQh8h4h 9hJc6s5h TsJd9s3d 2cAc8d6c"));
  }

  @Test
  public void test_omaha_holdem_2582_7d8sJcKhQh_Ah5hJhAd_Ac8d4cAs_8c2s5s4s_Qc4dKs7c_3sJd3d3h_5d7s8hTh_2c6sTc6c() {
    assertEquals(
      "2c6sTc6c 8c2s5s4s 3sJd3d3h Ac8d4cAs=Ah5hJhAd 5d7s8hTh Qc4dKs7c",
      Solver.process("omaha-holdem 7d8sJcKhQh Ah5hJhAd Ac8d4cAs 8c2s5s4s Qc4dKs7c 3sJd3d3h 5d7s8hTh 2c6sTc6c"));
  }

  @Test
  public void test_omaha_holdem_2583_4s5c6d8hKs_TdJc3dQc_Kd3h9c4h_3s5sKc3c_QdAcJh8d_Ts6c8sQs_2dQhAhTc_Th7dAs5d_Jd7h9sJs_4c9h2h7c() {
    assertEquals(
      "TdJc3dQc 2dQhAhTc QdAcJh8d Ts6c8sQs Kd3h9c4h 3s5sKc3c Th7dAs5d 4c9h2h7c=Jd7h9sJs",
      Solver.process("omaha-holdem 4s5c6d8hKs TdJc3dQc Kd3h9c4h 3s5sKc3c QdAcJh8d Ts6c8sQs 2dQhAhTc Th7dAs5d Jd7h9sJs 4c9h2h7c"));
  }

  @Test
  public void test_omaha_holdem_2584_2d4d6h7sAd_Kc9cJdQc_2s5dTsKs_Ac9s6c4c_Qh6s9hKh_2c8d8c9d_2h8sThKd_Tc3d8h7c_Jc6d4h3c_5sAsAhTd() {
    assertEquals(
      "Kc9cJdQc 2h8sThKd=2s5dTsKs Qh6s9hKh Tc3d8h7c Jc6d4h3c Ac9s6c4c 5sAsAhTd 2c8d8c9d",
      Solver.process("omaha-holdem 2d4d6h7sAd Kc9cJdQc 2s5dTsKs Ac9s6c4c Qh6s9hKh 2c8d8c9d 2h8sThKd Tc3d8h7c Jc6d4h3c 5sAsAhTd"));
  }

  @Test
  public void test_omaha_holdem_2585_3c9c9sKcQd_3hAdTh9d_4d9h5c7h_Jd8h6h4h() {
    assertEquals(
      "Jd8h6h4h 4d9h5c7h 3hAdTh9d",
      Solver.process("omaha-holdem 3c9c9sKcQd 3hAdTh9d 4d9h5c7h Jd8h6h4h"));
  }

  @Test
  public void test_omaha_holdem_2586_4h8sAcJsQs_Jd4c5s2s_3h8hAd5d_7d3d5cAs_TcTdThKc_9c7s6c3c_Qd7hQc6h_9h2h9d7c_4s8d6sAh_8c3s9s6d() {
    assertEquals(
      "9c7s6c3c 9h2h9d7c 7d3d5cAs 3h8hAd5d Qd7hQc6h TcTdThKc Jd4c5s2s 4s8d6sAh 8c3s9s6d",
      Solver.process("omaha-holdem 4h8sAcJsQs Jd4c5s2s 3h8hAd5d 7d3d5cAs TcTdThKc 9c7s6c3c Qd7hQc6h 9h2h9d7c 4s8d6sAh 8c3s9s6d"));
  }

  @Test
  public void test_omaha_holdem_2587_2h3c5d6h6s_4dKh8dKd_TdAs2d9s_2c9cJsTs_Qh7sJh8h() {
    assertEquals(
      "Qh7sJh8h 2c9cJsTs TdAs2d9s 4dKh8dKd",
      Solver.process("omaha-holdem 2h3c5d6h6s 4dKh8dKd TdAs2d9s 2c9cJsTs Qh7sJh8h"));
  }

  @Test
  public void test_omaha_holdem_2588_5c5h7d9hKs_5sJc8c4s_QsJs4d3h_Qd2cKcJd() {
    assertEquals(
      "QsJs4d3h Qd2cKcJd 5sJc8c4s",
      Solver.process("omaha-holdem 5c5h7d9hKs 5sJc8c4s QsJs4d3h Qd2cKcJd"));
  }

  @Test
  public void test_omaha_holdem_2589_5s6h9d9sTd_5h8s2s2d_2h9cJc7d_Js4cAs8d_7cKsKc2c_AdAc3sQd_JhQcQs5c_7s4h4dQh_8cAh4s6c_9hTc3d6d() {
    assertEquals(
      "Js4cAs8d 7s4h4dQh 5h8s2s2d 8cAh4s6c JhQcQs5c 7cKsKc2c AdAc3sQd 2h9cJc7d 9hTc3d6d",
      Solver.process("omaha-holdem 5s6h9d9sTd 5h8s2s2d 2h9cJc7d Js4cAs8d 7cKsKc2c AdAc3sQd JhQcQs5c 7s4h4dQh 8cAh4s6c 9hTc3d6d"));
  }

  @Test
  public void test_omaha_holdem_2590_4d6d9dKhQd_AcAdTd4s_Kc9s8sQh_3dJc4cQs_3cAhTc8d() {
    assertEquals(
      "3cAhTc8d 3dJc4cQs Kc9s8sQh AcAdTd4s",
      Solver.process("omaha-holdem 4d6d9dKhQd AcAdTd4s Kc9s8sQh 3dJc4cQs 3cAhTc8d"));
  }

  @Test
  public void test_omaha_holdem_2591_2d7s8hQsTs_7hTd5d4s_3s3cJcKs_Ad2s4h8s_As2c7d5s_AhQc9c3h() {
    assertEquals(
      "AhQc9c3h 7hTd5d4s Ad2s4h8s 3s3cJcKs As2c7d5s",
      Solver.process("omaha-holdem 2d7s8hQsTs 7hTd5d4s 3s3cJcKs Ad2s4h8s As2c7d5s AhQc9c3h"));
  }

  @Test
  public void test_omaha_holdem_2592_2s3d5h7sJd_9dTcQh6d_Qs3sJhTh_3h6h7h4h() {
    assertEquals(
      "9dTcQh6d Qs3sJhTh 3h6h7h4h",
      Solver.process("omaha-holdem 2s3d5h7sJd 9dTcQh6d Qs3sJhTh 3h6h7h4h"));
  }

  @Test
  public void test_omaha_holdem_2593_2c5d6d7hQs_KhTs3d3h_7c9cAc5c_8s7sThQh_Jd4s6hTd_5s9h7d9s() {
    assertEquals(
      "KhTs3d3h Jd4s6hTd 5s9h7d9s=7c9cAc5c 8s7sThQh",
      Solver.process("omaha-holdem 2c5d6d7hQs KhTs3d3h 7c9cAc5c 8s7sThQh Jd4s6hTd 5s9h7d9s"));
  }

  @Test
  public void test_omaha_holdem_2594_4d7dJcKhQh_JhQs5d3h_TcJd3cJs_2hAh5s4h_8d9hKc6h() {
    assertEquals(
      "2hAh5s4h 8d9hKc6h JhQs5d3h TcJd3cJs",
      Solver.process("omaha-holdem 4d7dJcKhQh JhQs5d3h TcJd3cJs 2hAh5s4h 8d9hKc6h"));
  }

  @Test
  public void test_omaha_holdem_2595_3c4d6dAhTd_8h3dTc6h_4sKsJs3s_QhAd7hKc_5h9cAcTs_5c6sKh2s_Qc9hQs2h() {
    assertEquals(
      "Qc9hQs2h QhAd7hKc 4sKsJs3s 8h3dTc6h 5h9cAcTs 5c6sKh2s",
      Solver.process("omaha-holdem 3c4d6dAhTd 8h3dTc6h 4sKsJs3s QhAd7hKc 5h9cAcTs 5c6sKh2s Qc9hQs2h"));
  }

  @Test
  public void test_omaha_holdem_2596_3s5cAcJdTs_7h3d6dKd_Kc6cAdQc_3h4sJh4d_TdQh2s5h_2h6s3cQd_7d8cAh9h_Kh7cKs4c_Th8sQsJs() {
    assertEquals(
      "2h6s3cQd 7h3d6dKd Kh7cKs4c 7d8cAh9h TdQh2s5h 3h4sJh4d Th8sQsJs Kc6cAdQc",
      Solver.process("omaha-holdem 3s5cAcJdTs 7h3d6dKd Kc6cAdQc 3h4sJh4d TdQh2s5h 2h6s3cQd 7d8cAh9h Kh7cKs4c Th8sQsJs"));
  }

  @Test
  public void test_omaha_holdem_2597_4c7sJcKcKs_8s4hKhJd_9hQcAdTs_QsJs5h6h_4s6sAsKd() {
    assertEquals(
      "9hQcAdTs QsJs5h6h 4s6sAsKd 8s4hKhJd",
      Solver.process("omaha-holdem 4c7sJcKcKs 8s4hKhJd 9hQcAdTs QsJs5h6h 4s6sAsKd"));
  }

  @Test
  public void test_omaha_holdem_2598_2d3c5d6c7s_6dJdJsTh_QhAhQsQc_KsJh3dTd_4d2s9cTs_5sKc6hJc_Tc4h7cKh_5c7h8h3s_8d4c9sAd() {
    assertEquals(
      "KsJh3dTd 6dJdJsTh QhAhQsQc 5sKc6hJc 5c7h8h3s 4d2s9cTs Tc4h7cKh 8d4c9sAd",
      Solver.process("omaha-holdem 2d3c5d6c7s 6dJdJsTh QhAhQsQc KsJh3dTd 4d2s9cTs 5sKc6hJc Tc4h7cKh 5c7h8h3s 8d4c9sAd"));
  }

  @Test
  public void test_omaha_holdem_2599_7s9sQsTdTs_9cQd6hKd_5s4h8d7h_Qh3h6c4s_8c7d9d3d_7c9hJs5c_AcAh4c8h() {
    assertEquals(
      "5s4h8d7h 8c7d9d3d 7c9hJs5c Qh3h6c4s 9cQd6hKd AcAh4c8h",
      Solver.process("omaha-holdem 7s9sQsTdTs 9cQd6hKd 5s4h8d7h Qh3h6c4s 8c7d9d3d 7c9hJs5c AcAh4c8h"));
  }

  @Test
  public void test_omaha_holdem_2600_8s9dJsTdTs_9hAdQdQs_4s4d7s3d() {
    assertEquals(
      "9hAdQdQs 4s4d7s3d",
      Solver.process("omaha-holdem 8s9dJsTdTs 9hAdQdQs 4s4d7s3d"));
  }

  @Test
  public void test_omaha_holdem_2601_4sAdJcKdTd_Ts7c8s5c_7sAh8hQd_Ac9c9h5h_Qs6cKc4h_AsJs5s5d_3cJh4c2d_3hQhTcQc_8d2cKhTh() {
    assertEquals(
      "Ts7c8s5c Ac9c9h5h 3cJh4c2d 8d2cKhTh AsJs5s5d 3hQhTcQc=7sAh8hQd=Qs6cKc4h",
      Solver.process("omaha-holdem 4sAdJcKdTd Ts7c8s5c 7sAh8hQd Ac9c9h5h Qs6cKc4h AsJs5s5d 3cJh4c2d 3hQhTcQc 8d2cKhTh"));
  }

  @Test
  public void test_omaha_holdem_2602_4s7c9hTdTh_Ad3cQs9s_3s4c7sAc_JdAs2s8d_7dTs4hKh_7h8sKsQh() {
    assertEquals(
      "7h8sKsQh 3s4c7sAc Ad3cQs9s JdAs2s8d 7dTs4hKh",
      Solver.process("omaha-holdem 4s7c9hTdTh Ad3cQs9s 3s4c7sAc JdAs2s8d 7dTs4hKh 7h8sKsQh"));
  }

  @Test
  public void test_omaha_holdem_2603_8d9cQhTcTh_Td2h5h2c_8s6sJsJc() {
    assertEquals(
      "Td2h5h2c 8s6sJsJc",
      Solver.process("omaha-holdem 8d9cQhTcTh Td2h5h2c 8s6sJsJc"));
  }

  @Test
  public void test_omaha_holdem_2604_5s8dQsTdTs_TcAd5c4s_2dJs9c3c() {
    assertEquals(
      "2dJs9c3c TcAd5c4s",
      Solver.process("omaha-holdem 5s8dQsTdTs TcAd5c4s 2dJs9c3c"));
  }

  @Test
  public void test_omaha_holdem_2605_4hKcKsTdTh_3d6c2hAs_AcJcJs4s_3c4d7c4c_7s6sJdQs_6h9s5h5s() {
    assertEquals(
      "7s6sJdQs 3d6c2hAs 6h9s5h5s AcJcJs4s 3c4d7c4c",
      Solver.process("omaha-holdem 4hKcKsTdTh 3d6c2hAs AcJcJs4s 3c4d7c4c 7s6sJdQs 6h9s5h5s"));
  }

  @Test
  public void test_omaha_holdem_2606_3h7s9hJcQd_3cKcAhKs_7c5h5c2c_5sKhTh9d_Ac6h7d5d() {
    assertEquals(
      "7c5h5c2c Ac6h7d5d 3cKcAhKs 5sKhTh9d",
      Solver.process("omaha-holdem 3h7s9hJcQd 3cKcAhKs 7c5h5c2c 5sKhTh9d Ac6h7d5d"));
  }

  @Test
  public void test_omaha_holdem_2607_2d8d9hAhJc_4cQhJh9s_3h8h3d3s_Kd6hTd2h_Ad4h7dJd_9d6sKh7h() {
    assertEquals(
      "Kd6hTd2h 3h8h3d3s 9d6sKh7h 4cQhJh9s Ad4h7dJd",
      Solver.process("omaha-holdem 2d8d9hAhJc 4cQhJh9s 3h8h3d3s Kd6hTd2h Ad4h7dJd 9d6sKh7h"));
  }

  @Test
  public void test_omaha_holdem_2608_5s7c7h7sJs_6sKhThQh_4c9s8cKc_3s2sQc8d() {
    assertEquals(
      "4c9s8cKc 6sKhThQh 3s2sQc8d",
      Solver.process("omaha-holdem 5s7c7h7sJs 6sKhThQh 4c9s8cKc 3s2sQc8d"));
  }

  @Test
  public void test_omaha_holdem_2609_3d4h7d9sQs_4d7hKs2c_Qh9c8dTs() {
    assertEquals(
      "4d7hKs2c Qh9c8dTs",
      Solver.process("omaha-holdem 3d4h7d9sQs 4d7hKs2c Qh9c8dTs"));
  }

  @Test
  public void test_omaha_holdem_2610_4d5h6h9cKc_2cTh9hQc_8c9d7sAs_TcKd6c6d_3dJhTd3h_Jc7d5c2h_Ac3s5d4h() {
    assertEquals(
      "3dJhTd3h Jc7d5c2h 2cTh9hQc Ac3s5d4h TcKd6c6d 8c9d7sAs",
      Solver.process("omaha-holdem 4d5h6h9cKc 2cTh9hQc 8c9d7sAs TcKd6c6d 3dJhTd3h Jc7d5c2h Ac3s5d4h"));
  }

  @Test
  public void test_omaha_holdem_2611_3c4c6h9sTc_ThQcTd2d_Kh4s9dTs_7hJd2hJc() {
    assertEquals(
      "7hJd2hJc Kh4s9dTs ThQcTd2d",
      Solver.process("omaha-holdem 3c4c6h9sTc ThQcTd2d Kh4s9dTs 7hJd2hJc"));
  }

  @Test
  public void test_omaha_holdem_2612_4c6h8hKcQd_4h9dAh9s_AdTs5cJs_3d8s2c5s_TcAs3c7s_Qh4s2d7d() {
    assertEquals(
      "TcAs3c7s AdTs5cJs 3d8s2c5s 4h9dAh9s Qh4s2d7d",
      Solver.process("omaha-holdem 4c6h8hKcQd 4h9dAh9s AdTs5cJs 3d8s2c5s TcAs3c7s Qh4s2d7d"));
  }

  @Test
  public void test_omaha_holdem_2613_3h4c7sKhQs_8d4s2d8h_3cKc2s2c_Ah7c8cAc_AsTh5sAd_5d6sTd4d() {
    assertEquals(
      "8d4s2d8h Ah7c8cAc=AsTh5sAd 3cKc2s2c 5d6sTd4d",
      Solver.process("omaha-holdem 3h4c7sKhQs 8d4s2d8h 3cKc2s2c Ah7c8cAc AsTh5sAd 5d6sTd4d"));
  }

  @Test
  public void test_omaha_holdem_2614_7h7s8dQdQs_2h2dJc3s_Ks3c8c8h_9cAh3h2s_Kd3d2c5s_JdTc9h6d_ThTsKhAs() {
    assertEquals(
      "JdTc9h6d Kd3d2c5s 9cAh3h2s 2h2dJc3s ThTsKhAs Ks3c8c8h",
      Solver.process("omaha-holdem 7h7s8dQdQs 2h2dJc3s Ks3c8c8h 9cAh3h2s Kd3d2c5s JdTc9h6d ThTsKhAs"));
  }

  @Test
  public void test_omaha_holdem_2615_7h7sAsQsTc_3c9h4s4c_7c4hJc2c() {
    assertEquals(
      "3c9h4s4c 7c4hJc2c",
      Solver.process("omaha-holdem 7h7sAsQsTc 3c9h4s4c 7c4hJc2c"));
  }

  @Test
  public void test_omaha_holdem_2616_2c3h4d9cKd_3sQd2h3d_8hKhQsTd_7d5h5dJs_6d2s8d5c_Ts4hTc8s_Kc3c6h7s_8cJh7hQh() {
    assertEquals(
      "8cJh7hQh 7d5h5dJs Ts4hTc8s 8hKhQsTd Kc3c6h7s 3sQd2h3d 6d2s8d5c",
      Solver.process("omaha-holdem 2c3h4d9cKd 3sQd2h3d 8hKhQsTd 7d5h5dJs 6d2s8d5c Ts4hTc8s Kc3c6h7s 8cJh7hQh"));
  }

  @Test
  public void test_omaha_holdem_2617_3s7s9sAhAs_4d6cTc4s_Ad8c9hJh_6h3d6dTh_8dQh2sKs_Kc3c6s2h_TdKd7d9c_7c2d8h7h() {
    assertEquals(
      "Kc3c6s2h 4d6cTc4s 6h3d6dTh TdKd7d9c 8dQh2sKs 7c2d8h7h Ad8c9hJh",
      Solver.process("omaha-holdem 3s7s9sAhAs 4d6cTc4s Ad8c9hJh 6h3d6dTh 8dQh2sKs Kc3c6s2h TdKd7d9c 7c2d8h7h"));
  }

  @Test
  public void test_omaha_holdem_2618_2h3c6dAdQd_5hQs3s5d_9hJsJc3d_7sQhTh9c_4s9d3hAh() {
    assertEquals(
      "9hJsJc3d 7sQhTh9c 5hQs3s5d 4s9d3hAh",
      Solver.process("omaha-holdem 2h3c6dAdQd 5hQs3s5d 9hJsJc3d 7sQhTh9c 4s9d3hAh"));
  }

  @Test
  public void test_omaha_holdem_2619_3h5s6cTdTs_Kc9d9hQs_Jh2hTc7c_4sTh3d9c_Kd8s3c7d_7h5cAhJd() {
    assertEquals(
      "Kd8s3c7d 7h5cAhJd Kc9d9hQs Jh2hTc7c 4sTh3d9c",
      Solver.process("omaha-holdem 3h5s6cTdTs Kc9d9hQs Jh2hTc7c 4sTh3d9c Kd8s3c7d 7h5cAhJd"));
  }

  @Test
  public void test_omaha_holdem_2620_2d3s6sAcQc_TdAsQhJd_8d9cJhJs_5s9h8c4d_Ah4s9s4c_5dKsTs7s_JcKh9dQd_5h2hTh3c_Tc2c3h7h() {
    assertEquals(
      "5dKsTs7s 8d9cJhJs JcKh9dQd Ah4s9s4c 5h2hTh3c=Tc2c3h7h TdAsQhJd 5s9h8c4d",
      Solver.process("omaha-holdem 2d3s6sAcQc TdAsQhJd 8d9cJhJs 5s9h8c4d Ah4s9s4c 5dKsTs7s JcKh9dQd 5h2hTh3c Tc2c3h7h"));
  }

  @Test
  public void test_omaha_holdem_2621_2c2d4dJhTs_9dJd7h2h_Ks3cKhJs_QhTcKdAs() {
    assertEquals(
      "QhTcKdAs Ks3cKhJs 9dJd7h2h",
      Solver.process("omaha-holdem 2c2d4dJhTs 9dJd7h2h Ks3cKhJs QhTcKdAs"));
  }

  @Test
  public void test_omaha_holdem_2622_5d5h6h8d9s_Ac2c3dAh_QcJcKs9d() {
    assertEquals(
      "QcJcKs9d Ac2c3dAh",
      Solver.process("omaha-holdem 5d5h6h8d9s Ac2c3dAh QcJcKs9d"));
  }

  @Test
  public void test_omaha_holdem_2623_2s3sAdJdQs_5d4cQcTc_ThAh3cTd_Qd2c7dKc_2d9c4sJh_5s7h3h6s_7cTs9h8c_5c8h8s6h() {
    assertEquals(
      "7cTs9h8c 5c8h8s6h 2d9c4sJh Qd2c7dKc ThAh3cTd 5d4cQcTc 5s7h3h6s",
      Solver.process("omaha-holdem 2s3sAdJdQs 5d4cQcTc ThAh3cTd Qd2c7dKc 2d9c4sJh 5s7h3h6s 7cTs9h8c 5c8h8s6h"));
  }

  @Test
  public void test_omaha_holdem_2624_2c5h6sJcQd_8s4d3cKd_Ah5c9sKc() {
    assertEquals(
      "Ah5c9sKc 8s4d3cKd",
      Solver.process("omaha-holdem 2c5h6sJcQd 8s4d3cKd Ah5c9sKc"));
  }

  @Test
  public void test_omaha_holdem_2625_3h6s7c7h8s_Ad8dJsTd_JhQc9c5d_9dTs4h5c_9hJd7s3c() {
    assertEquals(
      "Ad8dJsTd JhQc9c5d 9dTs4h5c 9hJd7s3c",
      Solver.process("omaha-holdem 3h6s7c7h8s Ad8dJsTd JhQc9c5d 9dTs4h5c 9hJd7s3c"));
  }

  @Test
  public void test_omaha_holdem_2626_2c5c7sKhTc_AsJc8sKs_7h6d5h3h_4sAcJhJd_Ts4h9d3d_Js5d2sQs_2h8cQd6c_9c6h9s4d() {
    assertEquals(
      "9c6h9s4d Ts4h9d3d 4sAcJhJd AsJc8sKs Js5d2sQs 7h6d5h3h 2h8cQd6c",
      Solver.process("omaha-holdem 2c5c7sKhTc AsJc8sKs 7h6d5h3h 4sAcJhJd Ts4h9d3d Js5d2sQs 2h8cQd6c 9c6h9s4d"));
  }

  @Test
  public void test_omaha_holdem_2627_3c5s9sAcJh_3s5dKs6s_Jd5hKh4d_6c2c4s9h_AhKd3h2s_JcTh7c8s_TcQh5c6d_Js6h9d8d_Qd2hKc7d() {
    assertEquals(
      "Qd2hKc7d TcQh5c6d JcTh7c8s 3s5dKs6s Jd5hKh4d Js6h9d8d AhKd3h2s 6c2c4s9h",
      Solver.process("omaha-holdem 3c5s9sAcJh 3s5dKs6s Jd5hKh4d 6c2c4s9h AhKd3h2s JcTh7c8s TcQh5c6d Js6h9d8d Qd2hKc7d"));
  }

  @Test
  public void test_omaha_holdem_2628_7cJdJhJsQd_QsQhKh4d_Jc2d7d6c_KcKs9d6s() {
    assertEquals(
      "KcKs9d6s QsQhKh4d Jc2d7d6c",
      Solver.process("omaha-holdem 7cJdJhJsQd QsQhKh4d Jc2d7d6c KcKs9d6s"));
  }

  @Test
  public void test_omaha_holdem_2629_6c6h8cTdTs_2cQsAd8h_Ac7h5s2d_JhQcKs5c_JsJcKc6s_5dAhKdAs_Tc7c3hQd() {
    assertEquals(
      "JhQcKs5c Ac7h5s2d 2cQsAd8h 5dAhKdAs JsJcKc6s Tc7c3hQd",
      Solver.process("omaha-holdem 6c6h8cTdTs 2cQsAd8h Ac7h5s2d JhQcKs5c JsJcKc6s 5dAhKdAs Tc7c3hQd"));
  }

  @Test
  public void test_omaha_holdem_2630_6cJcJhQdTc_5hTh8c7h_JsJd5d7c_6dTs7d2h_4hTdKd9d_3dQc2dAd_8d3c5s6s() {
    assertEquals(
      "8d3c5s6s 6dTs7d2h 5hTh8c7h 3dQc2dAd 4hTdKd9d JsJd5d7c",
      Solver.process("omaha-holdem 6cJcJhQdTc 5hTh8c7h JsJd5d7c 6dTs7d2h 4hTdKd9d 3dQc2dAd 8d3c5s6s"));
  }

  @Test
  public void test_omaha_holdem_2631_2s9d9hKdKs_Ah8c6d3h_4c8h9cQd_7cJc2c2h_4d8d6sTd_5d6h5cAc_Kc7d3dTh_9s5h7hAd() {
    assertEquals(
      "4d8d6sTd Ah8c6d3h 5d6h5cAc 4c8h9cQd 9s5h7hAd Kc7d3dTh 7cJc2c2h",
      Solver.process("omaha-holdem 2s9d9hKdKs Ah8c6d3h 4c8h9cQd 7cJc2c2h 4d8d6sTd 5d6h5cAc Kc7d3dTh 9s5h7hAd"));
  }

  @Test
  public void test_omaha_holdem_2632_2s3s4s5sQs_2c9s6d5c_8h7h9c3c_2d9dQc7s_As3hKdQh_Kc6s6hJd_Tc8cTdAd_AcJcKs8s_Ah4d7cTh() {
    assertEquals(
      "8h7h9c3c Kc6s6hJd Tc8cTdAd 2d9dQc7s Ah4d7cTh=As3hKdQh 2c9s6d5c AcJcKs8s",
      Solver.process("omaha-holdem 2s3s4s5sQs 2c9s6d5c 8h7h9c3c 2d9dQc7s As3hKdQh Kc6s6hJd Tc8cTdAd AcJcKs8s Ah4d7cTh"));
  }

  @Test
  public void test_omaha_holdem_2633_4h6h7d7hAd_7s6c8cKd_9c4cQhTs_TcJdJsTh_6s2hTd2d_7cAh9sAs() {
    assertEquals(
      "9c4cQhTs 6s2hTd2d TcJdJsTh 7s6c8cKd 7cAh9sAs",
      Solver.process("omaha-holdem 4h6h7d7hAd 7s6c8cKd 9c4cQhTs TcJdJsTh 6s2hTd2d 7cAh9sAs"));
  }

  @Test
  public void test_omaha_holdem_2634_9c9dQcTdTh_Tc3hJsJd_Ad8s3d5c_Ah8c6d9s_Kh5sJh9h_6sQhKsKd_2s7d7s3s_4d8h5dQs_2d2c4cQd_5hKcAcAs() {
    assertEquals(
      "Ad8s3d5c 2s7d7s3s 2d2c4cQd 4d8h5dQs 6sQhKsKd 5hKcAcAs Ah8c6d9s Tc3hJsJd Kh5sJh9h",
      Solver.process("omaha-holdem 9c9dQcTdTh Tc3hJsJd Ad8s3d5c Ah8c6d9s Kh5sJh9h 6sQhKsKd 2s7d7s3s 4d8h5dQs 2d2c4cQd 5hKcAcAs"));
  }

  @Test
  public void test_omaha_holdem_2635_2h4h8d9sTc_Kc3c9h3s_3dAsJh6d_JdKhQs7c_JcQh6cJs_9cAh8hTs_5d4sAc7h_5sAd7sQc() {
    assertEquals(
      "3dAsJh6d 5sAd7sQc 5d4sAc7h Kc3c9h3s 9cAh8hTs JcQh6cJs=JdKhQs7c",
      Solver.process("omaha-holdem 2h4h8d9sTc Kc3c9h3s 3dAsJh6d JdKhQs7c JcQh6cJs 9cAh8hTs 5d4sAc7h 5sAd7sQc"));
  }

  @Test
  public void test_omaha_holdem_2636_6c9dJdJhTc_Js2cAd8h_KhAc9h9s_Ks2d7dKc_3h3sJcAh_6d5d8c2h_5c3c6sQh_4c8s5h4h_7h4sTdAs_Th6hKdQs() {
    assertEquals(
      "4c8s5h4h 6d5d8c2h 5c3c6sQh 7h4sTdAs Ks2d7dKc 3h3sJcAh=Js2cAd8h Th6hKdQs KhAc9h9s",
      Solver.process("omaha-holdem 6c9dJdJhTc Js2cAd8h KhAc9h9s Ks2d7dKc 3h3sJcAh 6d5d8c2h 5c3c6sQh 4c8s5h4h 7h4sTdAs Th6hKdQs"));
  }

  @Test
  public void test_omaha_holdem_2637_2d9hAdJsQd_6s7cAcKh_6d8d3d4c_KsAh7dKd_8s5d6h8c_Qs3c2hQh_Th4hTs2c_2s9s3sTc_4d5c9d4s_TdJc7s3h() {
    assertEquals(
      "8s5d6h8c Th4hTs2c TdJc7s3h 6s7cAcKh 2s9s3sTc Qs3c2hQh 6d8d3d4c 4d5c9d4s KsAh7dKd",
      Solver.process("omaha-holdem 2d9hAdJsQd 6s7cAcKh 6d8d3d4c KsAh7dKd 8s5d6h8c Qs3c2hQh Th4hTs2c 2s9s3sTc 4d5c9d4s TdJc7s3h"));
  }

  @Test
  public void test_omaha_holdem_2638_6h8d8h8sQh_Jc3c3h9d_2h6c2s3d_Th8c2dTc_7sQs6s4h_Jh6d9c9h_4dAdQd7c_7dAs5h4s_5cAcTsKd_Jd3sTdQc() {
    assertEquals(
      "7sQs6s4h Jd3sTdQc 7dAs5h4s 4dAdQd7c 5cAcTsKd 2h6c2s3d Jc3c3h9d Jh6d9c9h Th8c2dTc",
      Solver.process("omaha-holdem 6h8d8h8sQh Jc3c3h9d 2h6c2s3d Th8c2dTc 7sQs6s4h Jh6d9c9h 4dAdQd7c 7dAs5h4s 5cAcTsKd Jd3sTdQc"));
  }

  @Test
  public void test_omaha_holdem_2639_2d3s4d4sKd_8cAhJsTc_5s9sTsQc() {
    assertEquals(
      "5s9sTsQc 8cAhJsTc",
      Solver.process("omaha-holdem 2d3s4d4sKd 8cAhJsTc 5s9sTsQc"));
  }

  @Test
  public void test_omaha_holdem_2640_3d3h5c9cTs_QhAdKcAs_7c4s4h2s_9d6d2h6s_9sJc5s2d_8sQsKdJs() {
    assertEquals(
      "8sQsKdJs 7c4s4h2s 9d6d2h6s 9sJc5s2d QhAdKcAs",
      Solver.process("omaha-holdem 3d3h5c9cTs QhAdKcAs 7c4s4h2s 9d6d2h6s 9sJc5s2d 8sQsKdJs"));
  }

  @Test
  public void test_omaha_holdem_2641_2h5c7dQdQs_ThAhJcJh_6s3cAdTs_3dJsKs3s() {
    assertEquals(
      "6s3cAdTs 3dJsKs3s ThAhJcJh",
      Solver.process("omaha-holdem 2h5c7dQdQs ThAhJcJh 6s3cAdTs 3dJsKs3s"));
  }

  @Test
  public void test_omaha_holdem_2642_6s9sAhJdQh_7dQsQc3c_2d9c3d6c_7cKs2c4s_5s7s3h8d_Ad5d6h8s_2sKh4hJh_8c5hJcQd_5cKdKc3s() {
    assertEquals(
      "5s7s3h8d 7cKs2c4s 2sKh4hJh 5cKdKc3s 2d9c3d6c 8c5hJcQd Ad5d6h8s 7dQsQc3c",
      Solver.process("omaha-holdem 6s9sAhJdQh 7dQsQc3c 2d9c3d6c 7cKs2c4s 5s7s3h8d Ad5d6h8s 2sKh4hJh 8c5hJcQd 5cKdKc3s"));
  }

  @Test
  public void test_omaha_holdem_2643_2s3h5sAhTs_4cQcAs2h_6hQs6d9d_7dKd4dJd_4s3c4hTh_Ad8c2c3d() {
    assertEquals(
      "7dKd4dJd 6hQs6d9d Ad8c2c3d 4cQcAs2h=4s3c4hTh",
      Solver.process("omaha-holdem 2s3h5sAhTs 4cQcAs2h 6hQs6d9d 7dKd4dJd 4s3c4hTh Ad8c2c3d"));
  }

  @Test
  public void test_omaha_holdem_2644_2h3c3h3s4s_8dAdThJh_Kh6h6s8h_Td7dKdAs() {
    assertEquals(
      "8dAdThJh Td7dKdAs Kh6h6s8h",
      Solver.process("omaha-holdem 2h3c3h3s4s 8dAdThJh Kh6h6s8h Td7dKdAs"));
  }

  @Test
  public void test_omaha_holdem_2645_4c6c7c7dJd_4h3d2dJs_Kd2s5h6d_8s8c4d4s_Qd5s3cAs_QhTc7hQs_Ac7sKc6h_Ah9c6s2h() {
    assertEquals(
      "Kd2s5h6d Ah9c6s2h 4h3d2dJs QhTc7hQs Qd5s3cAs 8s8c4d4s Ac7sKc6h",
      Solver.process("omaha-holdem 4c6c7c7dJd 4h3d2dJs Kd2s5h6d 8s8c4d4s Qd5s3cAs QhTc7hQs Ac7sKc6h Ah9c6s2h"));
  }

  @Test
  public void test_omaha_holdem_2646_3c3h4s5h6d_As5c8d9s_9dAc5d6s_QsTd2c7c_2s3d4d7h_JsKcKsJh_8hAhThTs_8s8cKhJc() {
    assertEquals(
      "QsTd2c7c As5c8d9s 9dAc5d6s 8s8cKhJc 8hAhThTs JsKcKsJh 2s3d4d7h",
      Solver.process("omaha-holdem 3c3h4s5h6d As5c8d9s 9dAc5d6s QsTd2c7c 2s3d4d7h JsKcKsJh 8hAhThTs 8s8cKhJc"));
  }

  @Test
  public void test_omaha_holdem_2647_3c6s9dTdTs_Js5c2sAd_AsTh5sQc_Qs4sKdAh_5d6d4hJh_8sQdQhAc() {
    assertEquals(
      "Js5c2sAd Qs4sKdAh 5d6d4hJh 8sQdQhAc AsTh5sQc",
      Solver.process("omaha-holdem 3c6s9dTdTs Js5c2sAd AsTh5sQc Qs4sKdAh 5d6d4hJh 8sQdQhAc"));
  }

  @Test
  public void test_omaha_holdem_2648_3c5sAsJhJs_8d9c9h6c_Ks3dJcTc_QsQc4d9s_5d8cAh9d_Th4sTdJd() {
    assertEquals(
      "8d9c9h6c 5d8cAh9d Th4sTdJd QsQc4d9s Ks3dJcTc",
      Solver.process("omaha-holdem 3c5sAsJhJs 8d9c9h6c Ks3dJcTc QsQc4d9s 5d8cAh9d Th4sTdJd"));
  }

  @Test
  public void test_omaha_holdem_2649_2d3d9hAcKs_2c8sThTs_9sKc7d7c_AsJc2hQc() {
    assertEquals(
      "2c8sThTs 9sKc7d7c AsJc2hQc",
      Solver.process("omaha-holdem 2d3d9hAcKs 2c8sThTs 9sKc7d7c AsJc2hQc"));
  }

  @Test
  public void test_omaha_holdem_2650_2c5h7d7hKh_6s4sQd5s_Kd8sQhAs_Qs3cAhAd() {
    assertEquals(
      "6s4sQd5s Kd8sQhAs Qs3cAhAd",
      Solver.process("omaha-holdem 2c5h7d7hKh 6s4sQd5s Kd8sQhAs Qs3cAhAd"));
  }

  @Test
  public void test_omaha_holdem_2651_4d5h5sAcTs_8s6d9s2d_AdQdJd8d_As5d9c7d_3h6s4cJs_6c2c4s3d_QsJcKh4h() {
    assertEquals(
      "8s6d9s2d 3h6s4cJs QsJcKh4h AdQdJd8d 6c2c4s3d As5d9c7d",
      Solver.process("omaha-holdem 4d5h5sAcTs 8s6d9s2d AdQdJd8d As5d9c7d 3h6s4cJs 6c2c4s3d QsJcKh4h"));
  }

  @Test
  public void test_omaha_holdem_2652_4c4s6d8dJh_7dAd4d9h_Ks8h6sKh_2s8c7sAs_4hJc5c9c_5s3cTh5h_Ah7hJd7c_Td8sAcQc_2hKc2c6c_3h2dQs3d() {
    assertEquals(
      "3h2dQs3d 5s3cTh5h 2hKc2c6c 2s8c7sAs=Td8sAcQc Ah7hJd7c Ks8h6sKh 7dAd4d9h 4hJc5c9c",
      Solver.process("omaha-holdem 4c4s6d8dJh 7dAd4d9h Ks8h6sKh 2s8c7sAs 4hJc5c9c 5s3cTh5h Ah7hJd7c Td8sAcQc 2hKc2c6c 3h2dQs3d"));
  }

  @Test
  public void test_omaha_holdem_2653_6c7c9dKsTc_Ts9c7d5c_Kc4c9hAd_4sJc5d8c_9sJd6s3s_Ac8sTh2d_7hJhKd6d_8d2cAs3d_JsTd2s4d_2hQhAh3h() {
    assertEquals(
      "8d2cAs3d 2hQhAh3h JsTd2s4d 9sJd6s3s 7hJhKd6d Ac8sTh2d Ts9c7d5c 4sJc5d8c Kc4c9hAd",
      Solver.process("omaha-holdem 6c7c9dKsTc Ts9c7d5c Kc4c9hAd 4sJc5d8c 9sJd6s3s Ac8sTh2d 7hJhKd6d 8d2cAs3d JsTd2s4d 2hQhAh3h"));
  }

  @Test
  public void test_omaha_holdem_2654_3c8c9cAdKh_JsAhKs2d_8s7c6c9h_Ts6d4sTd_6sQs2sKd_JdQc5c5d_7d6h8hAs() {
    assertEquals(
      "Ts6d4sTd 6sQs2sKd 7d6h8hAs JsAhKs2d 8s7c6c9h JdQc5c5d",
      Solver.process("omaha-holdem 3c8c9cAdKh JsAhKs2d 8s7c6c9h Ts6d4sTd 6sQs2sKd JdQc5c5d 7d6h8hAs"));
  }

  @Test
  public void test_omaha_holdem_2655_6sJcQcTcTs_2dAs2cQs_8h6c9h9d() {
    assertEquals(
      "2dAs2cQs 8h6c9h9d",
      Solver.process("omaha-holdem 6sJcQcTcTs 2dAs2cQs 8h6c9h9d"));
  }

  @Test
  public void test_omaha_holdem_2656_4d6sJcKcQd_Ts9s4s3h_3dAh3c5s_5d8d2dQc_2s4c7c7d() {
    assertEquals(
      "3dAh3c5s 2s4c7c7d 5d8d2dQc Ts9s4s3h",
      Solver.process("omaha-holdem 4d6sJcKcQd Ts9s4s3h 3dAh3c5s 5d8d2dQc 2s4c7c7d"));
  }

  @Test
  public void test_omaha_holdem_2657_2d4d5cAhQc_Qs8c5s7h_Qd8s8dJd() {
    assertEquals(
      "Qd8s8dJd Qs8c5s7h",
      Solver.process("omaha-holdem 2d4d5cAhQc Qs8c5s7h Qd8s8dJd"));
  }

  @Test
  public void test_omaha_holdem_2658_5c6d6s9cAd_9hKcJsTc_KdQc8c3s_5hKh5sQh_4cJd3hTh_8d7hAc7c_2h2s9sAh_Qd6c8sJh() {
    assertEquals(
      "4cJd3hTh KdQc8c3s 9hKcJsTc 2h2s9sAh Qd6c8sJh 8d7hAc7c 5hKh5sQh",
      Solver.process("omaha-holdem 5c6d6s9cAd 9hKcJsTc KdQc8c3s 5hKh5sQh 4cJd3hTh 8d7hAc7c 2h2s9sAh Qd6c8sJh"));
  }

  @Test
  public void test_omaha_holdem_2659_9c9dJsKcQs_3dKs3c8s_JdAs2s5c_4sTc8hQc_Ah4h7d2d_Kd9s6c6d_5h3hQd7h() {
    assertEquals(
      "Ah4h7d2d JdAs2s5c 5h3hQd7h 3dKs3c8s 4sTc8hQc Kd9s6c6d",
      Solver.process("omaha-holdem 9c9dJsKcQs 3dKs3c8s JdAs2s5c 4sTc8hQc Ah4h7d2d Kd9s6c6d 5h3hQd7h"));
  }

  @Test
  public void test_omaha_holdem_2660_2d5c6dAcTc_6hQcKcQd_9c4s7h6c_Th7cKdAs_4h7s4d3s_AdJh7d8h_5s3d8d8c_9s8sKhAh_JcQhTs3c() {
    assertEquals(
      "5s3d8d8c AdJh7d8h 9s8sKhAh Th7cKdAs 4h7s4d3s 9c4s7h6c JcQhTs3c 6hQcKcQd",
      Solver.process("omaha-holdem 2d5c6dAcTc 6hQcKcQd 9c4s7h6c Th7cKdAs 4h7s4d3s AdJh7d8h 5s3d8d8c 9s8sKhAh JcQhTs3c"));
  }

  @Test
  public void test_omaha_holdem_2661_4c5h9sKhKs_2d2hKcJs_9d6hTd5d_6dQcJh9c_7s4dAdQh_3d6cKd7h_9h5sTsAs_2cJd3h5c() {
    assertEquals(
      "7s4dAdQh 2cJd3h5c 9d6hTd5d 6dQcJh9c 9h5sTsAs 3d6cKd7h 2d2hKcJs",
      Solver.process("omaha-holdem 4c5h9sKhKs 2d2hKcJs 9d6hTd5d 6dQcJh9c 7s4dAdQh 3d6cKd7h 9h5sTsAs 2cJd3h5c"));
  }

  @Test
  public void test_omaha_holdem_2662_5c6h8cQcQs_3c7h5dJc_4dKc6sKs_3d6d8s4h() {
    assertEquals(
      "3d6d8s4h 4dKc6sKs 3c7h5dJc",
      Solver.process("omaha-holdem 5c6h8cQcQs 3c7h5dJc 4dKc6sKs 3d6d8s4h"));
  }

  @Test
  public void test_omaha_holdem_2663_3s4h8dKcQc_6c9cTd8s_Ah7h7sAd_7d4c4sJs_Qs9hAsKd_JcKs2dAc_ThQd3c6d() {
    assertEquals(
      "6c9cTd8s JcKs2dAc Ah7h7sAd ThQd3c6d Qs9hAsKd 7d4c4sJs",
      Solver.process("omaha-holdem 3s4h8dKcQc 6c9cTd8s Ah7h7sAd 7d4c4sJs Qs9hAsKd JcKs2dAc ThQd3c6d"));
  }

  @Test
  public void test_omaha_holdem_2664_3c4d5cJdKc_Ac9hTd9s_Th6cTs9d() {
    assertEquals(
      "Ac9hTd9s Th6cTs9d",
      Solver.process("omaha-holdem 3c4d5cJdKc Ac9hTd9s Th6cTs9d"));
  }

  @Test
  public void test_omaha_holdem_2665_2s5h6h7hAs_7s9sThAh_AdJd4sJs_8s7d5cKs_AcKh5s9c_8cQdTc3s() {
    assertEquals(
      "8cQdTc3s AdJd4sJs 8s7d5cKs AcKh5s9c 7s9sThAh",
      Solver.process("omaha-holdem 2s5h6h7hAs 7s9sThAh AdJd4sJs 8s7d5cKs AcKh5s9c 8cQdTc3s"));
  }

  @Test
  public void test_omaha_holdem_2666_2c4h6sAhTc_7sAs9s4d_2h9h7h8c_Kc4sKd3c_Qh5sQdJc() {
    assertEquals(
      "2h9h7h8c Qh5sQdJc Kc4sKd3c 7sAs9s4d",
      Solver.process("omaha-holdem 2c4h6sAhTc 7sAs9s4d 2h9h7h8c Kc4sKd3c Qh5sQdJc"));
  }

  @Test
  public void test_omaha_holdem_2667_3s6d9dJhKd_2cQhAd5h_3d6cJdKc_Qd5d3cAc_2hJc4h5c_2d7h7c9s() {
    assertEquals(
      "2cQhAd5h 2d7h7c9s 2hJc4h5c 3d6cJdKc Qd5d3cAc",
      Solver.process("omaha-holdem 3s6d9dJhKd 2cQhAd5h 3d6cJdKc Qd5d3cAc 2hJc4h5c 2d7h7c9s"));
  }

  @Test
  public void test_omaha_holdem_2668_4hJdJsKsQd_As6d9c5h_Kd7cKc2s_Qs8cJh5d_8h5s7d9s_2hJc4c2c() {
    assertEquals(
      "8h5s7d9s As6d9c5h 2hJc4c2c Qs8cJh5d Kd7cKc2s",
      Solver.process("omaha-holdem 4hJdJsKsQd As6d9c5h Kd7cKc2s Qs8cJh5d 8h5s7d9s 2hJc4c2c"));
  }

  @Test
  public void test_omaha_holdem_2669_4c4h5d8d8s_9d8h7d2c_6dAd5h2s_JcQs7sAh_3h7c6sKd_9c3sTh9s() {
    assertEquals(
      "JcQs7sAh 6dAd5h2s 9c3sTh9s 9d8h7d2c 3h7c6sKd",
      Solver.process("omaha-holdem 4c4h5d8d8s 9d8h7d2c 6dAd5h2s JcQs7sAh 3h7c6sKd 9c3sTh9s"));
  }

  @Test
  public void test_omaha_holdem_2670_6d8d8sJsKh_3sTs6cTh_6h7c7hAc_JdQs9sTc_2hKsAsKc_2c2d8cAd_9h7d5c8h_5d5s3hKd_Qd4cJh4h_QhJc4sTd() {
    assertEquals(
      "6h7c7hAc 3sTs6cTh JdQs9sTc=Qd4cJh4h=QhJc4sTd 5d5s3hKd 9h7d5c8h 2c2d8cAd 2hKsAsKc",
      Solver.process("omaha-holdem 6d8d8sJsKh 3sTs6cTh 6h7c7hAc JdQs9sTc 2hKsAsKc 2c2d8cAd 9h7d5c8h 5d5s3hKd Qd4cJh4h QhJc4sTd"));
  }

  @Test
  public void test_omaha_holdem_2671_2d4d6c7h9c_8s7d6dKh_Ad5hAh5c_9hJs2s4c_6s3s3c9d_9s7s7cJd_8h5dKcQc_JhAsQdTh_QsAc2c5s() {
    assertEquals(
      "JhAsQdTh QsAc2c5s Ad5hAh5c 8s7d6dKh 9hJs2s4c 6s3s3c9d 9s7s7cJd 8h5dKcQc",
      Solver.process("omaha-holdem 2d4d6c7h9c 8s7d6dKh Ad5hAh5c 9hJs2s4c 6s3s3c9d 9s7s7cJd 8h5dKcQc JhAsQdTh QsAc2c5s"));
  }

  @Test
  public void test_omaha_holdem_2672_2h4s5sQcQs_8cJh9c3c_2dAc6dQd() {
    assertEquals(
      "8cJh9c3c 2dAc6dQd",
      Solver.process("omaha-holdem 2h4s5sQcQs 8cJh9c3c 2dAc6dQd"));
  }

  @Test
  public void test_omaha_holdem_2673_4d8h8sAdJs_7h5dJdTc_9hThQd4c_2c9d9sQs_Ac2h3hAs_8dTs7s5c_Jh6s4h3c_5sKd8cTd() {
    assertEquals(
      "9hThQd4c 2c9d9sQs Jh6s4h3c 7h5dJdTc 8dTs7s5c 5sKd8cTd Ac2h3hAs",
      Solver.process("omaha-holdem 4d8h8sAdJs 7h5dJdTc 9hThQd4c 2c9d9sQs Ac2h3hAs 8dTs7s5c Jh6s4h3c 5sKd8cTd"));
  }

  @Test
  public void test_omaha_holdem_2674_6c7cJhKcQs_8s5d2s9c_3dKh9h6h_Th8d3cQh_9dJdAdJc() {
    assertEquals(
      "8s5d2s9c Th8d3cQh 3dKh9h6h 9dJdAdJc",
      Solver.process("omaha-holdem 6c7cJhKcQs 8s5d2s9c 3dKh9h6h Th8d3cQh 9dJdAdJc"));
  }

  @Test
  public void test_omaha_holdem_2675_4c8sKdQcTd_Jd2h5hJc_3c5cTh4s_9d2cTs9c_2d5dAdJh_8d6dAsKh() {
    assertEquals(
      "9d2cTs9c Jd2h5hJc 3c5cTh4s 8d6dAsKh 2d5dAdJh",
      Solver.process("omaha-holdem 4c8sKdQcTd Jd2h5hJc 3c5cTh4s 9d2cTs9c 2d5dAdJh 8d6dAsKh"));
  }

  @Test
  public void test_omaha_holdem_2676_2d6s7h9sKh_8hJsKs2h_4sQs7s5c_6h9h2c6d() {
    assertEquals(
      "4sQs7s5c 8hJsKs2h 6h9h2c6d",
      Solver.process("omaha-holdem 2d6s7h9sKh 8hJsKs2h 4sQs7s5c 6h9h2c6d"));
  }

  @Test
  public void test_omaha_holdem_2677_3h4c6s7hQh_Ac8dAsAd_Qc7sKh8h_Ks5h6d5d_Jc3sJh2h_4s6cKd3c_Tc7c8cJs_2c3dTs6h_4dTh9s9h_5sTd9dKc() {
    assertEquals(
      "5sTd9dKc Tc7c8cJs Ac8dAsAd 2c3dTs6h 4s6cKd3c Ks5h6d5d 4dTh9s9h Jc3sJh2h Qc7sKh8h",
      Solver.process("omaha-holdem 3h4c6s7hQh Ac8dAsAd Qc7sKh8h Ks5h6d5d Jc3sJh2h 4s6cKd3c Tc7c8cJs 2c3dTs6h 4dTh9s9h 5sTd9dKc"));
  }

  @Test
  public void test_omaha_holdem_2678_2d3c5sJcTc_JsQs6cJd_7dAs8sKs_Ac9d7h4h_Kd4sQhQc() {
    assertEquals(
      "7dAs8sKs Kd4sQhQc JsQs6cJd Ac9d7h4h",
      Solver.process("omaha-holdem 2d3c5sJcTc JsQs6cJd 7dAs8sKs Ac9d7h4h Kd4sQhQc"));
  }

  @Test
  public void test_omaha_holdem_2679_3c4s7h8sKh_9c2hAs8d_8cQhAd9h_6h3hAhQc_Js7s6cAc_5c8h2c4h_JhKd7d2s_9dQdJcTc() {
    assertEquals(
      "9dQdJcTc 6h3hAhQc Js7s6cAc 8cQhAd9h=9c2hAs8d 5c8h2c4h JhKd7d2s",
      Solver.process("omaha-holdem 3c4s7h8sKh 9c2hAs8d 8cQhAd9h 6h3hAhQc Js7s6cAc 5c8h2c4h JhKd7d2s 9dQdJcTc"));
  }

  @Test
  public void test_omaha_holdem_2680_5dAhAsJdTd_4h2dThTs_9d9c5s4s_7h4cKs8h_Jc3s8d9h_2s5hJh7d_6dKd4dQh_KcAc7s8c_Ad3h9s6c_Js2hQs6s() {
    assertEquals(
      "7h4cKs8h 9d9c5s4s 2s5hJh7d Jc3s8d9h Js2hQs6s Ad3h9s6c KcAc7s8c 6dKd4dQh 4h2dThTs",
      Solver.process("omaha-holdem 5dAhAsJdTd 4h2dThTs 9d9c5s4s 7h4cKs8h Jc3s8d9h 2s5hJh7d 6dKd4dQh KcAc7s8c Ad3h9s6c Js2hQs6s"));
  }

  @Test
  public void test_omaha_holdem_2681_6s7s9hJdJh_Jc3sTs9s_6d2s5cAs_AhTd5h8d_QhQs6c9d_2h5d7hKd_3h2c9cTh_6h8c7d4s_Kc5s4c3c_2d4d8sKh() {
    assertEquals(
      "Kc5s4c3c 2d4d8sKh 6d2s5cAs 6h8c7d4s 2h5d7hKd 3h2c9cTh QhQs6c9d AhTd5h8d Jc3sTs9s",
      Solver.process("omaha-holdem 6s7s9hJdJh Jc3sTs9s 6d2s5cAs AhTd5h8d QhQs6c9d 2h5d7hKd 3h2c9cTh 6h8c7d4s Kc5s4c3c 2d4d8sKh"));
  }

  @Test
  public void test_omaha_holdem_2682_5c6c7cJhTd_3s5d9s3d_5h6hKs7d_2s2hJsAc() {
    assertEquals(
      "3s5d9s3d 2s2hJsAc 5h6hKs7d",
      Solver.process("omaha-holdem 5c6c7cJhTd 3s5d9s3d 5h6hKs7d 2s2hJsAc"));
  }

  @Test
  public void test_omaha_holdem_2683_4h5c8h9hAh_9sQh7c6d_Td3h3c2d_Kd5d7d8s_9c8d2s8c_JcThQcJs_6sTs2h7s() {
    assertEquals(
      "JcThQcJs Kd5d7d8s 9c8d2s8c Td3h3c2d 6sTs2h7s=9sQh7c6d",
      Solver.process("omaha-holdem 4h5c8h9hAh 9sQh7c6d Td3h3c2d Kd5d7d8s 9c8d2s8c JcThQcJs 6sTs2h7s"));
  }

  @Test
  public void test_omaha_holdem_2684_7h8s9cJhTc_2hJcKc4d_Kh3sAhQd_6d6s6hKd_4hJs7s7d_3h9h7c5s_Qs4sAd8c_3d2d8hAs_QhKsTh4c_Ac5c5h8d() {
    assertEquals(
      "6d6s6hKd 3d2d8hAs=Ac5c5h8d 2hJcKc4d 3h9h7c5s=4hJs7s7d Qs4sAd8c Kh3sAhQd=QhKsTh4c",
      Solver.process("omaha-holdem 7h8s9cJhTc 2hJcKc4d Kh3sAhQd 6d6s6hKd 4hJs7s7d 3h9h7c5s Qs4sAd8c 3d2d8hAs QhKsTh4c Ac5c5h8d"));
  }

  @Test
  public void test_omaha_holdem_2685_3h4c6h7cKs_2s2cJd7h_4sAsTc6c_QdTdQhKd_6sQcAd3c_JsTh2h4h_JcKc8s8h_5hAh5c4d_6d5s3sKh_7s9d8cQs() {
    assertEquals(
      "JsTh2h4h 2s2cJd7h 7s9d8cQs JcKc8s8h QdTdQhKd 6sQcAd3c 4sAsTc6c 5hAh5c4d=6d5s3sKh",
      Solver.process("omaha-holdem 3h4c6h7cKs 2s2cJd7h 4sAsTc6c QdTdQhKd 6sQcAd3c JsTh2h4h JcKc8s8h 5hAh5c4d 6d5s3sKh 7s9d8cQs"));
  }

  @Test
  public void test_omaha_holdem_2686_2s3d7d8dAs_5sQdQs5d_Qc2h5h9s_Qh4hJdJs() {
    assertEquals(
      "Qc2h5h9s Qh4hJdJs 5sQdQs5d",
      Solver.process("omaha-holdem 2s3d7d8dAs 5sQdQs5d Qc2h5h9s Qh4hJdJs"));
  }

  @Test
  public void test_omaha_holdem_2687_4d4s5d9sAd_Ks2s7d8h_7hQhKc6c_Jd3sAs5c_KdAhJcQd() {
    assertEquals(
      "Ks2s7d8h 7hQhKc6c Jd3sAs5c KdAhJcQd",
      Solver.process("omaha-holdem 4d4s5d9sAd Ks2s7d8h 7hQhKc6c Jd3sAs5c KdAhJcQd"));
  }

  @Test
  public void test_omaha_holdem_2688_5d6s7cKsTd_Jd4c2dJc_8hJh6d7s_3hTsKhJs_8d8s2cTc_3dQc3c9d_Qd6c7hAd_5cAh6hAc_4hKd4sQh_9c2sTh2h() {
    assertEquals(
      "3dQc3c9d 8d8s2cTc 9c2sTh2h Jd4c2dJc 4hKd4sQh 5cAh6hAc 8hJh6d7s=Qd6c7hAd 3hTsKhJs",
      Solver.process("omaha-holdem 5d6s7cKsTd Jd4c2dJc 8hJh6d7s 3hTsKhJs 8d8s2cTc 3dQc3c9d Qd6c7hAd 5cAh6hAc 4hKd4sQh 9c2sTh2h"));
  }

  @Test
  public void test_omaha_holdem_2689_5c6c7s9c9h_Ad7h2sQd_2dAh5dTd_2hJh9d3s_Ac5hJd4d_Kc3d5s4c_Ts8hKhTc_7c3h8d9s_7d8cKs4h() {
    assertEquals(
      "2dAh5dTd=Ac5hJd4d Ad7h2sQd 2hJh9d3s 7d8cKs4h Ts8hKhTc Kc3d5s4c 7c3h8d9s",
      Solver.process("omaha-holdem 5c6c7s9c9h Ad7h2sQd 2dAh5dTd 2hJh9d3s Ac5hJd4d Kc3d5s4c Ts8hKhTc 7c3h8d9s 7d8cKs4h"));
  }

  @Test
  public void test_omaha_holdem_2690_2h3d7c9hJc_5c4h6cQh_QsAsKc7d_TsJd6d8s_9c3cTh5h_6h5d7h2s_Qd5sAhKd_Jh8h4c2d_Kh9sTc4d() {
    assertEquals(
      "5c4h6cQh Qd5sAhKd QsAsKc7d Kh9sTc4d 6h5d7h2s 9c3cTh5h Jh8h4c2d TsJd6d8s",
      Solver.process("omaha-holdem 2h3d7c9hJc 5c4h6cQh QsAsKc7d TsJd6d8s 9c3cTh5h 6h5d7h2s Qd5sAhKd Jh8h4c2d Kh9sTc4d"));
  }

  @Test
  public void test_omaha_holdem_2691_5h7h8sTdTh_9d6h4h6s_QcJc6d8d_9hAcJd3d() {
    assertEquals(
      "QcJc6d8d 9hAcJd3d 9d6h4h6s",
      Solver.process("omaha-holdem 5h7h8sTdTh 9d6h4h6s QcJc6d8d 9hAcJd3d"));
  }

  @Test
  public void test_omaha_holdem_2692_3h4c5c6h7s_9s7dTdQd_Tc4d6s9h_3dAd9d7c_5hAc6dQs() {
    assertEquals(
      "9s7dTdQd 3dAd9d7c=5hAc6dQs=Tc4d6s9h",
      Solver.process("omaha-holdem 3h4c5c6h7s 9s7dTdQd Tc4d6s9h 3dAd9d7c 5hAc6dQs"));
  }

  @Test
  public void test_omaha_holdem_2693_4c6d7h8hTc_2s2d4h7c_QdAh8dKs_Qs4dAdJh_Kd2cTh7d() {
    assertEquals(
      "Qs4dAdJh QdAh8dKs 2s2d4h7c Kd2cTh7d",
      Solver.process("omaha-holdem 4c6d7h8hTc 2s2d4h7c QdAh8dKs Qs4dAdJh Kd2cTh7d"));
  }

  @Test
  public void test_omaha_holdem_2694_2h3c5sKdTs_9dQc8dKh_5h8c2c2d() {
    assertEquals(
      "9dQc8dKh 5h8c2c2d",
      Solver.process("omaha-holdem 2h3c5sKdTs 9dQc8dKh 5h8c2c2d"));
  }

  @Test
  public void test_omaha_holdem_2695_4h5c6s7d9c_5h3dJd6h_Ts9s8s6c_5dKsJs3h_2sQc4s3s_7sTd8c9d_2d2hKdTh_8dAd6dQh_As2c3cJh_8h4dKc7c() {
    assertEquals(
      "2d2hKdTh As2c3cJh 2sQc4s3s=5dKsJs3h=5h3dJd6h 8dAd6dQh=8h4dKc7c 7sTd8c9d=Ts9s8s6c",
      Solver.process("omaha-holdem 4h5c6s7d9c 5h3dJd6h Ts9s8s6c 5dKsJs3h 2sQc4s3s 7sTd8c9d 2d2hKdTh 8dAd6dQh As2c3cJh 8h4dKc7c"));
  }

  @Test
  public void test_omaha_holdem_2696_3d4c9cKcQc_3c2sJc4h_8c2cQh6h_TcKs8d6s_Td9d5cAd_4d2d6c2h_As4s7c7s() {
    assertEquals(
      "4d2d6c2h As4s7c7s Td9d5cAd TcKs8d6s 8c2cQh6h 3c2sJc4h",
      Solver.process("omaha-holdem 3d4c9cKcQc 3c2sJc4h 8c2cQh6h TcKs8d6s Td9d5cAd 4d2d6c2h As4s7c7s"));
  }

  @Test
  public void test_omaha_holdem_2697_AdKcQcTcTh_8s4s6cAh_Qh4hAs7c() {
    assertEquals(
      "8s4s6cAh Qh4hAs7c",
      Solver.process("omaha-holdem AdKcQcTcTh 8s4s6cAh Qh4hAs7c"));
  }

  @Test
  public void test_omaha_holdem_2698_5d6c8h9hAs_JhQhKdJs_ThTc5c9s_6dAd7dTd_4s5s4hKs_QcJd3h8s_3sQs3c2s() {
    assertEquals(
      "3sQs3c2s 4s5s4hKs QcJd3h8s JhQhKdJs ThTc5c9s 6dAd7dTd",
      Solver.process("omaha-holdem 5d6c8h9hAs JhQhKdJs ThTc5c9s 6dAd7dTd 4s5s4hKs QcJd3h8s 3sQs3c2s"));
  }

  @Test
  public void test_omaha_holdem_2699_2d8dAhTcTd_8s9c4c4d_Jd2c4hQc_Qh2s9s6c_AdKd3s6s_Kc3d7s8c_6d7hKh6h_5cAc7d5h_QdTsAs9d() {
    assertEquals(
      "Jd2c4hQc=Qh2s9s6c 6d7hKh6h 8s9c4c4d Kc3d7s8c 5cAc7d5h AdKd3s6s QdTsAs9d",
      Solver.process("omaha-holdem 2d8dAhTcTd 8s9c4c4d Jd2c4hQc Qh2s9s6c AdKd3s6s Kc3d7s8c 6d7hKh6h 5cAc7d5h QdTsAs9d"));
  }

  @Test
  public void test_omaha_holdem_2700_4s7c8c9dAh_6s4d3d9s_7h6h9c2h_8dQs5hAd_Qc5s4h3h_Th6cAs7d_2c7sAcKc_KhTsJc3s() {
    assertEquals(
      "Qc5s4h3h 6s4d3d9s 7h6h9c2h 2c7sAcKc 8dQs5hAd Th6cAs7d KhTsJc3s",
      Solver.process("omaha-holdem 4s7c8c9dAh 6s4d3d9s 7h6h9c2h 8dQs5hAd Qc5s4h3h Th6cAs7d 2c7sAcKc KhTsJc3s"));
  }

  @Test
  public void test_omaha_holdem_2701_2s4s8hAdTc_6h7hQs6c_Jc3s8cAs_KhQh8sJd() {
    assertEquals(
      "6h7hQs6c KhQh8sJd Jc3s8cAs",
      Solver.process("omaha-holdem 2s4s8hAdTc 6h7hQs6c Jc3s8cAs KhQh8sJd"));
  }

  @Test
  public void test_omaha_holdem_2702_6d7s9d9hQh_9c7d3d4c_7h5c7cQc_Kh6h2dJd() {
    assertEquals(
      "Kh6h2dJd 7h5c7cQc 9c7d3d4c",
      Solver.process("omaha-holdem 6d7s9d9hQh 9c7d3d4c 7h5c7cQc Kh6h2dJd"));
  }

  @Test
  public void test_omaha_holdem_2703_3s5s7c8dQc_3c5dTc6d_4h6c4sKc() {
    assertEquals(
      "3c5dTc6d 4h6c4sKc",
      Solver.process("omaha-holdem 3s5s7c8dQc 3c5dTc6d 4h6c4sKc"));
  }

  @Test
  public void test_omaha_holdem_2704_6c6h9c9hJd_9dQh5hAh_Ts4s6dJc_8d3cKd2h_7cAsKh8s_8h2d4hTc_Qs5d9sJh_AdQc4c5s() {
    assertEquals(
      "8h2d4hTc 8d3cKd2h AdQc4c5s 7cAsKh8s 9dQh5hAh Ts4s6dJc Qs5d9sJh",
      Solver.process("omaha-holdem 6c6h9c9hJd 9dQh5hAh Ts4s6dJc 8d3cKd2h 7cAsKh8s 8h2d4hTc Qs5d9sJh AdQc4c5s"));
  }

  @Test
  public void test_omaha_holdem_2705_6s7dJhKdQh_Qd3h9d9s_Js6d3c5d_2h6c8h2s_5s4sAh4h_3s5h3d4d_8s7cQs9h() {
    assertEquals(
      "3s5h3d4d 5s4sAh4h 2h6c8h2s Qd3h9d9s Js6d3c5d 8s7cQs9h",
      Solver.process("omaha-holdem 6s7dJhKdQh Qd3h9d9s Js6d3c5d 2h6c8h2s 5s4sAh4h 3s5h3d4d 8s7cQs9h"));
  }

  @Test
  public void test_omaha_holdem_2706_4s7c7h9sQh_Jc9d9c4h_5s2s6c3c_6dTc6hQs_5dKh5c4c_KcAsQcTh_QdAd5h9h_6s2dJdTs_2cAc8c4d_8h3sTd2h() {
    assertEquals(
      "5s2s6c3c 8h3sTd2h 6s2dJdTs 2cAc8c4d 5dKh5c4c 6dTc6hQs KcAsQcTh QdAd5h9h Jc9d9c4h",
      Solver.process("omaha-holdem 4s7c7h9sQh Jc9d9c4h 5s2s6c3c 6dTc6hQs 5dKh5c4c KcAsQcTh QdAd5h9h 6s2dJdTs 2cAc8c4d 8h3sTd2h"));
  }

  @Test
  public void test_omaha_holdem_2707_3s5c5d8d9h_AsQd6s7h_Qc4h2sKd() {
    assertEquals(
      "Qc4h2sKd AsQd6s7h",
      Solver.process("omaha-holdem 3s5c5d8d9h AsQd6s7h Qc4h2sKd"));
  }

  @Test
  public void test_omaha_holdem_2708_3d4d5s9hAs_9s3s5cKh_7s2sAcKd_3c8d6hJs_Jd2d4cTs_Ks6d8s4h() {
    assertEquals(
      "3c8d6hJs Ks6d8s4h 9s3s5cKh 7s2sAcKd=Jd2d4cTs",
      Solver.process("omaha-holdem 3d4d5s9hAs 9s3s5cKh 7s2sAcKd 3c8d6hJs Jd2d4cTs Ks6d8s4h"));
  }

  @Test
  public void test_omaha_holdem_2709_2h6d6hJsTs_7d2s4h5h_ThTcAd2d_6s9dJhQd() {
    assertEquals(
      "7d2s4h5h 6s9dJhQd ThTcAd2d",
      Solver.process("omaha-holdem 2h6d6hJsTs 7d2s4h5h ThTcAd2d 6s9dJhQd"));
  }

  @Test
  public void test_omaha_holdem_2710_2s3d7dAsQc_Js6d2c8s_Ks8h5d4h_9dAhTdAd_7hQh9c6h_4d8cJd9s_TcKh4s3s_7c9h3c2h() {
    assertEquals(
      "4d8cJd9s Js6d2c8s TcKh4s3s 7c9h3c2h 7hQh9c6h 9dAhTdAd Ks8h5d4h",
      Solver.process("omaha-holdem 2s3d7dAsQc Js6d2c8s Ks8h5d4h 9dAhTdAd 7hQh9c6h 4d8cJd9s TcKh4s3s 7c9h3c2h"));
  }

  @Test
  public void test_omaha_holdem_2711_2s8s9c9dKh_Jd7c5s4h_9hQhAsJs() {
    assertEquals(
      "Jd7c5s4h 9hQhAsJs",
      Solver.process("omaha-holdem 2s8s9c9dKh Jd7c5s4h 9hQhAsJs"));
  }

  @Test
  public void test_omaha_holdem_2712_4hJsQsTdTh_9h3s4d3h_8d7cAs9c_6sAh2s2c_4c6h8hQc_Kh3d4s7s_KdKs5d5s_7d5c8s2d_3cQdKc6d() {
    assertEquals(
      "7d5c8s2d 6sAh2s2c 9h3s4d3h Kh3d4s7s 4c6h8hQc 3cQdKc6d KdKs5d5s 8d7cAs9c",
      Solver.process("omaha-holdem 4hJsQsTdTh 9h3s4d3h 8d7cAs9c 6sAh2s2c 4c6h8hQc Kh3d4s7s KdKs5d5s 7d5c8s2d 3cQdKc6d"));
  }

  @Test
  public void test_omaha_holdem_2713_3c7hAhJhQd_4hTc9d3s_Th3hAdKd() {
    assertEquals(
      "4hTc9d3s Th3hAdKd",
      Solver.process("omaha-holdem 3c7hAhJhQd 4hTc9d3s Th3hAdKd"));
  }

  @Test
  public void test_omaha_holdem_2714_5d6d9cAcJd_Qs2c2dKh_2h6h3h7h_4h8h8sTs_2s7c3dKs_9s5h7dTh_8c6c3s4c_Kc7s9hJh_Ah4d3cJc_KdTd8dQh() {
    assertEquals(
      "2s7c3dKs Qs2c2dKh 2h6h3h7h 8c6c3s4c 4h8h8sTs 9s5h7dTh Kc7s9hJh Ah4d3cJc KdTd8dQh",
      Solver.process("omaha-holdem 5d6d9cAcJd Qs2c2dKh 2h6h3h7h 4h8h8sTs 2s7c3dKs 9s5h7dTh 8c6c3s4c Kc7s9hJh Ah4d3cJc KdTd8dQh"));
  }

  @Test
  public void test_omaha_holdem_2715_3h4dJcJhTd_AsQc5hQd_6c7hTs5s_3d6s3cTh_Qs7s3s8s_5dAhAc4h_8h7d2d9h_Kc7c4c2c_4s9s2sKd_9dJdKsAd() {
    assertEquals(
      "8h7d2d9h Qs7s3s8s 4s9s2sKd=Kc7c4c2c 6c7hTs5s AsQc5hQd 5dAhAc4h 9dJdKsAd 3d6s3cTh",
      Solver.process("omaha-holdem 3h4dJcJhTd AsQc5hQd 6c7hTs5s 3d6s3cTh Qs7s3s8s 5dAhAc4h 8h7d2d9h Kc7c4c2c 4s9s2sKd 9dJdKsAd"));
  }

  @Test
  public void test_omaha_holdem_2716_3c3s6hAcTd_5c9s2hKh_9hKd5h3h() {
    assertEquals(
      "5c9s2hKh 9hKd5h3h",
      Solver.process("omaha-holdem 3c3s6hAcTd 5c9s2hKh 9hKd5h3h"));
  }

  @Test
  public void test_omaha_holdem_2717_5c6c7dAcJd_5s4c5hKh_9c9s3s3d_4hJsJcQc_QsJh3h4d_Ks8h8cQh_As4sKcTd() {
    assertEquals(
      "Ks8h8cQh 9c9s3s3d As4sKcTd 5s4c5hKh QsJh3h4d 4hJsJcQc",
      Solver.process("omaha-holdem 5c6c7dAcJd 5s4c5hKh 9c9s3s3d 4hJsJcQc QsJh3h4d Ks8h8cQh As4sKcTd"));
  }

  @Test
  public void test_omaha_holdem_2718_5c5h8sKdTs_2c3cQs9h_Ac2sJs8d_4s7s3hTh_Qh8c2dQc() {
    assertEquals(
      "2c3cQs9h Ac2sJs8d 4s7s3hTh Qh8c2dQc",
      Solver.process("omaha-holdem 5c5h8sKdTs 2c3cQs9h Ac2sJs8d 4s7s3hTh Qh8c2dQc"));
  }

  @Test
  public void test_omaha_holdem_2719_5s8h9hQsTs_4c8s8c6s_AsAdJhKd_7dKc3s2h_6h6dKsJc_5d7s9s9d() {
    assertEquals(
      "7dKc3s2h 6h6dKsJc=AsAdJhKd 4c8s8c6s 5d7s9s9d",
      Solver.process("omaha-holdem 5s8h9hQsTs 4c8s8c6s AsAdJhKd 7dKc3s2h 6h6dKsJc 5d7s9s9d"));
  }

  @Test
  public void test_omaha_holdem_2720_2c6c6sJcKs_9h5c6h6d_3s8dQs2h_Tc3c7cJh_2dKcKd9s_Kh3h4d7s() {
    assertEquals(
      "3s8dQs2h Kh3h4d7s Tc3c7cJh 2dKcKd9s 9h5c6h6d",
      Solver.process("omaha-holdem 2c6c6sJcKs 9h5c6h6d 3s8dQs2h Tc3c7cJh 2dKcKd9s Kh3h4d7s"));
  }

  @Test
  public void test_omaha_holdem_2721_7hAdAhQcTc_Td8h4dQh_9c5hJs6h() {
    assertEquals(
      "9c5hJs6h Td8h4dQh",
      Solver.process("omaha-holdem 7hAdAhQcTc Td8h4dQh 9c5hJs6h"));
  }

  @Test
  public void test_omaha_holdem_2722_2h3s4c6d8h_5dTd4d2s_6h5h6sAd_QcKdTsAc_Jd2cKs6c_9dQd7s7d() {
    assertEquals(
      "QcKdTsAc 9dQd7s7d Jd2cKs6c 5dTd4d2s=6h5h6sAd",
      Solver.process("omaha-holdem 2h3s4c6d8h 5dTd4d2s 6h5h6sAd QcKdTsAc Jd2cKs6c 9dQd7s7d"));
  }

  @Test
  public void test_omaha_holdem_2723_4d7c9sKdQc_8c4cTh2h_KsQd3cJs_2s3s5d8s_Qh7d8h3h_2c9hKcQs_3d9d6sTd_As6h7hKh_6dJc5h5s_8d9cAd2d() {
    assertEquals(
      "2s3s5d8s 8c4cTh2h 6dJc5h5s 3d9d6sTd 8d9cAd2d Qh7d8h3h As6h7hKh 2c9hKcQs=KsQd3cJs",
      Solver.process("omaha-holdem 4d7c9sKdQc 8c4cTh2h KsQd3cJs 2s3s5d8s Qh7d8h3h 2c9hKcQs 3d9d6sTd As6h7hKh 6dJc5h5s 8d9cAd2d"));
  }

  @Test
  public void test_omaha_holdem_2724_6s8c9h9sKs_4dQd8hKd_5cAd5d5h_2c4h7dTs_6d8dTdQh_7hJs3c7c_Tc6cJhAs_JdQc8s7s_3d3s2h4s_2d9cQs9d() {
    assertEquals(
      "5cAd5d5h Tc6cJhAs 7hJs3c7c 6d8dTdQh 4dQd8hKd 2c4h7dTs 3d3s2h4s JdQc8s7s 2d9cQs9d",
      Solver.process("omaha-holdem 6s8c9h9sKs 4dQd8hKd 5cAd5d5h 2c4h7dTs 6d8dTdQh 7hJs3c7c Tc6cJhAs JdQc8s7s 3d3s2h4s 2d9cQs9d"));
  }

  @Test
  public void test_omaha_holdem_2725_3s7c9cQcQs_9s8c3d2h_2c4h9dKd_7d8s5s2d_KsKcTc7h_8dQhTs3c_4cQd5dJc_6d6s2s9h_Jd7sAcTh() {
    assertEquals(
      "7d8s5s2d Jd7sAcTh 6d6s2s9h 9s8c3d2h 2c4h9dKd 4cQd5dJc KsKcTc7h 8dQhTs3c",
      Solver.process("omaha-holdem 3s7c9cQcQs 9s8c3d2h 2c4h9dKd 7d8s5s2d KsKcTc7h 8dQhTs3c 4cQd5dJc 6d6s2s9h Jd7sAcTh"));
  }

  @Test
  public void test_omaha_holdem_2726_6s7dAcJcJd_5dKh4hQs_Js8h9s9d() {
    assertEquals(
      "5dKh4hQs Js8h9s9d",
      Solver.process("omaha-holdem 6s7dAcJcJd 5dKh4hQs Js8h9s9d"));
  }

  @Test
  public void test_omaha_holdem_2727_7d7sKdQsTc_9h9d5s7c_5dTs6c7h_6hQc8c6s_8s2sKs5h_QdJsTd3s_Ad4c4s4d_Ac3h5c3d_3cJhTh9s_9cAs8hKh() {
    assertEquals(
      "Ac3h5c3d Ad4c4s4d 6hQc8c6s QdJsTd3s 8s2sKs5h 9cAs8hKh 9h9d5s7c 3cJhTh9s 5dTs6c7h",
      Solver.process("omaha-holdem 7d7sKdQsTc 9h9d5s7c 5dTs6c7h 6hQc8c6s 8s2sKs5h QdJsTd3s Ad4c4s4d Ac3h5c3d 3cJhTh9s 9cAs8hKh"));
  }

  @Test
  public void test_omaha_holdem_2728_5h8c8d9cTs_7c2h6c4s_9sAhJd3c() {
    assertEquals(
      "9sAhJd3c 7c2h6c4s",
      Solver.process("omaha-holdem 5h8c8d9cTs 7c2h6c4s 9sAhJd3c"));
  }

  @Test
  public void test_omaha_holdem_2729_2c3c7d7s8c_3sQc9c6h_AhJh5cKs() {
    assertEquals(
      "AhJh5cKs 3sQc9c6h",
      Solver.process("omaha-holdem 2c3c7d7s8c 3sQc9c6h AhJh5cKs"));
  }

  @Test
  public void test_omaha_holdem_2730_2h5sJhTcTs_AsAh9h3c_4h4s2c3s_ThAdQh8c_Ac4d7d6c_9d7cTd9c_9s8h3d2d_Kd4cQdKh() {
    assertEquals(
      "Ac4d7d6c 9s8h3d2d 4h4s2c3s Kd4cQdKh AsAh9h3c 9d7cTd9c ThAdQh8c",
      Solver.process("omaha-holdem 2h5sJhTcTs AsAh9h3c 4h4s2c3s ThAdQh8c Ac4d7d6c 9d7cTd9c 9s8h3d2d Kd4cQdKh"));
  }

  @Test
  public void test_omaha_holdem_2731_8d9dAcAdKd_4sThKh9c_4d8h9sKs() {
    assertEquals(
      "4d8h9sKs 4sThKh9c",
      Solver.process("omaha-holdem 8d9dAcAdKd 4sThKh9c 4d8h9sKs"));
  }

  @Test
  public void test_omaha_holdem_2732_3h6h7cTcTs_7d4hJhJd_Jc9h9s8c_QdQsAs5c_8sKc8d2c() {
    assertEquals(
      "8sKc8d2c 7d4hJhJd QdQsAs5c Jc9h9s8c",
      Solver.process("omaha-holdem 3h6h7cTcTs 7d4hJhJd Jc9h9s8c QdQsAs5c 8sKc8d2c"));
  }

  @Test
  public void test_omaha_holdem_2733_3h4c8cAdKd_Ah9h6s7s_7c2d2hQs_Jd6c5hTd_9c2c4h3c() {
    assertEquals(
      "Jd6c5hTd 7c2d2hQs Ah9h6s7s 9c2c4h3c",
      Solver.process("omaha-holdem 3h4c8cAdKd Ah9h6s7s 7c2d2hQs Jd6c5hTd 9c2c4h3c"));
  }

  @Test
  public void test_omaha_holdem_2734_3h3s6sKsTh_9sKd2c2s_5s4h7s2h_4d9cKh7d_JdQc4s9h() {
    assertEquals(
      "JdQc4s9h 4d9cKh7d 5s4h7s2h 9sKd2c2s",
      Solver.process("omaha-holdem 3h3s6sKsTh 9sKd2c2s 5s4h7s2h 4d9cKh7d JdQc4s9h"));
  }

  @Test
  public void test_omaha_holdem_2735_6sAcAdJsKd_9h7sAsTh_5h3d3s4s_9cQh3c2d_7hQsQdTc_Td8c2sKc() {
    assertEquals(
      "9cQh3c2d 5h3d3s4s Td8c2sKc 9h7sAsTh 7hQsQdTc",
      Solver.process("omaha-holdem 6sAcAdJsKd 9h7sAsTh 5h3d3s4s 9cQh3c2d 7hQsQdTc Td8c2sKc"));
  }

  @Test
  public void test_omaha_holdem_2736_2c5s9sKdTc_4hQh5d3h_3c7cTh6s_Jd2h6h4s_9h4cTs9d_Qd8s7s8c() {
    assertEquals(
      "Jd2h6h4s 4hQh5d3h Qd8s7s8c 3c7cTh6s 9h4cTs9d",
      Solver.process("omaha-holdem 2c5s9sKdTc 4hQh5d3h 3c7cTh6s Jd2h6h4s 9h4cTs9d Qd8s7s8c"));
  }

  @Test
  public void test_omaha_holdem_2737_2s3h6s9sAd_ThTs6h5h_4h2cKd7c_Ah6c5d8c_Js4sQcJh_4dJd9c7h_KsQs2h2d_3d8hQh8d_7d3sAcTd_TcJc5c9d() {
    assertEquals(
      "4h2cKd7c 3d8hQh8d 4dJd9c7h=TcJc5c9d ThTs6h5h 7d3sAcTd Ah6c5d8c Js4sQcJh KsQs2h2d",
      Solver.process("omaha-holdem 2s3h6s9sAd ThTs6h5h 4h2cKd7c Ah6c5d8c Js4sQcJh 4dJd9c7h KsQs2h2d 3d8hQh8d 7d3sAcTd TcJc5c9d"));
  }

  @Test
  public void test_omaha_holdem_2738_6d7s8c9cTd_2c8d5cQh_KhAc4dAd_7d3c7c3h_4sKdThAs_5dJh2s9s_Jd6h8sKs_QdKc2d5s() {
    assertEquals(
      "QdKc2d5s 4sKdThAs KhAc4dAd 7d3c7c3h 2c8d5cQh 5dJh2s9s=Jd6h8sKs",
      Solver.process("omaha-holdem 6d7s8c9cTd 2c8d5cQh KhAc4dAd 7d3c7c3h 4sKdThAs 5dJh2s9s Jd6h8sKs QdKc2d5s"));
  }

  @Test
  public void test_omaha_holdem_2739_2d3s9dKdKh_9sAc8sQc_2cKsTdQd_8cAdTh2h_Ts7dQh5s_5dJd9c4c_8hQs6d3h_4s4d9h7h_JcAsAh4h() {
    assertEquals(
      "Ts7dQh5s 8cAdTh2h 8hQs6d3h 4s4d9h7h 9sAc8sQc JcAsAh4h 5dJd9c4c 2cKsTdQd",
      Solver.process("omaha-holdem 2d3s9dKdKh 9sAc8sQc 2cKsTdQd 8cAdTh2h Ts7dQh5s 5dJd9c4c 8hQs6d3h 4s4d9h7h JcAsAh4h"));
  }

  @Test
  public void test_omaha_holdem_2740_6d6hAcJdQh_5sJs4dQs_9c7c7sTd_2sTs2h8c_Ad6c3cAs_4s4h2cQd() {
    assertEquals(
      "2sTs2h8c 9c7c7sTd 4s4h2cQd 5sJs4dQs Ad6c3cAs",
      Solver.process("omaha-holdem 6d6hAcJdQh 5sJs4dQs 9c7c7sTd 2sTs2h8c Ad6c3cAs 4s4h2cQd"));
  }

  @Test
  public void test_omaha_holdem_2741_3d5s8hAcQs_4c2c2dJs_7sKd3h3c_6d5d4dTh_QcJcQh5h_JdTd9hKc_Qd5c6s7d() {
    assertEquals(
      "JdTd9hKc 6d5d4dTh Qd5c6s7d 7sKd3h3c QcJcQh5h 4c2c2dJs",
      Solver.process("omaha-holdem 3d5s8hAcQs 4c2c2dJs 7sKd3h3c 6d5d4dTh QcJcQh5h JdTd9hKc Qd5c6s7d"));
  }

  @Test
  public void test_omaha_holdem_2742_5d7c7dAhQh_Kh5sAsQs_6h4d4h6d_Ks2d8cJd_6c3sQc9c_8d4s3dAc_7h8hJsQd() {
    assertEquals(
      "Ks2d8cJd 6h4d4h6d 6c3sQc9c 8d4s3dAc Kh5sAsQs 7h8hJsQd",
      Solver.process("omaha-holdem 5d7c7dAhQh Kh5sAsQs 6h4d4h6d Ks2d8cJd 6c3sQc9c 8d4s3dAc 7h8hJsQd"));
  }

  @Test
  public void test_omaha_holdem_2743_2s4cAdJdKs_3d8d8sJh_4s9c6s4d_3cAcQcQs_Qh7h2dTc_Qd2h7d6d_5hAh9d5d() {
    assertEquals(
      "Qd2h7d6d 3d8d8sJh 5hAh9d5d 3cAcQcQs 4s9c6s4d Qh7h2dTc",
      Solver.process("omaha-holdem 2s4cAdJdKs 3d8d8sJh 4s9c6s4d 3cAcQcQs Qh7h2dTc Qd2h7d6d 5hAh9d5d"));
  }

  @Test
  public void test_omaha_holdem_2744_4h5c6s7h9d_5d3dTc2d_8c9cAhAc_KsThQs4c() {
    assertEquals(
      "KsThQs4c 5d3dTc2d 8c9cAhAc",
      Solver.process("omaha-holdem 4h5c6s7h9d 5d3dTc2d 8c9cAhAc KsThQs4c"));
  }

  @Test
  public void test_omaha_holdem_2745_5d8s9cAcTd_Ks6cQhTc_9s4s4hAs_8dAd2s3s_7sTs7c3c_2dQc2c5h_Jd9dQdJs_Jc6hTh3d_QsKd6sJh() {
    assertEquals(
      "2dQc2c5h 7sTs7c3c Jc6hTh3d Ks6cQhTc 8dAd2s3s 9s4s4hAs Jd9dQdJs=QsKd6sJh",
      Solver.process("omaha-holdem 5d8s9cAcTd Ks6cQhTc 9s4s4hAs 8dAd2s3s 7sTs7c3c 2dQc2c5h Jd9dQdJs Jc6hTh3d QsKd6sJh"));
  }

  @Test
  public void test_omaha_holdem_2746_7cAcJsQhTc_AdAhQc4c_QdQs9h8s_Jh8d9sKd_Th5c4d8c_9d3c7sTs_AsKc2h6c_Kh7d3dJc() {
    assertEquals(
      "9d3c7sTs QdQs9h8s Jh8d9sKd=Kh7d3dJc Th5c4d8c AdAhQc4c AsKc2h6c",
      Solver.process("omaha-holdem 7cAcJsQhTc AdAhQc4c QdQs9h8s Jh8d9sKd Th5c4d8c 9d3c7sTs AsKc2h6c Kh7d3dJc"));
  }

  @Test
  public void test_omaha_holdem_2747_4d5c5s6dKh_Td6hTcJs_Kd7s8cAd_Kc3d4h6s_QcAh9sJd() {
    assertEquals(
      "QcAh9sJd Td6hTcJs Kc3d4h6s Kd7s8cAd",
      Solver.process("omaha-holdem 4d5c5s6dKh Td6hTcJs Kd7s8cAd Kc3d4h6s QcAh9sJd"));
  }

  @Test
  public void test_omaha_holdem_2748_2d5d6c7c9d_Ks7d6dAh_4c5hAd3s_Jd9s5s4h_3hKcAcJc_AsTsKhJs_Qc7s9h5c_9c8cKd8d_6hTc8hTh_3dJh2cQh() {
    assertEquals(
      "3hKcAcJc=AsTsKhJs 3dJh2cQh Jd9s5s4h Qc7s9h5c 4c5hAd3s 6hTc8hTh Ks7d6dAh 9c8cKd8d",
      Solver.process("omaha-holdem 2d5d6c7c9d Ks7d6dAh 4c5hAd3s Jd9s5s4h 3hKcAcJc AsTsKhJs Qc7s9h5c 9c8cKd8d 6hTc8hTh 3dJh2cQh"));
  }

  @Test
  public void test_omaha_holdem_2749_6d6s7sKsTd_8c5c7hQd_4h5dJc4s_2c6h2d9h_2s4d8h8d_9cAcKdAs_KcThTs3c_7dJs8sJh_TcQc7c9s() {
    assertEquals(
      "4h5dJc4s 8c5c7hQd 2s4d8h8d TcQc7c9s 9cAcKdAs 2c6h2d9h 7dJs8sJh KcThTs3c",
      Solver.process("omaha-holdem 6d6s7sKsTd 8c5c7hQd 4h5dJc4s 2c6h2d9h 2s4d8h8d 9cAcKdAs KcThTs3c 7dJs8sJh TcQc7c9s"));
  }

}
