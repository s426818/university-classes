
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver10HiddenTest {


  @Test
  public void test_texas_holdem_2500_2d4c6s8cQh_Tc5c_JcTs_3d5h() {
    assertEquals(
      "Tc5c JcTs 3d5h",
      Solver.process("texas-holdem 2d4c6s8cQh Tc5c JcTs 3d5h"));
  }

  @Test
  public void test_texas_holdem_2501_4d7cAsJdKs_3d7h_6sTh_2h2d_7d2s_Qd5h_QsTd() {
    assertEquals(
      "6sTh Qd5h 2h2d 3d7h=7d2s QsTd",
      Solver.process("texas-holdem 4d7cAsJdKs 3d7h 6sTh 2h2d 7d2s Qd5h QsTd"));
  }

  @Test
  public void test_texas_holdem_2502_2h7c9sKsTs_6d7d_9c9h_5c6c() {
    assertEquals(
      "5c6c 6d7d 9c9h",
      Solver.process("texas-holdem 2h7c9sKsTs 6d7d 9c9h 5c6c"));
  }

  @Test
  public void test_texas_holdem_2503_2d4hAcAhTc_2hQc_Jd5h() {
    assertEquals(
      "Jd5h 2hQc",
      Solver.process("texas-holdem 2d4hAcAhTc 2hQc Jd5h"));
  }

  @Test
  public void test_texas_holdem_2504_5c7dAsQdTh_2h2c_7sTc_Jd9c() {
    assertEquals(
      "Jd9c 2h2c 7sTc",
      Solver.process("texas-holdem 5c7dAsQdTh 2h2c 7sTc Jd9c"));
  }

  @Test
  public void test_texas_holdem_2505_6c7c8s9hJh_Kh3h_6s5h_Ad2c() {
    assertEquals(
      "Kh3h Ad2c 6s5h",
      Solver.process("texas-holdem 6c7c8s9hJh Kh3h 6s5h Ad2c"));
  }

  @Test
  public void test_texas_holdem_2506_3h5h6d7dKd_8c9h_Jh2c_6c2h() {
    assertEquals(
      "Jh2c 6c2h 8c9h",
      Solver.process("texas-holdem 3h5h6d7dKd 8c9h Jh2c 6c2h"));
  }

  @Test
  public void test_texas_holdem_2507_3d6s9dKhQc_3sAs_7hAc_2c4d_Kd9c_Ah5d_3c2s_9sQd_6hKc_8cTh() {
    assertEquals(
      "2c4d 8cTh Ah5d 7hAc 3c2s 3sAs 9sQd 6hKc Kd9c",
      Solver.process("texas-holdem 3d6s9dKhQc 3sAs 7hAc 2c4d Kd9c Ah5d 3c2s 9sQd 6hKc 8cTh"));
  }

  @Test
  public void test_texas_holdem_2508_7c8dJdTcTs_9d4d_9sQs_3dJh() {
    assertEquals(
      "3dJh 9d4d 9sQs",
      Solver.process("texas-holdem 7c8dJdTcTs 9d4d 9sQs 3dJh"));
  }

  @Test
  public void test_texas_holdem_2509_3c5h8s9cTd_6c4c_Js5s_7c8d_Th9s_Ah9d_6d4s_Jh2s_3sKs_KhQc() {
    assertEquals(
      "6c4c=6d4s Jh2s KhQc 3sKs Js5s 7c8d Ah9d Th9s",
      Solver.process("texas-holdem 3c5h8s9cTd 6c4c Js5s 7c8d Th9s Ah9d 6d4s Jh2s 3sKs KhQc"));
  }

  @Test
  public void test_texas_holdem_2510_2s4d8c9dAs_Jh7h_Tc8d_QsTd_3hKd_Qh9s_AhKc_Jc3c_KsJs() {
    assertEquals(
      "Jc3c Jh7h QsTd 3hKd KsJs Tc8d Qh9s AhKc",
      Solver.process("texas-holdem 2s4d8c9dAs Jh7h Tc8d QsTd 3hKd Qh9s AhKc Jc3c KsJs"));
  }

  @Test
  public void test_texas_holdem_2511_3c5c6h9dAc_8c9h_Qc4h_5s3h_QhJd_8sJc_2s6c_8dAd_2dQs() {
    assertEquals(
      "8sJc 2dQs=Qc4h QhJd 2s6c 8c9h 8dAd 5s3h",
      Solver.process("texas-holdem 3c5c6h9dAc 8c9h Qc4h 5s3h QhJd 8sJc 2s6c 8dAd 2dQs"));
  }

  @Test
  public void test_texas_holdem_2512_4d6sAsJhKs_Tc5c_5sTh_2h4s_3h2d_9hKc() {
    assertEquals(
      "3h2d 5sTh=Tc5c 2h4s 9hKc",
      Solver.process("texas-holdem 4d6sAsJhKs Tc5c 5sTh 2h4s 3h2d 9hKc"));
  }

  @Test
  public void test_texas_holdem_2513_2s6c7c8s9d_AdAs_9hAc_5c8d_4d8h_3sKd_5hKc_Js2d() {
    assertEquals(
      "3sKd Js2d 4d8h 9hAc AdAs 5c8d=5hKc",
      Solver.process("texas-holdem 2s6c7c8s9d AdAs 9hAc 5c8d 4d8h 3sKd 5hKc Js2d"));
  }

  @Test
  public void test_texas_holdem_2514_AdJdKsTcTd_Qs7s_7hAc_7c8h_5dQc() {
    assertEquals(
      "7c8h 7hAc 5dQc=Qs7s",
      Solver.process("texas-holdem AdJdKsTcTd Qs7s 7hAc 7c8h 5dQc"));
  }

  @Test
  public void test_texas_holdem_2515_3h7dAhJhTs_Kd6d_Jd8h_4d2c_KcTc_4s2h_3dKs_5h7h() {
    assertEquals(
      "4d2c=4s2h Kd6d 3dKs KcTc Jd8h 5h7h",
      Solver.process("texas-holdem 3h7dAhJhTs Kd6d Jd8h 4d2c KcTc 4s2h 3dKs 5h7h"));
  }

  @Test
  public void test_texas_holdem_2516_2h8h9hTcTd_KcQs_7sKh_KdTh_5cKs_2d7c_JsJd_3h4d() {
    assertEquals(
      "3h4d 5cKs=7sKh KcQs 2d7c JsJd KdTh",
      Solver.process("texas-holdem 2h8h9hTcTd KcQs 7sKh KdTh 5cKs 2d7c JsJd 3h4d"));
  }

  @Test
  public void test_texas_holdem_2517_4c4d4s6d8c_Tc4h_As3d_2cKd_KcQd_Ks7c() {
    assertEquals(
      "2cKd=Ks7c KcQd As3d Tc4h",
      Solver.process("texas-holdem 4c4d4s6d8c Tc4h As3d 2cKd KcQd Ks7c"));
  }

  @Test
  public void test_texas_holdem_2518_2h4d8s9dAc_8c3c_3d6c_Jd8d_Qh6s_KsTh_2c4s_Jh3h_3s6h() {
    assertEquals(
      "3d6c=3s6h Jh3h Qh6s KsTh 8c3c Jd8d 2c4s",
      Solver.process("texas-holdem 2h4d8s9dAc 8c3c 3d6c Jd8d Qh6s KsTh 2c4s Jh3h 3s6h"));
  }

  @Test
  public void test_texas_holdem_2519_3d3h5cJdTc_As7c_QcQs_Td6c_Jc2s_6h5s_TsKh_2h2d_7d4h() {
    assertEquals(
      "7d4h As7c 2h2d 6h5s Td6c TsKh Jc2s QcQs",
      Solver.process("texas-holdem 3d3h5cJdTc As7c QcQs Td6c Jc2s 6h5s TsKh 2h2d 7d4h"));
  }

  @Test
  public void test_texas_holdem_2520_3d3s4cAdJc_AcQc_5cTh_7s5h_7d2c_8dJd_Js6s_9d9s_Td2s() {
    assertEquals(
      "7d2c=7s5h 5cTh=Td2s 9d9s 8dJd=Js6s AcQc",
      Solver.process("texas-holdem 3d3s4cAdJc AcQc 5cTh 7s5h 7d2c 8dJd Js6s 9d9s Td2s"));
  }

  @Test
  public void test_texas_holdem_2521_2c4c7s9sQd_Tc8s_4h6d_8d9d_7hTh_4s3h_7cJs_Qh2d_5d6h() {
    assertEquals(
      "5d6h Tc8s 4h6d=4s3h 7hTh 7cJs 8d9d Qh2d",
      Solver.process("texas-holdem 2c4c7s9sQd Tc8s 4h6d 8d9d 7hTh 4s3h 7cJs Qh2d 5d6h"));
  }

  @Test
  public void test_texas_holdem_2522_2s6hAsKdKs_4sTd_TsTc_3d7h_JcQd() {
    assertEquals(
      "3d7h 4sTd JcQd TsTc",
      Solver.process("texas-holdem 2s6hAsKdKs 4sTd TsTc 3d7h JcQd"));
  }

  @Test
  public void test_texas_holdem_2523_4h7hAdJdTc_Ah5h_4dKh_8hKc_8d2d_7dJs_9s4c_2c9d_7sTd_Jh3h() {
    assertEquals(
      "8d2d 2c9d 8hKc 9s4c 4dKh Jh3h Ah5h 7sTd 7dJs",
      Solver.process("texas-holdem 4h7hAdJdTc Ah5h 4dKh 8hKc 8d2d 7dJs 9s4c 2c9d 7sTd Jh3h"));
  }

  @Test
  public void test_texas_holdem_2524_8d8s9hQhTh_3h3c_3dJs() {
    assertEquals(
      "3h3c 3dJs",
      Solver.process("texas-holdem 8d8s9hQhTh 3h3c 3dJs"));
  }

  @Test
  public void test_texas_holdem_2525_8c9h9sAcKs_Ah6d_2h4d_3dQh_7cQc_3h5d() {
    assertEquals(
      "2h4d=3h5d 3dQh=7cQc Ah6d",
      Solver.process("texas-holdem 8c9h9sAcKs Ah6d 2h4d 3dQh 7cQc 3h5d"));
  }

  @Test
  public void test_texas_holdem_2526_2h7dJhJsKh_Kc7h_5hQc_4dQd_7cAc_7sKd_4sTs_6dQs_2s6s() {
    assertEquals(
      "4sTs 4dQd=5hQc=6dQs 2s6s 7cAc 7sKd=Kc7h",
      Solver.process("texas-holdem 2h7dJhJsKh Kc7h 5hQc 4dQd 7cAc 7sKd 4sTs 6dQs 2s6s"));
  }

  @Test
  public void test_texas_holdem_2527_4hJcJdQdTs_9h9c_Ad7d_8c4c_6dJh_4s8h_3dJs_7cAc_6sAh() {
    assertEquals(
      "6sAh=7cAc=Ad7d 4s8h=8c4c 9h9c 3dJs=6dJh",
      Solver.process("texas-holdem 4hJcJdQdTs 9h9c Ad7d 8c4c 6dJh 4s8h 3dJs 7cAc 6sAh"));
  }

  @Test
  public void test_texas_holdem_2528_3s4s5hJcTc_6c6s_3d2s_9c7c_Qc8h_7sKc_Qs8s_2c5s_2d7h_KhAs() {
    assertEquals(
      "2d7h 9c7c Qc8h=Qs8s 7sKc KhAs 3d2s 2c5s 6c6s",
      Solver.process("texas-holdem 3s4s5hJcTc 6c6s 3d2s 9c7c Qc8h 7sKc Qs8s 2c5s 2d7h KhAs"));
  }

  @Test
  public void test_texas_holdem_2529_4s6cQhQsTc_7c5s_4hKh() {
    assertEquals(
      "7c5s 4hKh",
      Solver.process("texas-holdem 4s6cQhQsTc 7c5s 4hKh"));
  }

  @Test
  public void test_texas_holdem_2530_4s8s9d9hAc_6c7c_3sJh_Tc2s_5dAs() {
    assertEquals(
      "6c7c Tc2s 3sJh 5dAs",
      Solver.process("texas-holdem 4s8s9d9hAc 6c7c 3sJh Tc2s 5dAs"));
  }

  @Test
  public void test_texas_holdem_2531_6c8c8dQsTd_JdQh_2c7c() {
    assertEquals(
      "2c7c JdQh",
      Solver.process("texas-holdem 6c8c8dQsTd JdQh 2c7c"));
  }

  @Test
  public void test_texas_holdem_2532_2h3c4sKcQh_9h8s_5h2s_AsAc_8d4d_2cJh() {
    assertEquals(
      "9h8s 5h2s 2cJh 8d4d AsAc",
      Solver.process("texas-holdem 2h3c4sKcQh 9h8s 5h2s AsAc 8d4d 2cJh"));
  }

  @Test
  public void test_texas_holdem_2533_7c8cKdQhQs_3s7s_KcTc_5sQc_9h9c_Js3h_TsAd_5d8h_JdAh_2h5c() {
    assertEquals(
      "2h5c Js3h TsAd JdAh 3s7s 5d8h 9h9c KcTc 5sQc",
      Solver.process("texas-holdem 7c8cKdQhQs 3s7s KcTc 5sQc 9h9c Js3h TsAd 5d8h JdAh 2h5c"));
  }

  @Test
  public void test_texas_holdem_2534_6s8dAdQcTs_3cJh_7s3d_6c2h_8c3s_8h9h_Jc6d() {
    assertEquals(
      "7s3d 3cJh 6c2h Jc6d 8c3s=8h9h",
      Solver.process("texas-holdem 6s8dAdQcTs 3cJh 7s3d 6c2h 8c3s 8h9h Jc6d"));
  }

  @Test
  public void test_texas_holdem_2535_3c7h8d9cTs_8cJd_4h6c_7dJc_9d5s_2sKd() {
    assertEquals(
      "2sKd 9d5s 4h6c 7dJc=8cJd",
      Solver.process("texas-holdem 3c7h8d9cTs 8cJd 4h6c 7dJc 9d5s 2sKd"));
  }

  @Test
  public void test_texas_holdem_2536_6c8s9dAhJs_Td2c_Ks4s_Ts6d() {
    assertEquals(
      "Td2c Ks4s Ts6d",
      Solver.process("texas-holdem 6c8s9dAhJs Td2c Ks4s Ts6d"));
  }

  @Test
  public void test_texas_holdem_2537_3c6s8dAdQh_4s8h_4h9d_7d7s_5d7c() {
    assertEquals(
      "5d7c 4h9d 7d7s 4s8h",
      Solver.process("texas-holdem 3c6s8dAdQh 4s8h 4h9d 7d7s 5d7c"));
  }

  @Test
  public void test_texas_holdem_2538_2c5d6d9sTc_TsAd_AhJh_3dQh_Js9c_4hKh() {
    assertEquals(
      "3dQh 4hKh AhJh Js9c TsAd",
      Solver.process("texas-holdem 2c5d6d9sTc TsAd AhJh 3dQh Js9c 4hKh"));
  }

  @Test
  public void test_texas_holdem_2539_2c5h6hKdTd_3d7c_2hQc() {
    assertEquals(
      "3d7c 2hQc",
      Solver.process("texas-holdem 2c5h6hKdTd 3d7c 2hQc"));
  }

  @Test
  public void test_texas_holdem_2540_5dAhKhTcTs_7s7h_7d8s_Qs8c_Jh9h_6hQc() {
    assertEquals(
      "7d8s Jh9h 6hQc=Qs8c 7s7h",
      Solver.process("texas-holdem 5dAhKhTcTs 7s7h 7d8s Qs8c Jh9h 6hQc"));
  }

  @Test
  public void test_texas_holdem_2541_3c3sJsKcKd_6s4s_8hAc_5c5d_2s9c_Tc5h_6h7s_7h2d_7c6c_ThAh() {
    assertEquals(
      "2s9c=6h7s=6s4s=7c6c=7h2d=Tc5h 8hAc=ThAh 5c5d",
      Solver.process("texas-holdem 3c3sJsKcKd 6s4s 8hAc 5c5d 2s9c Tc5h 6h7s 7h2d 7c6c ThAh"));
  }

  @Test
  public void test_texas_holdem_2542_4cAdJdQdQs_4h5s_5d7d_KhTs_5h8c_2dQc() {
    assertEquals(
      "5h8c 4h5s 2dQc KhTs 5d7d",
      Solver.process("texas-holdem 4cAdJdQdQs 4h5s 5d7d KhTs 5h8c 2dQc"));
  }

  @Test
  public void test_texas_holdem_2543_7cJcJsKdKs_4sQc_Ad9h_KhJd_Ac5s_9d9s_4c3s() {
    assertEquals(
      "4c3s 9d9s 4sQc Ac5s=Ad9h KhJd",
      Solver.process("texas-holdem 7cJcJsKdKs 4sQc Ad9h KhJd Ac5s 9d9s 4c3s"));
  }

  @Test
  public void test_texas_holdem_2544_2d6d8c8hQh_7d9h_4d5d_4hAh_4s2h_AdJd_3cKd_6cKs() {
    assertEquals(
      "4d5d 7d9h 3cKd 4hAh AdJd 4s2h 6cKs",
      Solver.process("texas-holdem 2d6d8c8hQh 7d9h 4d5d 4hAh 4s2h AdJd 3cKd 6cKs"));
  }

  @Test
  public void test_texas_holdem_2545_6d6s7d8sTd_9hTh_5cJc_Kd5d_KhKc_9d2h_As4h_3sQs_2d2s() {
    assertEquals(
      "5cJc 3sQs As4h 2d2s KhKc 9d2h=9hTh Kd5d",
      Solver.process("texas-holdem 6d6s7d8sTd 9hTh 5cJc Kd5d KhKc 9d2h As4h 3sQs 2d2s"));
  }

  @Test
  public void test_texas_holdem_2546_4c6c8s9d9h_4hAd_Jh6s_7d7s() {
    assertEquals(
      "4hAd Jh6s 7d7s",
      Solver.process("texas-holdem 4c6c8s9d9h 4hAd Jh6s 7d7s"));
  }

  @Test
  public void test_texas_holdem_2547_3s4d8d8sJd_AhKc_Ts7c_Jh9h_2d9s_6dQc_Qd3h_AdTd_Tc3d() {
    assertEquals(
      "2d9s Ts7c 6dQc AhKc Tc3d Qd3h Jh9h AdTd",
      Solver.process("texas-holdem 3s4d8d8sJd AhKc Ts7c Jh9h 2d9s 6dQc Qd3h AdTd Tc3d"));
  }

  @Test
  public void test_texas_holdem_2548_6d9hAsJcKh_3s4s_7cQc_6h9s_4d2c_3h2s_7hKs() {
    assertEquals(
      "3h2s=3s4s=4d2c 7cQc 7hKs 6h9s",
      Solver.process("texas-holdem 6d9hAsJcKh 3s4s 7cQc 6h9s 4d2c 3h2s 7hKs"));
  }

  @Test
  public void test_texas_holdem_2549_7d7h9hAdTc_4cJs_Ts5s_3c2s_Kh8s_Jh9s_5cKd_AhAc() {
    assertEquals(
      "3c2s 4cJs 5cKd=Kh8s Jh9s Ts5s AhAc",
      Solver.process("texas-holdem 7d7h9hAdTc 4cJs Ts5s 3c2s Kh8s Jh9s 5cKd AhAc"));
  }

  @Test
  public void test_texas_holdem_2550_3d7dAhJdQd_8d2c_Qc3c_4sKd_Kh7s() {
    assertEquals(
      "Kh7s Qc3c 8d2c 4sKd",
      Solver.process("texas-holdem 3d7dAhJdQd 8d2c Qc3c 4sKd Kh7s"));
  }

  @Test
  public void test_texas_holdem_2551_2d4d5s6cTc_3s8c_5cQd_7h7d_Td9s_3d4s_Th7c_3hJh_Ad9h_3c8h() {
    assertEquals(
      "Ad9h 5cQd 7h7d Th7c Td9s 3c8h=3d4s=3hJh=3s8c",
      Solver.process("texas-holdem 2d4d5s6cTc 3s8c 5cQd 7h7d Td9s 3d4s Th7c 3hJh Ad9h 3c8h"));
  }

  @Test
  public void test_texas_holdem_2552_2c6s7c8hAc_9dKc_4d5c_Js7h_Kh9s_3c3d_9cJc_3s8d_2dQh_4hQd() {
    assertEquals(
      "4hQd 9dKc=Kh9s 2dQh 3c3d Js7h 3s8d 4d5c 9cJc",
      Solver.process("texas-holdem 2c6s7c8hAc 9dKc 4d5c Js7h Kh9s 3c3d 9cJc 3s8d 2dQh 4hQd"));
  }

  @Test
  public void test_texas_holdem_2553_2s4h6h8sJc_8dQh_9hJh_7s2h_4s7d_Jd2c_Ac3c() {
    assertEquals(
      "Ac3c 7s2h 4s7d 8dQh 9hJh Jd2c",
      Solver.process("texas-holdem 2s4h6h8sJc 8dQh 9hJh 7s2h 4s7d Jd2c Ac3c"));
  }

  @Test
  public void test_texas_holdem_2554_2s6h7h7sTd_9cQc_4c5d_4d3s_Jd3d_Ac4s_5h5c_QdKs() {
    assertEquals(
      "4d3s 4c5d Jd3d 9cQc QdKs Ac4s 5h5c",
      Solver.process("texas-holdem 2s6h7h7sTd 9cQc 4c5d 4d3s Jd3d Ac4s 5h5c QdKs"));
  }

  @Test
  public void test_texas_holdem_2555_3d8sAdJdQc_5c7c_Kd7s_8d4h() {
    assertEquals(
      "5c7c Kd7s 8d4h",
      Solver.process("texas-holdem 3d8sAdJdQc 5c7c Kd7s 8d4h"));
  }

  @Test
  public void test_texas_holdem_2556_4c5d8h8sQc_Tc6d_4hQh_Ac5c_Ah8c() {
    assertEquals(
      "Tc6d Ac5c 4hQh Ah8c",
      Solver.process("texas-holdem 4c5d8h8sQc Tc6d 4hQh Ac5c Ah8c"));
  }

  @Test
  public void test_texas_holdem_2557_3d3s5h9d9h_2dJc_2s8c_7s4d_Ah7c() {
    assertEquals(
      "7s4d 2s8c 2dJc Ah7c",
      Solver.process("texas-holdem 3d3s5h9d9h 2dJc 2s8c 7s4d Ah7c"));
  }

  @Test
  public void test_texas_holdem_2558_6h7d8cAcQd_3cAh_Js2d_As4h_KhJh_6d5c_2sQs_JdQc_6c5s_5d6s() {
    assertEquals(
      "Js2d KhJh 5d6s=6c5s=6d5c 2sQs JdQc 3cAh=As4h",
      Solver.process("texas-holdem 6h7d8cAcQd 3cAh Js2d As4h KhJh 6d5c 2sQs JdQc 6c5s 5d6s"));
  }

  @Test
  public void test_texas_holdem_2559_4s5s8dQcQs_9cKd_3hKs_As8c_9h5h_3cTc_2cAh_6c5c() {
    assertEquals(
      "3cTc 3hKs 9cKd 2cAh 6c5c 9h5h As8c",
      Solver.process("texas-holdem 4s5s8dQcQs 9cKd 3hKs As8c 9h5h 3cTc 2cAh 6c5c"));
  }

  @Test
  public void test_texas_holdem_2560_2c5d5s8hKc_3s2d_AsJh_9cQd_8s7d_6dTs() {
    assertEquals(
      "6dTs 9cQd AsJh 3s2d 8s7d",
      Solver.process("texas-holdem 2c5d5s8hKc 3s2d AsJh 9cQd 8s7d 6dTs"));
  }

  @Test
  public void test_texas_holdem_2561_4c4s6d7h9s_TcJh_4h9d_8hJd_5sAs_5cKd_5dAc_3s9h_KcQh() {
    assertEquals(
      "8hJd TcJh 5cKd KcQh 5dAc=5sAs 3s9h 4h9d",
      Solver.process("texas-holdem 4c4s6d7h9s TcJh 4h9d 8hJd 5sAs 5cKd 5dAc 3s9h KcQh"));
  }

  @Test
  public void test_texas_holdem_2562_4c6h7dJcQh_9h8s_Kd4d_8hTd_5c3s_5hAc_6dJs() {
    assertEquals(
      "9h8s 8hTd 5hAc Kd4d 6dJs 5c3s",
      Solver.process("texas-holdem 4c6h7dJcQh 9h8s Kd4d 8hTd 5c3s 5hAc 6dJs"));
  }

  @Test
  public void test_texas_holdem_2563_2d6h7hAsJc_7s5s_6c4c_8cKs_9hJh_6s4h_AhQc_ThAc_Kh7c_3cQh() {
    assertEquals(
      "3cQh 8cKs 6c4c=6s4h 7s5s Kh7c 9hJh ThAc AhQc",
      Solver.process("texas-holdem 2d6h7hAsJc 7s5s 6c4c 8cKs 9hJh 6s4h AhQc ThAc Kh7c 3cQh"));
  }

  @Test
  public void test_texas_holdem_2564_3h5h7h7sQs_Jc9s_3c6s_AhQh_8d2c_TcJs_5cQc() {
    assertEquals(
      "8d2c Jc9s TcJs 3c6s 5cQc AhQh",
      Solver.process("texas-holdem 3h5h7h7sQs Jc9s 3c6s AhQh 8d2c TcJs 5cQc"));
  }

  @Test
  public void test_texas_holdem_2565_4c5h6cAdKc_Jd7c_3s7s_TdQs_Tc3c_3hTh() {
    assertEquals(
      "3hTh Jd7c TdQs 3s7s Tc3c",
      Solver.process("texas-holdem 4c5h6cAdKc Jd7c 3s7s TdQs Tc3c 3hTh"));
  }

  @Test
  public void test_texas_holdem_2566_6cKdQsTcTd_JsAs_AdAc_8h9s_ThJd_Kc3h_4s9d_5c7c_Qc8s() {
    assertEquals(
      "5c7c 4s9d=8h9s Qc8s Kc3h AdAc ThJd JsAs",
      Solver.process("texas-holdem 6cKdQsTcTd JsAs AdAc 8h9s ThJd Kc3h 4s9d 5c7c Qc8s"));
  }

  @Test
  public void test_texas_holdem_2567_3s6h9hJsKc_5s7c_5d7s_Ah4c_8c7h_5h6c() {
    assertEquals(
      "5d7s=5s7c 8c7h Ah4c 5h6c",
      Solver.process("texas-holdem 3s6h9hJsKc 5s7c 5d7s Ah4c 8c7h 5h6c"));
  }

  @Test
  public void test_texas_holdem_2568_3d4h6d8dJc_TcQc_Js7h_Kd6s_5dKc() {
    assertEquals(
      "TcQc 5dKc Kd6s Js7h",
      Solver.process("texas-holdem 3d4h6d8dJc TcQc Js7h Kd6s 5dKc"));
  }

  @Test
  public void test_texas_holdem_2569_2d2h9sAdQd_4h5d_9hAc_Qh3d_9dQc_6h8c_7sTs_4d6d_3c4c_As8s() {
    assertEquals(
      "3c4c=4h5d=6h8c 7sTs Qh3d 9dQc As8s 9hAc 4d6d",
      Solver.process("texas-holdem 2d2h9sAdQd 4h5d 9hAc Qh3d 9dQc 6h8c 7sTs 4d6d 3c4c As8s"));
  }

  @Test
  public void test_texas_holdem_2570_4c5s8dAcJs_8s8h_Ks4h_9d5h_3dQd_KhAd_6h3c_5d7d_Kd8c() {
    assertEquals(
      "6h3c 3dQd Ks4h 5d7d 9d5h Kd8c KhAd 8s8h",
      Solver.process("texas-holdem 4c5s8dAcJs 8s8h Ks4h 9d5h 3dQd KhAd 6h3c 5d7d Kd8c"));
  }

  @Test
  public void test_texas_holdem_2571_5d9hAdJcKd_Ts3c_5c4s_2h7c_Kc2d() {
    assertEquals(
      "2h7c Ts3c 5c4s Kc2d",
      Solver.process("texas-holdem 5d9hAdJcKd Ts3c 5c4s 2h7c Kc2d"));
  }

  @Test
  public void test_texas_holdem_2572_4d4h9dJsTs_8dAh_5d2c_Ad2s_8c6h_3h8s_TdQc_6cKh() {
    assertEquals(
      "3h8s=5d2c=8c6h 6cKh 8dAh=Ad2s TdQc",
      Solver.process("texas-holdem 4d4h9dJsTs 8dAh 5d2c Ad2s 8c6h 3h8s TdQc 6cKh"));
  }

  @Test
  public void test_texas_holdem_2573_2s3h5cKdKh_Js6c_3sJc_4c8c_JdJh_Td6d_Ah9d_8hAs_Tc9h_7s7c() {
    assertEquals(
      "4c8c Td6d Tc9h Js6c 8hAs Ah9d 3sJc 7s7c JdJh",
      Solver.process("texas-holdem 2s3h5cKdKh Js6c 3sJc 4c8c JdJh Td6d Ah9d 8hAs Tc9h 7s7c"));
  }

  @Test
  public void test_texas_holdem_2574_4c7sAdJdJs_4s6c_Th5h_6dQs_3d5d_2s3c() {
    assertEquals(
      "2s3c 3d5d Th5h 6dQs 4s6c",
      Solver.process("texas-holdem 4c7sAdJdJs 4s6c Th5h 6dQs 3d5d 2s3c"));
  }

  @Test
  public void test_texas_holdem_2575_2d9hJdQhTd_6h3d_QdAh_6cTs_8c5c_2h7c_Jh4c() {
    assertEquals(
      "6h3d 2h7c 6cTs Jh4c QdAh 8c5c",
      Solver.process("texas-holdem 2d9hJdQhTd 6h3d QdAh 6cTs 8c5c 2h7c Jh4c"));
  }

  @Test
  public void test_texas_holdem_2576_5c7h8sQcTs_8c2d_Tc3s_9c3h_Th4s_Kh2s_JsKd_5hKs_7s2c_9s7c() {
    assertEquals(
      "9c3h Kh2s JsKd 5hKs 7s2c 9s7c 8c2d Tc3s=Th4s",
      Solver.process("texas-holdem 5c7h8sQcTs 8c2d Tc3s 9c3h Th4s Kh2s JsKd 5hKs 7s2c 9s7c"));
  }

  @Test
  public void test_texas_holdem_2577_6c9sKhTcTd_Ad8d_6s2d_Qs5d() {
    assertEquals(
      "Qs5d Ad8d 6s2d",
      Solver.process("texas-holdem 6c9sKhTcTd Ad8d 6s2d Qs5d"));
  }

  @Test
  public void test_texas_holdem_2578_2h7dAdJcTh_5dTc_3sJd_9s8d_4c2s_6hAh_6s5h_JsKs_4dQh() {
    assertEquals(
      "6s5h 4dQh 4c2s 5dTc 3sJd JsKs 6hAh 9s8d",
      Solver.process("texas-holdem 2h7dAdJcTh 5dTc 3sJd 9s8d 4c2s 6hAh 6s5h JsKs 4dQh"));
  }

  @Test
  public void test_texas_holdem_2579_3d5hAcKcQd_As2h_Td6d_JhQh_Kh4d_Jc4h_Kd2c_5s6h() {
    assertEquals(
      "Td6d Jc4h 5s6h JhQh Kd2c=Kh4d As2h",
      Solver.process("texas-holdem 3d5hAcKcQd As2h Td6d JhQh Kh4d Jc4h Kd2c 5s6h"));
  }

  @Test
  public void test_texas_holdem_2580_5c5s8dAhTc_6s7c_Kc9h_Ad8s_KdKh() {
    assertEquals(
      "6s7c Kc9h KdKh Ad8s",
      Solver.process("texas-holdem 5c5s8dAhTc 6s7c Kc9h Ad8s KdKh"));
  }

  @Test
  public void test_texas_holdem_2581_3c6cJhKsQc_8cJc_6s4c_Kc8d_2s3s_7hTs_Td9c_Jd4s_8s9h() {
    assertEquals(
      "8s9h 7hTs 2s3s 6s4c Jd4s Kc8d Td9c 8cJc",
      Solver.process("texas-holdem 3c6cJhKsQc 8cJc 6s4c Kc8d 2s3s 7hTs Td9c Jd4s 8s9h"));
  }

  @Test
  public void test_texas_holdem_2582_2d3s5dKsQh_3c7s_9cAd_4sQs_4d7d_Ah6c() {
    assertEquals(
      "4d7d Ah6c 9cAd 3c7s 4sQs",
      Solver.process("texas-holdem 2d3s5dKsQh 3c7s 9cAd 4sQs 4d7d Ah6c"));
  }

  @Test
  public void test_texas_holdem_2583_2s4s6h9sKh_6c8d_As8h_AhAd_6dTd() {
    assertEquals(
      "As8h 6c8d 6dTd AhAd",
      Solver.process("texas-holdem 2s4s6h9sKh 6c8d As8h AhAd 6dTd"));
  }

  @Test
  public void test_texas_holdem_2584_5c5h7h9hQh_Qd8d_4s2s_3hJh_Qc5s() {
    assertEquals(
      "4s2s Qd8d 3hJh Qc5s",
      Solver.process("texas-holdem 5c5h7h9hQh Qd8d 4s2s 3hJh Qc5s"));
  }

  @Test
  public void test_texas_holdem_2585_7d8hQcQsTd_9hJh_Ts8s_6dQd() {
    assertEquals(
      "Ts8s 6dQd 9hJh",
      Solver.process("texas-holdem 7d8hQcQsTd 9hJh Ts8s 6dQd"));
  }

  @Test
  public void test_texas_holdem_2586_2d5c6s7dKd_Ks9h_ThQh() {
    assertEquals(
      "ThQh Ks9h",
      Solver.process("texas-holdem 2d5c6s7dKd Ks9h ThQh"));
  }

  @Test
  public void test_texas_holdem_2587_5c7cAdAsJs_7d4h_4c3s_KhAc_2c7s_6h8c() {
    assertEquals(
      "4c3s 6h8c 2c7s=7d4h KhAc",
      Solver.process("texas-holdem 5c7cAdAsJs 7d4h 4c3s KhAc 2c7s 6h8c"));
  }

  @Test
  public void test_texas_holdem_2588_2c7cJhJsTh_5dAc_2dKd() {
    assertEquals(
      "5dAc 2dKd",
      Solver.process("texas-holdem 2c7cJhJsTh 5dAc 2dKd"));
  }

  @Test
  public void test_texas_holdem_2589_3c6dKcTcTh_2d8h_KhTs_Qs3s_2s6h() {
    assertEquals(
      "2d8h Qs3s 2s6h KhTs",
      Solver.process("texas-holdem 3c6dKcTcTh 2d8h KhTs Qs3s 2s6h"));
  }

  @Test
  public void test_texas_holdem_2590_5c5s8dAdTd_4hKc_4dTs_5h9c_Jc2d_2s4c_Qc3s_QhKh_KsTh_7d8h() {
    assertEquals(
      "2s4c Jc2d Qc3s 4hKc QhKh 7d8h 4dTs=KsTh 5h9c",
      Solver.process("texas-holdem 5c5s8dAdTd 4hKc 4dTs 5h9c Jc2d 2s4c Qc3s QhKh KsTh 7d8h"));
  }

  @Test
  public void test_texas_holdem_2591_3d4h4s6hAd_5h3c_7h3s_2cAh() {
    assertEquals(
      "5h3c=7h3s 2cAh",
      Solver.process("texas-holdem 3d4h4s6hAd 5h3c 7h3s 2cAh"));
  }

  @Test
  public void test_texas_holdem_2592_3d6h8d9cTh_2c9h_As5h_QsJh_7cAh_Js4c() {
    assertEquals(
      "Js4c As5h 2c9h 7cAh QsJh",
      Solver.process("texas-holdem 3d6h8d9cTh 2c9h As5h QsJh 7cAh Js4c"));
  }

  @Test
  public void test_texas_holdem_2593_7c8dJhQcQs_5c7s_4s6s_Qd3s_7d2c_4d2s_Ts8s_5dAc_5sKh_9sJd() {
    assertEquals(
      "4d2s=4s6s 5sKh 5dAc 5c7s=7d2c Ts8s 9sJd Qd3s",
      Solver.process("texas-holdem 7c8dJhQcQs 5c7s 4s6s Qd3s 7d2c 4d2s Ts8s 5dAc 5sKh 9sJd"));
  }

  @Test
  public void test_texas_holdem_2594_2h9hKdQcTc_5s5d_JdTd_7h7s_Ac9c() {
    assertEquals(
      "5s5d 7h7s Ac9c JdTd",
      Solver.process("texas-holdem 2h9hKdQcTc 5s5d JdTd 7h7s Ac9c"));
  }

  @Test
  public void test_texas_holdem_2595_3h5c9cJcQh_TcQs_5h5s_9sTs_7dJd_Js3c_2h2c_KhAc_6d7h_8dKs() {
    assertEquals(
      "6d7h 8dKs KhAc 2h2c 9sTs 7dJd TcQs Js3c 5h5s",
      Solver.process("texas-holdem 3h5c9cJcQh TcQs 5h5s 9sTs 7dJd Js3c 2h2c KhAc 6d7h 8dKs"));
  }

  @Test
  public void test_texas_holdem_2596_3s4s9cKsQc_4d7c_5d7s_9d9s_Jd2h_8d9h_3dAc_4h6h_8s6s() {
    assertEquals(
      "5d7s Jd2h 3dAc 4d7c=4h6h 8d9h 9d9s 8s6s",
      Solver.process("texas-holdem 3s4s9cKsQc 4d7c 5d7s 9d9s Jd2h 8d9h 3dAc 4h6h 8s6s"));
  }

  @Test
  public void test_texas_holdem_2597_2d3d3s8hQs_QhKh_9d6s_5c7d_Ad9s() {
    assertEquals(
      "5c7d 9d6s Ad9s QhKh",
      Solver.process("texas-holdem 2d3d3s8hQs QhKh 9d6s 5c7d Ad9s"));
  }

  @Test
  public void test_texas_holdem_2598_4h5h7h7sJc_5sKh_2hKc_7c6c_AdAc_3d6s() {
    assertEquals(
      "2hKc 5sKh AdAc 7c6c 3d6s",
      Solver.process("texas-holdem 4h5h7h7sJc 5sKh 2hKc 7c6c AdAc 3d6s"));
  }

  @Test
  public void test_texas_holdem_2599_7h9sJcJsKd_2s2h_6d6h_4h4c() {
    assertEquals(
      "2s2h 4h4c 6d6h",
      Solver.process("texas-holdem 7h9sJcJsKd 2s2h 6d6h 4h4c"));
  }

  @Test
  public void test_texas_holdem_2600_2c3d4c7dQc_2d3h_9sKc_Kh5d() {
    assertEquals(
      "Kh5d 9sKc 2d3h",
      Solver.process("texas-holdem 2c3d4c7dQc 2d3h 9sKc Kh5d"));
  }

  @Test
  public void test_texas_holdem_2601_2h6d9sKdTc_Td5s_5c2c() {
    assertEquals(
      "5c2c Td5s",
      Solver.process("texas-holdem 2h6d9sKdTc Td5s 5c2c"));
  }

  @Test
  public void test_texas_holdem_2602_5d7d8dJcTs_6c8h_Ac3c_Qd2c_6hAs_Ah9s_5h6d_5c2h() {
    assertEquals(
      "Qd2c 6hAs=Ac3c 5c2h=5h6d 6c8h Ah9s",
      Solver.process("texas-holdem 5d7d8dJcTs 6c8h Ac3c Qd2c 6hAs Ah9s 5h6d 5c2h"));
  }

  @Test
  public void test_texas_holdem_2603_3s5c6s9sTc_6hKs_7dJs_5dKd_9dTs_2dKh_Ac2h_3h2c_8dTd() {
    assertEquals(
      "7dJs 2dKh Ac2h 3h2c 5dKd 6hKs 8dTd 9dTs",
      Solver.process("texas-holdem 3s5c6s9sTc 6hKs 7dJs 5dKd 9dTs 2dKh Ac2h 3h2c 8dTd"));
  }

  @Test
  public void test_texas_holdem_2604_3c3d6dKhTs_8dJd_5d5h_7s3h_9h2s_9c9s_4s6c_7d6s_6h5s_3sAh() {
    assertEquals(
      "9h2s 8dJd 5d5h 4s6c=6h5s=7d6s 9c9s 7s3h 3sAh",
      Solver.process("texas-holdem 3c3d6dKhTs 8dJd 5d5h 7s3h 9h2s 9c9s 4s6c 7d6s 6h5s 3sAh"));
  }

  @Test
  public void test_texas_holdem_2605_3s4d6s8dQh_9d2h_7d9s_AsJc_Js6d_3d9c_Th6h_8cAc_5sTc_QcQs() {
    assertEquals(
      "9d2h 7d9s 5sTc AsJc 3d9c Th6h Js6d 8cAc QcQs",
      Solver.process("texas-holdem 3s4d6s8dQh 9d2h 7d9s AsJc Js6d 3d9c Th6h 8cAc 5sTc QcQs"));
  }

  @Test
  public void test_texas_holdem_2606_3d3h4hAdJd_Ah9h_3s6s() {
    assertEquals(
      "Ah9h 3s6s",
      Solver.process("texas-holdem 3d3h4hAdJd Ah9h 3s6s"));
  }

  @Test
  public void test_texas_holdem_2607_3h4d8dQcTs_6c8s_2c9h() {
    assertEquals(
      "2c9h 6c8s",
      Solver.process("texas-holdem 3h4d8dQcTs 6c8s 2c9h"));
  }

  @Test
  public void test_texas_holdem_2608_4h4s9cAsQd_TsTh_8cJh_Ks6h_6s5h_Ah8s_2hQc_9h2c_Ac7h() {
    assertEquals(
      "6s5h 8cJh Ks6h 9h2c TsTh 2hQc Ac7h=Ah8s",
      Solver.process("texas-holdem 4h4s9cAsQd TsTh 8cJh Ks6h 6s5h Ah8s 2hQc 9h2c Ac7h"));
  }

  @Test
  public void test_texas_holdem_2609_7s9dJdKdQd_Td8h_Ad8c_4s9h_6sKc_QsJs_9cAs_8dQc_9sAh_3c3h() {
    assertEquals(
      "3c3h 4s9h 9cAs=9sAh 6sKc QsJs 8dQc Ad8c Td8h",
      Solver.process("texas-holdem 7s9dJdKdQd Td8h Ad8c 4s9h 6sKc QsJs 9cAs 8dQc 9sAh 3c3h"));
  }

  @Test
  public void test_texas_holdem_2610_2s4d6c7hJc_Js7s_2hAh_8s2d_Qc2c_Kd8c_3cJd() {
    assertEquals(
      "Kd8c 8s2d Qc2c 2hAh 3cJd Js7s",
      Solver.process("texas-holdem 2s4d6c7hJc Js7s 2hAh 8s2d Qc2c Kd8c 3cJd"));
  }

  @Test
  public void test_texas_holdem_2611_6c7h8sQhTd_9sAh_JdAs_7sJh_2c4d() {
    assertEquals(
      "2c4d JdAs 7sJh 9sAh",
      Solver.process("texas-holdem 6c7h8sQhTd 9sAh JdAs 7sJh 2c4d"));
  }

  @Test
  public void test_texas_holdem_2612_4h4s6dKcTc_Kd6h_5c8c_As8d() {
    assertEquals(
      "5c8c As8d Kd6h",
      Solver.process("texas-holdem 4h4s6dKcTc Kd6h 5c8c As8d"));
  }

  @Test
  public void test_texas_holdem_2613_5s6c6hAdJh_Th3h_9d2s_7s7c_4d2d_5dKs() {
    assertEquals(
      "4d2d 9d2s Th3h 5dKs 7s7c",
      Solver.process("texas-holdem 5s6c6hAdJh Th3h 9d2s 7s7c 4d2d 5dKs"));
  }

  @Test
  public void test_texas_holdem_2614_6s9sAcJcKd_Tc5s_Qs4h_9c5d_Ad2c() {
    assertEquals(
      "Tc5s Qs4h 9c5d Ad2c",
      Solver.process("texas-holdem 6s9sAcJcKd Tc5s Qs4h 9c5d Ad2c"));
  }

  @Test
  public void test_texas_holdem_2615_4c4h9d9hTs_7c5c_4d9s_Js2d_2c8s_5dKs_6dQc_ThTd_Jd3c() {
    assertEquals(
      "2c8s=7c5c Jd3c=Js2d 6dQc 5dKs 4d9s ThTd",
      Solver.process("texas-holdem 4c4h9d9hTs 7c5c 4d9s Js2d 2c8s 5dKs 6dQc ThTd Jd3c"));
  }

  @Test
  public void test_texas_holdem_2616_3h6c7dAhTs_8d3s_4s5h_8s5d_2s9c_9h6s() {
    assertEquals(
      "8s5d 2s9c 8d3s 9h6s 4s5h",
      Solver.process("texas-holdem 3h6c7dAhTs 8d3s 4s5h 8s5d 2s9c 9h6s"));
  }

  @Test
  public void test_texas_holdem_2617_2c4c6h7dTh_Qc6d_9s2s_JhAd_3d5c_Js6c_4hKc() {
    assertEquals(
      "JhAd 9s2s 4hKc Js6c Qc6d 3d5c",
      Solver.process("texas-holdem 2c4c6h7dTh Qc6d 9s2s JhAd 3d5c Js6c 4hKc"));
  }

  @Test
  public void test_texas_holdem_2618_2c3c4cAcQs_8s9s_Ks2d_6s5c_9d5h_6cTs_QdTh_6d3s_JcKh_2s2h() {
    assertEquals(
      "8s9s Ks2d 6d3s QdTh 2s2h 9d5h 6cTs JcKh 6s5c",
      Solver.process("texas-holdem 2c3c4cAcQs 8s9s Ks2d 6s5c 9d5h 6cTs QdTh 6d3s JcKh 2s2h"));
  }

  @Test
  public void test_texas_holdem_2619_3d3h5d6cJs_4dAd_5cKd_4s8c_3cKc_7s2h_AcKs_7cTh_3sJc_Tc2d() {
    assertEquals(
      "7s2h 4s8c Tc2d 7cTh 4dAd AcKs 5cKd 3cKc 3sJc",
      Solver.process("texas-holdem 3d3h5d6cJs 4dAd 5cKd 4s8c 3cKc 7s2h AcKs 7cTh 3sJc Tc2d"));
  }

  @Test
  public void test_texas_holdem_2620_6dJcKcQcQd_QhKd_Kh3h_8d2d_4s5s() {
    assertEquals(
      "4s5s 8d2d Kh3h QhKd",
      Solver.process("texas-holdem 6dJcKcQcQd QhKd Kh3h 8d2d 4s5s"));
  }

  @Test
  public void test_texas_holdem_2621_4d7d8hKdTc_ThJs_5sTd_5d6d_3dJh() {
    assertEquals(
      "3dJh 5sTd ThJs 5d6d",
      Solver.process("texas-holdem 4d7d8hKdTc ThJs 5sTd 5d6d 3dJh"));
  }

  @Test
  public void test_texas_holdem_2622_2s7c8cJhQd_Jd6d_3c4s_Ks7h_3d2c_9dKc_6s3s_As2h() {
    assertEquals(
      "3c4s 6s3s 9dKc 3d2c As2h Ks7h Jd6d",
      Solver.process("texas-holdem 2s7c8cJhQd Jd6d 3c4s Ks7h 3d2c 9dKc 6s3s As2h"));
  }

  @Test
  public void test_texas_holdem_2623_2h4c5c9c9s_Ac5h_Th2s_4h6c_8c8d_3cQc_TdKd_5s3d_4dQh() {
    assertEquals(
      "TdKd Th2s 4h6c 4dQh 5s3d Ac5h 8c8d 3cQc",
      Solver.process("texas-holdem 2h4c5c9c9s Ac5h Th2s 4h6c 8c8d 3cQc TdKd 5s3d 4dQh"));
  }

  @Test
  public void test_texas_holdem_2624_3s6h9h9sKd_Th3h_Tc7c_As4c_3dQd() {
    assertEquals(
      "Tc7c As4c 3dQd=Th3h",
      Solver.process("texas-holdem 3s6h9h9sKd Th3h Tc7c As4c 3dQd"));
  }

  @Test
  public void test_texas_holdem_2625_3d5s7hJdQh_3h7d_6s7s_ThTc() {
    assertEquals(
      "6s7s ThTc 3h7d",
      Solver.process("texas-holdem 3d5s7hJdQh 3h7d 6s7s ThTc"));
  }

  @Test
  public void test_texas_holdem_2626_4s7sKhKsTc_Qs6c_2d9s_6s2s_Kc3h() {
    assertEquals(
      "2d9s Qs6c Kc3h 6s2s",
      Solver.process("texas-holdem 4s7sKhKsTc Qs6c 2d9s 6s2s Kc3h"));
  }

  @Test
  public void test_texas_holdem_2627_4c6c8s9hJs_8c7c_KcJd_AdQc_9d5h_Ac2s_6h8d() {
    assertEquals(
      "Ac2s AdQc 8c7c 9d5h KcJd 6h8d",
      Solver.process("texas-holdem 4c6c8s9hJs 8c7c KcJd AdQc 9d5h Ac2s 6h8d"));
  }

  @Test
  public void test_texas_holdem_2628_2c3h6hAhJd_4hJh_5sTc_2hJc_8d7s_8sKs_Ts6d_9h4d_Kc4s() {
    assertEquals(
      "8d7s 9h4d 5sTc Kc4s 8sKs Ts6d 2hJc 4hJh",
      Solver.process("texas-holdem 2c3h6hAhJd 4hJh 5sTc 2hJc 8d7s 8sKs Ts6d 9h4d Kc4s"));
  }

  @Test
  public void test_texas_holdem_2629_3c8h8sKdQd_Ad9c_7d9d_5dTc_Jc6s_6d9h_2h4s() {
    assertEquals(
      "2h4s 6d9h=7d9d 5dTc Jc6s Ad9c",
      Solver.process("texas-holdem 3c8h8sKdQd Ad9c 7d9d 5dTc Jc6s 6d9h 2h4s"));
  }

  @Test
  public void test_texas_holdem_2630_3d3h9c9sTs_8dAd_9d4h_ThJs_6s4c_Kc8s_6h8h_Ah2c_TcAs() {
    assertEquals(
      "6h8h=6s4c Kc8s 8dAd=Ah2c ThJs TcAs 9d4h",
      Solver.process("texas-holdem 3d3h9c9sTs 8dAd 9d4h ThJs 6s4c Kc8s 6h8h Ah2c TcAs"));
  }

  @Test
  public void test_texas_holdem_2631_4c7hAsJhQc_9cTh_Qs5s_5d4s_6sKc_9hAc_8d3s_Tc9d() {
    assertEquals(
      "8d3s 9cTh=Tc9d 6sKc 5d4s Qs5s 9hAc",
      Solver.process("texas-holdem 4c7hAsJhQc 9cTh Qs5s 5d4s 6sKc 9hAc 8d3s Tc9d"));
  }

  @Test
  public void test_texas_holdem_2632_8dAdJcKhTs_3hAc_7c9h_4s2s_KsJs_9sTc_4h3s_As9d_9cQd() {
    assertEquals(
      "4h3s=4s2s 9sTc 3hAc=As9d KsJs 7c9h 9cQd",
      Solver.process("texas-holdem 8dAdJcKhTs 3hAc 7c9h 4s2s KsJs 9sTc 4h3s As9d 9cQd"));
  }

  @Test
  public void test_texas_holdem_2633_6h8dAsKdTs_Ad9h_Th5h_2s4d_8c7s_4cJc_Qc7h_Jh5s_8s6d_QsQd() {
    assertEquals(
      "2s4d 4cJc=Jh5s Qc7h 8c7s Th5h QsQd Ad9h 8s6d",
      Solver.process("texas-holdem 6h8dAsKdTs Ad9h Th5h 2s4d 8c7s 4cJc Qc7h Jh5s 8s6d QsQd"));
  }

  @Test
  public void test_texas_holdem_2634_7d8cQcQsTc_4h4c_8hQh_3d2d_6h6d_AdJs_9sKs() {
    assertEquals(
      "3d2d 9sKs AdJs 4h4c 6h6d 8hQh",
      Solver.process("texas-holdem 7d8cQcQsTc 4h4c 8hQh 3d2d 6h6d AdJs 9sKs"));
  }

  @Test
  public void test_texas_holdem_2635_4d4h5cAcTc_Js7d_Ks8d() {
    assertEquals(
      "Js7d Ks8d",
      Solver.process("texas-holdem 4d4h5cAcTc Js7d Ks8d"));
  }

  @Test
  public void test_texas_holdem_2636_2h4sAcJsQd_KhTd_3s6h_8d3c_Jd4d_Jh4c_Kc4h() {
    assertEquals(
      "3s6h 8d3c Kc4h Jd4d=Jh4c KhTd",
      Solver.process("texas-holdem 2h4sAcJsQd KhTd 3s6h 8d3c Jd4d Jh4c Kc4h"));
  }

  @Test
  public void test_texas_holdem_2637_4h5c6h9sQd_QsJd_9d3d_9h2h_5sQc_2c5d_Jh2d_As6d_Kh7c_Js8h() {
    assertEquals(
      "Jh2d Js8h Kh7c 2c5d As6d 9d3d=9h2h QsJd 5sQc",
      Solver.process("texas-holdem 4h5c6h9sQd QsJd 9d3d 9h2h 5sQc 2c5d Jh2d As6d Kh7c Js8h"));
  }

  @Test
  public void test_texas_holdem_2638_2h4d6dJcJh_7hQs_5h3s_9cAs_9dTh_8c9h_Td4c_7c6h() {
    assertEquals(
      "8c9h 9dTh 7hQs 9cAs Td4c 7c6h 5h3s",
      Solver.process("texas-holdem 2h4d6dJcJh 7hQs 5h3s 9cAs 9dTh 8c9h Td4c 7c6h"));
  }

  @Test
  public void test_texas_holdem_2639_2h5h8hKhQd_Jh6h_JcQh_Jd4d_As7d_2sAh_4h9s_Ad5s() {
    assertEquals(
      "Jd4d As7d Ad5s 4h9s Jh6h JcQh 2sAh",
      Solver.process("texas-holdem 2h5h8hKhQd Jh6h JcQh Jd4d As7d 2sAh 4h9s Ad5s"));
  }

  @Test
  public void test_texas_holdem_2640_6sAsKdKhKs_Td9s_Qd8h_5d7d_Js2c_6dQc_5sTc_8s5h_3s8d() {
    assertEquals(
      "5d7d 3s8d=8s5h 5sTc=Td9s Js2c Qd8h 6dQc",
      Solver.process("texas-holdem 6sAsKdKhKs Td9s Qd8h 5d7d Js2c 6dQc 5sTc 8s5h 3s8d"));
  }

  @Test
  public void test_texas_holdem_2641_3c6c6d9cQd_QhJh_2c7h_Ad7s_As5c_5d8h_3d8s_2s7c_Jd9d_Th4h() {
    assertEquals(
      "2c7h=2s7c 5d8h Th4h Ad7s=As5c 3d8s Jd9d QhJh",
      Solver.process("texas-holdem 3c6c6d9cQd QhJh 2c7h Ad7s As5c 5d8h 3d8s 2s7c Jd9d Th4h"));
  }

  @Test
  public void test_texas_holdem_2642_2d8s9d9hJd_QhTh_Ks3h_Ts5d_4d3s_6s7s_Ah2h_3dJc_Tc7c_4cAs() {
    assertEquals(
      "4d3s 6s7s Ts5d Ks3h 4cAs Ah2h 3dJc Tc7c QhTh",
      Solver.process("texas-holdem 2d8s9d9hJd QhTh Ks3h Ts5d 4d3s 6s7s Ah2h 3dJc Tc7c 4cAs"));
  }

  @Test
  public void test_texas_holdem_2643_4sAdKcTcTh_Td9s_5sJc_7sQc_Ah8d_QdKd() {
    assertEquals(
      "5sJc 7sQc QdKd Ah8d Td9s",
      Solver.process("texas-holdem 4sAdKcTcTh Td9s 5sJc 7sQc Ah8d QdKd"));
  }

  @Test
  public void test_texas_holdem_2644_5d8dJdQcQh_JsAc_KdKh_8c7s_Ts4s_Jh4h_3s3h_4cKs_9sAs_8sQd() {
    assertEquals(
      "Ts4s 4cKs 9sAs 3s3h 8c7s Jh4h JsAc KdKh 8sQd",
      Solver.process("texas-holdem 5d8dJdQcQh JsAc KdKh 8c7s Ts4s Jh4h 3s3h 4cKs 9sAs 8sQd"));
  }

  @Test
  public void test_texas_holdem_2645_5d6d6hJdTs_Js4s_9h5c_4c2d_3hQc_Th2h_Kd5h_7cKc() {
    assertEquals(
      "4c2d 3hQc 7cKc 9h5c Kd5h Th2h Js4s",
      Solver.process("texas-holdem 5d6d6hJdTs Js4s 9h5c 4c2d 3hQc Th2h Kd5h 7cKc"));
  }

  @Test
  public void test_texas_holdem_2646_2s5h6c6dTh_KsTs_7sTc_AcAd_5d8d_2cJh() {
    assertEquals(
      "2cJh 5d8d 7sTc KsTs AcAd",
      Solver.process("texas-holdem 2s5h6c6dTh KsTs 7sTc AcAd 5d8d 2cJh"));
  }

  @Test
  public void test_texas_holdem_2647_2h4d7dKcKs_KhAh_8cAc_Tc9h() {
    assertEquals(
      "Tc9h 8cAc KhAh",
      Solver.process("texas-holdem 2h4d7dKcKs KhAh 8cAc Tc9h"));
  }

  @Test
  public void test_texas_holdem_2648_AdJcKsQhTd_4cTh_5hKd_9sTs() {
    assertEquals(
      "4cTh=5hKd=9sTs",
      Solver.process("texas-holdem AdJcKsQhTd 4cTh 5hKd 9sTs"));
  }

  @Test
  public void test_texas_holdem_2649_4h6s8c9dAh_5s4d_2cAc_3d7d_7hQs_2dQh_5c7c_6cTs_2h9h() {
    assertEquals(
      "3d7d 2dQh 7hQs 5s4d 6cTs 2h9h 2cAc 5c7c",
      Solver.process("texas-holdem 4h6s8c9dAh 5s4d 2cAc 3d7d 7hQs 2dQh 5c7c 6cTs 2h9h"));
  }

  @Test
  public void test_texas_holdem_2650_4c5c6d9dKs_Kh3h_6s8c() {
    assertEquals(
      "6s8c Kh3h",
      Solver.process("texas-holdem 4c5c6d9dKs Kh3h 6s8c"));
  }

  @Test
  public void test_texas_holdem_2651_6d7d9dJcTd_7sAs_QhQc_JhAd_2cQs_Js6c_4h8h() {
    assertEquals(
      "2cQs 7sAs QhQc Js6c 4h8h JhAd",
      Solver.process("texas-holdem 6d7d9dJcTd 7sAs QhQc JhAd 2cQs Js6c 4h8h"));
  }

  @Test
  public void test_texas_holdem_2652_2d7d7s9cKs_AcQs_8sAh() {
    assertEquals(
      "8sAh AcQs",
      Solver.process("texas-holdem 2d7d7s9cKs AcQs 8sAh"));
  }

  @Test
  public void test_texas_holdem_2653_4c6h7d8d8h_2hAc_5d3c_6dJs() {
    assertEquals(
      "2hAc 6dJs 5d3c",
      Solver.process("texas-holdem 4c6h7d8d8h 2hAc 5d3c 6dJs"));
  }

  @Test
  public void test_texas_holdem_2654_2d3d8cQsTd_8dQd_3h4h_9dKc_5h7h_TsQh_Ad5s_Jc9h() {
    assertEquals(
      "5h7h 9dKc Ad5s 3h4h TsQh Jc9h 8dQd",
      Solver.process("texas-holdem 2d3d8cQsTd 8dQd 3h4h 9dKc 5h7h TsQh Ad5s Jc9h"));
  }

  @Test
  public void test_texas_holdem_2655_2s3h4d7s9d_5s4c_Kd2h_JcJs_8sTd_6h6d_Qc4s_JhAs_Qd5c() {
    assertEquals(
      "8sTd Qd5c JhAs Kd2h 5s4c Qc4s 6h6d JcJs",
      Solver.process("texas-holdem 2s3h4d7s9d 5s4c Kd2h JcJs 8sTd 6h6d Qc4s JhAs Qd5c"));
  }

  @Test
  public void test_texas_holdem_2656_3d5s7s9sAh_8dJs_8s8c_Qh9c() {
    assertEquals(
      "8dJs 8s8c Qh9c",
      Solver.process("texas-holdem 3d5s7s9sAh 8dJs 8s8c Qh9c"));
  }

  @Test
  public void test_texas_holdem_2657_2c4c4s7d9d_2dKs_Ts4d_5c7h_3dTd_TcAh_Kd5d_8h2h_6hJc_2sJs() {
    assertEquals(
      "3dTd 6hJc Kd5d TcAh 8h2h 2sJs 2dKs 5c7h Ts4d",
      Solver.process("texas-holdem 2c4c4s7d9d 2dKs Ts4d 5c7h 3dTd TcAh Kd5d 8h2h 6hJc 2sJs"));
  }

  @Test
  public void test_texas_holdem_2658_4c6c7sKdKh_Ac7h_Th9h_AdTs_3d4h_6hQc_6s5c_Td8h() {
    assertEquals(
      "Td8h Th9h AdTs 3d4h 6s5c 6hQc Ac7h",
      Solver.process("texas-holdem 4c6c7sKdKh Ac7h Th9h AdTs 3d4h 6hQc 6s5c Td8h"));
  }

  @Test
  public void test_texas_holdem_2659_5h7d8sAdJd_Kd3s_Th9c_6sQc_2hQd() {
    assertEquals(
      "2hQd=6sQc Kd3s Th9c",
      Solver.process("texas-holdem 5h7d8sAdJd Kd3s Th9c 6sQc 2hQd"));
  }

  @Test
  public void test_texas_holdem_2660_2s9c9hQdTs_KhJh_Js9d() {
    assertEquals(
      "Js9d KhJh",
      Solver.process("texas-holdem 2s9c9hQdTs KhJh Js9d"));
  }

  @Test
  public void test_texas_holdem_2661_2s3c5cQcQs_Kh7c_Jc2d_4c2h_JsAc_8h9d_6c8c_TdTc_5s3s_2c4h() {
    assertEquals(
      "8h9d Kh7c JsAc 2c4h=4c2h Jc2d 5s3s TdTc 6c8c",
      Solver.process("texas-holdem 2s3c5cQcQs Kh7c Jc2d 4c2h JsAc 8h9d 6c8c TdTc 5s3s 2c4h"));
  }

  @Test
  public void test_texas_holdem_2662_3s5d6c9sKd_4c7h_8cAs_5hJd_9h6s_4d6d_JcQc() {
    assertEquals(
      "JcQc 8cAs 5hJd 4d6d 9h6s 4c7h",
      Solver.process("texas-holdem 3s5d6c9sKd 4c7h 8cAs 5hJd 9h6s 4d6d JcQc"));
  }

  @Test
  public void test_texas_holdem_2663_2h2s3s7s9d_3h6s_Jd3d_KsTc_7d7h_8c9c() {
    assertEquals(
      "KsTc 3h6s Jd3d 8c9c 7d7h",
      Solver.process("texas-holdem 2h2s3s7s9d 3h6s Jd3d KsTc 7d7h 8c9c"));
  }

  @Test
  public void test_texas_holdem_2664_4d5h6h9cJh_9s2s_3cQh_8s2d_Ac6s_4h5d_5sQc_7hAd_Jc8h() {
    assertEquals(
      "8s2d 3cQh 7hAd 5sQc Ac6s 9s2s Jc8h 4h5d",
      Solver.process("texas-holdem 4d5h6h9cJh 9s2s 3cQh 8s2d Ac6s 4h5d 5sQc 7hAd Jc8h"));
  }

  @Test
  public void test_texas_holdem_2665_2d7c7dQdTd_JhTh_Jc4h_9s2c_AdKs() {
    assertEquals(
      "Jc4h 9s2c JhTh AdKs",
      Solver.process("texas-holdem 2d7c7dQdTd JhTh Jc4h 9s2c AdKs"));
  }

  @Test
  public void test_texas_holdem_2666_4h5c5sKhTs_7hKc_As3h_7d6s_3sJd_9sTh_6cQs_9c4s_5hKd() {
    assertEquals(
      "7d6s 3sJd 6cQs As3h 9c4s 9sTh 7hKc 5hKd",
      Solver.process("texas-holdem 4h5c5sKhTs 7hKc As3h 7d6s 3sJd 9sTh 6cQs 9c4s 5hKd"));
  }

  @Test
  public void test_texas_holdem_2667_2d8d9sAhQc_6h3h_ThQh_2h2s_7hTs_6sJh_8cKh_Jd4s_5s3c_2c6c() {
    assertEquals(
      "5s3c 6h3h 7hTs 6sJh=Jd4s 2c6c 8cKh ThQh 2h2s",
      Solver.process("texas-holdem 2d8d9sAhQc 6h3h ThQh 2h2s 7hTs 6sJh 8cKh Jd4s 5s3c 2c6c"));
  }

  @Test
  public void test_texas_holdem_2668_4d4h5cKhQc_Jd8s_TcTd_8c8d_9d7s_8h5d_4sJs() {
    assertEquals(
      "9d7s Jd8s 8h5d 8c8d TcTd 4sJs",
      Solver.process("texas-holdem 4d4h5cKhQc Jd8s TcTd 8c8d 9d7s 8h5d 4sJs"));
  }

  @Test
  public void test_texas_holdem_2669_3cAsKhQhTd_7h6s_Tc6c() {
    assertEquals(
      "7h6s Tc6c",
      Solver.process("texas-holdem 3cAsKhQhTd 7h6s Tc6c"));
  }

  @Test
  public void test_texas_holdem_2670_2s5dAcKdQs_2h8d_5sJc_4d9s_7hKc_6d8s_9d3s_Qd6c_KsQh() {
    assertEquals(
      "6d8s 4d9s=9d3s 2h8d 5sJc Qd6c 7hKc KsQh",
      Solver.process("texas-holdem 2s5dAcKdQs 2h8d 5sJc 4d9s 7hKc 6d8s 9d3s Qd6c KsQh"));
  }

  @Test
  public void test_texas_holdem_2671_5s6dJdQcQs_Ts4c_Qh6c() {
    assertEquals(
      "Ts4c Qh6c",
      Solver.process("texas-holdem 5s6dJdQcQs Ts4c Qh6c"));
  }

  @Test
  public void test_texas_holdem_2672_6s7c9hQcQd_8cTd_2s6d_7h8s_Kd7s_Ts8h() {
    assertEquals(
      "2s6d 7h8s Kd7s 8cTd=Ts8h",
      Solver.process("texas-holdem 6s7c9hQcQd 8cTd 2s6d 7h8s Kd7s Ts8h"));
  }

  @Test
  public void test_texas_holdem_2673_4s8c8h9dKd_KsJd_2s7d_Td9c_3s6s_Ad7s_8s4h() {
    assertEquals(
      "3s6s 2s7d Ad7s Td9c KsJd 8s4h",
      Solver.process("texas-holdem 4s8c8h9dKd KsJd 2s7d Td9c 3s6s Ad7s 8s4h"));
  }

  @Test
  public void test_texas_holdem_2674_2h3d8d9h9s_Ts7s_4hJc_Th7c() {
    assertEquals(
      "Th7c=Ts7s 4hJc",
      Solver.process("texas-holdem 2h3d8d9h9s Ts7s 4hJc Th7c"));
  }

  @Test
  public void test_texas_holdem_2675_3c4c6cQhTd_Ks4d_6d2d_AhJc_As4s_QsTh_TcJd_8c8s() {
    assertEquals(
      "AhJc Ks4d As4s 6d2d 8c8s TcJd QsTh",
      Solver.process("texas-holdem 3c4c6cQhTd Ks4d 6d2d AhJc As4s QsTh TcJd 8c8s"));
  }

  @Test
  public void test_texas_holdem_2676_2c8dAsJsKc_Th3d_2h7c_6c6s_7hQh_7dJh_Kd9d() {
    assertEquals(
      "Th3d 7hQh 2h7c 6c6s 7dJh Kd9d",
      Solver.process("texas-holdem 2c8dAsJsKc Th3d 2h7c 6c6s 7hQh 7dJh Kd9d"));
  }

  @Test
  public void test_texas_holdem_2677_3s6h9dQsTd_6cAh_7d3h_3d2d_JcKh() {
    assertEquals(
      "3d2d=7d3h 6cAh JcKh",
      Solver.process("texas-holdem 3s6h9dQsTd 6cAh 7d3h 3d2d JcKh"));
  }

  @Test
  public void test_texas_holdem_2678_4d4h8dAsKc_3dTc_AdJh_6sQs_Kd7h_Js5d_AhQd_8c7s() {
    assertEquals(
      "3dTc Js5d 6sQs 8c7s Kd7h AdJh=AhQd",
      Solver.process("texas-holdem 4d4h8dAsKc 3dTc AdJh 6sQs Kd7h Js5d AhQd 8c7s"));
  }

  @Test
  public void test_texas_holdem_2679_2d3s5d6hTs_KcKd_6s2h_Qc7d() {
    assertEquals(
      "Qc7d KcKd 6s2h",
      Solver.process("texas-holdem 2d3s5d6hTs KcKd 6s2h Qc7d"));
  }

  @Test
  public void test_texas_holdem_2680_4d9c9dJcTc_5hJs_Qs8h_AdTs_2c5s_ThKc_7c6c_9s3c() {
    assertEquals(
      "2c5s ThKc AdTs 5hJs 9s3c Qs8h 7c6c",
      Solver.process("texas-holdem 4d9c9dJcTc 5hJs Qs8h AdTs 2c5s ThKc 7c6c 9s3c"));
  }

  @Test
  public void test_texas_holdem_2681_6s7d7hAsQs_3s3d_8dJs_AdTd_QdJh_Jd6d_4sAh_7cTh() {
    assertEquals(
      "8dJs 3s3d Jd6d QdJh 4sAh=AdTd 7cTh",
      Solver.process("texas-holdem 6s7d7hAsQs 3s3d 8dJs AdTd QdJh Jd6d 4sAh 7cTh"));
  }

  @Test
  public void test_texas_holdem_2682_6h7s8hTdTs_2s7d_8d9c_7c4h() {
    assertEquals(
      "2s7d=7c4h 8d9c",
      Solver.process("texas-holdem 6h7s8hTdTs 2s7d 8d9c 7c4h"));
  }

  @Test
  public void test_texas_holdem_2683_6d8d9sAsJd_8sTh_AdJh_7h3s() {
    assertEquals(
      "7h3s 8sTh AdJh",
      Solver.process("texas-holdem 6d8d9sAsJd 8sTh AdJh 7h3s"));
  }

  @Test
  public void test_texas_holdem_2684_5hJcJhKsTd_2hTs_8s2s_3dKd_2d6h() {
    assertEquals(
      "2d6h 8s2s 2hTs 3dKd",
      Solver.process("texas-holdem 5hJcJhKsTd 2hTs 8s2s 3dKd 2d6h"));
  }

  @Test
  public void test_texas_holdem_2685_3d5cAcJcQh_2h4c_7d9d_9hTh() {
    assertEquals(
      "7d9d 9hTh 2h4c",
      Solver.process("texas-holdem 3d5cAcJcQh 2h4c 7d9d 9hTh"));
  }

  @Test
  public void test_texas_holdem_2686_3h7d9sJdQc_8s8d_ThKc_7s2d() {
    assertEquals(
      "7s2d 8s8d ThKc",
      Solver.process("texas-holdem 3h7d9sJdQc 8s8d ThKc 7s2d"));
  }

  @Test
  public void test_texas_holdem_2687_6h7h7s8d8h_8cKd_9d5s_3dAs_3h4c_AcTs_4dJc_AhJd_Qd5c_Kh6s() {
    assertEquals(
      "3h4c 4dJc Qd5c Kh6s 3dAs=AcTs=AhJd 9d5s 8cKd",
      Solver.process("texas-holdem 6h7h7s8d8h 8cKd 9d5s 3dAs 3h4c AcTs 4dJc AhJd Qd5c Kh6s"));
  }

  @Test
  public void test_texas_holdem_2688_2cJdKhQhTh_KdQc_Jc7s_7cKc_5dKs_4d6c() {
    assertEquals(
      "4d6c Jc7s 5dKs=7cKc KdQc",
      Solver.process("texas-holdem 2cJdKhQhTh KdQc Jc7s 7cKc 5dKs 4d6c"));
  }

  @Test
  public void test_texas_holdem_2689_3h7s8h9dAc_5cKd_TcQh_9h2c_5s2h_6c7c_5h6d_Th9s_6h8c() {
    assertEquals(
      "5s2h TcQh 5cKd 6c7c 6h8c 9h2c Th9s 5h6d",
      Solver.process("texas-holdem 3h7s8h9dAc 5cKd TcQh 9h2c 5s2h 6c7c 5h6d Th9s 6h8c"));
  }

  @Test
  public void test_texas_holdem_2690_3d4d5cAcJh_Qh7d_TcKs_8sQs_2c7s_Js9s_3cKh_4c9h_4hAh() {
    assertEquals(
      "Qh7d 8sQs TcKs 3cKh 4c9h Js9s 4hAh 2c7s",
      Solver.process("texas-holdem 3d4d5cAcJh Qh7d TcKs 8sQs 2c7s Js9s 3cKh 4c9h 4hAh"));
  }

  @Test
  public void test_texas_holdem_2691_3h6s9dAsJd_Td2h_QsQh_JcKd_Th6d_Qc4c_Ac8c_8sKs() {
    assertEquals(
      "Td2h Qc4c 8sKs Th6d JcKd QsQh Ac8c",
      Solver.process("texas-holdem 3h6s9dAsJd Td2h QsQh JcKd Th6d Qc4c Ac8c 8sKs"));
  }

  @Test
  public void test_texas_holdem_2692_2c6d6hJdKd_8dTh_4h4s_Ts6c_3dQc_Kh5d_Ah7s_QdKs_4c3h_9c3s() {
    assertEquals(
      "4c3h 9c3s 8dTh 3dQc Ah7s 4h4s Kh5d QdKs Ts6c",
      Solver.process("texas-holdem 2c6d6hJdKd 8dTh 4h4s Ts6c 3dQc Kh5d Ah7s QdKs 4c3h 9c3s"));
  }

  @Test
  public void test_texas_holdem_2693_3d7c7sTdTs_Jc9c_5s8c_7hKh_Qh2s_KdJd_2d5h() {
    assertEquals(
      "2d5h 5s8c Jc9c Qh2s KdJd 7hKh",
      Solver.process("texas-holdem 3d7c7sTdTs Jc9c 5s8c 7hKh Qh2s KdJd 2d5h"));
  }

  @Test
  public void test_texas_holdem_2694_2c4h5dAdJc_Ac4d_2sQh_Ah3c_Kh8c_Qd4s_Td9s() {
    assertEquals(
      "Td9s Kh8c 2sQh Qd4s Ac4d Ah3c",
      Solver.process("texas-holdem 2c4h5dAdJc Ac4d 2sQh Ah3c Kh8c Qd4s Td9s"));
  }

  @Test
  public void test_texas_holdem_2695_2d4h5d6c8c_6h4c_KcQc_Ad9d_4dJc_Jd2h_3dTs() {
    assertEquals(
      "KcQc Ad9d Jd2h 4dJc 6h4c 3dTs",
      Solver.process("texas-holdem 2d4h5d6c8c 6h4c KcQc Ad9d 4dJc Jd2h 3dTs"));
  }

  @Test
  public void test_texas_holdem_2696_4d5h8dKcKs_7hTd_9s6s_4h6d_As2s_QsTs() {
    assertEquals(
      "9s6s 7hTd QsTs As2s 4h6d",
      Solver.process("texas-holdem 4d5h8dKcKs 7hTd 9s6s 4h6d As2s QsTs"));
  }

  @Test
  public void test_texas_holdem_2697_4h4s6s7cKd_7sTc_AdQs_Qc2d_3hJh_6cJd_Jc8s() {
    assertEquals(
      "3hJh Jc8s Qc2d AdQs 6cJd 7sTc",
      Solver.process("texas-holdem 4h4s6s7cKd 7sTc AdQs Qc2d 3hJh 6cJd Jc8s"));
  }

  @Test
  public void test_texas_holdem_2698_4h6d6s9cTh_QdQc_3s6c_9h9d_3c5h_7dTc_Jh8d() {
    assertEquals(
      "3c5h Jh8d 7dTc QdQc 3s6c 9h9d",
      Solver.process("texas-holdem 4h6d6s9cTh QdQc 3s6c 9h9d 3c5h 7dTc Jh8d"));
  }

  @Test
  public void test_texas_holdem_2699_2h3hQhTdTh_6c5c_JsJd() {
    assertEquals(
      "6c5c JsJd",
      Solver.process("texas-holdem 2h3hQhTdTh 6c5c JsJd"));
  }

  @Test
  public void test_texas_holdem_2700_8hQsTcTdTs_9c3c_6dKh_8s7c_4h4s() {
    assertEquals(
      "9c3c 6dKh 4h4s 8s7c",
      Solver.process("texas-holdem 8hQsTcTdTs 9c3c 6dKh 8s7c 4h4s"));
  }

  @Test
  public void test_texas_holdem_2701_2d7h8d8s9d_JhQd_5cJd_9c8h_4h4c_9hTh_6dKd() {
    assertEquals(
      "5cJd JhQd 4h4c 9hTh 6dKd 9c8h",
      Solver.process("texas-holdem 2d7h8d8s9d JhQd 5cJd 9c8h 4h4c 9hTh 6dKd"));
  }

  @Test
  public void test_texas_holdem_2702_2s5d6hJhKh_4sAc_7h6c_KdTh_4d3d() {
    assertEquals(
      "4sAc 7h6c KdTh 4d3d",
      Solver.process("texas-holdem 2s5d6hJhKh 4sAc 7h6c KdTh 4d3d"));
  }

  @Test
  public void test_texas_holdem_2703_6c6d6s7d8d_JcTs_4s5h_8c5s_9dQd_5dAd_4hJs_AhJh_3s3h_JdQh() {
    assertEquals(
      "4hJs JcTs JdQh AhJh 4s5h 9dQd 5dAd 3s3h 8c5s",
      Solver.process("texas-holdem 6c6d6s7d8d JcTs 4s5h 8c5s 9dQd 5dAd 4hJs AhJh 3s3h JdQh"));
  }

  @Test
  public void test_texas_holdem_2704_3d5d6dJsKc_2c9d_9cAd_Tc5s_2h7s_Ks9s_4dKd_3h4h() {
    assertEquals(
      "2h7s 2c9d 9cAd 3h4h Tc5s Ks9s 4dKd",
      Solver.process("texas-holdem 3d5d6dJsKc 2c9d 9cAd Tc5s 2h7s Ks9s 4dKd 3h4h"));
  }

  @Test
  public void test_texas_holdem_2705_2c3d5sAdQc_3hKs_6h4h_As4s_ThAh_5c2s_8sQh_5d6d_Ac7h() {
    assertEquals(
      "3hKs 5d6d 8sQh Ac7h ThAh 5c2s As4s 6h4h",
      Solver.process("texas-holdem 2c3d5sAdQc 3hKs 6h4h As4s ThAh 5c2s 8sQh 5d6d Ac7h"));
  }

  @Test
  public void test_texas_holdem_2706_2d9hJcKsQc_3s9c_Td5c_2hQs_5h8s_3d6s_JdAc_3c2s_9dAh_6cKh() {
    assertEquals(
      "3d6s 5h8s 3c2s 3s9c 9dAh JdAc 6cKh 2hQs Td5c",
      Solver.process("texas-holdem 2d9hJcKsQc 3s9c Td5c 2hQs 5h8s 3d6s JdAc 3c2s 9dAh 6cKh"));
  }

  @Test
  public void test_texas_holdem_2707_2c7h9dQsTd_4d2s_Ks2h_5c7c_3c3d() {
    assertEquals(
      "4d2s Ks2h 3c3d 5c7c",
      Solver.process("texas-holdem 2c7h9dQsTd 4d2s Ks2h 5c7c 3c3d"));
  }

  @Test
  public void test_texas_holdem_2708_2d2hAhJcKd_4cQc_8dKh_QsTs_QhKc_5c4h_3cKs_3sAd_6dJd() {
    assertEquals(
      "5c4h 4cQc 6dJd 3cKs=8dKh=QhKc 3sAd QsTs",
      Solver.process("texas-holdem 2d2hAhJcKd 4cQc 8dKh QsTs QhKc 5c4h 3cKs 3sAd 6dJd"));
  }

  @Test
  public void test_texas_holdem_2709_4h5d5s9dTd_6h5c_8dAs_9c4s_9hQc_JhAc_Kh8c_8hTh_4d9s_2d4c() {
    assertEquals(
      "Kh8c 8dAs JhAc 2d4c 4d9s=9c4s 9hQc 8hTh 6h5c",
      Solver.process("texas-holdem 4h5d5s9dTd 6h5c 8dAs 9c4s 9hQc JhAc Kh8c 8hTh 4d9s 2d4c"));
  }

  @Test
  public void test_texas_holdem_2710_2s5h6sJcKd_4sAs_Ts3d_7c6h_Th4d_3s8s_Ad3c_8h9h_9c4h() {
    assertEquals(
      "3s8s 9c4h 8h9h Th4d=Ts3d 4sAs=Ad3c 7c6h",
      Solver.process("texas-holdem 2s5h6sJcKd 4sAs Ts3d 7c6h Th4d 3s8s Ad3c 8h9h 9c4h"));
  }

  @Test
  public void test_texas_holdem_2711_2h7d8h9cAh_JcAc_5d2s_3sJd() {
    assertEquals(
      "3sJd 5d2s JcAc",
      Solver.process("texas-holdem 2h7d8h9cAh JcAc 5d2s 3sJd"));
  }

  @Test
  public void test_texas_holdem_2712_2h3c3d8hQs_9cQd_9d7s_JhKs_5h8s_6h8c_AdAs_2sTh_6dTc() {
    assertEquals(
      "9d7s 6dTc JhKs 2sTh 5h8s=6h8c 9cQd AdAs",
      Solver.process("texas-holdem 2h3c3d8hQs 9cQd 9d7s JhKs 5h8s 6h8c AdAs 2sTh 6dTc"));
  }

  @Test
  public void test_texas_holdem_2713_2s3h3s7d9s_4dAd_6h6d_9hTc_KhJs_3cTh_9dTs_Qs8h_Kc5c() {
    assertEquals(
      "Qs8h Kc5c KhJs 4dAd 6h6d 9dTs=9hTc 3cTh",
      Solver.process("texas-holdem 2s3h3s7d9s 4dAd 6h6d 9hTc KhJs 3cTh 9dTs Qs8h Kc5c"));
  }

  @Test
  public void test_texas_holdem_2714_4s6s8sTcTd_TsKs_7c4d_3hQh() {
    assertEquals(
      "3hQh 7c4d TsKs",
      Solver.process("texas-holdem 4s6s8sTcTd TsKs 7c4d 3hQh"));
  }

  @Test
  public void test_texas_holdem_2715_2s3c8s9hTs_Ks8c_4cQd_Th3s() {
    assertEquals(
      "4cQd Ks8c Th3s",
      Solver.process("texas-holdem 2s3c8s9hTs Ks8c 4cQd Th3s"));
  }

  @Test
  public void test_texas_holdem_2716_2d3d4s6sTc_JhTs_Th3h_AcQs_Jd2c() {
    assertEquals(
      "AcQs Jd2c JhTs Th3h",
      Solver.process("texas-holdem 2d3d4s6sTc JhTs Th3h AcQs Jd2c"));
  }

  @Test
  public void test_texas_holdem_2717_2s4c5hKsQh_8d4d_QcTs_AcTh_QsJs_2d7d() {
    assertEquals(
      "AcTh 2d7d 8d4d QcTs QsJs",
      Solver.process("texas-holdem 2s4c5hKsQh 8d4d QcTs AcTh QsJs 2d7d"));
  }

  @Test
  public void test_texas_holdem_2718_2h6cJhQcTh_9dKd_QsTc_3dAc_7c5d() {
    assertEquals(
      "7c5d 3dAc QsTc 9dKd",
      Solver.process("texas-holdem 2h6cJhQcTh 9dKd QsTc 3dAc 7c5d"));
  }

  @Test
  public void test_texas_holdem_2719_2d3h4d5hAs_7c9d_7h5s_7sAd_Qh5c_3c9h_2sJc_8cKh_6s6d_Jh2c() {
    assertEquals(
      "2sJc=3c9h=7c9d=7h5s=7sAd=8cKh=Jh2c=Qh5c 6s6d",
      Solver.process("texas-holdem 2d3h4d5hAs 7c9d 7h5s 7sAd Qh5c 3c9h 2sJc 8cKh 6s6d Jh2c"));
  }

  @Test
  public void test_texas_holdem_2720_2d2s4d8dAd_AhQh_5hJd_3c9s_7c4h() {
    assertEquals(
      "3c9s 7c4h AhQh 5hJd",
      Solver.process("texas-holdem 2d2s4d8dAd AhQh 5hJd 3c9s 7c4h"));
  }

  @Test
  public void test_texas_holdem_2721_2d5d5sAdTd_3d6s_2s9h_Kd3c_KsJs() {
    assertEquals(
      "KsJs 2s9h 3d6s Kd3c",
      Solver.process("texas-holdem 2d5d5sAdTd 3d6s 2s9h Kd3c KsJs"));
  }

  @Test
  public void test_texas_holdem_2722_3h7c8h8sQc_5s5d_9cQd_KhTs_4hKc_2cJd_QsAc_4cTd_2dAh_Jc7d() {
    assertEquals(
      "4cTd 2cJd 4hKc KhTs 2dAh 5s5d Jc7d 9cQd QsAc",
      Solver.process("texas-holdem 3h7c8h8sQc 5s5d 9cQd KhTs 4hKc 2cJd QsAc 4cTd 2dAh Jc7d"));
  }

  @Test
  public void test_texas_holdem_2723_5h8sAhJcTh_4s2d_AsQc_6h6d_5sJh_Jd2c() {
    assertEquals(
      "4s2d 6h6d Jd2c AsQc 5sJh",
      Solver.process("texas-holdem 5h8sAhJcTh 4s2d AsQc 6h6d 5sJh Jd2c"));
  }

  @Test
  public void test_texas_holdem_2724_9cAdKhQcQd_2s3s_Kc6h_Ts5s_8d6c_Ah2d_7c4c_6d9s_3h9h_8c2h() {
    assertEquals(
      "2s3s=7c4c=8c2h=8d6c Ts5s 3h9h=6d9s Kc6h Ah2d",
      Solver.process("texas-holdem 9cAdKhQcQd 2s3s Kc6h Ts5s 8d6c Ah2d 7c4c 6d9s 3h9h 8c2h"));
  }

  @Test
  public void test_texas_holdem_2725_3s5s6c7c7s_JhKd_5c9d_Qh3h_2s2d_7d4d_Ts8s_6h4c_2h8d_4hKs() {
    assertEquals(
      "2h8d JhKd 2s2d Qh3h 5c9d 4hKs=6h4c=7d4d Ts8s",
      Solver.process("texas-holdem 3s5s6c7c7s JhKd 5c9d Qh3h 2s2d 7d4d Ts8s 6h4c 2h8d 4hKs"));
  }

  @Test
  public void test_texas_holdem_2726_2c3c3s7c8c_9cQs_2dAh_7s8s_7d4c_6dTc_4h6s_8h4s_Js2s_JhKs() {
    assertEquals(
      "4h6s JhKs Js2s 2dAh 8h4s 7s8s 7d4c 9cQs 6dTc",
      Solver.process("texas-holdem 2c3c3s7c8c 9cQs 2dAh 7s8s 7d4c 6dTc 4h6s 8h4s Js2s JhKs"));
  }

  @Test
  public void test_texas_holdem_2727_4d9dAdKcKh_2d7s_6cJd_Qd6d_Qs5h() {
    assertEquals(
      "2d7s 6cJd Qs5h Qd6d",
      Solver.process("texas-holdem 4d9dAdKcKh 2d7s 6cJd Qd6d Qs5h"));
  }

  @Test
  public void test_texas_holdem_2728_4c6d7sQsTh_3h4d_4h6s_5h3c_7d8s_6hKs_4sJd_8cQc() {
    assertEquals(
      "3h4d 4sJd 6hKs 7d8s 8cQc 4h6s 5h3c",
      Solver.process("texas-holdem 4c6d7sQsTh 3h4d 4h6s 5h3c 7d8s 6hKs 4sJd 8cQc"));
  }

  @Test
  public void test_texas_holdem_2729_4d5s7hAhKc_QhJd_8c3h_Qs9h() {
    assertEquals(
      "8c3h Qs9h QhJd",
      Solver.process("texas-holdem 4d5s7hAhKc QhJd 8c3h Qs9h"));
  }

  @Test
  public void test_texas_holdem_2730_4c9h9sAhKc_5c7h_5h3d_KhTd_2c6s() {
    assertEquals(
      "5h3d 2c6s 5c7h KhTd",
      Solver.process("texas-holdem 4c9h9sAhKc 5c7h 5h3d KhTd 2c6s"));
  }

  @Test
  public void test_texas_holdem_2731_2h2s3h4sQh_6sTs_6d3c_ThJh_9sTc_KcAh() {
    assertEquals(
      "6sTs 9sTc KcAh 6d3c ThJh",
      Solver.process("texas-holdem 2h2s3h4sQh 6sTs 6d3c ThJh 9sTc KcAh"));
  }

  @Test
  public void test_texas_holdem_2732_4s6s9dJcQc_4c8d_4d6h_Kc6c_Qh5c_7dAs() {
    assertEquals(
      "7dAs 4c8d Kc6c Qh5c 4d6h",
      Solver.process("texas-holdem 4s6s9dJcQc 4c8d 4d6h Kc6c Qh5c 7dAs"));
  }

  @Test
  public void test_texas_holdem_2733_6c8c9cQhTd_9sTc_2d5c_Ad4s_JhKh_Jd5s_4d9h_9d7h_As3h() {
    assertEquals(
      "2d5c Ad4s=As3h 4d9h 9sTc 9d7h Jd5s JhKh",
      Solver.process("texas-holdem 6c8c9cQhTd 9sTc 2d5c Ad4s JhKh Jd5s 4d9h 9d7h As3h"));
  }

  @Test
  public void test_texas_holdem_2734_2s4d6dAsTc_7dAh_Ac7h_2c2d() {
    assertEquals(
      "7dAh=Ac7h 2c2d",
      Solver.process("texas-holdem 2s4d6dAsTc 7dAh Ac7h 2c2d"));
  }

  @Test
  public void test_texas_holdem_2735_2d4h5dJcKd_2c9s_6dAc_Ts5s_8d2s_5hKc_QcJd() {
    assertEquals(
      "6dAc 8d2s 2c9s Ts5s QcJd 5hKc",
      Solver.process("texas-holdem 2d4h5dJcKd 2c9s 6dAc Ts5s 8d2s 5hKc QcJd"));
  }

  @Test
  public void test_texas_holdem_2736_4cAcAhAsTh_Kd2c_Ts6d_Jh5s_KcQd_Js6h_3d4s_3sQc_5c9h() {
    assertEquals(
      "5c9h Jh5s=Js6h 3sQc Kd2c KcQd 3d4s Ts6d",
      Solver.process("texas-holdem 4cAcAhAsTh Kd2c Ts6d Jh5s KcQd Js6h 3d4s 3sQc 5c9h"));
  }

  @Test
  public void test_texas_holdem_2737_2s5c9dAsTh_3h6c_Ad5d_7hJh_Ts8d() {
    assertEquals(
      "3h6c 7hJh Ts8d Ad5d",
      Solver.process("texas-holdem 2s5c9dAsTh 3h6c Ad5d 7hJh Ts8d"));
  }

  @Test
  public void test_texas_holdem_2738_4c4h5s6sTc_8d6c_9h8c_AcTh_7cAh() {
    assertEquals(
      "9h8c 7cAh 8d6c AcTh",
      Solver.process("texas-holdem 4c4h5s6sTc 8d6c 9h8c AcTh 7cAh"));
  }

  @Test
  public void test_texas_holdem_2739_3s9cQcTcTs_3cKh_9s6d_AdJc_AsKc_Qs8c_6sQh_8s5c_7h7d_5d6h() {
    assertEquals(
      "5d6h 8s5c AdJc AsKc 3cKh 7h7d 9s6d 6sQh=Qs8c",
      Solver.process("texas-holdem 3s9cQcTcTs 3cKh 9s6d AdJc AsKc Qs8c 6sQh 8s5c 7h7d 5d6h"));
  }

  @Test
  public void test_texas_holdem_2740_3h4s6s8h9h_4cKs_Qh9d_Th7c_8dTc_5d6d_Ad4d_2s2h_Jh8c() {
    assertEquals(
      "2s2h 4cKs Ad4d 5d6d 8dTc Jh8c Qh9d Th7c",
      Solver.process("texas-holdem 3h4s6s8h9h 4cKs Qh9d Th7c 8dTc 5d6d Ad4d 2s2h Jh8c"));
  }

  @Test
  public void test_texas_holdem_2741_4h5h8sJdKs_TdTs_6h6d_8hKh() {
    assertEquals(
      "6h6d TdTs 8hKh",
      Solver.process("texas-holdem 4h5h8sJdKs TdTs 6h6d 8hKh"));
  }

  @Test
  public void test_texas_holdem_2742_5s6c6d9dAh_8dQd_6sKs_4dTs_9hTh_9cQs_TcKc() {
    assertEquals(
      "4dTs 8dQd TcKc 9cQs=9hTh 6sKs",
      Solver.process("texas-holdem 5s6c6d9dAh 8dQd 6sKs 4dTs 9hTh 9cQs TcKc"));
  }

  @Test
  public void test_texas_holdem_2743_7d8hJdKsTd_TsJc_QcQh_8d4s_9d6d_5cAs_Kd8c() {
    assertEquals(
      "5cAs 8d4s QcQh TsJc Kd8c 9d6d",
      Solver.process("texas-holdem 7d8hJdKsTd TsJc QcQh 8d4s 9d6d 5cAs Kd8c"));
  }

  @Test
  public void test_texas_holdem_2744_3c3h7h8dAh_7dQs_QdQc_8sJd_6hKc_Jc4d() {
    assertEquals(
      "Jc4d 6hKc 7dQs 8sJd QdQc",
      Solver.process("texas-holdem 3c3h7h8dAh 7dQs QdQc 8sJd 6hKc Jc4d"));
  }

  @Test
  public void test_texas_holdem_2745_2c3h5hAhAs_3dQh_QcTs_7d4h() {
    assertEquals(
      "QcTs 3dQh 7d4h",
      Solver.process("texas-holdem 2c3h5hAhAs 3dQh QcTs 7d4h"));
  }

  @Test
  public void test_texas_holdem_2746_3d8dJdKdTh_TsJh_4h2s_4c4d_6d7c_8cKh_5c8s_9c3h_Td2d() {
    assertEquals(
      "4h2s 9c3h 5c8s TsJh 8cKh 4c4d 6d7c Td2d",
      Solver.process("texas-holdem 3d8dJdKdTh TsJh 4h2s 4c4d 6d7c 8cKh 5c8s 9c3h Td2d"));
  }

  @Test
  public void test_texas_holdem_2747_2d5c5d9hKd_6sQh_8dQc_4c3d_8hTd() {
    assertEquals(
      "4c3d 8hTd 6sQh=8dQc",
      Solver.process("texas-holdem 2d5c5d9hKd 6sQh 8dQc 4c3d 8hTd"));
  }

  @Test
  public void test_texas_holdem_2748_4d8s9hThTs_Qd2h_8cQs_Td3h_4s3d() {
    assertEquals(
      "Qd2h 4s3d 8cQs Td3h",
      Solver.process("texas-holdem 4d8s9hThTs Qd2h 8cQs Td3h 4s3d"));
  }

  @Test
  public void test_texas_holdem_2749_3d3h6d7dJh_QdQc_Ks5s_9d4s_4h6c() {
    assertEquals(
      "9d4s Ks5s 4h6c QdQc",
      Solver.process("texas-holdem 3d3h6d7dJh QdQc Ks5s 9d4s 4h6c"));
  }

}
