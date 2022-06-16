
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver11HiddenTest {


  @Test
  public void test_texas_holdem_2750_2s4s9cAhJh_2d4d_8dJd_3c8s_Kd6s_Kh7s() {
    assertEquals(
      "3c8s Kd6s Kh7s 8dJd 2d4d",
      Solver.process("texas-holdem 2s4s9cAhJh 2d4d 8dJd 3c8s Kd6s Kh7s"));
  }

  @Test
  public void test_texas_holdem_2751_2h3h6h9dKh_5dJc_7cAs_JhQc() {
    assertEquals(
      "5dJc 7cAs JhQc",
      Solver.process("texas-holdem 2h3h6h9dKh 5dJc 7cAs JhQc"));
  }

  @Test
  public void test_texas_holdem_2752_4cAhKhTcTd_4s3c_Ts3d_KdKc_6s3h_Qd7d() {
    assertEquals(
      "6s3h Qd7d 4s3c Ts3d KdKc",
      Solver.process("texas-holdem 4cAhKhTcTd 4s3c Ts3d KdKc 6s3h Qd7d"));
  }

  @Test
  public void test_texas_holdem_2753_5c6hJsKdKh_7s7d_5sJh_Th2d_4dAs_JcQc() {
    assertEquals(
      "Th2d 4dAs 7s7d 5sJh JcQc",
      Solver.process("texas-holdem 5c6hJsKdKh 7s7d 5sJh Th2d 4dAs JcQc"));
  }

  @Test
  public void test_texas_holdem_2754_4h7d8cKsTs_QsTc_2d4c_6c2s_5h3s_2cQd_7hAh_9c8d_Jh9h() {
    assertEquals(
      "5h3s 6c2s 2cQd 2d4c 7hAh 9c8d QsTc Jh9h",
      Solver.process("texas-holdem 4h7d8cKsTs QsTc 2d4c 6c2s 5h3s 2cQd 7hAh 9c8d Jh9h"));
  }

  @Test
  public void test_texas_holdem_2755_6s7d9dJsKs_7sAh_6d6h() {
    assertEquals(
      "7sAh 6d6h",
      Solver.process("texas-holdem 6s7d9dJsKs 7sAh 6d6h"));
  }

  @Test
  public void test_texas_holdem_2756_3d4s5s6hTc_AcJc_8s4d_7dQs_7hKc_9c9h_3sKh_Jd8h_3hTs() {
    assertEquals(
      "Jd8h AcJc 3sKh 8s4d 9c9h 3hTs 7dQs=7hKc",
      Solver.process("texas-holdem 3d4s5s6hTc AcJc 8s4d 7dQs 7hKc 9c9h 3sKh Jd8h 3hTs"));
  }

  @Test
  public void test_texas_holdem_2757_2d4d7dQcTc_Ah7c_2h9c_8sAd_2c8h_QsJd_7h5s_6hKs_3c6d() {
    assertEquals(
      "3c6d 6hKs 8sAd 2c8h 2h9c 7h5s Ah7c QsJd",
      Solver.process("texas-holdem 2d4d7dQcTc Ah7c 2h9c 8sAd 2c8h QsJd 7h5s 6hKs 3c6d"));
  }

  @Test
  public void test_texas_holdem_2758_2c6c6dTcTs_KhKs_JcQs_JsKc_6sKd_7d8h_Ad9h() {
    assertEquals(
      "7d8h JcQs JsKc Ad9h KhKs 6sKd",
      Solver.process("texas-holdem 2c6c6dTcTs KhKs JcQs JsKc 6sKd 7d8h Ad9h"));
  }

  @Test
  public void test_texas_holdem_2759_5s6d7hJcQs_4sQd_AdKh_9s7d() {
    assertEquals(
      "AdKh 9s7d 4sQd",
      Solver.process("texas-holdem 5s6d7hJcQs 4sQd AdKh 9s7d"));
  }

  @Test
  public void test_texas_holdem_2760_2d4d7sJhQh_5h6c_KsTc_2s3h_4cJs() {
    assertEquals(
      "5h6c KsTc 2s3h 4cJs",
      Solver.process("texas-holdem 2d4d7sJhQh 5h6c KsTc 2s3h 4cJs"));
  }

  @Test
  public void test_texas_holdem_2761_5h6s9c9hQc_5dJd_9d4c_6cAc_3d9s_5c3h_2hJs_7sQh() {
    assertEquals(
      "2hJs 5c3h=5dJd 6cAc 7sQh 3d9s=9d4c",
      Solver.process("texas-holdem 5h6s9c9hQc 5dJd 9d4c 6cAc 3d9s 5c3h 2hJs 7sQh"));
  }

  @Test
  public void test_texas_holdem_2762_4h7c7hKhQd_2c5c_4cAd_9sTc() {
    assertEquals(
      "2c5c 9sTc 4cAd",
      Solver.process("texas-holdem 4h7c7hKhQd 2c5c 4cAd 9sTc"));
  }

  @Test
  public void test_texas_holdem_2763_5d9cJsKhQh_6h7d_8dAc_2d8s_3hTd() {
    assertEquals(
      "6h7d 2d8s 8dAc 3hTd",
      Solver.process("texas-holdem 5d9cJsKhQh 6h7d 8dAc 2d8s 3hTd"));
  }

  @Test
  public void test_texas_holdem_2764_3d5h7s9hJc_AdTc_Kd4c_Qh8s_5dAh() {
    assertEquals(
      "Qh8s Kd4c AdTc 5dAh",
      Solver.process("texas-holdem 3d5h7s9hJc AdTc Kd4c Qh8s 5dAh"));
  }

  @Test
  public void test_texas_holdem_2765_3h4c5cKcTc_Qh4h_2c7s_9sQs_Ts8h_2h2s() {
    assertEquals(
      "9sQs 2h2s Qh4h Ts8h 2c7s",
      Solver.process("texas-holdem 3h4c5cKcTc Qh4h 2c7s 9sQs Ts8h 2h2s"));
  }

  @Test
  public void test_texas_holdem_2766_7h8dAcKdQd_5dQc_Qh8h_KcKs_2sQs_6d7d_Td6s_5sTs_6c4h_Jh6h() {
    assertEquals(
      "6c4h 5sTs=Td6s Jh6h 2sQs=5dQc Qh8h KcKs 6d7d",
      Solver.process("texas-holdem 7h8dAcKdQd 5dQc Qh8h KcKs 2sQs 6d7d Td6s 5sTs 6c4h Jh6h"));
  }

  @Test
  public void test_texas_holdem_2767_2s6d8sAcKs_Ah3s_2h2c_Kh5s_Ts6c_8hQh_TdTh() {
    assertEquals(
      "Ts6c 8hQh TdTh Kh5s Ah3s 2h2c",
      Solver.process("texas-holdem 2s6d8sAcKs Ah3s 2h2c Kh5s Ts6c 8hQh TdTh"));
  }

  @Test
  public void test_texas_holdem_2768_4c8h9d9sKs_As2s_Ac2d_6c5h() {
    assertEquals(
      "6c5h Ac2d=As2s",
      Solver.process("texas-holdem 4c8h9d9sKs As2s Ac2d 6c5h"));
  }

  @Test
  public void test_texas_holdem_2769_2h2s3c6hKh_Ts8h_AdJh_9c5c() {
    assertEquals(
      "9c5c Ts8h AdJh",
      Solver.process("texas-holdem 2h2s3c6hKh Ts8h AdJh 9c5c"));
  }

  @Test
  public void test_texas_holdem_2770_2s4s7d8hTc_TsJd_9h8d_Kh2c_4dJh_Kc9s_7sTd() {
    assertEquals(
      "Kc9s Kh2c 4dJh 9h8d TsJd 7sTd",
      Solver.process("texas-holdem 2s4s7d8hTc TsJd 9h8d Kh2c 4dJh Kc9s 7sTd"));
  }

  @Test
  public void test_texas_holdem_2771_4h6h8hJcJd_2c3s_4d7h_Ad6d_AhAc_3dQc_Js5h_5dKd() {
    assertEquals(
      "2c3s 3dQc 5dKd 4d7h Ad6d AhAc Js5h",
      Solver.process("texas-holdem 4h6h8hJcJd 2c3s 4d7h Ad6d AhAc 3dQc Js5h 5dKd"));
  }

  @Test
  public void test_texas_holdem_2772_6d7dJcTcTd_9c3s_Qs5h_2cTh_5sQc() {
    assertEquals(
      "9c3s 5sQc=Qs5h 2cTh",
      Solver.process("texas-holdem 6d7dJcTcTd 9c3s Qs5h 2cTh 5sQc"));
  }

  @Test
  public void test_texas_holdem_2773_2h4cAhJcQh_6sTc_6h9c_7s3h_KhJs_Ad7h_Td3c() {
    assertEquals(
      "7s3h 6h9c Td3c 6sTc KhJs Ad7h",
      Solver.process("texas-holdem 2h4cAhJcQh 6sTc 6h9c 7s3h KhJs Ad7h Td3c"));
  }

  @Test
  public void test_texas_holdem_2774_2c5h8d9dKs_2d9s_Kh9c_Ts3d_6c7c_5c9h_2sQd_Th8c_3hQs() {
    assertEquals(
      "Ts3d 3hQs 2sQd Th8c 2d9s 5c9h Kh9c 6c7c",
      Solver.process("texas-holdem 2c5h8d9dKs 2d9s Kh9c Ts3d 6c7c 5c9h 2sQd Th8c 3hQs"));
  }

  @Test
  public void test_texas_holdem_2775_5c7dJdThTs_TdQs_KdAc_6d5s_4cKc_4s7s_3c8d() {
    assertEquals(
      "3c8d 4cKc KdAc 6d5s 4s7s TdQs",
      Solver.process("texas-holdem 5c7dJdThTs TdQs KdAc 6d5s 4cKc 4s7s 3c8d"));
  }

  @Test
  public void test_texas_holdem_2776_2s9cJdKcKd_5d4c_6cAh() {
    assertEquals(
      "5d4c 6cAh",
      Solver.process("texas-holdem 2s9cJdKcKd 5d4c 6cAh"));
  }

  @Test
  public void test_texas_holdem_2777_3h5d6cKcQs_9h6d_QcJd_2d2c_8c4c_3s5c_7d5s_Kd5h() {
    assertEquals(
      "8c4c 2d2c 7d5s 9h6d QcJd 3s5c Kd5h",
      Solver.process("texas-holdem 3h5d6cKcQs 9h6d QcJd 2d2c 8c4c 3s5c 7d5s Kd5h"));
  }

  @Test
  public void test_texas_holdem_2778_4s7h8dAsTd_3dAd_JsAc() {
    assertEquals(
      "3dAd JsAc",
      Solver.process("texas-holdem 4s7h8dAsTd 3dAd JsAc"));
  }

  @Test
  public void test_texas_holdem_2779_3s4c5d5sTd_4d5c_4h2h_5hJc_8d2s() {
    assertEquals(
      "8d2s 4h2h 5hJc 4d5c",
      Solver.process("texas-holdem 3s4c5d5sTd 4d5c 4h2h 5hJc 8d2s"));
  }

  @Test
  public void test_texas_holdem_2780_4s5c5d9hAc_JhKs_9s2d_2c3s_Th7c_8sTd_AhKd_3c3h_9c2s() {
    assertEquals(
      "8sTd=Th7c JhKs 3c3h 9c2s=9s2d AhKd 2c3s",
      Solver.process("texas-holdem 4s5c5d9hAc JhKs 9s2d 2c3s Th7c 8sTd AhKd 3c3h 9c2s"));
  }

  @Test
  public void test_texas_holdem_2781_6d7c8cQhTs_4s4d_6sQd_3s5s_As2s_TdTh_Qc6c_9d2c_8s2d_KcKd() {
    assertEquals(
      "3s5s As2s 4s4d 8s2d KcKd 6sQd=Qc6c TdTh 9d2c",
      Solver.process("texas-holdem 6d7c8cQhTs 4s4d 6sQd 3s5s As2s TdTh Qc6c 9d2c 8s2d KcKd"));
  }

  @Test
  public void test_texas_holdem_2782_2c3h4dKsTd_4cAd_9c5c_Kh3d_6dTs_Kd6s_5s2d_7h2s_4s8c_7c9s() {
    assertEquals(
      "9c5c 7c9s 5s2d 7h2s 4s8c 4cAd 6dTs Kd6s Kh3d",
      Solver.process("texas-holdem 2c3h4dKsTd 4cAd 9c5c Kh3d 6dTs Kd6s 5s2d 7h2s 4s8c 7c9s"));
  }

  @Test
  public void test_texas_holdem_2783_9cAdJcKhQc_2d2s_5c6c_Jh9d() {
    assertEquals(
      "2d2s Jh9d 5c6c",
      Solver.process("texas-holdem 9cAdJcKhQc 2d2s 5c6c Jh9d"));
  }

  @Test
  public void test_texas_holdem_2784_3d8dJcKcTs_4h3c_Qd6d_Jd5h() {
    assertEquals(
      "Qd6d 4h3c Jd5h",
      Solver.process("texas-holdem 3d8dJcKcTs 4h3c Qd6d Jd5h"));
  }

  @Test
  public void test_texas_holdem_2785_4c6c6s7cQh_Qd8c_6hJs() {
    assertEquals(
      "Qd8c 6hJs",
      Solver.process("texas-holdem 4c6c6s7cQh Qd8c 6hJs"));
  }

  @Test
  public void test_texas_holdem_2786_4d8h9sJcQh_TcTh_4s3c_6sKh_9dQs_As4c_4hJs() {
    assertEquals(
      "6sKh 4s3c As4c 4hJs 9dQs TcTh",
      Solver.process("texas-holdem 4d8h9sJcQh TcTh 4s3c 6sKh 9dQs As4c 4hJs"));
  }

  @Test
  public void test_texas_holdem_2787_2c5d6dKhTs_2h7c_3sKs_Tc2s_2d8h_KcJc() {
    assertEquals(
      "2h7c 2d8h 3sKs KcJc Tc2s",
      Solver.process("texas-holdem 2c5d6dKhTs 2h7c 3sKs Tc2s 2d8h KcJc"));
  }

  @Test
  public void test_texas_holdem_2788_3d6c6d7hJd_Kh2c_TsKc_2d5s_5h3c_7c7d() {
    assertEquals(
      "2d5s Kh2c TsKc 5h3c 7c7d",
      Solver.process("texas-holdem 3d6c6d7hJd Kh2c TsKc 2d5s 5h3c 7c7d"));
  }

  @Test
  public void test_texas_holdem_2789_6d7c8dAcAs_7dKh_9dTd_Ah2c_Js7h_6c3d() {
    assertEquals(
      "6c3d Js7h 7dKh Ah2c 9dTd",
      Solver.process("texas-holdem 6d7c8dAcAs 7dKh 9dTd Ah2c Js7h 6c3d"));
  }

  @Test
  public void test_texas_holdem_2790_4h9c9dQcTh_6c5h_TdTc_4dKh_3s5s_7s2d_Jh8d_KsKd_3dQs() {
    assertEquals(
      "3s5s 6c5h 7s2d 4dKh 3dQs KsKd Jh8d TdTc",
      Solver.process("texas-holdem 4h9c9dQcTh 6c5h TdTc 4dKh 3s5s 7s2d Jh8d KsKd 3dQs"));
  }

  @Test
  public void test_texas_holdem_2791_2sAcKcQhTs_Kd8d_3h7c_4d7s_7d5h_8hJc_5cQc_6sAh_Js3d_4cKh() {
    assertEquals(
      "3h7c=4d7s=7d5h 5cQc 4cKh=Kd8d 6sAh 8hJc=Js3d",
      Solver.process("texas-holdem 2sAcKcQhTs Kd8d 3h7c 4d7s 7d5h 8hJc 5cQc 6sAh Js3d 4cKh"));
  }

  @Test
  public void test_texas_holdem_2792_2h3d7d8s9c_5c7h_Qs5s_5hAs_Kd3s_4h4d_Kc3c_4c5d_Ts2s_9hAh() {
    assertEquals(
      "4c5d Qs5s 5hAs Ts2s Kc3c=Kd3s 4h4d 5c7h 9hAh",
      Solver.process("texas-holdem 2h3d7d8s9c 5c7h Qs5s 5hAs Kd3s 4h4d Kc3c 4c5d Ts2s 9hAh"));
  }

  @Test
  public void test_texas_holdem_2793_4c6d7h8sKh_9d3c_7sTc_6sAd_9cAs_5h5c_2sAh_KdJh() {
    assertEquals(
      "9d3c 2sAh 9cAs 6sAd 7sTc KdJh 5h5c",
      Solver.process("texas-holdem 4c6d7h8sKh 9d3c 7sTc 6sAd 9cAs 5h5c 2sAh KdJh"));
  }

  @Test
  public void test_texas_holdem_2794_2c2h3s6h8h_4s5s_9d9s_Qc4c() {
    assertEquals(
      "Qc4c 9d9s 4s5s",
      Solver.process("texas-holdem 2c2h3s6h8h 4s5s 9d9s Qc4c"));
  }

  @Test
  public void test_texas_holdem_2795_2h6cJhJsKh_8sKs_TsKd_AhQh_3cQd_4sJd() {
    assertEquals(
      "3cQd 8sKs TsKd 4sJd AhQh",
      Solver.process("texas-holdem 2h6cJhJsKh 8sKs TsKd AhQh 3cQd 4sJd"));
  }

  @Test
  public void test_texas_holdem_2796_3s4sAsJsQd_Td8s_KdQh_QsAc_7h4c_KsJh_6s3d() {
    assertEquals(
      "7h4c KdQh 6s3d Td8s QsAc KsJh",
      Solver.process("texas-holdem 3s4sAsJsQd Td8s KdQh QsAc 7h4c KsJh 6s3d"));
  }

  @Test
  public void test_texas_holdem_2797_3c3s4d5dQh_As5h_7h4c_AcKh() {
    assertEquals(
      "AcKh 7h4c As5h",
      Solver.process("texas-holdem 3c3s4d5dQh As5h 7h4c AcKh"));
  }

  @Test
  public void test_texas_holdem_2798_4c6c9sKdTs_6hJc_AsQs() {
    assertEquals(
      "AsQs 6hJc",
      Solver.process("texas-holdem 4c6c9sKdTs 6hJc AsQs"));
  }

  @Test
  public void test_texas_holdem_2799_6h8cJsKcQd_5s3h_9d8s_Jc5c_4dAs_9c3d_7c8d_Ac4h_Qc6c() {
    assertEquals(
      "5s3h 9c3d 4dAs=Ac4h 7c8d=9d8s Jc5c Qc6c",
      Solver.process("texas-holdem 6h8cJsKcQd 5s3h 9d8s Jc5c 4dAs 9c3d 7c8d Ac4h Qc6c"));
  }

  @Test
  public void test_texas_holdem_2800_2c2s7cJsQs_AcJh_9h3d_7h4d_2h4h() {
    assertEquals(
      "9h3d 7h4d AcJh 2h4h",
      Solver.process("texas-holdem 2c2s7cJsQs AcJh 9h3d 7h4d 2h4h"));
  }

  @Test
  public void test_texas_holdem_2801_4h4sKhQcQh_JhJc_5cTs_8d7s_Td9d_5sJd_8s3h_6c5h_AsKc_6dAh() {
    assertEquals(
      "5cTs=5sJd=6c5h=8d7s=8s3h=Td9d 6dAh JhJc AsKc",
      Solver.process("texas-holdem 4h4sKhQcQh JhJc 5cTs 8d7s Td9d 5sJd 8s3h 6c5h AsKc 6dAh"));
  }

  @Test
  public void test_texas_holdem_2802_3h5h8hAcAh_8sJc_Jd9h_JsQc() {
    assertEquals(
      "JsQc 8sJc Jd9h",
      Solver.process("texas-holdem 3h5h8hAcAh 8sJc Jd9h JsQc"));
  }

  @Test
  public void test_texas_holdem_2803_2c2s5s6c6s_7sTd_JcJh_4s5h_3s6d_Ah9d_Kh8d_Qh7h() {
    assertEquals(
      "7sTd Qh7h Kh8d Ah9d 4s5h JcJh 3s6d",
      Solver.process("texas-holdem 2c2s5s6c6s 7sTd JcJh 4s5h 3s6d Ah9d Kh8d Qh7h"));
  }

  @Test
  public void test_texas_holdem_2804_3s5s6cQcQd_9dAc_4s7d_Tc7s_5h8d_8c4d_KhJs_9h4c_JdTh_7cAs() {
    assertEquals(
      "8c4d 9h4c Tc7s JdTh KhJs 7cAs 9dAc 5h8d 4s7d",
      Solver.process("texas-holdem 3s5s6cQcQd 9dAc 4s7d Tc7s 5h8d 8c4d KhJs 9h4c JdTh 7cAs"));
  }

  @Test
  public void test_texas_holdem_2805_2h3c7c9d9s_AcJc_8s8d_6cTs_3sKs_Jh4c_7d7h_KcAh_5c8c() {
    assertEquals(
      "5c8c 6cTs Jh4c AcJc KcAh 3sKs 8s8d 7d7h",
      Solver.process("texas-holdem 2h3c7c9d9s AcJc 8s8d 6cTs 3sKs Jh4c 7d7h KcAh 5c8c"));
  }

  @Test
  public void test_texas_holdem_2806_6d8d8sAdQh_9sKc_Ts2c_Qc7s_4h8c_Jd9c_4cJs_3d6s_Qd7h_2h7c() {
    assertEquals(
      "2h7c Ts2c 4cJs=Jd9c 9sKc 3d6s Qc7s=Qd7h 4h8c",
      Solver.process("texas-holdem 6d8d8sAdQh 9sKc Ts2c Qc7s 4h8c Jd9c 4cJs 3d6s Qd7h 2h7c"));
  }

  @Test
  public void test_texas_holdem_2807_3cAcAsKsQd_Td5h_AhTc() {
    assertEquals(
      "Td5h AhTc",
      Solver.process("texas-holdem 3cAcAsKsQd Td5h AhTc"));
  }

  @Test
  public void test_texas_holdem_2808_5dAsKcTdTh_QdJd_AcJh_4c9d_5h8d_Qh7d() {
    assertEquals(
      "4c9d Qh7d 5h8d AcJh QdJd",
      Solver.process("texas-holdem 5dAsKcTdTh QdJd AcJh 4c9d 5h8d Qh7d"));
  }

  @Test
  public void test_texas_holdem_2809_3h6c9dAhQs_Ac5d_6s5h_Jd8s_9hJh_Qh8c() {
    assertEquals(
      "Jd8s 6s5h 9hJh Qh8c Ac5d",
      Solver.process("texas-holdem 3h6c9dAhQs Ac5d 6s5h Jd8s 9hJh Qh8c"));
  }

  @Test
  public void test_texas_holdem_2810_4c7sJsKsTs_8c4h_Th2d_5dAs() {
    assertEquals(
      "8c4h Th2d 5dAs",
      Solver.process("texas-holdem 4c7sJsKsTs 8c4h Th2d 5dAs"));
  }

  @Test
  public void test_texas_holdem_2811_4s8cAcKsTh_Jc6h_Ah2h() {
    assertEquals(
      "Jc6h Ah2h",
      Solver.process("texas-holdem 4s8cAcKsTh Jc6h Ah2h"));
  }

  @Test
  public void test_texas_holdem_2812_4d5hJcKhQs_7h4h_2sJh_7c8d_As4s_Ks8c_3cQd_9c7d() {
    assertEquals(
      "7c8d 9c7d 7h4h As4s 2sJh 3cQd Ks8c",
      Solver.process("texas-holdem 4d5hJcKhQs 7h4h 2sJh 7c8d As4s Ks8c 3cQd 9c7d"));
  }

  @Test
  public void test_texas_holdem_2813_2c2h5c9dQh_Kd8s_9c4c_3hKs_3s5d_9hJh() {
    assertEquals(
      "3hKs=Kd8s 3s5d 9c4c=9hJh",
      Solver.process("texas-holdem 2c2h5c9dQh Kd8s 9c4c 3hKs 3s5d 9hJh"));
  }

  @Test
  public void test_texas_holdem_2814_5s6h9dJsQs_KsJh_AsQd_2sTs_7hJc_9s3c_2d4s_5cKc_KdKh() {
    assertEquals(
      "2d4s 5cKc 9s3c 7hJc KsJh AsQd KdKh 2sTs",
      Solver.process("texas-holdem 5s6h9dJsQs KsJh AsQd 2sTs 7hJc 9s3c 2d4s 5cKc KdKh"));
  }

  @Test
  public void test_texas_holdem_2815_2h3h6c9cTs_7c3d_6dTc_KsQh_As4d_9dKc_Th4c_8d5h_Ad4s() {
    assertEquals(
      "8d5h KsQh Ad4s=As4d 7c3d 9dKc Th4c 6dTc",
      Solver.process("texas-holdem 2h3h6c9cTs 7c3d 6dTc KsQh As4d 9dKc Th4c 8d5h Ad4s"));
  }

  @Test
  public void test_texas_holdem_2816_3d5d7dAhAs_AcTc_Qs9d_4s7c_Kd4d_9s2d_8d4c_Td2c() {
    assertEquals(
      "8d4c 9s2d Td2c Qs9d 4s7c AcTc Kd4d",
      Solver.process("texas-holdem 3d5d7dAhAs AcTc Qs9d 4s7c Kd4d 9s2d 8d4c Td2c"));
  }

  @Test
  public void test_texas_holdem_2817_2d5c5s7hQs_6dJh_8cAd_Ks7s_5d3d_8s9h_2cKc_4s4h_9c3s() {
    assertEquals(
      "9c3s 8s9h 6dJh 8cAd 2cKc 4s4h Ks7s 5d3d",
      Solver.process("texas-holdem 2d5c5s7hQs 6dJh 8cAd Ks7s 5d3d 8s9h 2cKc 4s4h 9c3s"));
  }

  @Test
  public void test_texas_holdem_2818_2c3s7s8dTd_QdAc_5cQc_JhTc_Th6h_4hTs() {
    assertEquals(
      "5cQc QdAc 4hTs Th6h JhTc",
      Solver.process("texas-holdem 2c3s7s8dTd QdAc 5cQc JhTc Th6h 4hTs"));
  }

  @Test
  public void test_texas_holdem_2819_2h4c4s8dTh_2cAc_QdQh_2dKh_6h3h_Jd6s_JcAd_7sTd_9c6c() {
    assertEquals(
      "6h3h 9c6c Jd6s JcAd 2dKh 2cAc 7sTd QdQh",
      Solver.process("texas-holdem 2h4c4s8dTh 2cAc QdQh 2dKh 6h3h Jd6s JcAd 7sTd 9c6c"));
  }

  @Test
  public void test_texas_holdem_2820_2c5c5hAdTs_9d3d_2s6c_Js7d_3hAc_4dQc_Jc4h() {
    assertEquals(
      "9d3d Jc4h=Js7d 4dQc 2s6c 3hAc",
      Solver.process("texas-holdem 2c5c5hAdTs 9d3d 2s6c Js7d 3hAc 4dQc Jc4h"));
  }

  @Test
  public void test_texas_holdem_2821_2d8s9cKdTc_9sAd_7dKs_Qd7h_3cTh_KhKc_6s5s_Jd9h() {
    assertEquals(
      "6s5s Qd7h Jd9h 9sAd 3cTh 7dKs KhKc",
      Solver.process("texas-holdem 2d8s9cKdTc 9sAd 7dKs Qd7h 3cTh KhKc 6s5s Jd9h"));
  }

  @Test
  public void test_texas_holdem_2822_4c5h7sQdQh_Tc3c_6d9s_TsJc_2h5c_AsQc_4d9d_3d3s() {
    assertEquals(
      "6d9s Tc3c TsJc 3d3s 4d9d 2h5c AsQc",
      Solver.process("texas-holdem 4c5h7sQdQh Tc3c 6d9s TsJc 2h5c AsQc 4d9d 3d3s"));
  }

  @Test
  public void test_texas_holdem_2823_2c2h4h7hQc_Th7c_4s9s_Qd3c() {
    assertEquals(
      "4s9s Th7c Qd3c",
      Solver.process("texas-holdem 2c2h4h7hQc Th7c 4s9s Qd3c"));
  }

  @Test
  public void test_texas_holdem_2824_3d6sJhThTs_9hQd_8cAc_9c5h_6c7h_As8s_Tc9d() {
    assertEquals(
      "9c5h 9hQd 8cAc=As8s 6c7h Tc9d",
      Solver.process("texas-holdem 3d6sJhThTs 9hQd 8cAc 9c5h 6c7h As8s Tc9d"));
  }

  @Test
  public void test_texas_holdem_2825_3c3d5hJhTd_4hAc_Qs5d_8sTc_4d8d_4sQc_7hKh_7c9d() {
    assertEquals(
      "4d8d 7c9d 4sQc 7hKh 4hAc Qs5d 8sTc",
      Solver.process("texas-holdem 3c3d5hJhTd 4hAc Qs5d 8sTc 4d8d 4sQc 7hKh 7c9d"));
  }

  @Test
  public void test_texas_holdem_2826_2c2d7s8dJd_Js9d_7c8s_5hKc_5s8c_AsKh_AhTd_4c6c() {
    assertEquals(
      "4c6c 5hKc AhTd AsKh 5s8c 7c8s Js9d",
      Solver.process("texas-holdem 2c2d7s8dJd Js9d 7c8s 5hKc 5s8c AsKh AhTd 4c6c"));
  }

  @Test
  public void test_texas_holdem_2827_5c7cAdJcKc_QcJs_7hKs_5sKh() {
    assertEquals(
      "5sKh 7hKs QcJs",
      Solver.process("texas-holdem 5c7cAdJcKc QcJs 7hKs 5sKh"));
  }

  @Test
  public void test_texas_holdem_2828_7c7d8hAdKc_Kh2h_Js5d_6dJc() {
    assertEquals(
      "6dJc=Js5d Kh2h",
      Solver.process("texas-holdem 7c7d8hAdKc Kh2h Js5d 6dJc"));
  }

  @Test
  public void test_texas_holdem_2829_3h7dAcKdTc_9sJs_2sJd_3c4c_7s5d() {
    assertEquals(
      "2sJd 9sJs 3c4c 7s5d",
      Solver.process("texas-holdem 3h7dAcKdTc 9sJs 2sJd 3c4c 7s5d"));
  }

  @Test
  public void test_texas_holdem_2830_3h7d8dThTs_6c9s_7hJh_2dKd_QcJd_5h3c_Ac4c_Kh2h_7s9d_3s9h() {
    assertEquals(
      "QcJd 2dKd=Kh2h Ac4c 5h3c 3s9h 7s9d 7hJh 6c9s",
      Solver.process("texas-holdem 3h7d8dThTs 6c9s 7hJh 2dKd QcJd 5h3c Ac4c Kh2h 7s9d 3s9h"));
  }

  @Test
  public void test_texas_holdem_2831_2d3hKcKhQs_5sJh_8d7s_7h6c_9d2c_AsJs_Ad2s() {
    assertEquals(
      "7h6c 8d7s 5sJh AsJs 9d2c Ad2s",
      Solver.process("texas-holdem 2d3hKcKhQs 5sJh 8d7s 7h6c 9d2c AsJs Ad2s"));
  }

  @Test
  public void test_texas_holdem_2832_3c5d5hKsTs_2h4h_AhJd() {
    assertEquals(
      "2h4h AhJd",
      Solver.process("texas-holdem 3c5d5hKsTs 2h4h AhJd"));
  }

  @Test
  public void test_texas_holdem_2833_2c3h6c6d8s_3dAd_8dJh_2hAs_4sJc_Qh5s_9dJd_9h9s_5c4d() {
    assertEquals(
      "4sJc 9dJd Qh5s 2hAs 3dAd 8dJh 9h9s 5c4d",
      Solver.process("texas-holdem 2c3h6c6d8s 3dAd 8dJh 2hAs 4sJc Qh5s 9dJd 9h9s 5c4d"));
  }

  @Test
  public void test_texas_holdem_2834_2d2h6sAhTd_Qs4s_5h6c_3c7s_Ts8d_9dKh() {
    assertEquals(
      "3c7s Qs4s 9dKh 5h6c Ts8d",
      Solver.process("texas-holdem 2d2h6sAhTd Qs4s 5h6c 3c7s Ts8d 9dKh"));
  }

  @Test
  public void test_texas_holdem_2835_7s8c8h9sKh_7h7d_8s6h_QhAc() {
    assertEquals(
      "QhAc 8s6h 7h7d",
      Solver.process("texas-holdem 7s8c8h9sKh 7h7d 8s6h QhAc"));
  }

  @Test
  public void test_texas_holdem_2836_3h5d9hJsTd_4s7c_2hKs_QdAs_6c4d_3c8c_2sTc_Jc4c() {
    assertEquals(
      "6c4d 4s7c 2hKs QdAs 3c8c 2sTc Jc4c",
      Solver.process("texas-holdem 3h5d9hJsTd 4s7c 2hKs QdAs 6c4d 3c8c 2sTc Jc4c"));
  }

  @Test
  public void test_texas_holdem_2837_2d4s8cKsQs_4h7h_Ad7c_6h7d_KhAh_5c9h() {
    assertEquals(
      "6h7d 5c9h Ad7c 4h7h KhAh",
      Solver.process("texas-holdem 2d4s8cKsQs 4h7h Ad7c 6h7d KhAh 5c9h"));
  }

  @Test
  public void test_texas_holdem_2838_2c2h6c7sAc_4d9h_TcKd_4s8s_5hJc_3dTs_5d3h_KcAs_2sTd() {
    assertEquals(
      "5d3h 4s8s 4d9h 3dTs 5hJc TcKd KcAs 2sTd",
      Solver.process("texas-holdem 2c2h6c7sAc 4d9h TcKd 4s8s 5hJc 3dTs 5d3h KcAs 2sTd"));
  }

  @Test
  public void test_texas_holdem_2839_3s5c8dAhKd_Ad5d_5h2d_ThQh_2c2h_AsJh_4c5s_9d4s_QsKs_7hQd() {
    assertEquals(
      "9d4s 7hQd ThQh 2c2h 4c5s=5h2d QsKs AsJh Ad5d",
      Solver.process("texas-holdem 3s5c8dAhKd Ad5d 5h2d ThQh 2c2h AsJh 4c5s 9d4s QsKs 7hQd"));
  }

  @Test
  public void test_texas_holdem_2840_3d5sJdJsTs_9d6s_7hKh_4s8d_8hAh_QsTd_Jh9c_Tc7d_Kc8c() {
    assertEquals(
      "4s8d 9d6s 7hKh Kc8c 8hAh Tc7d QsTd Jh9c",
      Solver.process("texas-holdem 3d5sJdJsTs 9d6s 7hKh 4s8d 8hAh QsTd Jh9c Tc7d Kc8c"));
  }

  @Test
  public void test_texas_holdem_2841_2s3s6cKsQs_6dJd_4s2h_2c4h_3d6h_5h4c_5cJh_4d5s() {
    assertEquals(
      "5cJh 2c4h 6dJd 3d6h 5h4c 4s2h 4d5s",
      Solver.process("texas-holdem 2s3s6cKsQs 6dJd 4s2h 2c4h 3d6h 5h4c 5cJh 4d5s"));
  }

  @Test
  public void test_texas_holdem_2842_6d8s9sQhTs_Kc8d_KsAs_5dTc_9h6c_5h7d() {
    assertEquals(
      "Kc8d 5dTc 9h6c 5h7d KsAs",
      Solver.process("texas-holdem 6d8s9sQhTs Kc8d KsAs 5dTc 9h6c 5h7d"));
  }

  @Test
  public void test_texas_holdem_2843_2d6h9hAcJs_4s7d_TcAs() {
    assertEquals(
      "4s7d TcAs",
      Solver.process("texas-holdem 2d6h9hAcJs 4s7d TcAs"));
  }

  @Test
  public void test_texas_holdem_2844_4d5s6d9sKh_5dQd_Td8d_9c6c_4c7h_QcJd_Qs7s() {
    assertEquals(
      "Td8d Qs7s QcJd 4c7h 5dQd 9c6c",
      Solver.process("texas-holdem 4d5s6d9sKh 5dQd Td8d 9c6c 4c7h QcJd Qs7s"));
  }

  @Test
  public void test_texas_holdem_2845_3h6d8dAcQd_3sAs_Kh3c_2s4c() {
    assertEquals(
      "2s4c Kh3c 3sAs",
      Solver.process("texas-holdem 3h6d8dAcQd 3sAs Kh3c 2s4c"));
  }

  @Test
  public void test_texas_holdem_2846_3d3hAcAsJh_2dTh_8d8h() {
    assertEquals(
      "2dTh 8d8h",
      Solver.process("texas-holdem 3d3hAcAsJh 2dTh 8d8h"));
  }

  @Test
  public void test_texas_holdem_2847_5s8dJsQdQs_8cKc_Kd8s() {
    assertEquals(
      "8cKc=Kd8s",
      Solver.process("texas-holdem 5s8dJsQdQs 8cKc Kd8s"));
  }

  @Test
  public void test_texas_holdem_2848_7c8sJcKhTs_2d2c_6s6c_Jd7s_JhQh_Ks8h() {
    assertEquals(
      "2d2c 6s6c JhQh Jd7s Ks8h",
      Solver.process("texas-holdem 7c8sJcKhTs 2d2c 6s6c Jd7s JhQh Ks8h"));
  }

  @Test
  public void test_texas_holdem_2849_3s4c4s6s7c_8d9s_7h2c() {
    assertEquals(
      "8d9s 7h2c",
      Solver.process("texas-holdem 3s4c4s6s7c 8d9s 7h2c"));
  }

  @Test
  public void test_texas_holdem_2850_4c6d8c8dAh_Jc9s_5dQc_5sJd_4h7c_2h6c_Kc9c() {
    assertEquals(
      "5sJd Jc9s 5dQc Kc9c 4h7c 2h6c",
      Solver.process("texas-holdem 4c6d8c8dAh Jc9s 5dQc 5sJd 4h7c 2h6c Kc9c"));
  }

  @Test
  public void test_texas_holdem_2851_7dAdAsKcTd_2h2c_8c3c_KsJd_6d6h() {
    assertEquals(
      "8c3c 2h2c 6d6h KsJd",
      Solver.process("texas-holdem 7dAdAsKcTd 2h2c 8c3c KsJd 6d6h"));
  }

  @Test
  public void test_texas_holdem_2852_2c5h6c6s7d_6hAc_8cQd_Kc9d_8dAd_4hTh_3dTc_TdJc_9c5s() {
    assertEquals(
      "3dTc=4hTh TdJc 8cQd Kc9d 8dAd 9c5s 6hAc",
      Solver.process("texas-holdem 2c5h6c6s7d 6hAc 8cQd Kc9d 8dAd 4hTh 3dTc TdJc 9c5s"));
  }

  @Test
  public void test_texas_holdem_2853_2d4d8h9cJs_8sJd_Kc6d_TdJc() {
    assertEquals(
      "Kc6d TdJc 8sJd",
      Solver.process("texas-holdem 2d4d8h9cJs 8sJd Kc6d TdJc"));
  }

  @Test
  public void test_texas_holdem_2854_3c4h9sJsTs_8cKh_Qs2c_7hKc_AhQc_Td5s_9d7s_Qh5c_AcKd() {
    assertEquals(
      "Qs2c Qh5c 7hKc 8cKh AhQc AcKd 9d7s Td5s",
      Solver.process("texas-holdem 3c4h9sJsTs 8cKh Qs2c 7hKc AhQc Td5s 9d7s Qh5c AcKd"));
  }

  @Test
  public void test_texas_holdem_2855_2s3s4c7cJh_AsQh_Th7s_Kh9c_Jc9d_Ac5d_2d6c_6hJs() {
    assertEquals(
      "Kh9c AsQh 2d6c Th7s 6hJs Jc9d Ac5d",
      Solver.process("texas-holdem 2s3s4c7cJh AsQh Th7s Kh9c Jc9d Ac5d 2d6c 6hJs"));
  }

  @Test
  public void test_texas_holdem_2856_2d2s5h7sAc_3hTh_8dAh_3s9d_QsJd_3c4h_9cTs_Td8c() {
    assertEquals(
      "3s9d 3hTh Td8c 9cTs QsJd 8dAh 3c4h",
      Solver.process("texas-holdem 2d2s5h7sAc 3hTh 8dAh 3s9d QsJd 3c4h 9cTs Td8c"));
  }

  @Test
  public void test_texas_holdem_2857_5c7c9dJdKh_AsTs_Ac8s_2cKc_4c7s_8dQs_6c4s_QcJh_Tc2h() {
    assertEquals(
      "6c4s Tc2h 8dQs Ac8s AsTs 4c7s QcJh 2cKc",
      Solver.process("texas-holdem 5c7c9dJdKh AsTs Ac8s 2cKc 4c7s 8dQs 6c4s QcJh Tc2h"));
  }

  @Test
  public void test_texas_holdem_2858_2d2s4hKdTc_5c7h_7s3h_JcQc_4cQs_Kc4d_KhAc_6s8s_9sKs() {
    assertEquals(
      "5c7h=7s3h 6s8s JcQc 4cQs 9sKs KhAc Kc4d",
      Solver.process("texas-holdem 2d2s4hKdTc 5c7h 7s3h JcQc 4cQs Kc4d KhAc 6s8s 9sKs"));
  }

  @Test
  public void test_texas_holdem_2859_3h5h6hKdTs_6sJh_4s4c_3s5s_Jc5c_2sJd_7cKh_5d4d_Td6d() {
    assertEquals(
      "2sJd 4s4c 5d4d Jc5c 6sJh 7cKh 3s5s Td6d",
      Solver.process("texas-holdem 3h5h6hKdTs 6sJh 4s4c 3s5s Jc5c 2sJd 7cKh 5d4d Td6d"));
  }

  @Test
  public void test_texas_holdem_2860_2s7h8dJdTd_Ah6s_TcAs_5s7s_7c5h() {
    assertEquals(
      "Ah6s 5s7s=7c5h TcAs",
      Solver.process("texas-holdem 2s7h8dJdTd Ah6s TcAs 5s7s 7c5h"));
  }

  @Test
  public void test_texas_holdem_2861_5s6c9dJdKc_Qh6h_3s5d_Th6d() {
    assertEquals(
      "3s5d Th6d Qh6h",
      Solver.process("texas-holdem 5s6c9dJdKc Qh6h 3s5d Th6d"));
  }

  @Test
  public void test_texas_holdem_2862_3s6s8hKcTd_9s9d_4c2d_KsJh() {
    assertEquals(
      "4c2d 9s9d KsJh",
      Solver.process("texas-holdem 3s6s8hKcTd 9s9d 4c2d KsJh"));
  }

  @Test
  public void test_texas_holdem_2863_4c5s8cJdTc_9d6h_6c4d_4hTd_QsTh_5dKh_7cKd() {
    assertEquals(
      "9d6h 7cKd 6c4d 5dKh QsTh 4hTd",
      Solver.process("texas-holdem 4c5s8cJdTc 9d6h 6c4d 4hTd QsTh 5dKh 7cKd"));
  }

  @Test
  public void test_texas_holdem_2864_AsJsKhQcTh_Qs2h_9hTc_KsJh_6dAh_4dKd_2cKc() {
    assertEquals(
      "2cKc=4dKd=6dAh=9hTc=KsJh=Qs2h",
      Solver.process("texas-holdem AsJsKhQcTh Qs2h 9hTc KsJh 6dAh 4dKd 2cKc"));
  }

  @Test
  public void test_texas_holdem_2865_2d4s5d6s8h_8c9s_JcAs_3d3s_9dKc_Kd4c_Tc6h_Th5c_QcAh() {
    assertEquals(
      "9dKc JcAs QcAh Kd4c Th5c Tc6h 8c9s 3d3s",
      Solver.process("texas-holdem 2d4s5d6s8h 8c9s JcAs 3d3s 9dKc Kd4c Tc6h Th5c QcAh"));
  }

  @Test
  public void test_texas_holdem_2866_3s5d6cKsQc_Qh8d_8h4c_2s3d_2d6h_7cKh_7d6d_AcKc_5sJh() {
    assertEquals(
      "8h4c 2s3d 5sJh 2d6h 7d6d Qh8d 7cKh AcKc",
      Solver.process("texas-holdem 3s5d6cKsQc Qh8d 8h4c 2s3d 2d6h 7cKh 7d6d AcKc 5sJh"));
  }

  @Test
  public void test_texas_holdem_2867_4s5d8c9cKs_Th3c_7h4d_JcAc_Jh9s_3sJs_KhAd() {
    assertEquals(
      "Th3c 3sJs JcAc 7h4d Jh9s KhAd",
      Solver.process("texas-holdem 4s5d8c9cKs Th3c 7h4d JcAc Jh9s 3sJs KhAd"));
  }

  @Test
  public void test_texas_holdem_2868_3c4c8sQdTd_9s8h_4hQs_TcQc_2c4d_6d3s_Jh2d() {
    assertEquals(
      "Jh2d 6d3s 2c4d 9s8h 4hQs TcQc",
      Solver.process("texas-holdem 3c4c8sQdTd 9s8h 4hQs TcQc 2c4d 6d3s Jh2d"));
  }

  @Test
  public void test_texas_holdem_2869_6d9dJdKcQs_4cAs_7d3d_QdAh_3s6s() {
    assertEquals(
      "4cAs 3s6s QdAh 7d3d",
      Solver.process("texas-holdem 6d9dJdKcQs 4cAs 7d3d QdAh 3s6s"));
  }

  @Test
  public void test_texas_holdem_2870_3d5s8sQsTh_9h6h_5c4c_2hKs_6d7s_4sAd_Td9c_7dQd() {
    assertEquals(
      "6d7s 9h6h 2hKs 4sAd 5c4c Td9c 7dQd",
      Solver.process("texas-holdem 3d5s8sQsTh 9h6h 5c4c 2hKs 6d7s 4sAd Td9c 7dQd"));
  }

  @Test
  public void test_texas_holdem_2871_3c4h6hKsTh_7dTc_6c5d_Kh8h() {
    assertEquals(
      "6c5d 7dTc Kh8h",
      Solver.process("texas-holdem 3c4h6hKsTh 7dTc 6c5d Kh8h"));
  }

  @Test
  public void test_texas_holdem_2872_2d4s9hJhTc_7s2h_8h8d_Ah2c_QhTh_3d7d_KhKd_6sTd_Ks2s() {
    assertEquals(
      "3d7d 7s2h Ks2s Ah2c 8h8d 6sTd QhTh KhKd",
      Solver.process("texas-holdem 2d4s9hJhTc 7s2h 8h8d Ah2c QhTh 3d7d KhKd 6sTd Ks2s"));
  }

  @Test
  public void test_texas_holdem_2873_2c4s7s9cQd_Kc9h_5s8c() {
    assertEquals(
      "5s8c Kc9h",
      Solver.process("texas-holdem 2c4s7s9cQd Kc9h 5s8c"));
  }

  @Test
  public void test_texas_holdem_2874_5c6cAdAhJd_Kh3h_6h6s_2dQc_Ac9c_9d7c_4s4d_7h9h_ThKd() {
    assertEquals(
      "7h9h=9d7c 2dQc Kh3h ThKd 4s4d Ac9c 6h6s",
      Solver.process("texas-holdem 5c6cAdAhJd Kh3h 6h6s 2dQc Ac9c 9d7c 4s4d 7h9h ThKd"));
  }

  @Test
  public void test_texas_holdem_2875_4d4sQcQdTs_Js5c_8sAs_Qs7c_KsJc() {
    assertEquals(
      "Js5c KsJc 8sAs Qs7c",
      Solver.process("texas-holdem 4d4sQcQdTs Js5c 8sAs Qs7c KsJc"));
  }

  @Test
  public void test_texas_holdem_2876_2h4s6h8dTc_Ah6c_QdJd_4cJh_Kh6d_5h9s_5d9d_2cQh_7d7h_9c2s() {
    assertEquals(
      "5d9d=5h9s QdJd 9c2s 2cQh 4cJh Kh6d Ah6c 7d7h",
      Solver.process("texas-holdem 2h4s6h8dTc Ah6c QdJd 4cJh Kh6d 5h9s 5d9d 2cQh 7d7h 9c2s"));
  }

  @Test
  public void test_texas_holdem_2877_4hAdJcKsTc_5d6c_8h3h_2dJd_7s9c() {
    assertEquals(
      "5d6c 8h3h 7s9c 2dJd",
      Solver.process("texas-holdem 4hAdJcKsTc 5d6c 8h3h 2dJd 7s9c"));
  }

  @Test
  public void test_texas_holdem_2878_3h4d6c6d7c_6s8h_2cAs() {
    assertEquals(
      "2cAs 6s8h",
      Solver.process("texas-holdem 3h4d6c6d7c 6s8h 2cAs"));
  }

  @Test
  public void test_texas_holdem_2879_2s3h4d8sAs_3c7h_QdTs_3s5h_KdKc_KhTd_Tc2c_5d7d_7cJh() {
    assertEquals(
      "7cJh QdTs KhTd Tc2c 3c7h KdKc 3s5h=5d7d",
      Solver.process("texas-holdem 2s3h4d8sAs 3c7h QdTs 3s5h KdKc KhTd Tc2c 5d7d 7cJh"));
  }

  @Test
  public void test_texas_holdem_2880_6c6d8h9cTd_5hQd_8cQs_3c7h_Tc5s_2h3h() {
    assertEquals(
      "2h3h 5hQd 8cQs Tc5s 3c7h",
      Solver.process("texas-holdem 6c6d8h9cTd 5hQd 8cQs 3c7h Tc5s 2h3h"));
  }

  @Test
  public void test_texas_holdem_2881_2d5h6d7sJc_4h8d_7dAh_KcJs_Ks7c() {
    assertEquals(
      "Ks7c 7dAh KcJs 4h8d",
      Solver.process("texas-holdem 2d5h6d7sJc 4h8d 7dAh KcJs Ks7c"));
  }

  @Test
  public void test_texas_holdem_2882_2s3h4s6dKs_Qs2c_7h5h_Kh2d_5c5d_JsTh_Qc9c_JdTd() {
    assertEquals(
      "JdTd=JsTh Qc9c Qs2c Kh2d 5c5d 7h5h",
      Solver.process("texas-holdem 2s3h4s6dKs Qs2c 7h5h Kh2d 5c5d JsTh Qc9c JdTd"));
  }

  @Test
  public void test_texas_holdem_2883_2s5c5sKcKh_7h7s_9s6c_Ah3d_ThTs_3hQd_4dQh_AcAs_Jc7d() {
    assertEquals(
      "9s6c Jc7d 3hQd=4dQh Ah3d 7h7s ThTs AcAs",
      Solver.process("texas-holdem 2s5c5sKcKh 7h7s 9s6c Ah3d ThTs 3hQd 4dQh AcAs Jc7d"));
  }

  @Test
  public void test_texas_holdem_2884_3d6d9hAdQd_3c5d_7c2h_7s9d_Ks6c_5hAh_Kh3h() {
    assertEquals(
      "7c2h Kh3h Ks6c 5hAh 3c5d 7s9d",
      Solver.process("texas-holdem 3d6d9hAdQd 3c5d 7c2h 7s9d Ks6c 5hAh Kh3h"));
  }

  @Test
  public void test_texas_holdem_2885_2c3d6c9dQh_3hJs_KcQd() {
    assertEquals(
      "3hJs KcQd",
      Solver.process("texas-holdem 2c3d6c9dQh 3hJs KcQd"));
  }

  @Test
  public void test_texas_holdem_2886_6d7sJhJsQd_4h5h_5d3h_TcAs_9s6s_2d6h_2c3c_8sJd_QsQc() {
    assertEquals(
      "2c3c=4h5h=5d3h TcAs 2d6h=9s6s 8sJd QsQc",
      Solver.process("texas-holdem 6d7sJhJsQd 4h5h 5d3h TcAs 9s6s 2d6h 2c3c 8sJd QsQc"));
  }

  @Test
  public void test_texas_holdem_2887_2c6h9cJdKh_5dQs_9hJc_3c2s() {
    assertEquals(
      "5dQs 3c2s 9hJc",
      Solver.process("texas-holdem 2c6h9cJdKh 5dQs 9hJc 3c2s"));
  }

  @Test
  public void test_texas_holdem_2888_2d6d8d9sTc_7h7s_2h3d() {
    assertEquals(
      "2h3d 7h7s",
      Solver.process("texas-holdem 2d6d8d9sTc 7h7s 2h3d"));
  }

  @Test
  public void test_texas_holdem_2889_4s7dAcQdTc_3dKc_6h8h_6d3c_9h2s_Ks2h_9c6s_5s3h() {
    assertEquals(
      "5s3h 6d3c 6h8h 9c6s=9h2s 3dKc=Ks2h",
      Solver.process("texas-holdem 4s7dAcQdTc 3dKc 6h8h 6d3c 9h2s Ks2h 9c6s 5s3h"));
  }

  @Test
  public void test_texas_holdem_2890_2c2h6hAcKh_2sQd_6c8h_AsAh_7sQs_5s8c_Qh9h_6s7c_Jc3h() {
    assertEquals(
      "5s8c Jc3h 7sQs 6c8h=6s7c 2sQd Qh9h AsAh",
      Solver.process("texas-holdem 2c2h6hAcKh 2sQd 6c8h AsAh 7sQs 5s8c Qh9h 6s7c Jc3h"));
  }

  @Test
  public void test_texas_holdem_2891_7s9dAdJhQh_7hKd_2c8d_Jc7c_As4h_5d9h_3s9s_6dTd_TcKs_6hQd() {
    assertEquals(
      "2c8d 6dTd 7hKd 3s9s=5d9h 6hQd As4h Jc7c TcKs",
      Solver.process("texas-holdem 7s9dAdJhQh 7hKd 2c8d Jc7c As4h 5d9h 3s9s 6dTd TcKs 6hQd"));
  }

  @Test
  public void test_texas_holdem_2892_3s5dKdQsTh_TsQc_4s5h_2d5s_6s7d_QdAh_2c6h_Qh8h_As6d() {
    assertEquals(
      "2c6h 6s7d As6d 2d5s=4s5h Qh8h QdAh TsQc",
      Solver.process("texas-holdem 3s5dKdQsTh TsQc 4s5h 2d5s 6s7d QdAh 2c6h Qh8h As6d"));
  }

  @Test
  public void test_texas_holdem_2893_5cAcQdThTs_3h8d_8sQc_4h9h_TdJh_5dQs() {
    assertEquals(
      "3h8d 4h9h 5dQs=8sQc TdJh",
      Solver.process("texas-holdem 5cAcQdThTs 3h8d 8sQc 4h9h TdJh 5dQs"));
  }

  @Test
  public void test_texas_holdem_2894_3d5dJhQcQh_Jd6c_5hTd_Tc6h_4cKc() {
    assertEquals(
      "Tc6h 4cKc 5hTd Jd6c",
      Solver.process("texas-holdem 3d5dJhQcQh Jd6c 5hTd Tc6h 4cKc"));
  }

  @Test
  public void test_texas_holdem_2895_4c4s7h8cJs_2dQs_Jc3d_Ac5d_7c6d() {
    assertEquals(
      "2dQs Ac5d 7c6d Jc3d",
      Solver.process("texas-holdem 4c4s7h8cJs 2dQs Jc3d Ac5d 7c6d"));
  }

  @Test
  public void test_texas_holdem_2896_2d6h6sAsTs_7c6d_Kh5s_JcKd_Tc5d() {
    assertEquals(
      "Kh5s JcKd Tc5d 7c6d",
      Solver.process("texas-holdem 2d6h6sAsTs 7c6d Kh5s JcKd Tc5d"));
  }

  @Test
  public void test_texas_holdem_2897_2s5s7cJsTs_5h4d_4s3h_5d2c() {
    assertEquals(
      "5h4d 5d2c 4s3h",
      Solver.process("texas-holdem 2s5s7cJsTs 5h4d 4s3h 5d2c"));
  }

  @Test
  public void test_texas_holdem_2898_3s9hQcQdTs_5h4h_ThAh_8s5s_Kc2h() {
    assertEquals(
      "5h4h 8s5s Kc2h ThAh",
      Solver.process("texas-holdem 3s9hQcQdTs 5h4h ThAh 8s5s Kc2h"));
  }

  @Test
  public void test_texas_holdem_2899_3c5h7s8cAd_Tc9d_5d6d_8d3d_2cKc_Jd2d() {
    assertEquals(
      "Tc9d Jd2d 2cKc 5d6d 8d3d",
      Solver.process("texas-holdem 3c5h7s8cAd Tc9d 5d6d 8d3d 2cKc Jd2d"));
  }

  @Test
  public void test_texas_holdem_2900_3h7d9sAsQh_6s2d_Td5h_2c9h() {
    assertEquals(
      "6s2d Td5h 2c9h",
      Solver.process("texas-holdem 3h7d9sAsQh 6s2d Td5h 2c9h"));
  }

  @Test
  public void test_texas_holdem_2901_7h9cAcJcTh_5d5s_QdQc() {
    assertEquals(
      "5d5s QdQc",
      Solver.process("texas-holdem 7h9cAcJcTh 5d5s QdQc"));
  }

  @Test
  public void test_texas_holdem_2902_2h6h8hKdQs_Kh9c_KcKs_5d9h_Jc3d_5sJd_AcAh_4d7d_2s5h_2d7h() {
    assertEquals(
      "4d7d 5d9h 5sJd=Jc3d 2d7h=2s5h Kh9c AcAh KcKs",
      Solver.process("texas-holdem 2h6h8hKdQs Kh9c KcKs 5d9h Jc3d 5sJd AcAh 4d7d 2s5h 2d7h"));
  }

  @Test
  public void test_texas_holdem_2903_6c9cAcAsJc_6h2h_5h8c_KsQc_QhAd_Ah7d_5s7s_6s8d_4d4h_3d8h() {
    assertEquals(
      "5s7s 3d8h 4d4h 6h2h=6s8d Ah7d QhAd 5h8c KsQc",
      Solver.process("texas-holdem 6c9cAcAsJc 6h2h 5h8c KsQc QhAd Ah7d 5s7s 6s8d 4d4h 3d8h"));
  }

  @Test
  public void test_texas_holdem_2904_3d3h6h7h9h_Jd6s_5dKh_9sQc_AcTc_5c2c_Th6d_3sKd_8sKs_4s8d() {
    assertEquals(
      "5c2c 4s8d 8sKs AcTc Jd6s 9sQc 3sKd Th6d 5dKh",
      Solver.process("texas-holdem 3d3h6h7h9h Jd6s 5dKh 9sQc AcTc 5c2c Th6d 3sKd 8sKs 4s8d"));
  }

  @Test
  public void test_texas_holdem_2905_4s6c7s9hKh_4h2d_3h8s_Th6h_4c2s_5cTs_8h7h_6sJd() {
    assertEquals(
      "3h8s 5cTs 4c2s=4h2d Th6h 6sJd 8h7h",
      Solver.process("texas-holdem 4s6c7s9hKh 4h2d 3h8s Th6h 4c2s 5cTs 8h7h 6sJd"));
  }

  @Test
  public void test_texas_holdem_2906_2d3h6h9cQd_TsTh_7c5s_KhKs_Ac8d_QcJc_Kc5h() {
    assertEquals(
      "7c5s Kc5h Ac8d TsTh QcJc KhKs",
      Solver.process("texas-holdem 2d3h6h9cQd TsTh 7c5s KhKs Ac8d QcJc Kc5h"));
  }

  @Test
  public void test_texas_holdem_2907_5s7sJcJhTh_8s3h_Td4d_5cTc() {
    assertEquals(
      "8s3h 5cTc=Td4d",
      Solver.process("texas-holdem 5s7sJcJhTh 8s3h Td4d 5cTc"));
  }

  @Test
  public void test_texas_holdem_2908_2c2d2hAhTd_8cAs_4cKh_6hJd_9c7d_7s9d_JcQh_4d3d_4s4h() {
    assertEquals(
      "4d3d=7s9d=9c7d 6hJd JcQh 4cKh 4s4h 8cAs",
      Solver.process("texas-holdem 2c2d2hAhTd 8cAs 4cKh 6hJd 9c7d 7s9d JcQh 4d3d 4s4h"));
  }

  @Test
  public void test_texas_holdem_2909_7d9cAdJhQs_6s6c_3s7c_Qc2d_7sKd() {
    assertEquals(
      "6s6c 3s7c 7sKd Qc2d",
      Solver.process("texas-holdem 7d9cAdJhQs 6s6c 3s7c Qc2d 7sKd"));
  }

  @Test
  public void test_texas_holdem_2910_3c4s5h7cQh_Kc4c_TsQc_Tc3d_Ad2h() {
    assertEquals(
      "Tc3d Kc4c TsQc Ad2h",
      Solver.process("texas-holdem 3c4s5h7cQh Kc4c TsQc Tc3d Ad2h"));
  }

  @Test
  public void test_texas_holdem_2911_2d2s3d7dTd_JsQd_JdTs() {
    assertEquals(
      "JdTs JsQd",
      Solver.process("texas-holdem 2d2s3d7dTd JsQd JdTs"));
  }

  @Test
  public void test_texas_holdem_2912_2c3d3s7s8h_6dQd_7dAh_TsAs_Ad5c() {
    assertEquals(
      "6dQd Ad5c TsAs 7dAh",
      Solver.process("texas-holdem 2c3d3s7s8h 6dQd 7dAh TsAs Ad5c"));
  }

  @Test
  public void test_texas_holdem_2913_3s7cAdAsQs_9sJc_5cAc_6s4s_7h4c_4d5h_3dKc_7s2s() {
    assertEquals(
      "4d5h 9sJc 3dKc 7h4c 5cAc 6s4s 7s2s",
      Solver.process("texas-holdem 3s7cAdAsQs 9sJc 5cAc 6s4s 7h4c 4d5h 3dKc 7s2s"));
  }

  @Test
  public void test_texas_holdem_2914_3d7hKhQcTh_8sJd_5s3c_6hAh() {
    assertEquals(
      "8sJd 5s3c 6hAh",
      Solver.process("texas-holdem 3d7hKhQcTh 8sJd 5s3c 6hAh"));
  }

  @Test
  public void test_texas_holdem_2915_2c2d3d3s5c_Qs8h_JhKh_6d4d_8sKd_2sKs_QcAh_6sAd_Kc2h() {
    assertEquals(
      "Qs8h 8sKd=JhKh 6sAd=QcAh 6d4d 2sKs=Kc2h",
      Solver.process("texas-holdem 2c2d3d3s5c Qs8h JhKh 6d4d 8sKd 2sKs QcAh 6sAd Kc2h"));
  }

  @Test
  public void test_texas_holdem_2916_3h3s9dJcTs_Jd9s_ThJs_Ad4d() {
    assertEquals(
      "Ad4d Jd9s ThJs",
      Solver.process("texas-holdem 3h3s9dJcTs Jd9s ThJs Ad4d"));
  }

  @Test
  public void test_texas_holdem_2917_8c9h9sAcKc_6s4c_7s7c_TcQc() {
    assertEquals(
      "6s4c 7s7c TcQc",
      Solver.process("texas-holdem 8c9h9sAcKc 6s4c 7s7c TcQc"));
  }

  @Test
  public void test_texas_holdem_2918_9cAhKhQcQd_KcQs_6s2c_7h8d() {
    assertEquals(
      "6s2c=7h8d KcQs",
      Solver.process("texas-holdem 9cAhKhQcQd KcQs 6s2c 7h8d"));
  }

  @Test
  public void test_texas_holdem_2919_7c7h9hJdKs_9c2c_5hKd() {
    assertEquals(
      "9c2c 5hKd",
      Solver.process("texas-holdem 7c7h9hJdKs 9c2c 5hKd"));
  }

  @Test
  public void test_texas_holdem_2920_5s7h8sQsTc_JdAd_6s4h_4cKh() {
    assertEquals(
      "4cKh JdAd 6s4h",
      Solver.process("texas-holdem 5s7h8sQsTc JdAd 6s4h 4cKh"));
  }

  @Test
  public void test_texas_holdem_2921_3c5sAcJsQd_Kc8d_Kh9h_9s6h_4cKs() {
    assertEquals(
      "9s6h 4cKs Kc8d Kh9h",
      Solver.process("texas-holdem 3c5sAcJsQd Kc8d Kh9h 9s6h 4cKs"));
  }

  @Test
  public void test_texas_holdem_2922_5h6h6s7hQh_KhTd_7s8h_Ks9h_Jd4d_6d4h_5d9d_7d4s() {
    assertEquals(
      "Jd4d 5d9d 7d4s 6d4h 7s8h Ks9h KhTd",
      Solver.process("texas-holdem 5h6h6s7hQh KhTd 7s8h Ks9h Jd4d 6d4h 5d9d 7d4s"));
  }

  @Test
  public void test_texas_holdem_2923_3c5s8s9cKs_Kc4h_Tc5h() {
    assertEquals(
      "Tc5h Kc4h",
      Solver.process("texas-holdem 3c5s8s9cKs Kc4h Tc5h"));
  }

  @Test
  public void test_texas_holdem_2924_2h4h5c7s8h_6s3d_Qs4c_9hTc_3h7d_Ts6c() {
    assertEquals(
      "9hTc Qs4c 3h7d 6s3d=Ts6c",
      Solver.process("texas-holdem 2h4h5c7s8h 6s3d Qs4c 9hTc 3h7d Ts6c"));
  }

  @Test
  public void test_texas_holdem_2925_4h5dAsJsTc_3sQh_Th9h_7hKd_4sJc_8d7c_Td5s() {
    assertEquals(
      "8d7c 3sQh 7hKd Th9h Td5s 4sJc",
      Solver.process("texas-holdem 4h5dAsJsTc 3sQh Th9h 7hKd 4sJc 8d7c Td5s"));
  }

  @Test
  public void test_texas_holdem_2926_5hKsQcQhTc_3d9s_AdTs_4s2h_9hTd_As8s_Jd8h_Qd2c_JsKc_7h4c() {
    assertEquals(
      "4s2h 7h4c 3d9s Jd8h As8s 9hTd AdTs JsKc Qd2c",
      Solver.process("texas-holdem 5hKsQcQhTc 3d9s AdTs 4s2h 9hTd As8s Jd8h Qd2c JsKc 7h4c"));
  }

  @Test
  public void test_texas_holdem_2927_2d3d5h8hAs_4sJh_TdAd() {
    assertEquals(
      "TdAd 4sJh",
      Solver.process("texas-holdem 2d3d5h8hAs 4sJh TdAd"));
  }

  @Test
  public void test_texas_holdem_2928_4h5d6h9dKh_KdTd_3hJd() {
    assertEquals(
      "3hJd KdTd",
      Solver.process("texas-holdem 4h5d6h9dKh KdTd 3hJd"));
  }

  @Test
  public void test_texas_holdem_2929_6s7c8hJdKc_5c3d_8d7s_3cTd() {
    assertEquals(
      "5c3d 3cTd 8d7s",
      Solver.process("texas-holdem 6s7c8hJdKc 5c3d 8d7s 3cTd"));
  }

  @Test
  public void test_texas_holdem_2930_3s4sJdJsQs_9c4c_4d8d_3d9d_Qc5h_KhTh_7s6s_Ac7d_5d9h_8h3c() {
    assertEquals(
      "5d9h KhTh Ac7d 3d9d=8h3c 4d8d=9c4c Qc5h 7s6s",
      Solver.process("texas-holdem 3s4sJdJsQs 9c4c 4d8d 3d9d Qc5h KhTh 7s6s Ac7d 5d9h 8h3c"));
  }

  @Test
  public void test_texas_holdem_2931_7h9sJhKcKs_Kd3c_8cQd_6h9d_7d4h_Qc2d_4c9h_Jd7s_4d5d() {
    assertEquals(
      "4d5d 8cQd=Qc2d 7d4h 4c9h=6h9d Jd7s Kd3c",
      Solver.process("texas-holdem 7h9sJhKcKs Kd3c 8cQd 6h9d 7d4h Qc2d 4c9h Jd7s 4d5d"));
  }

  @Test
  public void test_texas_holdem_2932_2h6s8hQhTc_Ad4s_AsQd_9d2c() {
    assertEquals(
      "Ad4s 9d2c AsQd",
      Solver.process("texas-holdem 2h6s8hQhTc Ad4s AsQd 9d2c"));
  }

  @Test
  public void test_texas_holdem_2933_2d3s5cAdTd_5s7c_8d9d_JhTs_Ac9s_7h9c_7d6c_KsKc_Kh5h() {
    assertEquals(
      "7d6c 7h9c 5s7c Kh5h JhTs KsKc Ac9s 8d9d",
      Solver.process("texas-holdem 2d3s5cAdTd 5s7c 8d9d JhTs Ac9s 7h9c 7d6c KsKc Kh5h"));
  }

  @Test
  public void test_texas_holdem_2934_6d7d8sKcQc_5s4h_6c2d_JcJh_4dKs_9dAd_8hTc_KhTs() {
    assertEquals(
      "9dAd 6c2d 8hTc JcJh 4dKs KhTs 5s4h",
      Solver.process("texas-holdem 6d7d8sKcQc 5s4h 6c2d JcJh 4dKs 9dAd 8hTc KhTs"));
  }

  @Test
  public void test_texas_holdem_2935_2c7c7s8c8h_5dTd_6d5s_Ts9s_Jc6h_Kh2s_3h7h_TcAh_AcAs() {
    assertEquals(
      "6d5s 5dTd=Ts9s Jc6h Kh2s TcAh AcAs 3h7h",
      Solver.process("texas-holdem 2c7c7s8c8h 5dTd 6d5s Ts9s Jc6h Kh2s 3h7h TcAh AcAs"));
  }

  @Test
  public void test_texas_holdem_2936_JhKcQsTcTd_7cAs_Th6h_Jd3c_8d4h() {
    assertEquals(
      "8d4h Jd3c Th6h 7cAs",
      Solver.process("texas-holdem JhKcQsTcTd 7cAs Th6h Jd3c 8d4h"));
  }

  @Test
  public void test_texas_holdem_2937_7d8h8sJhQs_4c5s_5h6c_Ad4h_3h5c_2c2s_KcTd_6dKs_7s9d() {
    assertEquals(
      "3h5c=4c5s=5h6c 6dKs=KcTd Ad4h 2c2s 7s9d",
      Solver.process("texas-holdem 7d8h8sJhQs 4c5s 5h6c Ad4h 3h5c 2c2s KcTd 6dKs 7s9d"));
  }

  @Test
  public void test_texas_holdem_2938_7s8sAcJhKc_9d8h_Js5s() {
    assertEquals(
      "9d8h Js5s",
      Solver.process("texas-holdem 7s8sAcJhKc 9d8h Js5s"));
  }

  @Test
  public void test_texas_holdem_2939_2c5d9hKcTc_QsTs_AhJh_JcQh_3cQc_6sAs() {
    assertEquals(
      "6sAs AhJh QsTs JcQh 3cQc",
      Solver.process("texas-holdem 2c5d9hKcTc QsTs AhJh JcQh 3cQc 6sAs"));
  }

  @Test
  public void test_texas_holdem_2940_3d4s8hJhQc_2h6d_Qh2d_3s2c_AsKc() {
    assertEquals(
      "2h6d AsKc 3s2c Qh2d",
      Solver.process("texas-holdem 3d4s8hJhQc 2h6d Qh2d 3s2c AsKc"));
  }

  @Test
  public void test_texas_holdem_2941_5s8h9sJdJs_Ks7d_QdQs_3cKc_9c6h_Qc4s_5cAs_9dAc_9hJc_Jh3s() {
    assertEquals(
      "Qc4s 3cKc=Ks7d 5cAs 9c6h 9dAc QdQs Jh3s 9hJc",
      Solver.process("texas-holdem 5s8h9sJdJs Ks7d QdQs 3cKc 9c6h Qc4s 5cAs 9dAc 9hJc Jh3s"));
  }

  @Test
  public void test_texas_holdem_2942_3c9dQdQsTh_6sQc_As8d_7h5s_9h8c() {
    assertEquals(
      "7h5s As8d 9h8c 6sQc",
      Solver.process("texas-holdem 3c9dQdQsTh 6sQc As8d 7h5s 9h8c"));
  }

  @Test
  public void test_texas_holdem_2943_8hAcKdQdQh_3dJc_Qs4c_4h9h_Ts4d() {
    assertEquals(
      "4h9h Ts4d 3dJc Qs4c",
      Solver.process("texas-holdem 8hAcKdQdQh 3dJc Qs4c 4h9h Ts4d"));
  }

  @Test
  public void test_texas_holdem_2944_2d3c4d8d9h_Ac5s_8c4h_2h6h_7cJh_5dKs_3dJs_9cAd_Kc2s() {
    assertEquals(
      "7cJh 5dKs 2h6h Kc2s 3dJs 9cAd 8c4h Ac5s",
      Solver.process("texas-holdem 2d3c4d8d9h Ac5s 8c4h 2h6h 7cJh 5dKs 3dJs 9cAd Kc2s"));
  }

  @Test
  public void test_texas_holdem_2945_2h6s8hKsTc_2s3d_AcKd_7hTd_As3s_2c6d_8dAh() {
    assertEquals(
      "As3s 2s3d 8dAh 7hTd AcKd 2c6d",
      Solver.process("texas-holdem 2h6s8hKsTc 2s3d AcKd 7hTd As3s 2c6d 8dAh"));
  }

  @Test
  public void test_texas_holdem_2946_3d3s7sQdTs_Tc5s_5dAh() {
    assertEquals(
      "5dAh Tc5s",
      Solver.process("texas-holdem 3d3s7sQdTs Tc5s 5dAh"));
  }

  @Test
  public void test_texas_holdem_2947_2s3s5dAsJh_Kd9s_Ac8s_4sTs() {
    assertEquals(
      "Kd9s Ac8s 4sTs",
      Solver.process("texas-holdem 2s3s5dAsJh Kd9s Ac8s 4sTs"));
  }

  @Test
  public void test_texas_holdem_2948_3d4s5s6hAs_8sJs_Kd4h_7dKh_AcJh_4c2h() {
    assertEquals(
      "Kd4h AcJh 4c2h 7dKh 8sJs",
      Solver.process("texas-holdem 3d4s5s6hAs 8sJs Kd4h 7dKh AcJh 4c2h"));
  }

  @Test
  public void test_texas_holdem_2949_5h6hAhAsKh_8hAd_7s5s_Tc3d_Th2d_Kd5d_Ks2s_Qc6c_QsJs() {
    assertEquals(
      "Tc3d QsJs 7s5s Qc6c Kd5d=Ks2s 8hAd Th2d",
      Solver.process("texas-holdem 5h6hAhAsKh 8hAd 7s5s Tc3d Th2d Kd5d Ks2s Qc6c QsJs"));
  }

  @Test
  public void test_texas_holdem_2950_5c5hJcKdQd_9c8c_3sKc_8sAd_6sKh_6c6d_5d7d() {
    assertEquals(
      "9c8c 8sAd 6c6d 3sKc=6sKh 5d7d",
      Solver.process("texas-holdem 5c5hJcKdQd 9c8c 3sKc 8sAd 6sKh 6c6d 5d7d"));
  }

  @Test
  public void test_texas_holdem_2951_2h2s3d6hJh_4dJd_4h6c_Ts7h_7sKd_5d3s_AdAc_9sJs_Jc3c_4sQc() {
    assertEquals(
      "Ts7h 4sQc 7sKd 5d3s 4h6c 4dJd 9sJs Jc3c AdAc",
      Solver.process("texas-holdem 2h2s3d6hJh 4dJd 4h6c Ts7h 7sKd 5d3s AdAc 9sJs Jc3c 4sQc"));
  }

  @Test
  public void test_texas_holdem_2952_5h7hJcKcTh_6s8s_6dJd() {
    assertEquals(
      "6s8s 6dJd",
      Solver.process("texas-holdem 5h7hJcKcTh 6s8s 6dJd"));
  }

  @Test
  public void test_texas_holdem_2953_4c7s8hJsTd_8c3s_2cTc() {
    assertEquals(
      "8c3s 2cTc",
      Solver.process("texas-holdem 4c7s8hJsTd 8c3s 2cTc"));
  }

  @Test
  public void test_texas_holdem_2954_2h4c6d6hQc_TsQd_AcKs_5s2d_3s8h_Kd9s() {
    assertEquals(
      "3s8h Kd9s AcKs 5s2d TsQd",
      Solver.process("texas-holdem 2h4c6d6hQc TsQd AcKs 5s2d 3s8h Kd9s"));
  }

  @Test
  public void test_texas_holdem_2955_6s8hAcAdQh_7c2d_9sQd_4c8d_Qc3d_6hJs_KhJc_Td3s_5hKc() {
    assertEquals(
      "7c2d Td3s 5hKc KhJc 6hJs 4c8d Qc3d 9sQd",
      Solver.process("texas-holdem 6s8hAcAdQh 7c2d 9sQd 4c8d Qc3d 6hJs KhJc Td3s 5hKc"));
  }

  @Test
  public void test_texas_holdem_2956_4h6h7s9cAs_Ah3d_2cAc_8hQd() {
    assertEquals(
      "8hQd 2cAc=Ah3d",
      Solver.process("texas-holdem 4h6h7s9cAs Ah3d 2cAc 8hQd"));
  }

  @Test
  public void test_texas_holdem_2957_7c7h8s9hQs_AdKc_6s6h() {
    assertEquals(
      "AdKc 6s6h",
      Solver.process("texas-holdem 7c7h8s9hQs AdKc 6s6h"));
  }

  @Test
  public void test_texas_holdem_2958_2s5c8d9hKd_6h3s_7h6d_As9c_AhAc_Ks5d_5s9s() {
    assertEquals(
      "6h3s As9c AhAc 5s9s Ks5d 7h6d",
      Solver.process("texas-holdem 2s5c8d9hKd 6h3s 7h6d As9c AhAc Ks5d 5s9s"));
  }

  @Test
  public void test_texas_holdem_2959_2d6c6sAcTc_4sKd_9d8c_AsKc_Qd2h() {
    assertEquals(
      "9d8c 4sKd Qd2h AsKc",
      Solver.process("texas-holdem 2d6c6sAcTc 4sKd 9d8c AsKc Qd2h"));
  }

  @Test
  public void test_texas_holdem_2960_3h4s9sQhQs_2c5d_8cQc_Ac7c_6hTd_Jh5s_9cAh() {
    assertEquals(
      "2c5d 6hTd Jh5s Ac7c 9cAh 8cQc",
      Solver.process("texas-holdem 3h4s9sQhQs 2c5d 8cQc Ac7c 6hTd Jh5s 9cAh"));
  }

  @Test
  public void test_texas_holdem_2961_5d8d8sKcKd_4c9c_Kh7d_9d3s() {
    assertEquals(
      "4c9c=9d3s Kh7d",
      Solver.process("texas-holdem 5d8d8sKcKd 4c9c Kh7d 9d3s"));
  }

  @Test
  public void test_texas_holdem_2962_3c3d9cAhKs_Js3h_Ts5s_8d8h() {
    assertEquals(
      "Ts5s 8d8h Js3h",
      Solver.process("texas-holdem 3c3d9cAhKs Js3h Ts5s 8d8h"));
  }

  @Test
  public void test_texas_holdem_2963_3d6c6d9cTs_3hAh_7c8d_2d3c_Ad9h_8cAc_5h6s() {
    assertEquals(
      "8cAc 2d3c 3hAh Ad9h 5h6s 7c8d",
      Solver.process("texas-holdem 3d6c6d9cTs 3hAh 7c8d 2d3c Ad9h 8cAc 5h6s"));
  }

  @Test
  public void test_texas_holdem_2964_5h6d6s8hQc_9c5s_Jh8s_7sTd_JdAd_Qh3d_Ah9h_3hAs_Kc6h_6cJs() {
    assertEquals(
      "7sTd 3hAs Ah9h JdAd 9c5s Jh8s Qh3d 6cJs Kc6h",
      Solver.process("texas-holdem 5h6d6s8hQc 9c5s Jh8s 7sTd JdAd Qh3d Ah9h 3hAs Kc6h 6cJs"));
  }

  @Test
  public void test_texas_holdem_2965_3h7d7s9sAc_4hKs_AsJh_4cQs_Kh2h_3c8s_5h5d_6dKc() {
    assertEquals(
      "4cQs 4hKs=6dKc=Kh2h 3c8s 5h5d AsJh",
      Solver.process("texas-holdem 3h7d7s9sAc 4hKs AsJh 4cQs Kh2h 3c8s 5h5d 6dKc"));
  }

  @Test
  public void test_texas_holdem_2966_4c7d7sAcKh_5s8d_4sKc_4d8h_6cQh_Jh4h() {
    assertEquals(
      "5s8d 6cQh 4d8h=Jh4h 4sKc",
      Solver.process("texas-holdem 4c7d7sAcKh 5s8d 4sKc 4d8h 6cQh Jh4h"));
  }

  @Test
  public void test_texas_holdem_2967_3s6h6s9cKc_3dTc_KdTs() {
    assertEquals(
      "3dTc KdTs",
      Solver.process("texas-holdem 3s6h6s9cKc 3dTc KdTs"));
  }

  @Test
  public void test_texas_holdem_2968_5cKhKsQcQh_7d5s_Ah5h_Ac3c_ThAd_2dTd_5d3s() {
    assertEquals(
      "5d3s 7d5s 2dTd Ac3c=Ah5h=ThAd",
      Solver.process("texas-holdem 5cKhKsQcQh 7d5s Ah5h Ac3c ThAd 2dTd 5d3s"));
  }

  @Test
  public void test_texas_holdem_2969_2h5c6h7cKs_Th4d_8s3c_9s3h_4s7d_Jc3s_8dQd_9dAh_6cQh_2sKh() {
    assertEquals(
      "8s3c 9s3h Th4d Jc3s 8dQd 9dAh 6cQh 4s7d 2sKh",
      Solver.process("texas-holdem 2h5c6h7cKs Th4d 8s3c 9s3h 4s7d Jc3s 8dQd 9dAh 6cQh 2sKh"));
  }

  @Test
  public void test_texas_holdem_2970_3s6d6hAsJh_5dTc_5s7s() {
    assertEquals(
      "5s7s 5dTc",
      Solver.process("texas-holdem 3s6d6hAsJh 5dTc 5s7s"));
  }

  @Test
  public void test_texas_holdem_2971_2h7hAcAhQd_ThQh_5cTs_3s8s_8cQs_Kc9h_2s7d_9cQc_8d2d() {
    assertEquals(
      "3s8s 5cTs Kc9h 8d2d 2s7d 8cQs 9cQc ThQh",
      Solver.process("texas-holdem 2h7hAcAhQd ThQh 5cTs 3s8s 8cQs Kc9h 2s7d 9cQc 8d2d"));
  }

  @Test
  public void test_texas_holdem_2972_2s3c3hAcQh_6d3d_9hQc_6c5d() {
    assertEquals(
      "6c5d 9hQc 6d3d",
      Solver.process("texas-holdem 2s3c3hAcQh 6d3d 9hQc 6c5d"));
  }

  @Test
  public void test_texas_holdem_2973_2d4h6c8hQc_9d4s_9c7h_5sAd_6hTc_Qs6d_Kd9h_TdJc() {
    assertEquals(
      "9c7h TdJc Kd9h 5sAd 9d4s 6hTc Qs6d",
      Solver.process("texas-holdem 2d4h6c8hQc 9d4s 9c7h 5sAd 6hTc Qs6d Kd9h TdJc"));
  }

  @Test
  public void test_texas_holdem_2974_3d7c8dAsKh_Ad6s_6c9h_Td9s_Kd4c_2cTs_KcJs_Qd2d_Qs4h() {
    assertEquals(
      "6c9h 2cTs Td9s Qd2d=Qs4h Kd4c KcJs Ad6s",
      Solver.process("texas-holdem 3d7c8dAsKh Ad6s 6c9h Td9s Kd4c 2cTs KcJs Qd2d Qs4h"));
  }

  @Test
  public void test_texas_holdem_2975_5d9dJcJdQc_2hKd_8s5s_AsKs_Tc3c_9c6c_4d3s_Kh5c_AhTh_6sJs() {
    assertEquals(
      "4d3s Tc3c 2hKd AhTh AsKs 8s5s Kh5c 9c6c 6sJs",
      Solver.process("texas-holdem 5d9dJcJdQc 2hKd 8s5s AsKs Tc3c 9c6c 4d3s Kh5c AhTh 6sJs"));
  }

  @Test
  public void test_texas_holdem_2976_3d3h4cAsQh_Jc7d_7sKh_3s4s_9c9d_Ah5s_Kc2d_2cAd_5c5d_4hAc() {
    assertEquals(
      "Jc7d 7sKh=Kc2d 5c5d 9c9d 2cAd=Ah5s 4hAc 3s4s",
      Solver.process("texas-holdem 3d3h4cAsQh Jc7d 7sKh 3s4s 9c9d Ah5s Kc2d 2cAd 5c5d 4hAc"));
  }

  @Test
  public void test_texas_holdem_2977_2h5c7c9sAd_Qh9c_6cQs_3dQc() {
    assertEquals(
      "3dQc 6cQs Qh9c",
      Solver.process("texas-holdem 2h5c7c9sAd Qh9c 6cQs 3dQc"));
  }

  @Test
  public void test_texas_holdem_2978_3s8hJhJsTh_Ac6c_Ks3d_6h7h_8d9d_5dTd() {
    assertEquals(
      "Ac6c Ks3d 8d9d 5dTd 6h7h",
      Solver.process("texas-holdem 3s8hJhJsTh Ac6c Ks3d 6h7h 8d9d 5dTd"));
  }

  @Test
  public void test_texas_holdem_2979_2d3d4h8h9h_Kd8c_QdAh_Kh5s_7s9c_2c2s() {
    assertEquals(
      "Kh5s QdAh Kd8c 7s9c 2c2s",
      Solver.process("texas-holdem 2d3d4h8h9h Kd8c QdAh Kh5s 7s9c 2c2s"));
  }

  @Test
  public void test_texas_holdem_2980_5d6d7dAcTs_Qc3h_3dJc_Jh6c_9c6s_Tc3c_2dQh_Kc8h_Jd4d() {
    assertEquals(
      "3dJc 2dQh=Qc3h Kc8h 9c6s Jh6c Tc3c Jd4d",
      Solver.process("texas-holdem 5d6d7dAcTs Qc3h 3dJc Jh6c 9c6s Tc3c 2dQh Kc8h Jd4d"));
  }

  @Test
  public void test_texas_holdem_2981_6c8sAsTcTs_9dAh_5c4c() {
    assertEquals(
      "5c4c 9dAh",
      Solver.process("texas-holdem 6c8sAsTcTs 9dAh 5c4c"));
  }

  @Test
  public void test_texas_holdem_2982_3h6s7d9sAh_7cAs_8d6d_Ac9c_2hTd_8hAd_7h8c_5h9d_5c3d_Th6c() {
    assertEquals(
      "2hTd 5c3d 8d6d Th6c 7h8c 5h9d 8hAd 7cAs Ac9c",
      Solver.process("texas-holdem 3h6s7d9sAh 7cAs 8d6d Ac9c 2hTd 8hAd 7h8c 5h9d 5c3d Th6c"));
  }

  @Test
  public void test_texas_holdem_2983_6c7h9sJcTc_QsTd_8h9c_5s2h_4s2c_Ts3d_6s7s_Qc3c_Js5c() {
    assertEquals(
      "4s2c=5s2h Ts3d QsTd Js5c 6s7s 8h9c Qc3c",
      Solver.process("texas-holdem 6c7h9sJcTc QsTd 8h9c 5s2h 4s2c Ts3d 6s7s Qc3c Js5c"));
  }

  @Test
  public void test_texas_holdem_2984_3c3d6c8h9s_4dAd_Kh8s_7d9h_8d7c_Qd2h_6sKd_5h5c() {
    assertEquals(
      "Qd2h 4dAd 5h5c 6sKd 8d7c Kh8s 7d9h",
      Solver.process("texas-holdem 3c3d6c8h9s 4dAd Kh8s 7d9h 8d7c Qd2h 6sKd 5h5c"));
  }

  @Test
  public void test_texas_holdem_2985_9dAcQdTcTd_QhTh_Qc5s_Kd5c_TsJc_2h8d_Jd6h_6s4s_Jh7s() {
    assertEquals(
      "2h8d=6s4s Jd6h=Jh7s Kd5c Qc5s TsJc QhTh",
      Solver.process("texas-holdem 9dAcQdTcTd QhTh Qc5s Kd5c TsJc 2h8d Jd6h 6s4s Jh7s"));
  }

  @Test
  public void test_texas_holdem_2986_8d9cKsQhTc_3s8c_As3d_7d2s_6sTs_4c9d() {
    assertEquals(
      "7d2s As3d 3s8c 4c9d 6sTs",
      Solver.process("texas-holdem 8d9cKsQhTc 3s8c As3d 7d2s 6sTs 4c9d"));
  }

  @Test
  public void test_texas_holdem_2987_3c4h6h7c9d_3h5d_9c8c() {
    assertEquals(
      "9c8c 3h5d",
      Solver.process("texas-holdem 3c4h6h7c9d 3h5d 9c8c"));
  }

  @Test
  public void test_texas_holdem_2988_3d5d7cJdTd_7sJs_2hAs_KsJh_KhJc_7d2c_5c4c_Ah4h() {
    assertEquals(
      "2hAs=Ah4h 5c4c KhJc=KsJh 7sJs 7d2c",
      Solver.process("texas-holdem 3d5d7cJdTd 7sJs 2hAs KsJh KhJc 7d2c 5c4c Ah4h"));
  }

  @Test
  public void test_texas_holdem_2989_2s5c8sJdQc_4dTh_Kc6h_Jc3d_9sTd_Ah9d() {
    assertEquals(
      "4dTh Kc6h Ah9d Jc3d 9sTd",
      Solver.process("texas-holdem 2s5c8sJdQc 4dTh Kc6h Jc3d 9sTd Ah9d"));
  }

  @Test
  public void test_texas_holdem_2990_2c3s4hKdQs_Ks6c_Kc3d_4c8d_Kh4s_6sJs_5cAh_3c2s() {
    assertEquals(
      "6sJs 4c8d Ks6c 3c2s Kc3d Kh4s 5cAh",
      Solver.process("texas-holdem 2c3s4hKdQs Ks6c Kc3d 4c8d Kh4s 6sJs 5cAh 3c2s"));
  }

  @Test
  public void test_texas_holdem_2991_7d8cJsQcTs_Kh2h_6c4h() {
    assertEquals(
      "6c4h Kh2h",
      Solver.process("texas-holdem 7d8cJsQcTs Kh2h 6c4h"));
  }

  @Test
  public void test_texas_holdem_2992_7s8c8sJcQd_2s5c_7c7h_Ts3c_9s4h_9c8d_3s6c_5s4c_Kc6d() {
    assertEquals(
      "2s5c=3s6c=5s4c 9s4h Ts3c Kc6d 9c8d 7c7h",
      Solver.process("texas-holdem 7s8c8sJcQd 2s5c 7c7h Ts3c 9s4h 9c8d 3s6c 5s4c Kc6d"));
  }

  @Test
  public void test_texas_holdem_2993_6c8cJcKsTs_Kc9h_7h8h_KdTh() {
    assertEquals(
      "7h8h Kc9h KdTh",
      Solver.process("texas-holdem 6c8cJcKsTs Kc9h 7h8h KdTh"));
  }

  @Test
  public void test_texas_holdem_2994_5c6h7h7sQd_7cTd_Tc5s_9cJs_4hKs_Kd2c_9sTs_Jc3c_KhKc_6cAs() {
    assertEquals(
      "9sTs Jc3c 9cJs 4hKs=Kd2c Tc5s 6cAs KhKc 7cTd",
      Solver.process("texas-holdem 5c6h7h7sQd 7cTd Tc5s 9cJs 4hKs Kd2c 9sTs Jc3c KhKc 6cAs"));
  }

  @Test
  public void test_texas_holdem_2995_5s7h7s9hKh_5hJh_3d2s_9dAd_6c7d_Th9s_3hJs() {
    assertEquals(
      "3d2s 3hJs Th9s 9dAd 6c7d 5hJh",
      Solver.process("texas-holdem 5s7h7s9hKh 5hJh 3d2s 9dAd 6c7d Th9s 3hJs"));
  }

  @Test
  public void test_texas_holdem_2996_5c8h8s9cKc_5h7s_Kh3d_6hQc_2dAd_TcQd_9sKd_JhTh_5dJd_4dQs() {
    assertEquals(
      "JhTh 4dQs=6hQc TcQd 2dAd 5dJd=5h7s Kh3d 9sKd",
      Solver.process("texas-holdem 5c8h8s9cKc 5h7s Kh3d 6hQc 2dAd TcQd 9sKd JhTh 5dJd 4dQs"));
  }

  @Test
  public void test_texas_holdem_2997_2c5s7dJcTs_Td4s_JhQc() {
    assertEquals(
      "Td4s JhQc",
      Solver.process("texas-holdem 2c5s7dJcTs Td4s JhQc"));
  }

  @Test
  public void test_texas_holdem_2998_5h8c8sKdTs_JdKc_9sTc_Qs3s_Qh7d() {
    assertEquals(
      "Qh7d=Qs3s 9sTc JdKc",
      Solver.process("texas-holdem 5h8c8sKdTs JdKc 9sTc Qs3s Qh7d"));
  }

  @Test
  public void test_texas_holdem_2999_6s8c8d9hAh_2dQh_Qs4s_9dAc_Js4d_6c7d_3s8s_6hTs() {
    assertEquals(
      "Js4d 2dQh=Qs4s 6c7d=6hTs 9dAc 3s8s",
      Solver.process("texas-holdem 6s8c8d9hAh 2dQh Qs4s 9dAc Js4d 6c7d 3s8s 6hTs"));
  }

}
